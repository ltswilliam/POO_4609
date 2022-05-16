import java.util.Scanner;

/**
 * 
 */

/**			"UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE"
* NOMBRE: Llumitasig William				Lista:  
* FECHA: 11 may. 2022					PERIODO:Pregrado S-I MAY22-SEP22
* NRC: 4609
* EJERCICIO: 
* DESCRIPCION: 
*
* @author ZTX
*/
public class E03Suma3 {
	// Atrib Globales
	static Scanner Leer=new Scanner(System.in);
	static int numero1,  numero2;
    static int suma;
	// Metodos
	
	public static void main(String[] args) {
		// Atrib locales
		
		// Ingreso de datos
        IngresarDatos();
        //Proceso
        suma=numero1+numero2;
        //Salida de datos
        MostrarDatos(suma);  
	}
	
	public static void IngresarDatos() {
		System.out.println("Ingrese primer numero");    
        numero1=Leer.nextInt();
        System.out.println("Ingrese segundo numero");    
        numero2=Leer.nextInt();
	}
	
	public static void MostrarDatos(int suma) {
		System.out.printf("La suma es: %d",suma);
	}

}








