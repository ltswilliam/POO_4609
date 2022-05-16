/**
 * 
 */

/**			"UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE"
* NOMBRE: Llumitasig William				Lista:  
* FECHA: 13 may. 2022					PERIODO:Pregrado S-I MAY22-SEP22
* NRC: 4609
* EJERCICIO: 
* DESCRIPCION: 
*
* @author ZTX
*/

//librerias
import java.util.Scanner;
public class E04ParImpar1 {
	//Atrib
	
	//Public Ingresar desde otras clases
	//Private solo ingreso de la misma clase
	// Protect clases con herencia
	
	protected static int numero;
	
	public static void main(String[] args) {
		numero=0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Desea utilizar el programa SI NO");
		String opcion=leer.nextLine().toUpperCase();
		System.out.println("Valor de opcion: "+opcion);
		
		while (opcion.equals("SI")) {
			
			System.out.println("\nIngrese un numero ");
			numero=leer.nextInt();
			System.out.println("El numero es "+numero);
		
			if(numero>=0) {
				System.out.println("ES POSITIVO");
			}else {
				System.out.println("ES NEGATIVO");
			}
			System.out.println("\nDesea utilizar otra vez SI NO");
			System.out.println("Valor de opcion: "+opcion);
			opcion=leer.nextLine().toUpperCase();
			
		}
		
		System.out.println("Saliste, gracias por utilizar el programa...");
		
	}

}
