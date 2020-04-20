package dev;

public class Calculos implements ICalc {

	private double[] arreglo;
	ReadFileIntoList lectura_archivos = new ReadFileIntoList(); // lectura csv

	public Calculos(String dirpath) {

		lectura_archivos.IngresoDatos(dirpath); // ingresa csv a arrreglo
		arreglo = new double[lectura_archivos.getTamanio()];
		for (int i = 0; i < lectura_archivos.getTamanio(); i++) {
			arreglo[i] = lectura_archivos.getDatos(i);
		}
	}

	public Calculos(double[] arregloX) {
		arreglo = new double[arregloX.length];
		for (int i = 0; i < arreglo.length; i++) {
			arreglo[i] = arregloX[i];
		}
	}

	private double LogaritmoNatural(double[] arreglo) {
		double sum_logaritmoNatural = 0;
		for (double element : arreglo) {
			sum_logaritmoNatural += Math.log(element);
		}
		return sum_logaritmoNatural; // calculo suma lognat
	}

	private double Varianza() {
		double desviacion = 0;
		double prom = promedio(LogaritmoNatural(arreglo), arreglo.length);
		for (double element : arreglo) {
			desviacion += Math.pow(Math.log(element) - prom, 2);
		}
		return Math.sqrt(desviacion / (arreglo.length - 1)); // calculoVarianza
	}

	private double promedio(double LogNat, int tam) {

		return LogNat / tam; // calculo prom
	}

	@Override
	public double imprimir(int index) { // impresion
		double prom = promedio(LogaritmoNatural(arreglo), arreglo.length);
		double var = Varianza();
		double[] arr2 = new double[5];
		arr2[0] = Math.pow(Math.E, prom - 2 * var);
		arr2[1] = Math.pow(Math.E, prom - var);
		arr2[2] = Math.pow(Math.E, prom);
		arr2[3] = Math.pow(Math.E, prom + var);
		arr2[4] = Math.pow(Math.E, prom + 2 * var);
		return arr2[index];
	}

}
