/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsberorientasiobjek;

/**
 *
 * @author LENOVO
 * 
 * 
 */

class sepedamotor{ //class
    String merek;
    String warna; //variabel
    String jenisprusahan;
    String tahun;
       
}
        
public class Utsberorientasiobjek {
    public static void main(String[] args) { //metode
        sepedamotor sepedamotorku = new sepedamotor(); //instansiasi
        sepedamotorku.merek = "vario";
        sepedamotorku.warna = "merah";
        sepedamotorku.jenisprusahan = "honda";
        sepedamotorku.tahun = "2015";
        
       System.out.println ("merek"+sepedamotorku.merek);
       System.out.println ("warna"+sepedamotorku.warna);
       System.out.println ("jenisprusahan"+sepedamotorku.jenisprusahan);
       System.out.println ("tahun"+sepedamotorku.tahun);   
       
        
    }
    
}
