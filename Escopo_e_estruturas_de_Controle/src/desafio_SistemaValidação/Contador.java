package desafio_SistemaValidação;
import java.util.Scanner;

class ParametrosInvalidosException extends Exception {
    /**
	 * PARA CRIRAR UMA EXCEÇÃO PRECISA CRIAR UMA CLASSE TAMBEEEEM!!!!
	 */
	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException(String mensagem) {
        super(mensagem);
    }
}
public class Contador {
	static void contadorParametros(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			//Demonstra um metodo simples de mostrar a mensagem de erro como a padrão do java
			throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
			
			//Imprime uma mensagem padrão !!
			//System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}else {
			int parametroNovo = parametroDois - parametroUm;
			for (int i=1;i <= parametroNovo;i++) {
				int parametroAux = parametroUm + i;
				System.out.println("Imprimindo o "+i+"º Número: "+(parametroAux));
			}
		}
		
	} 
	
	public static void main(String[] args) {
		
		
		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro: ");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro: ");
			int parametroDois = terminal.nextInt();
			try {
				contadorParametros(parametroUm, parametroDois);
				
			}catch(ParametrosInvalidosException exception) {
				//Chama a mensagem de erro da exceção ParametrosInvalidosException do metodo contadorParametros();
				exception.printStackTrace();
				
				
				//Aind posso usar o Código abaixo, personalizando ainda mais a minha Exception !!!!
				//String mensagem = exception.getMessage();
				//System.out.println("Ocorreu uma exceção: "+ mensagem);
				
			}
		}
		
		
		
	}

}
