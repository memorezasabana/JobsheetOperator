/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konversi.suhu;

/**
 *
 * @author TUF
 */
import java.util.Scanner;
public class KonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi
        double celcius, fahrenheit;
        
        ///membuat scanner baru
        Scanner baca = new Scanner(System.in) ;
        
        //input
        System.out.println("Suhu Celcius ke Fahrenheit");
        System.out.print("Celcius: ") ;
        celcius = baca.nextInt() ;
        
        //proses
        fahrenheit = Double.valueOf((9/5 * celcius) + 32);
        
        //output
        System.out.println("F:" + fahrenheit);
      
    }
    
}
