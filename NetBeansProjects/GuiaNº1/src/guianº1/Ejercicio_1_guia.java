
package guianº1;

import java.lang.*; //llamar a todas las demas librerias
import java.io.*; //indica entrada y salida de datos
import java.util.*; // todas las librerias utiles para programador

public class Ejercicio_1_guia {

   
    public static void main(String[] args) {
        // TODO code application logic here
    double num1,num2,resultado; //defino las variable como double para que lea los decimales
    
    Scanner Teclado = new Scanner (System.in);
    
    System.out.println("ingrese numero 1");
    num1 = Teclado.nextDouble();
    
    System.out.println("ingrese numero 2");
    num2 = Teclado.nextDouble();
    
    resultado = num1 + num2;
    
    System.out.println("su resultado es: "+resultado);     
    
    }
    
    
}
