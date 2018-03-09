/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjava1.pkg2;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class EjerciciosJava12 {
    
    //Ejercicio Maximos
    public int[] maximo(int[] listaNumeros) {
	int[] numerosMaximos = new int[2];					//Array para guardar los máximos
	
	for (int i = 0; i < listaNumeros.length; i++) {				//Con esto recorremos los arrays
	    if (numerosMaximos[0] < listaNumeros[i]) {			
		numerosMaximos[1] = numerosMaximos[0];			
		numerosMaximos[0] = listaNumeros[i];
	    } else if (numerosMaximos[1] < listaNumeros[i]) {			
		numerosMaximos[1] = listaNumeros[i];				
	    }
	}
	return numerosMaximos;
    }
    
    //Ejercicios Palindromo 
    public boolean palindromo(String frase) {
	boolean palindromo = true;
	String fraseSimple = frase.toUpperCase();				//Primero comprobamos quitamos los posibles errores. 
	fraseSimple = fraseSimple.replaceAll("Á", "A");				//Para ello lo pasamos todo a mayúsculas,
	fraseSimple = fraseSimple.replaceAll("Ä", "A");				//quitamos acentos y reemplazamos la 'Ñ'.

	fraseSimple = fraseSimple.replaceAll("É", "E");
	fraseSimple = fraseSimple.replaceAll("Ë", "E");

	fraseSimple = fraseSimple.replaceAll("Í", "I");
	fraseSimple = fraseSimple.replaceAll("Ï", "I");

	fraseSimple = fraseSimple.replaceAll("Ó", "O");
	fraseSimple = fraseSimple.replaceAll("Ö", "O");

	fraseSimple = fraseSimple.replaceAll("Ú", "U");
	fraseSimple = fraseSimple.replaceAll("Ü", "U");

	fraseSimple = fraseSimple.replaceAll("Ñ", "n");

	fraseSimple = fraseSimple.replaceAll("\\W", "");			//Ahora quitamos el resto de símbolos que no sean letras.

	for (int i = 0; i < fraseSimple.length() / 2; i++) {			//Aquí recorremos el Array haciendo las comprobaciones.
	    if (fraseSimple.charAt(i) != fraseSimple.charAt(fraseSimple.length() - i - 1) && palindromo == true) {
		palindromo = false;
	    }
	}
	return palindromo;
    }
    
    

  //Ejercicio Del Isograma Resuelto
    public boolean isograma(String palabra) {
	boolean esIsograma = true;						
	int letrasRepetidas;							
	for (int i = 0; i < palabra.length(); i++) {				
	    letrasRepetidas = 0;						
	    for (int j = 0; j < palabra.length(); j++) {				
		if (palabra.charAt(i) == palabra.charAt(j)) {			
		    letrasRepetidas++;
		}
	    }
	    if (letrasRepetidas > 1) {						
		esIsograma = false;
	    }
	}

	return esIsograma;
    }
    
    //Ejercicio del Calendario resuelto 
   public void calendario(int retraso) {
	int diasSemana = 0;						
	String[] calendario = new String[31];				
	for (int i = 0; i < retraso; i++) {					
	    if (diasSemana < 7) {
		System.out.print("XX ");
		diasSemana++;
	    } else {							
		System.out.println();
		System.out.print("XX ");
		diasSemana = 1;
	    }
	}
	for (int i = 0; i < calendario.length; i++) {			
	    if (diasSemana < 7) {					
		if (i < 9) {
		    System.out.print("0");
		}
		System.out.print((i + 1) + " ");
		diasSemana++;
	    } else {
		System.out.println();
		if (i < 9) {
		    System.out.print("0");
		}
		System.out.print((i + 1) + " ");
		diasSemana = 1;
	    }
	}
	for (int i = diasSemana; i < 7; i++) {			
	    System.out.print("XX ");
	}
	System.out.println();
    }
//Ejercicio Anagrana 
   public static boolean anagrama (String palabra1, String palabra2){
       char[]  array1 = palabra1.toCharArray();
       char[] array2 =  palabra2.toCharArray();
       Arrays.sort(array1);
       Arrays.sort(array2);
       return new String(array1).equals(new String(array2));
       
    }
   
   //Ejercicio de escalera de palabras:
   public boolean escaleraDePalabras(char[][] escalera) {
	boolean esEscalera = true;						
	int letrasDiferentes;							
	for (int fila = 0; fila < escalera.length - 1; fila++) {		
	    letrasDiferentes = 0;						
	    if (escalera[fila].length == escalera[fila + 1].length) {		
		for (int columna = 0; columna < escalera[fila].length; columna++) {
		    if (escalera[fila][columna] != escalera[fila + 1][columna]) {
			letrasDiferentes++;
		    }
		    if (letrasDiferentes > 1) {					
			esEscalera = false;
		    }
		}
	    } else {
		System.out.println("Las palabras tienen distinta longitud");
	    }
	}
	return esEscalera;
    }
   
}
