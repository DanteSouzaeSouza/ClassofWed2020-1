import java.util.Scanner;

public class DivisaoComInput {

	public static void main(String[] args) {
		
		// Criando um Scanner pra captar a entrada do usu�rio
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		
		// Criando uma vari�vel para receber essa entrada e
		// atribuindo o valor que est� na vari�vel input
		int num1 = input.nextInt();
		
		System.out.println("Digite mais um n�mero inteiro: ");
		
		// Criando uma segunda vari�vel para receber o n�mero digitado
		int num2 = input.nextInt();		
		
		// checando se o segundo n�mero digitado � igual a zero:
		if (num2 == 0) {
			// se for igual a zero, pede para o usu�rio digitar outro n�mero
			System.out.println("N�o existe divis�o por zero! Digite outro n�mero: ");
			
			// capta o n�mero digitado
			num2 = input.nextInt();
		}		
		int div = num1 / num2;
		
		System.out.println("A Divis�o �: " + div);
	}	
}
