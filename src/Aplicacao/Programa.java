package Aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Valor;

public class Programa {

	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Valor valor = null;
		
		System.out.print("Informe o numero da Conta");
		int numero =sc.nextInt();
		System.out.print("Informe o Nome do titular:");
		sc.nextLine();
		String nome =sc.nextLine();
		System.out.print("Tem deposito inicial (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y'){
			System.out.print("Informe o valor inicial");
			double depositoInicial = sc.nextDouble();
			valor = new Valor(numero, nome, depositoInicial); 
		}
		else {
			
		}
		
		System.out.println();
		System.out.println("conta dados:");
		System.out.println(valor);
		
		System.out.println();
		System.out.print("Entre com deposito");
		double depositoValor = sc.nextDouble();
		valor.deposito(depositoValor);
		System.out.println("Atualize dados");
		System.out.println(valor);
		
		System.out.println();
		System.out.print("Valor do Saque");
		double saqueValor = sc.nextDouble();
		valor.saque(saqueValor);
		System.out.println(valor);
		
		sc.close();
	

	
		
	}

	
		
	}


