package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List <Forma> list = new ArrayList<>();
		
		System.out.print("Quantas figuras deseja digitar? ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.print("Retângulo ou Círculo [r/c]? ");
			char ch = sc.next().charAt(0);
			System.out.print("Cor: ");
			Cor cor =  Cor.valueOf(sc.next()); // O que o usuário digitar como valor em ENUM.
			
			if (ch == 'r') {
				System.out.print("Largura: ");
				Double largura = sc.nextDouble();
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();
				list.add(new Retangulo(cor, largura, altura)); 
				// Como a classe Forma é abstrata, eu instancio a classe Retangulo direto na lista. 
			}
			else if (ch == 'c') {
				System.out.print("Raio: ");
				Double raio = sc.nextDouble();
				list.add(new Circulo(cor, raio));
				// Como a classe Forma é abstrata, eu instancio a classe Circulo direto na lista. 
			}
		}
		
		System.out.println();
		System.out.println("ÁREAS DAS FORMAS:");
		for (Forma forma : list) {
			System.out.printf("%.2f\n", forma.area());
		}		

	}

}