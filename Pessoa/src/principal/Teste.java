/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList();
        
        
        System.out.printf("Entre com a quantidade de pessoas: ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0; i<n; i++){
        System.out.printf("Entre com o nome da pessoa: ");
        String nome = sc.nextLine();
        System.out.printf("Entre com a idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        
        list.add(i,new Pessoa(nome, idade));
        
        }
        System.out.println("imprimir pessoa");
   
        Pessoa p = list.stream().max(Comparator.comparingInt(Pessoa::getIdade)).get();
        System.out.println("maior idade: "+ p.toString());
       
        Pessoa menorI = list.stream().min(Comparator.comparingInt(Pessoa::getIdade)).get();
        System.out.println("maior idade: "+ menorI.toString());
    }
    
}
