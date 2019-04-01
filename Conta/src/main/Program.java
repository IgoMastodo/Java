package main;

import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria[] cliente = new ContaBancaria[2];

		int numero, senha, i;
		String nome;
		double saldo;
		char resposta;
		for (i = 0; i < 2; i++) {
			

			System.out.printf("Insira o nome do cliente %d \n",i+1);
			nome = sc.nextLine();
			System.out.printf("Insira o numero da conta do cliente %d \n",i+1);
			numero = sc.nextInt();
			System.out.printf("Insira a senha do cliente %d \n",i+1);
			senha = sc.nextInt();
			System.out.println("Existe algum saldo inicial?(y/n)");
			resposta = sc.next().charAt(0);

			while (true) {
				if (resposta == 'y' || resposta == 'n') break;
				System.out.println("Resposta inválida.(y/n)");
				resposta = sc.next().charAt(0);

			}
			if (resposta == 'y') {
				System.out.printf("Insira o saldo inicial do cliente %d \n",i+1);
				saldo = sc.nextDouble();
				cliente[i] = new ContaBancaria(nome, senha, saldo, numero);
			} else if (resposta == 'n') {
				cliente[i] = new ContaBancaria(nome, senha, numero);
			}
			
			System.out.println(cliente[i]);
			sc.nextLine();
		}
		sc.close();
	}

}
