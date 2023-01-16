/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresso.facil.entity;

import java.text.SimpleDateFormat;

/**
 *
 * @author wesly
 */
public class Ingresso {
    
    private String nome;
    private String cpf;
    private Evento evento;
    private Integer categoria;

    public Ingresso() {
    }

    public Ingresso(String nome, String cpf, Evento evento, Categoria categoria) {
        this.nome = nome;
        this.cpf = cpf;
        this.evento = evento;
        this.categoria = categoria.getCod();
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Categoria getCategoria() {
        return Categoria.toEnum(categoria);
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria.getCod();
    }
    
    public void calcularValorIngresso(Categoria categoria){
        if(categoria.equals(Categoria.CAMAROTE)){
            double valor = evento.getValorUnico()+(evento.getValorUnico()*0.60); 
            evento.setValorUnico(valor);
            
        }else if(categoria.equals(Categoria.VIP)){
            double valor = evento.getValorUnico()+(evento.getValorUnico()*0.30); 
            evento.setValorUnico(valor);
        }else{
            evento.getValorUnico();
        }
    }
    
    public void imprimirValor(Categoria categoria){
        if(categoria.equals(Categoria.CAMAROTE)){
            System.out.println("Camarote "+ evento.getValorUnico());
        }else if(categoria.equals(Categoria.VIP)){
            System.out.println("Vip "+ evento.getValorUnico());
        }else{
            System.out.println("Pista" + evento.getValorUnico());
        }
    }
    
    public void mostrarResumo(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Resumo");
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Data: " + sdf.format(evento.getData()));
    }

    
  
    
    
}
