package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		ArrayList<Estudiante> lista = new ArrayList<Estudiante>();

		int carne;
		Double numcredito;
		Double vcredito;
		Double pordescuento;
		Double veces;
		System.out.println("ingrese numero de estudiantes: ");
		veces = (double) entrada.nextInt();

		for (int i = 0; i < veces; i++) {
			System.out.println("ingrese carne: ");
			carne = (int) entrada.nextInt();

			System.out.println("ingrese numero de creditos: ");
			numcredito = (double) entrada.nextInt();

			System.out.println("ingrese valor del credito: ");
			vcredito = (double) entrada.nextInt();

			System.out.println("ingrese porcentaje de descuento: ");
			pordescuento = (double) entrada.nextInt();
			


			numcredito = numcredito * vcredito;

			Double matricula = (numcredito * pordescuento) / 100;
			
			lista.add(new Estudiante(carne, numcredito, vcredito, pordescuento, veces, matricula));
		

			//System.out.println("El carne del estudiante es:  " + carne);
			//System.out.println("la matricula del estudiante es:  " + matricula);

			//Double mayor = (double) 0;
			//Double menor = (double) 0;

		
			System.out.println(lista.get(i).toString());
		}
		Double matriculamayor=0D;
		int carneStudent =0;
		for (int j = 0; j < lista.size(); j++) {
			System.out.println(lista.get(j).getMatricula());
			if (lista.get(j).getMatricula()>matriculamayor) {
				matriculamayor=lista.get(j).getMatricula();
				carneStudent=lista.get(j).getCarne();
				
			}
		
		}
		System.out.println("el carne es: "+carneStudent);
		

	}

}
