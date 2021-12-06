/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author paulo
 */
public class pessoas {

    public pessoas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the pes_cod
     */
    public int getPes_cod() {
        return pes_cod;
    }

    /**
     * @param pes_cod the pes_cod to set
     */
    public void setPes_cod(int pes_cod) {
        this.pes_cod = pes_cod;
    }

    /**
     * @return the pes_nome
     */
    public String getPes_nome() {
        return pes_nome;
    }

    /**
     * @param pes_nome the pes_nome to set
     */
    public void setPes_nome(String pes_nome) {
        this.pes_nome = pes_nome;
    }

    /**
     * @return the pes_rg
     */
    public String getPes_rg() {
        return pes_rg;
    }

    /**
     * @param pes_rg the pes_rg to set
     */
    public void setPes_rg(String pes_rg) {
        this.pes_rg = pes_rg;
    }

    /**
     * @return the oes_cpf
     */
    public String getOes_cpf() {
        return oes_cpf;
    }

    /**
     * @param oes_cpf the oes_cpf to set
     */
    public void setOes_cpf(String oes_cpf) {
        this.oes_cpf = oes_cpf;
    }

    /**
     * @return the pes_telefone
     */
    public String getPes_telefone() {
        return pes_telefone;
    }

    /**
     * @param pes_telefone the pes_telefone to set
     */
    public void setPes_telefone(String pes_telefone) {
        this.pes_telefone = pes_telefone;
    }

    /**
     * @return the pes_email
     */
    public String getPes_email() {
        return pes_email;
    }

    /**
     * @param pes_email the pes_email to set
     */
    public void setPes_email(String pes_email) {
        this.pes_email = pes_email;
    }
    
    private int pes_cod;
    private String pes_nome;
    private String pes_rg;
    private String oes_cpf;
    private String pes_telefone;
    private String pes_email;

    public pessoas(int pes_cod, String pes_nome, String pes_rg, String oes_cpf, String pes_telefone, String pes_email) {
        this.pes_cod = pes_cod;
        this.pes_nome = pes_nome;
        this.pes_rg = pes_rg;
        this.oes_cpf = oes_cpf;
        this.pes_telefone = pes_telefone;
        this.pes_email = pes_email;
    }

    public Object getPes_cpf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
