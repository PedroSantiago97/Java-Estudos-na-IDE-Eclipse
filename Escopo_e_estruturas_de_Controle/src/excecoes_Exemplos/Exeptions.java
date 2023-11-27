package excecoes_Exemplos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exeptions {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.printf("Digite sua idade: ");
			int idade = scan.nextInt();
			System.out.println(idade);
			
			System.out.printf("Digite seu nome: ");
			String nome = scan.next();
			
			boolean somenteLetras = nome.matches("[a-zA-Z]+");
			if (somenteLetras == true) {
				System.out.println(nome);
			} else {
				System.out.println("Digite um nome com letras!!");
			}
			// um Adeno para o metodo .matches!! usado para verificar se toda a string de entrada do usuário consiste apenas em letras.
			// Esse if é um exemploi de Exeptions Criada manualmente
		}
		catch (InputMismatchException e){
			System.out.println("Por favor, Digite um número válido!");
			// com o "catch" e importando a Exception é possivel criar uma mensagem quando ele for acionado
		} scan.close();
	}

}
