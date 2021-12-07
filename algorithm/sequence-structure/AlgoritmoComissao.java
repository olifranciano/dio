/*escreva um algoritmo para calcular o salario de um funcionario*/

public class AlgoritmoComissao{
	public static void main(String[] args){

		double salario,comissao,salarioFinal;

		salario = 2300;
		comissao = salario * 0.04;
		salarioFinal = salario + comissao;

		System.out.println("Salario= " + salario + "\n" +  "Comissao= " + comissao + "\n" + "Salario Final= " + salarioFinal + "\n");
	}
}
