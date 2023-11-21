package estruturas_condicionais;
import java.util.Scanner;
public class CondicionaisEncadeadas { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.printf("Digite sua primeira nota: ");
			double primeiraNota = scan.nextDouble();
			System.out.printf("Digite sua segunda nota: ");
			double segundaNota = scan.nextDouble();
			
			double media = (primeiraNota + segundaNota)/2;
			System.out.println("Sua média foi de "+String.format("%.2f", media)+" !");
			
			if (media >= 7) {
				System.out.println("Você está Aprovado, Parabéns!");
				
			}else if(media<7 && media >= 5){
				
				System.out.println("Você está de Recuperação, Estude para as proximas provas!");
				
			}else {
				System.out.println("Você está Reprovado, se esforce no proximo ano");
			}
			
			//System.out.println(String.format("%.2f", media));
			//Estrutura que representa o encadeamento de condicionais
			/* Deixando notório os conhecimentos sobre a leitura de variáveis no console e a formatação de valores double com o parametro 
			String.format("%.2f", media) que coloca somente duas casas após a virgula independente do valor recebido
			*/
			
		} finally {
			scan.close();
		}
	}

}
