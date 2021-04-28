/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
        */
        Scanner read = new Scanner(System.in);
	
	System.out.println("Ingrese nombre ciudad: ");
	String nombreCiudad = read.next()
	
	System.out.println("Ingrese nombre hospital: ");
	String nombreHospital = read.next();
	
	System.out.println("Ingrese número doctores: ");
	int numDoctores = read.nextInt();

	System.out.println("Ingrese número enfermeros");
	int numEnfermeros = read.nextInt();
	
	Hospital hospital = new Hospital(nombreCiudad, nombreHospital, numDoctores, numEnfermeros);
	System.out.println(hospital.toString());        
   }
}
