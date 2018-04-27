import java.util.Scanner; 

public class Exercicio02 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
        double n1, n2, media; 
   
        System.out.println("Digite a primeira nota:");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");

        media=(n1+n2)/2;
        
       if(media<=3){
           System.out.println("sua media é:"+media+"\n Reprovado!");
       }
	   if(media>=3){
           System.out.println("sua media é:"+media+"\n Exame!");
       }
       if(media>=7){
           System.out.println("Sua media é:"+media+"\n Aprovado");
       }
    }
    
}