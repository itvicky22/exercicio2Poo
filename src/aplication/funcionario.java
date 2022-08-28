	package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidades.empregado;

public class funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		
		empregado func1 = new empregado();
		
		System.out.println("Nome: ");
		func1.nome = ler.nextLine();
		
		System.out.println("Salario Bruto: ");
		func1.salarioBruto = ler.nextDouble();
		
		System.out.println("Imposto: ");
		func1.imposto = ler.nextDouble();
				
		double A = func1.salarioLiquido();
		System.out.printf("\nEmpregado: %s, $ %.2f", func1.nome, A);
		
		System.out.println("\n\nQual porcentagem para aumentar o salario?");
		double aumento = ler.nextDouble();
		
		func1.aumentoSalario(aumento);
		
		ler.close();
	}

}
