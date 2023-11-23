package estruturas_repetição;
import java.util.concurrent.ThreadLocalRandom;
// import java.util.concurrent.ThreadLocalRandom; PARA GERAR valores aleatórios 
// usa-se: ThreadLocalRandom.current().nextDouble(2,8); para gerar
public class While {
	public static void main(String[] args) {
		double mesada = 50.0;
		while(mesada>0) {
			Double valorDoce = ThreadLocalRandom.current().nextDouble(2,8);
			if (mesada<2) {
				break;
			}
			System.out.println("Doce valor: $"+String.format("%.2f", valorDoce)+" Adicionado no carrinho !");
			mesada = mesada - valorDoce;
		}
		
		if(mesada <= 0) {
			System.out.println("Mesada: R$0,00");
			System.out.println("Joaozinho gastou TODA sua mesada em doces!!");
			
		}else {
			System.out.println("Mesada: R$"+String.format("%.2f", mesada));
			System.out.println("Sobrou R$"+String.format("%.2f", mesada)+" reais da mesada de Joaozinho!");
			
		}
		
	}
	/*private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2,8);
	}*/ // pode-se usar tambem, uma função para chamar esse recurso da biblioteca

}
