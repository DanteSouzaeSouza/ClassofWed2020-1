import java.util.Scanner;
import java.lang.StringBuilder;

public class InverteString {	

	public static void main(String[] args) {
		// TODO Criar um programa que inverta uma string digitada pelo usuário
		
		// Criando um Scanner pra captar a entrada do usuário
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma frase: ");
		
		// --- método 1 --- usando char array
		char[] frase = input.nextLine().toCharArray();
		
		for (int i = frase.length - 1; i >= 0; i--) {
			System.out.print(frase[i]);
		}
		System.out.print("\n");
		
		// --- método 2 --- usando StringBuilder
		System.out.println("Digite uma nova frase: ");
		
		// Criando uma variável String usando um StringBuilder com seu método 
		// reverse() para gerar a frase invertida
		String mFrase = new StringBuilder(input.nextLine()).reverse().toString();
		
		System.out.println("Usando StringBuilder: " + mFrase);
	}
}
