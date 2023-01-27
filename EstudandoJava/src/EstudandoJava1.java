//Programa java inicial para trabalhar numeros inteiros inseridos pelo usuario
//Programa que trabalha adicao, subtracao, multiplicacao e divisao de inteiros

import java.util.Scanner;
public class EstudandoJava1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n1, n2;
		int soma, sub, mult, div;
		
		System.out.println("Insira o primeiro numero inteiro: ");
		n1= input.nextInt();
		
		System.out.println("Insira o segundo numero inteiro: ");
		n2= input.nextInt();
		
		soma=n1+n2;
		sub=n1-n2;
		mult=n1*n2;
		div=n1/n2;
		
		System.out.println("A soma de "+n1+" e "+n2+" é igual a "+soma);
		System.out.println("A subtracao de "+n1+" e "+n2+" é igual a "+sub);
		System.out.println("A multiplicacao de "+n1+" e "+n2+" é igual a "+mult);
		System.out.println("A divisao de "+n1+" e "+n2+" é igual a "+div);
		
		input.close();

	}

}
