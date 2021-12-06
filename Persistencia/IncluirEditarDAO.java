/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Model.pessoas;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class IncluirEditarDAO {
    
    pessoas ojbpes = new pessoas();
    
    public int Incluir( pessoas objpes) throws SQLException{
        
        Conexao conexao = new Conexao();
        int registros;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement
        ("INSERT INTO pessoas (pes_cod, pes_nome, Pes_rg, pes_cpf, pes_telefone, pes_email)" + 
                 " VALEUS (?, ?, ?, ?, ?, ?, ?")) {
            pstmt.setString(1, objpes.getPes_nome().toUpperCase().trim());
            pstmt.setString(2, objpes.getPes_rg().trim());
            /*pstmt.setString(2, objpes.getPes_cpf().trim());*/
            pstmt.setString(4, objpes.getPes_telefone().trim());
            pstmt.setString(5, objpes.getPes_email().toUpperCase().trim());
            
            registros = pstmt.executeUpdate();
        }
        
        PreparedStatement pstmtAux = conexao.getConexao().prepareStatement("SELECT @@IDENTITY");
        ResultSet rs = pstmtAux.executeQuery();
        int codigo = 0;
    
        if ((registros==1)&&(rs != null)){
            rs.next();
            codigo = rs.getInt(1);
            return codigo; }
        else {
            return codigo;}
        
    }
    
public boolean Editar (pessoas objpes) throws SQLException
        {       
           Conexao conexao = new Conexao();
           int registros;
           try (PreparedStatement pstmt = conexao.getConexao ().prepareStatement
               ("update pessoas set pes_nome=?, pes_rg=?,pes_cpf=?, pes_end=?, pes_tel=?,pes_dtcadastro=?,pes_status where pes_id =?")){
                   
               pstmt.setString(1, objpes.getPes_nome().toUpperCase().trim());
               pstmt.setString(2, objpes.getPes_rg().trim());
               /*pstmt.setString(2, objpes.getPes_cpf().trim());*/
               pstmt.setString(4, objpes.getPes_telefone().trim());
               pstmt.setString(5, objpes.getPes_email().toUpperCase().trim());   
               registros = pstmt.executeUpdate();
           }  
        return registros == 1; 
       
           }   
    
}
