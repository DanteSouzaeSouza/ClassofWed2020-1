import java.io.Console;

public class Password {

	public static void main(String[] args) {
		// TODO Criar um programa que:
		// Permita que o usuário digite seu nome e
		// Permita que ele digite a sua senha (fictícia) e 
		// Exiba a senha do usuário no Console
		Console console = System.console();
		if ((console = System.console()) != null) {
			char[] senha = null;
			
			try {
				senha = console.readPassword();
				System.out.println("Sua senha é: " + new String(senha));
				
			} finally {
				if (senha != null) {
					java.util.Arrays.fill(senha, ' ');
				}
			}
		} else {
			throw new RuntimeException("Não foi possível ler a senha. Não há console diponível");
		}		
	}
}
