
package university;

import java.sql.*;
import javax.swing.JOptionPane;


public class myconnection{
       static  Connection con;
       public static  Connection getConnection() {
         
       try
       {
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bassam","admin","");
      // JOptionPane.showMessageDialog(null,"تم التصال");
       }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return con;
            }

       private myconnection() {
       }
//       public static void main(String[] args) {
//        con=getConnection();
//    }
   }
