//Este projeto trabalha programa simples de adição
//Soma de dois números INTEIROS inseridos pelo usuário

import java.util.Scanner;

public class EstudandoJava {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		int n1, n2, soma;
		
		System.out.println("Insira um número para ser somado: ");
		n1= input.nextInt();
		
		System.out.println("\nInsira um número para ser somado: ");
		n2= input.nextInt();
		
		soma=n1+n2;
		
		System.out.println("\nO resultado da soma de "+n1+" e "+n2+" é "+soma);
		input.close();
	}

}
