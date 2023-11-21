package estruturas_condicionais;
import java.util.Scanner;

public class CondicionalComposta {
	public static void main(String[] args) {
		Scanner imprima = new Scanner(System.in);
		try {
			System.out.printf("Digite a nota do Aluno: ");
			int nota = imprima.nextInt();
			if(nota >= 6) {
				System.out.println("Aprovado");
			} else {
				System.out.println("Reprovado");
			}
			
		} finally {
			imprima.close();
		}
	}

}
