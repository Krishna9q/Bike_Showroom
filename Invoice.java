import java.io.FileOutputStream;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;




class Invoice{
  public String payment;
  public static String in_n;
   static String IN;
   
  Invoice(int customer_id2,String customer_name){
     int bike_Id  =0;
   IN = "Invoice No:";
        try {
          Random e = new Random(); 
            String path = "bill/"+customer_name+".pdf";
            Document dc = new Document();
            PdfWriter.getInstance(dc, new FileOutputStream(path));

            dc.open();
            // showroom
             
             Font f = new Font();
             f.setSize(40);
            Paragraph h =  new Paragraph("Invoice", f);
            h.setAlignment(Element.ALIGN_RIGHT);
            dc.add(h);
           
           // Random e = new Random(); 
            Font inn = new Font();
            inn.setSize(14);
            
            String in_n =(String.format("%04d", e.nextInt(10000)));
            String Fin_n = IN+in_n;
            Paragraph inNo = new Paragraph(Fin_n,inn);
            inNo.setAlignment(Element.ALIGN_RIGHT);
            dc.add(inNo);
           
               Font name = new Font();
               name.setSize(20);
               Paragraph Name = new Paragraph("BAJAJ SHOWROOM",name);
               
               Name.setAlignment(Element.ALIGN_LEFT);
               dc.add(Name);           
            
            //doc.add(new Paragraph("Invoce", f));
          
            Paragraph F = new Paragraph("\nAddress : Bajaj Showroom Near Sant Singaji Collage Sandalpur \nContact : 9857465427\nEmail : kdyadav@gmail.com");
            F.setAlignment(Element.ALIGN_LEFT);
            dc.add(F);
            
          
            // customer Data
         
            String Customer_Name ="";
           String Mob ="";
            String Add ="";
            String email ="";
           
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/showroom", "root", "k1010");

              PreparedStatement psC = con.prepareStatement("select customer_name,mobile_number,email,address,payment_type,bike_id from customer where customer_id ="+customer_id2);
              
              ResultSet rsc = psC.executeQuery();
              while(rsc.next()){ 

                Customer_Name  = rsc.getString(1);
                Mob  = rsc.getString(2);
                email = rsc.getString(3);
                Add  = rsc.getString(4);
                payment = rsc.getString(5);
                bike_Id  = rsc.getInt(6);
            
              };
              
            
              
             dc.add(new Paragraph("-----------"));
                 
            
             Font c = new Font();
            c.setSize(12);
            Paragraph to = new Paragraph("\nCustomer name : "+Customer_Name+"\nMob.No : "+Mob+"\nEmail : "+email+"\nAddress : "+Add+"",c);
                to.setAlignment(Element.ALIGN_LEFT);
                        dc.add(to);
                        
            dc.add(new Paragraph(" "));
            dc.add(new Paragraph("Bike Details : ",c));
            dc.add(new Paragraph(" "));
          
           
            PdfPTable table = new PdfPTable(8);
            table.setWidthPercentage(100);
            table.setWidths(new float[]{2, 2, 2, 2, 2, 2, 2, 2});

            PdfPCell cell;

            // Table header
            Font tableHeaderFont = new Font(Font.FontFamily.HELVETICA, 14, Font.BOLD, BaseColor.WHITE);
            cell = new PdfPCell(new Phrase("Bike Name", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Model Name", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Color", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Engine", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Quantity", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Price", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("GST", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            cell = new PdfPCell(new Phrase("Total Cost", tableHeaderFont));
            cell.setBackgroundColor(BaseColor.GRAY);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(cell);

            PreparedStatement ps = con.prepareStatement("select bike_name,model_name,color,engine,price from bike_details where bike_id = "+bike_Id);
            String B_Name = "";
            String Model = "";
            String Color = "";
            String Engine  = "";
            Double price  = 0.0;

            ResultSet rs = ps.executeQuery();
            while(rs.next()){
              B_Name = rs.getString(1);
              Model = rs.getString(2);
              Color = rs.getString(3);
              Engine = rs.getString(4);
              price = rs.getDouble(5);
            }

            int in_no = Integer.parseInt(in_n);
            PreparedStatement psd = con.prepareStatement("insert into sale (sale_date, bike_id, customer_id, invoice_number) values (?,?,?,?)");

            
           java.util.Date d = new java.util.Date();
          psd.setTimestamp(1,new java.sql.Timestamp(d.getTime()));
          psd.setInt(2, bike_Id);
          psd.setInt(3, customer_id2);
          psd.setInt(4, in_no);
        
          

          psd.executeUpdate();

           
            

          
             cell = new PdfPCell(new Phrase(B_Name));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);

                      cell = new PdfPCell(new Phrase(Model));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);
                    
                      cell = new PdfPCell(new Phrase(Color));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);

                      cell = new PdfPCell(new Phrase(Engine));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);

                      cell = new PdfPCell(new Phrase("1"));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);

                    cell = new PdfPCell(new Phrase(String.valueOf(price)));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);
                    

                    double gst = 0.10;
                    
                    double gst_price = price*gst;
                    String gst1 = String.format("%.2f",gst_price);
                    


                      cell = new PdfPCell(new Phrase(String.valueOf(gst1)));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);
                    
                    double totalAmount = price+gst_price;


                      cell = new PdfPCell(new Phrase(String.valueOf(totalAmount)));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    table.addCell(cell);

            

            dc.add(table);




             PdfPTable total = new PdfPTable(2);
             total.setWidthPercentage(40);
             total.setSpacingAfter(5f);
             total.setSpacingBefore(50f);
             float tcolomwidth[] = {10,15} ;
             total.setWidths(tcolomwidth);
          
             total.setHorizontalAlignment(Element.ALIGN_RIGHT);
 
 
              PdfPCell tcell1 = new PdfPCell( new Paragraph("Total",tableHeaderFont));
               tcell1.setBackgroundColor(BaseColor.GRAY);
            tcell1.setHorizontalAlignment(Element.ALIGN_CENTER);
            
             total.addCell(tcell1);
 
              PdfPCell tcell2 = new PdfPCell(new Paragraph(" Payment Status",tableHeaderFont));
               tcell2.setBackgroundColor(BaseColor.GRAY);
            tcell2.setHorizontalAlignment(Element.ALIGN_CENTER);
           
              total.addCell(tcell2);
             
                cell = new PdfPCell(new Phrase(String.valueOf(totalAmount)));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    total.addCell(cell);
                    
                 //   Customer c1 = new Customer();

                  
             
               cell = new PdfPCell(new Phrase(payment));
                    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                    total.addCell(cell);
                        
              dc.add(total);
            
 
             

             System.out.println("Done");
             dc.close();

        } catch (Exception e) {
            System.out.println(e);
        }
  
}
}