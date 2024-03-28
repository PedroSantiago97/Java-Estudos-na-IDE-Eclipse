package desafio_SistemaValidação;
import java.util.Scanner;

public class SistemaValidação {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Bem vindo ao processo seletivo da empresa KalTech");
			System.out.printf("Digite sua pretensão salarial em R$: ");
			double salarioPretendido = scan.nextDouble();
			double salarioEmpresa = 2000;
			
			if (salarioPretendido < salarioEmpresa) {
				System.out.printf("Ligar para Futuro funcionário Em Breve! =D");
				
			}else if (salarioPretendido == salarioEmpresa) {
				System.out.printf("Faixa salarial acima do esperado");
				System.out.printf("Ligar Em Breve com Contra Proposta! ;)");
			}else { 
				System.out.printf("Aguardar demais candidatos! =(");
			}
			
			
		
		} finally {
			scan.close();
		}
		
	}
	

}
