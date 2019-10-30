/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livro;

/**
 *
 * @author aprendizti
 */
public class Livro {
    
   private int id;
   private String titulo;
   private String autor;
   private byte edicao;
   private short ano;
   private String categoria;
   private String disponibilidade;
   
   public int getId() {
       return id;
   }
   
   public void setId (int id){
       this.id = id;
   }
   
  public String getTitulo() {
       return titulo;
   }
  
   public void setTitulo (String titulo){
       this.titulo = titulo;
   }
   
   public String getAutor() {
       return autor;
   }
   
   public void setAutor (String autor){
       this.autor = autor;
   }
   
   public byte getEdicao() {
       return edicao;
   }
   
   public void setEdicao (byte edicao){
       this.edicao = edicao;
   }
   
   public short getAno() {
       return ano;
   }
   
   public void setAno (short ano){
       this.ano = ano;
   }
   
   public String getCategoria() {
       return categoria;
   }
   
   public void setCatgoria (String categoria){
       this.categoria = categoria;
   }
   
   public String getDisponibilidade() {
       return disponibilidade;
   }
   
   public void setDisponibilidade (String disponibilidade){
       this.disponibilidade = disponibilidade;
   }
   
}
