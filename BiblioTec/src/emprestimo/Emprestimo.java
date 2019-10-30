/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emprestimo;

/**
 *
 * @author aprendizti
 */
public class Emprestimo {
 
    private int idEmprestimo;
    private int idCliente;
    private int idLivro;
    private String dtEmprestimo;
    private String dtDevolucao;
    
    
    public int getIdEmprestimo(){
        return idEmprestimo;
    }
    
    public void setIdEmprestimo(int idEmprestimo){
        this.idEmprestimo = idEmprestimo;
    }
    
    public int getIdCliente(){
        return idCliente;
    }
    
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
    public int getIdLivro(){
        return idLivro;
    }
    
    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }
    
    public String getDtEmprestimo(){
        return dtEmprestimo;
    }
    
    public void setDtEmprestimo(String dtEmprestimo){
        this.dtEmprestimo = dtEmprestimo;
    }
    
    public String getDtDevolucao(){
        return dtDevolucao;
    }
    
    public void setDtDevolucao(String dtDevolucao){
        this.dtDevolucao = dtDevolucao;
    }    
}
