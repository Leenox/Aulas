import java.util.Scanner;

public class Subtracao{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
				
		int n1,n2,result;
				
		System.out.println("Digite o valor de Nota 1: ");
		n1 = leia.nextInt();
		System.out.println("Digite o valor de Nota 2: ");
		n2 = leia.nextInt();
		result = n1 - n2;
		System.out.print("Resultado= "+result);		
	}	
}	