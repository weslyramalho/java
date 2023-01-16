/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author wesly
 */
public class Executa {
    private double num1;
    private double num2;
    private double num3;

    public Executa(double num1, double num2, double num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        System.out.println("SOMA: "+ soma(num1, num2, num3) + "\n"
                            +"MEDIA: "+media(num1, num2, num3));
        
    }
    public double soma(double num1, double num2, double num3){
        return num1+num2+num3;
    }
    public double media(double num1, double num2, double num3){
        return soma(num1,num2,num3)/3;
    }
    
    
}
