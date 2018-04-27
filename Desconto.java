import java.util.Scanner;

public class Desconto{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		double valor,result;
		
		System.out.println("Informe o valor do produto: ");
		valor = leia.nextDouble();
		
		//result = valor - valor*0.1;
		//result = valor + (valor*0.1);
		result = valor*1.10;
		
		System.out.println("valor com desconto= " + result);
	}
}