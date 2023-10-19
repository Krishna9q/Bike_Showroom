import javax.swing.*;
import javax.swing.RowFilter.ComparisonType;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import com.itextpdf.text.Font;
import com.toedter.calendar.JDateChooser;

import java.sql.*;
import java.util.Vector;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Sales extends JFrame {

    private JTable table;
    DefaultTableModel tableModel;
    private JButton backbtn;
    private javax.swing.JScrollPane jScrollPane1;

    private javax.swing.JButton searchbtn;
    public JDateChooser dateChooser;

    public Sales() {

        jScrollPane1 = new javax.swing.JScrollPane();
        backbtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(511, 10, 120, 30);
        getContentPane().add(dateChooser);

        // Add an ActionListener to the JDateChooser
        dateChooser.getDateEditor().addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent e) {
                if ("date".equals(e.getPropertyName())) {
                    filterByDate(dateChooser.getDate());
                }
            }
        });

       


       
        backbtn.setText("BACK");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispose();
                new Bike().setVisible(true);
            }
        });
        getContentPane().add(backbtn);
        backbtn.setBounds(10, 10, 90, 29);


        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                // searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn);
        searchbtn.setBounds(650, 10, 90, 30);

        




        // Subclass DefaultTableModel to make the table non-editable
        tableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make all cells non-editable
            }
        };
        tableModel.addColumn("Sale ID");
        tableModel.addColumn("Customer Name");
        tableModel.addColumn("Bike Name");
        tableModel.addColumn("Price");
        tableModel.addColumn("Payment_Type");
        tableModel.addColumn("Sale Date");

        table = new JTable(tableModel);
        table.setBackground(Color.decode("#8AAAE5"));
        table.setForeground(Color.WHITE);

        jScrollPane1.setViewportView(table);
        jScrollPane1.setBounds(-1, 50, 760, 280);
        getContentPane().add(jScrollPane1);  getContentPane().add(jScrollPane1);
        

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom", "root",
                    "k1010");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(
                    "select sale.sale_id,customer.customer_name,bike_details.bike_name,bike_details.price,customer.payment_type,sale.sale_date from ((sale inner join bike_details ON sale.bike_id = bike_details.bike_id INNER JOIN customer ON sale.customer_id = customer.customer_id))");

            while (resultSet.next()) {
                Vector<Object> row = new Vector<>();
                int price = resultSet.getInt("price");
                double gst = 0.10;
                double total_price = price * gst;
                price = 0;
                row.add(resultSet.getInt("sale_id"));
                row.add(resultSet.getString("customer_name"));
                row.add(resultSet.getString("bike_name"));
                row.add(resultSet.getInt("price") + total_price);
                row.add(resultSet.getString("payment_type"));
                row.add(resultSet.getDate("sale_date"));

                tableModel.addRow(row);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(390, 150, 760, 400);

    }

    private void filterByDate(java.util.Date date) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<>(model);
        table.setRowSorter(rowSorter);

        if (date == null) {
            rowSorter.setRowFilter(null); // Clear the filter
        } else {
            rowSorter.setRowFilter(RowFilter.dateFilter(ComparisonType.EQUAL, date, 5)); // 5 is the column index of the sale date in your table
        }
    }
    public static void main(String[] args) {
        new Sales().setVisible(true);
    }
}
