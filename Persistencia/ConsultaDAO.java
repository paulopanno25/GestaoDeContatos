/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class ConsultaDAO {
    public static ResultSet carregaTabela (String tipo, String arg) throws SQLException
    {
        String argumento=tipo+" "+"like'"+arg+"%'";
        
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement(
              "SELECT pes_cod,pes_nome,pes_rg,pes_cpf,pes_tel,pes_email FROM pessoas where "+argumento+"");
             
                ResultSet rs = pstmt.executeQuery();
                
                return rs;
    }
public static ResultSet carregaTabela() throws SQLException
    {
        Conexao conexao = new Conexao();
        PreparedStatement pstmt = conexao.getConexao().prepareStatement(
                "SELECT pes_id.pes_nome,pes_rg,pes_cpf,pes_tel,pes_status FROM pessoas");
                ResultSet rs = pstmt.executeQuery();
                return rs;
    }   
}
