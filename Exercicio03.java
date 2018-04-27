import java.util.Scanner; 

public class Exercicio03 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
        double n1, n2; 
   
        System.out.println("Digite a primeira nota:");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        
       if(n1>n2){
           System.out.println("O Menor é:"+n2);
       }
	   else{
		   System.out.println("O Menor é:"+n1);
	   }
       }
}
    