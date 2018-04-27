import java.util.Scanner;
public class Exemplo5{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		//declarar as variaveis
		double preco;
		double novopreco;
		//entrada de dados
		System.out.println("Digite o preco:");
		preco=leia.nextDouble();
		//processamento
		novopreco = preco - (preco*0.1);
		//saida de dados
		System.out.println("O novo preco: "+novopreco);
	}
}