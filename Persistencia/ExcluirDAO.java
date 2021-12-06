/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author paulo
 */
public class ExcluirDAO {
    public boolean Excluir(int cod) throws SQLException{
        Conexao conexao = new Conexao();
        int registros;
        try (PreparedStatement pstmt = conexao.getConexao().prepareStatement 
        ("delete from pessoas where pes_cod=?")){
            pstmt.setInt(1,cod);
            registros = pstmt.executeUpdate();
    }
        if (registros ==1){
            return true;}
        else{
            return false;}
        }
}
