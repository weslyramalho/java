/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculamedia;

import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class CalculaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        double soma=0, media=0, tot=0;
        System.out.println("Calcula Media");
        while(num < 1000){
            num++;
                //System.out.println(num+ " - ");  

            if(num % 2 != 0){
                tot++;
                soma += num;
            }
        }
        media =(soma/tot);
        System.out.println("Quantidade de numeros impares: "+ tot); 
        System.out.println("A soma é : "+ soma); 
        System.out.println("A media: "+ media); 



        
    }
    
}
