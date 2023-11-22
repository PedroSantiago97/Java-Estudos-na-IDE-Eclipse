package estruturas_repetição;
import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try {
			
			for (int carneiros = 1;carneiros <= 20;carneiros++) {
				System.out.printf(carneiros+" ");
			}
		}finally {
			scan.close();
		}
	}

}
