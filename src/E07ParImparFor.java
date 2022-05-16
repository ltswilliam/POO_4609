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
import java.util.Scanner;
public class E07ParImparFor {
	//librerias
	//Atrib Glob
	static int i;
	
	//Public Ingresar desde otras clases
	//Private solo ingreso de la misma clase
	// Protect clases con herencia
	
	
	public static void main(String[] args) {
		int numero=0;
		Scanner leer = new Scanner(System.in);
		
		for(i=0; i<10; i++) {
			System.out.println("\nIngrese un numero ");
			numero=leer.nextInt();
			System.out.println("El numero es "+numero);
		
			if(numero%2==0) {
				System.out.println("ES PAR");
			}else {
				System.out.println("ES IMPAR");
			}
		}
		valorr();
		
		
		System.out.println("Saliste, gracias por utilizar el programa...");
	}
	
	public static void valorr() {
		System.out.println("El valor de i es"+i);
	}
}
