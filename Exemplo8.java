import java.util.Scanner;
public class Exemplo8{
	public static void main(String[] args){
		Scanner leia =  new Scanner(System.in);
		//declarar as variaveis
		double peso;
		double pesoemgramas;
		//entrada de dados
		System.out.println("Digite seu peso:");
		peso=leia.nextDouble();
		//processamento
		pesoemgramas = peso*100;
		//saida de dados
		System.out.println("Seu peso em gramas: "+pesoemgramas);
	}
}