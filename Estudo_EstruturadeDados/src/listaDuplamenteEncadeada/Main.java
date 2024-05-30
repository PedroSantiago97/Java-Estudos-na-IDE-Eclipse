package listaDuplamenteEncadeada;

public class Main {
	public static void main(String[] args) {
		ListaDuplamenteEncadeada<String> minhalista = new ListaDuplamenteEncadeada<>();
		minhalista.add("primeiro");
		minhalista.add("segundo");
		minhalista.add("terceiro");
		minhalista.add("quarto");
		/*minhalista.add(0, "primeiro");
		minhalista.add(1, "segundo");
		minhalista.add(2, "terceiro");
		minhalista.add(3, "quarto");*/
		//minhalista.remove(2);
		minhalista.add(2, "quarto.1");
		//minhalista.add(0, null);
	
		
		//minhalista.remove(0);
		
		//minhalista.add(4,"99");
		
		
	
		
		
		
		System.out.println(minhalista);
		
	}

}
