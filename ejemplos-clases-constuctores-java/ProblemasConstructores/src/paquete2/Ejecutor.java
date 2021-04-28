/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        
	Hospital hospital = new Hospital("Loja", "Agustin", 20, 20);
	System.out.println(hospital.toString());        
    }
}
