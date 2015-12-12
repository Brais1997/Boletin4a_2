/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Brais
 */
public class Descontos {

    int prezoArtigo = Integer.valueOf(JOptionPane.showInputDialog("Prezo do artigo ?"));
    int cantArtigo = Integer.valueOf(JOptionPane.showInputDialog("Cantidades compradas ?"));
    int total = cantArtigo * prezoArtigo;
    double desconto;

    public void desconto() {
        System.out.println("Unidades : " + cantArtigo);
        System.out.println("Prezo unitario : " + prezoArtigo + "€");
        if (cantArtigo < 100) {
            System.out.println("Non hay desconto");
            desconto = 0;
        } else if (cantArtigo < 200) {
            if (prezoArtigo > 2000) {
                System.out.println("O desconto é do 5%");
                desconto = total - total * 0.05;
            } else {
                System.out.println("O desconto é do 2%");
                desconto = total - total * 0.02;
            }
        } else {
            if (prezoArtigo > 4000) {
                System.out.println("O desconto é do 10%");
                desconto = total - total * 0.1;
            } else {
                System.out.println("O desconto é do 8%");
                desconto = total - total * 0.08;
            }
        }
        System.out.println("Total a pagar : " + desconto +"€");
    }
}
