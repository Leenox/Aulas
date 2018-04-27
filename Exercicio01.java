import java.util.Scanner; 

public class Exercicio01 {

    public static void main(String[] args) {
       Scanner leia = new Scanner (System.in);
        double n1, n2, n3, n4, media; 
   
        //entrada de dados 
        System.out.println("Digite a primeira nota:");
        n1 = leia.nextDouble();
        System.out.println("Digite a segunda nota: ");
        n2 = leia.nextDouble();
        System.out.println("Digite a terceira nota: ");
        n3 = leia.nextDouble();
        System.out.println("Digite a quarta nota: ");
        n4 = leia.nextDouble(); 
        
        //processamento e saida
        media=(n1+n2+n3+n4)/4;
        
       if(media<7){
           System.out.println("sua media é:"+media+"\n Reprovado!");
       }
       if(media>=7){
           System.out.println("Sua media é:"+media+"\n Aprovado");
       }
    }
    
}