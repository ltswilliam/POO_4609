/**			"UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE"
* NOMBRE: Llumitasig William				Lista:  
* FECHA: 11 may. 2022					PERIODO:Pregrado S-I MAY22-SEP22
* NRC: 4609
* EJERCICIO: 
* DESCRIPCION: 
*
* @author ZTX
*/
import java.util.Scanner;

public class E02Suma{
	//Atributos
	//Metodos
	public static void main(String[]  args){
		short numero1,  numero2;
        int suma;
        String nombre;
        Scanner Leer=new Scanner(System.in);
        // Ingreso de datos
        System.out.print("Ingrese un nombre");    
        nombre=Leer.nextLine();
        System.out.print("Ingrese un numero");    
        numero1=Leer.nextShort();
         System.out.println("Ingrese un segundo numero");    
        numero2=Leer.nextShort();
        //Proceso 
        suma=numero1+numero2;
        //Salida de datos
        System.out.println("La suma es:"+suma+"\nEl nombre es: "+nombre);
    }
}
