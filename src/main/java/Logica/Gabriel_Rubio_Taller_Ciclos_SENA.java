/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Logica;

/**
 *
 * @author USUARIO
 */

public class Gabriel_Rubio_Taller_Ciclos_SENA {

    public static void main(String[] args) {
        System.out.println("Procesando... ");
        for(int i = 1; i<=100; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
               
            }
            System.out.print("\rProgreso: " + i + "%");
            
        }
        
         
    }
}
