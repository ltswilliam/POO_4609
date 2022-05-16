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
public class E06ParImparDoWhile {
	//Atrib
	
	//Public Ingresar desde otras clases
	//Private solo ingreso de la misma clase
	// Protect clases con herencia
	
	protected static int numero;
	
	public static void main(String[] args) {
		numero=0;
		Scanner leer = new Scanner(System.in);
		String opcion= "SI";
		
		
		do {
			
			System.out.println("Valor de opcion: "+opcion);
			System.out.println("\nIngrese un numero ");
			numero=leer.nextInt();
			System.out.println("El numero es "+numero);
		
			if(numero%2==0) {
				System.out.println("ES PAR");
			}else {
				System.out.println("ES IMPAR");
			}
			System.out.println("\nDesea utilizar otra vez SI NO");
			opcion = leer.nextLine().toUpperCase();
		}while (opcion.equals("SI"));
		
		System.out.println("Saliste, gracias por utilizar el programa...");
		
	}

	

}
