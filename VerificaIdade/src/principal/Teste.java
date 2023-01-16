/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;
import static principal.Pessoa.comparaIdade;

/**
 *
 * @author wesly
 */
public class Teste {
    public static void main(String[] args) {
        Pessoa a = new Pessoa("Alan", 4);
        Pessoa b = new Pessoa("Maria", 25);
        comparaIdade(a,b);
     }
}
