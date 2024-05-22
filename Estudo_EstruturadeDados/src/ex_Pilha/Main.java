package ex_Pilha;

//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Pilha minhaPilha = new Pilha();
		/*try (Scanner scan = new Scanner(System.in)) {
			
			while(true) {
				System.out.println("Digite 1 para adicionar valores na Pilha ou 2 para sair: ");
				int oPadd = scan.nextInt();
				if(oPadd == 1) {
					System.out.println("Digite um valor para adicionar a pilha: ");
					int addPil = scan.nextInt();
					minhaPilha.push(new No(addPil));
				}else {
					break;
				}	
			}
		}*/
		
		minhaPilha.push(new No(1));
		minhaPilha.push(new No(2));
		minhaPilha.push(new No(3));
		minhaPilha.push(new No(4));
		
		System.out.println(minhaPilha);
		
		

		
		
		
		
		
	}

}
