import java.util.Scanner;

public class Divisao{
	public static void main(String[] args){
	Scanner leia = new Scanner(System.in);	
		
		float n1,n2,result;
		
		System.out.println("Primeiro numero");
		n1 = leia.nextFloat();
		
		System.out.println("Segundo numero");
		n2 = leia.nextFloat();
		
		result = n1 / n2;
		
		System.out.print("Resultado= " + result);
	
	}
}