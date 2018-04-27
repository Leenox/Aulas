import java.util.Scanner;

public class  Multiplicacao{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		
		float n1,n2,n3,result;
		
		System.out.println("Digite o primeiro numero");
		n1 = leia.nextFloat();
		
		System.out.println("Digite o segundo numero");
		n2 = leia.nextFloat();
		
		System.out.println("Digite o terceiro numero");
		n3 = leia.nextFloat();
		
		result = n1 * n2 * n3;
		
		System.out.print("Resultado da multiplicacao= " + result);
		
	}
	
	
}