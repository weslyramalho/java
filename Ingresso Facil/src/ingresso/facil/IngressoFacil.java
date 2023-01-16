/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ingresso.facil;

import ingresso.facil.entity.Categoria;
import ingresso.facil.entity.Evento;
import ingresso.facil.entity.Ingresso;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class IngressoFacil {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);
        Evento evento = new Evento();
        evento.setNome("alrora");
        evento.setCapacidadeMaxima(255);
        evento.setData(sdf.parse("22/09/2022"));
        evento.setValorUnico(100);
        Ingresso ingresso = new Ingresso();
        ingresso.setNome("ana");
        ingresso.setCpf("55555");
        ingresso.setEvento(evento);
        ingresso.setCategoria(Categoria.VIP);
        evento.venderIngresso(ingresso);
        ingresso.calcularValorIngresso(Categoria.toEnum(1));
        ingresso.imprimirValor(Categoria.toEnum(1));
        evento.ingressosVendidos();
        ingresso.mostrarResumo();
        
    }
}
