import java.util.Scanner;

public class Exemplo2{
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
				
		int x,y,z;
				
		System.out.println("Digite o valor de x: ");
		x = leia.nextInt();
		System.out.println("Digite o valor de y: ");
		y = leia.nextInt();
		z = x + y;
		System.out.print("z = "+z);		
	}	
}	