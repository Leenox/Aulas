import java.util.Scanner;
public class Exemplo7{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		//declarar as variaveis
		double peso;
		double novopeso;
		double novopesoengorda;
		//entrada de dados
		System.out.println("Digite o peso:");
		peso=leia.nextDouble();
		//processamento
		novopeso = peso - (peso*0.2);
		novopesoengorda = peso + (peso*0.15);
		//saida de dados
		System.out.println("Seu novo peso apos emagrecer: "+novopeso);
		System.out.println("Seu novo peso apos engordar "+novopesoengorda);
	}
}