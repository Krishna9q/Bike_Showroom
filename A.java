import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class A {
   
    public static void main(String[] args) {


        try{
            Class.forName ("com.mysql.cj.jdbc.Driver"); 
         Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom", "root",
         "k1010");

 Statement statement = connection.createStatement();

 ResultSet resultSet = statement.executeQuery("select sale.sale_id,customer.customer_name,bike_details.bike_name,bike_details.price,customer.payment_type,sale.sale_date from ((sale inner join bike_details ON sale.bike_id = bike_details.bike_id INNER JOIN customer ON sale.customer_id = customer.customer_id))");

                /* Step-2: Initialize PDF documents - logical objects */
                Document my_pdf_report = new Document();
                PdfWriter.getInstance(my_pdf_report, new FileOutputStream("bill/pdf_report_from_sql_using_java.pdf"));
                my_pdf_report.open();            
                //we have four columns in our table
                PdfPTable my_report_table = new PdfPTable(6);
                //create a cell object
                PdfPCell table_cell;
                

            // Table header
            Font tableHeaderFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.WHITE);
            table_cell = new PdfPCell(new Phrase("Sale_ID", tableHeaderFont));
            table_cell.setBackgroundColor(BaseColor.DARK_GRAY);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            my_report_table.addCell(table_cell);

            table_cell = new PdfPCell(new Phrase("Customer Name", tableHeaderFont));
            table_cell.setBackgroundColor(BaseColor.DARK_GRAY);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             my_report_table.addCell(table_cell);

           table_cell = new PdfPCell(new Phrase("Bike Name", tableHeaderFont));
            table_cell.setBackgroundColor(BaseColor.DARK_GRAY);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             my_report_table.addCell(table_cell);

             table_cell = new PdfPCell(new Phrase("Price", tableHeaderFont));
            table_cell.setBackgroundColor(BaseColor.DARK_GRAY);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             my_report_table.addCell(table_cell);

             table_cell = new PdfPCell(new Phrase("Payment_type", tableHeaderFont));
            table_cell.setBackgroundColor(BaseColor.DARK_GRAY);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             my_report_table.addCell(table_cell);

             table_cell = new PdfPCell(new Phrase("Date", tableHeaderFont));
            table_cell.setBackgroundColor(BaseColor.DARK_GRAY);
            table_cell.setHorizontalAlignment(Element.ALIGN_CENTER);
             my_report_table.addCell(table_cell);

            

                while (resultSet.next()) {                
                                String dept_id = resultSet.getString("sale_id");
                                table_cell=new PdfPCell(new Phrase(dept_id));
                                my_report_table.addCell(table_cell);
                                String dept_name=resultSet.getString("customer_name");
                                table_cell=new PdfPCell(new Phrase(dept_name));
                                my_report_table.addCell(table_cell);
                                String manager_id=resultSet.getString("bike_name");
                                table_cell=new PdfPCell(new Phrase(manager_id));
                                my_report_table.addCell(table_cell);
                                String location_id=String.valueOf(resultSet.getInt("price"));
                                table_cell=new PdfPCell(new Phrase(location_id));
                                my_report_table.addCell(table_cell);

                                String payment_type=resultSet.getString("payment_type");
                                table_cell=new PdfPCell(new Phrase(payment_type));
                                my_report_table.addCell(table_cell);

                                String date=String.valueOf(resultSet.getDate("sale_date"));
                                table_cell=new PdfPCell(new Phrase(date));
                                my_report_table.addCell(table_cell);
                                }
                /* Attach report table to PDF */
                my_pdf_report.add(my_report_table);                       
                my_pdf_report.close();
                
                /* Close all DB related objects */
                resultSet.close();
                statement.close(); 
                connection.close();   
        

        }catch(Exception e){
            System.out.println(e);

        }
    }


}
