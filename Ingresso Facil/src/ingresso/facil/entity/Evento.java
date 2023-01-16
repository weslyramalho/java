/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ingresso.facil.entity;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import ingresso.facil.entity.Ingresso;

/**
 *
 * @author wesly
 */
public class Evento {
    
    private String nome;
    private Date data;
    private double valorUnico;
    private int capacidadeMaxima;

    private List<Ingresso> ingressos = new ArrayList<>();

    public Evento() {
    }

    public Evento(String nome, Date data, double valorUnico, int capacidadeMaxima) {
        this.nome = nome;
        this.data = data;
        this.valorUnico = valorUnico;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(double valorUnico) {
        this.valorUnico = valorUnico;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
    
      public void venderIngresso(Ingresso ingresso){
        if(getCapacidadeMaxima() > getIngressos().size()){
            ingressos.add(ingresso);
        }
        else{
            System.out.println("Ops! Todos os Ingressos já foram vendidos!");
        }
    }
      public void ingressosVendidos(){
           System.out.println("Foram vendidos "+  getIngressos().size() + " Ingressos");
      }
    
    
    
    
}
