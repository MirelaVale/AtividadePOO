/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadepessoa;
import modelo.Pessoa;

public class Principal {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Ruth", 16);
        
        p1.fazAniversario();
        p1.fazAniversario();
        
        System.out.println(p1.nome + ": " + p1.idade + " anos");
    }
    
}