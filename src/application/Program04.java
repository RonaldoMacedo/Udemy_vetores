package application;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números vc vai digitar? ");
		int q = sc.nextInt();
		
		double[] vect = new double[q];
		double soma = 0.0;
		double media = 0.0;
		
		for(int i = 0; i < q; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
			media = soma / (i + 1);
		}
		
		System.out.println();
		System.out.print("Valores =  ");
		for(int i = 0; i < q; i++) {
			System.out.print(vect[i] + "  ");
		}
		
		System.out.println();
		System.out.printf("Soma = %.2f%n", soma);
		System.out.printf("Média = %.2f", media);
		
		sc.close();

	}

}
