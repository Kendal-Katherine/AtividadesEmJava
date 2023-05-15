/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;
import javax.swing.JOptionPane;

/**
 *
 * @author KENDAL
 */
public class Atividade {

    public static void main(String[] args) {
        Double n1=Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O VALOR DO PRIMEIRO NÚMERO"));
        Double n2=Double.parseDouble(JOptionPane.showInputDialog(null, "DIGITE O VALOR DO SEGUNDO NÚMERO"));
        JOptionPane.showMessageDialog(null,"A MULTIPLICAÇÃO DOS NÚMEROS É: " + (n1*n2));
    }
}
