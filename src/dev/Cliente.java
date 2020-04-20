package dev;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		System.out.println("ingrese la ruta del archivo .csv de una columnas sin encabezado");
		System.out.println("Se calculara tamaños relativos");
		System.out.println(".................................");

		Scanner myObj = new Scanner(System.in); // Un objeto lector para ingreso data
		String dirpath = myObj.nextLine();
		myObj.close();

		ICalc calculos = new Calculos(dirpath); // clase calculos ingresa la ruta

		System.out.println("XS:  " + calculos.imprimir(0));
		System.out.println("S:  " + calculos.imprimir(1));
		System.out.println("M:  " + calculos.imprimir(2));
		System.out.println("L:  " + calculos.imprimir(3));
		System.out.println("XL:  " + calculos.imprimir(4));

		/// /home/sebastiangilpatino/eclipse-workspace/PSPact4/data/prueba.csv

	}

}
