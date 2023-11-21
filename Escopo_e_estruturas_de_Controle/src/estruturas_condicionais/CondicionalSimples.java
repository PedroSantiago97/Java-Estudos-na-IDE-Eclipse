package estruturas_condicionais;
import java.util.Scanner;



public class CondicionalSimples {
	
	public static void main(String[] args) {
		Scanner imprima = new Scanner(System.in);
		try {
			System.out.printf("Digite seu Saldo");
			int valorSolicitado = imprima.nextInt();
			int saldo = 25;
			
			if (valorSolicitado < saldo) {
				saldo = saldo - valorSolicitado;
				System.out.println("Seu saldo é de R$" + saldo);
			} else {
				System.out.println("Você não tem saldo suficiente !");
			}
			 
		} finally {
			imprima.close();
		}
		
	}
	
	

}
