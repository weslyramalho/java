/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author wesly
 */
public class Aula01 {

    
    public static void main(String[] args) {
        //System.out.println("Olá mUNDO");
        int op=0;
        Scanner sc = new Scanner(System.in);
        
        //JOptionPane.showMessageDialog(null, "Olá Mundo!");
        
        do{
            System.out.println("1 - Para somar\n"
                    + "2 - Para subtrair\n"
                    + "3 - Para multiplicar\n"
                    + "4 - Para dividir\n"
                    + "5 - Para raiz quadrada\n"
                    + "9 - Sair");
            op = sc.nextInt();

        }while(op != 9);
        
        switch(op){
            case 1:
                
                break;
                
            default:
                System.out.println("Saindo...");
        }
        
        
        int idade = 10;
        
        if (idade <= 18){
            JOptionPane.showMessageDialog(null, idade);
        }
        //String nome = JOptionPane.showInputDialog("Qual é o seu nome: ");
       // JOptionPane.showMessageDialog(null, "O nome digitado foi "+ nome);
    }
    
}
