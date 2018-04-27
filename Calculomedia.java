//importando a classe escaner.
import java.util.Scanner;

//criando a classe com o nome Calculomedia.
public class Calculomedia {

//criando um metodo principal 
	public static void main (String[] args) {

		Scanner leia = new Scanner (System.in); 
		
//criando variaveis do tipo bouble; 
		float nota1, nota2, soma, media;
		
/* imprindo uma mensagem na tela e colhendo as informaçoes atribuidas 
	pelo usuario e ás armazenando nas variaveis*/ 
		System.out.print ("Digite o valor da primeira nota: R$ " );
		nota1 = leia.nextFloat(); 

//somente dando espaço.
		System.out.println (" "); 
		
/* imprindo uma mensagem na tela e colhendo as informaçoes atribuidas 
	pelo usuario e ás armazenando nas variaveis*/	
		System.out.print ( "Informe o valor da segunda nota: R$" );
		nota2 = leia.nextFloat();
		
		System.out.println (" ");

// calculando a media 
		soma = nota1 + nota2;
		media = soma/2;

//apresentando o resultado.
		System.out.println ("Media entre as notas: R$ " +media );
	}
}