/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author wesly
 */
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    static void comparaIdade(Pessoa a, Pessoa b){
        if(a.idade > b.idade){
            System.out.println("O mais velho é: "+ a.nome);
            System.out.println("O mais novo é: "+ b.nome);
        }else{
            System.out.println("O mais velho é: "+ b.nome);
            System.out.println("O mais novo é: "+ a.nome);
        }
    }
    
}
