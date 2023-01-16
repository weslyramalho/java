/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operacoes;

import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class Operacoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalArgumentException{
        double a = 0, b = 0, c=0, delta = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o valor de ‘a’");
        a = sc.nextInt();
        System.out.println("Informe o valor de ‘b’");
        b = sc.nextInt();
        System.out.println("Informe o valor de ‘c’");
        c = sc.nextInt();
        
        delta = Math.pow(b, 2) - 4*a*c;
        if(delta<0){
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }else{   
        System.out.println("O valor de delta é: "+ delta);
        double xUm = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("O valor de x1 é: "+ xUm);
        double xDois = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("O valor de x1 é: "+ xDois);
        }  
    }
    
}
