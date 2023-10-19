public class DashBoard {
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true); 
            }
        });
       
         
    }     

}