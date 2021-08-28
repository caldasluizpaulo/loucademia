package br.com.softblue.loucademia.domain.aluno;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int menorIdadeGrupo = 0;
		int maiorIdadeGrupo = 0;
		double salarioGrupo = 0;
		int qtdeHabitantes = 0;
		int qtdeHomens = 0;
		int qtdeMulheresSalarioMaior100 = 0;
		double salarioLidoAtual = 0;

		while (salarioLidoAtual >= 0) {
			System.out.print("Qual o seu Salário: ");
			double leitorSalario = scan.nextDouble();

			salarioLidoAtual = leitorSalario;

			if (salarioLidoAtual >= 0) {

				System.out.print("Qual o seu Sexo: ");
				char leitorSexo = scan.next().charAt(0);
				System.out.print("Qual o sua Idade: ");
				int leitorIdade = scan.nextInt();

				qtdeHabitantes++;

				if (qtdeHabitantes == 1) {
					menorIdadeGrupo = leitorIdade;
				}

				salarioGrupo = salarioGrupo + leitorSalario;

				if (leitorIdade > maiorIdadeGrupo) {
					maiorIdadeGrupo = leitorIdade;
				}

				if (leitorIdade < menorIdadeGrupo) {
					menorIdadeGrupo = leitorIdade;
				}

				if (leitorSexo == 'F' && leitorSalario <= 100) {
					qtdeMulheresSalarioMaior100++;
				}

				if (leitorSexo == 'M') {
					qtdeHomens++;
				}

			}
		}

		System.out.println("A média de salário do grupo: " + (salarioGrupo / qtdeHabitantes));
		System.out.println("Maior idade do grupo: " + maiorIdadeGrupo);
		System.out.println("Menor idade do grupo: " + menorIdadeGrupo);
		System.out.println("Quantidade de mulheres com salário até R$ 100,00: " + qtdeMulheresSalarioMaior100);
		System.out.println("Quantidade de homens: " + qtdeHomens);

	}

}
