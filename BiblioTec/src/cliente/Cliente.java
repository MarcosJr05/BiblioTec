/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;




/**
 *
 * @author aprendizti
 */
public class Cliente {
    
    private int id;
    private String nome;
    private String dtNasc;
    private String cpf;
    private String contato;
    
   
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getContato(){
        return contato;
    }
    
    public void setContato(String contato){
        this.contato = contato;
    }
    
    public String getDtNasc(){
        return dtNasc;
    }
    
    public void setDtNasc(String dtNasc){
        this.dtNasc = dtNasc;
    }
}
