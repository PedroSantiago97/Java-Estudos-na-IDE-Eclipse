package excecao_fixacao;
import java.util.Scanner;
public class FormatadorRegistroGeral {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.printf("Digite seu RG: ");
			String registroGeral = scan.next();
			formatarRG(registroGeral);
			//System.out.println(registroGeral.charAt(0)+registroGeral.charAt(1)+registroGeral.charAt(2));
			
		} catch (RGInvalidoException e) {
			e.printStackTrace();
		}
		scan.close();
	}

	public static String formatarRG(String rg) throws RGInvalidoException{
		if (rg.length() != 11) {
			throw new RGInvalidoException();
		}
		return rg;
	}

}
