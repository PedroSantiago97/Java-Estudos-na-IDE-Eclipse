package lista_Encadeada;

public class Main {
	public static void main(String[] args) {
		ListaEncadeada<Integer> lista = new ListaEncadeada<>();
		lista.add(1);
		//System.out.println(lista);
		lista.add(2);
		//System.out.println(lista);
		lista.add(3);
		System.out.println(lista);
		
		lista.remove(0);
		System.out.println(lista);
		System.out.println(lista.get(1));
		lista.remove(1);
		lista.remove(0);
		System.out.println("A lista tem "+lista.size()+" Itens.");
		
		
		
		
	}
}
