import java.util.Scanner;

public class MediaPonderada{
	public static void main(String[] args){
		Scanner leia = new Scanner (System.in);
		
		double n1,n2,result;
		
		System.out.println("Primeira nota= ");
		n1 = leia.nextDouble();
		
		System.out.println("Segunda nota= ");
		n2 = leia.nextDouble();
		
		result = (n1*2 + n2*3)/5;
		
		System.out.print("Resultado= " + result);
	}
}