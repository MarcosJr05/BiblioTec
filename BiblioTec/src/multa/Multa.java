/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multa;

/**
 *
 * @author aprendizti
 */
public class Multa {
    
    private int idMulta;
    private int idCliente;
    private String descricao;
    private float valor;
    
    public int getIdMulta(){
        return idMulta;
    }
    
    public void setIdMulta(int idMulta){
        this.idMulta = idMulta;
    }
    
     public int getIdCliente(){
        return idCliente;
    }
     
    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
    
     public String getDescricao(){
        return descricao;
    }
     
    public void setDescricao(String descricao ){
        this.descricao = descricao;
    }
    
     public float valor(){
        return valor;
    }
     
    public void setValor(float Valor){
        this.valor = valor;
    }
    
    
    
}
