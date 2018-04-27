import java.util.Scanner;
public class Exemplo6{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		//declarar as variaveis
		double salario;
		double vendas;
		double salariofinal;
		double comissao;
		//entrada de dados
		System.out.println("Digite o salario:");
		salario=leia.nextDouble();
		System.out.println("Digite o valor das vendas:");
		vendas=leia.nextDouble();
		//processamento
		comissao = vendas*0.04;
		salariofinal = salario + comissao;
		//saida de dados
		System.out.println("A comissao: "+comissao);
		System.out.println("O salario final: "+salariofinal);
	}
}