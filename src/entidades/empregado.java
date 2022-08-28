package entidades;

public class empregado {
	
	public String nome;
	public double salarioBruto; 		
	public double imposto;				
	
	
	public double salarioLiquido() {
		return salarioBruto - imposto;	
	}
	
	public void aumentoSalario(double aumento) {
		double B = (salarioBruto - imposto) + ((aumento/100)*salarioBruto);
		System.out.printf("Informações Atualizadas: %s, $ %.2f", nome, B);
	}
	
	
}
