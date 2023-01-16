/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author wesly
 */
public class Calculadora {

    public static void main(String[] args) {
        Calcular cal = new Calcular();
        int op=0;
        double a=0,b=0;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1 - Para somar\n"
                    + "2 - Para subtrair\n"
                    + "3 - Para multiplicar\n"
                    + "4 - Para dividir\n"
                    + "5 - Para raiz quadrada\n"
                    + "0 - Sair");
            op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Digite o primeiro valor");
                a = sc.nextDouble();
                System.out.println("Digite o segundo valor");
                b = sc.nextDouble();
                System.out.println("A soma de "+ a + "+" + b + " = "+ cal.somar(a, b));
                break;
            case 2:
                System.out.println("Digite o primeiro valor");
                a = sc.nextDouble();
                System.out.println("Digite o segundo valor");
                b = sc.nextDouble();
                System.out.println("A subtracao de "+ a + "-" + b + " = "+ cal.subtrair(a, b));
                break;
                
            case 3:
                System.out.println("Digite o primeiro valor");
                a = sc.nextDouble();
                System.out.println("Digite o segundo valor");
                b = sc.nextDouble();
                System.out.println("A Multiplicacao de "+ a + "x" + b + " = "+ cal.multiplicar(a, b));
                break;
                
            case 4:
                System.out.println("Digite o primeiro valor");
                a = sc.nextDouble();
                System.out.println("Digite o segundo valor");
                b = sc.nextDouble();
                System.out.println("A Divisao de "+ a + "/" + b + " = "+ cal.Dividir(a, b));
                break;
            
            case 5:
                System.out.println("Digite o numero que deseja saber a raiz");
                a = sc.nextDouble();
                System.out.println("A raiz quadrada de "+ a +" = "+ cal.raiz(a));
                break;
            default:
                System.out.println("Saindo...");
        }   
        }while(op != 0);

    }
    
}
