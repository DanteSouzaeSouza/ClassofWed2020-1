import java.io.Console;

public class Password {

	public static void main(String[] args) {
		// TODO Criar um programa que:
		// Permita que o usu�rio digite seu nome e
		// Permita que ele digite a sua senha (fict�cia) e 
		// Exiba a senha do usu�rio no Console
		Console console = System.console();
		if ((console = System.console()) != null) {
			char[] senha = null;
			
			try {
				senha = console.readPassword();
				System.out.println("Sua senha �: " + new String(senha));
				
			} finally {
				if (senha != null) {
					java.util.Arrays.fill(senha, ' ');
				}
			}
		} else {
			throw new RuntimeException("N�o foi poss�vel ler a senha. N�o h� console dipon�vel");
		}		
	}
}
