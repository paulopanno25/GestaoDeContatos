package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexao {
  
 
public static String base="GestaoContato";



    private static Connection conexao;
    public Conexao()
    { try
        {
    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    String url = "jdbc:sqlserver://localhost:1433;databaseName=db_loja;user=javassim;password=123456";        
    
  /// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 ///  String url = "jdbc:odbc:myodbc;database="+base+";user=sa;password=";          
            
     
          conexao = DriverManager.getConnection(url);
          System.out.println("conexao ok");        
          
        }
        catch(Exception erro){
            JOptionPane.showMessageDialog(null,
          "Ocorreu um erro de conexão. Verifique a Base de Dados indicada !"+"\n" +  erro.getMessage(),"Conexão",3);
            erro.printStackTrace();
        }
    }

    // Mtodos pblicos:
    public Connection getConexao()
    {
        return conexao;
        
    }
    
   public void getConexaoFechar()
    {
    try {
        conexao.close();
    } catch (SQLException ex) {
        Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }     
    
    
   


}