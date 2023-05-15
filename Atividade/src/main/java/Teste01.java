
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author KENDAL
 */
public class Teste01 {
    public static void main(String[] args){
    int a,b,divisao,resto;
String entrada;
entrada = JOptionPane.showInputDialog("Informe um numero inteiro");
a= Integer.parseInt(entrada);
entrada= JOptionPane.showInputDialog("Informe outro número inteiro");
b= Integer.parseInt(entrada);
divisao = a/b;
resto = a % b;
JOptionPane.showMessageDialog(null,"a/b = " + divisao ); 
JOptionPane.showMessageDialog(null,"a%b = " + resto );
    }
}
