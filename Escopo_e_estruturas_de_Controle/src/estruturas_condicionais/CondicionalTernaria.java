package estruturas_condicionais;
import java.util.Scanner;
public class CondicionalTernaria {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.printf("Digite sua nota: ");
			double nota = scan.nextDouble();
			String resultado = nota >= 7 ? "Aprovado" : nota < 7 && nota >= 5 ? "Recuperação" : "Reprovado";
			//Operador ternário:
			// Coloca-se a condição antes da '?' e o valor atribuido a variável depois.
			// Para encadear, só repetir o processo após os ':' !!!
			System.out.println(resultado);
		}finally {
			scan.close();
		}
	}

}
