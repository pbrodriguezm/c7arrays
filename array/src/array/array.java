package array;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// llamar a mi funcion
		int palabras[] = new int[3];
		palabras[0]=1;
		palabras[1]=1;
		palabras[2]=1;
		imprimitir(palabras);
	}

	private static void imprimitir(int[] palabras) {
		int resultado=0;
			for(int i=0;i<palabras.length;i++) {
				resultado=resultado+palabras[i];
				
				
				//PASO 1 CREA I=0;
				//PASO 2: PREGUNTA I<TAMAÑO
				//PASO 3: IMPRIMRE CODIGO
				//PASO4 4: SUMA I++
				//REGRESAR AL ´PASO 2
			}
			System.out.println(resultado);
	}


	


}
