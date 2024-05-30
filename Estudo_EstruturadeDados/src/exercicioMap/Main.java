package exercicioMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) {
		
		
		Map<Integer,Contatos> agenda = new HashMap<Integer,Contatos>(){{
		put(1, new Contatos("Joana", 4444));
		put(4, new Contatos("Marcela", 1111));
		put(5, new Contatos("Isabel", 8888));
		put(2, new Contatos("Dani", 2222));
		}};
		
		
		
		for(Map.Entry<Integer,Contatos> entry : agenda.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
		}
		System.out.println(" ");
		//Esse for(); foi Ultilizado para Colocar o nome dos contatos na ordenação pedida
		//Esse de baixo é ordem de adição, e o de cima é Aleatório
		Map<Integer,Contatos> agenda1 = new LinkedHashMap<>();
		agenda1.put(1, new Contatos("Joana", 4444));
		agenda1.put(4, new Contatos("Marcela", 8888));
		agenda1.put(5, new Contatos("Isabel", 1111));
		agenda1.put(2, new Contatos("Dani", 2222));
		
		//System.out.println(agenda);
		
		//Esse for foi Ultilizado para Colocar o nome dos contatos na ordenação pedida
		//Esse de baixo é ordem de adição, e o de cima é Aleatório
		for(Map.Entry<Integer,Contatos> entry : agenda1.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
		}
		System.out.println(" ");
		//Ordem de id dos Contados, das chaves = Key();
		Map<Integer,Contatos> agenda2 = new TreeMap<>(agenda);
		for(Map.Entry<Integer,Contatos> entry : agenda2.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
		}
		System.out.println(" ");
		
		//Ordem dos números de contato
		//Refatorando código afim de deixa-lo mais Clean *
		Set<Map.Entry<Integer,Contatos>> set = new TreeSet<>(Comparator.comparing(t -> t.getValue().getNumero()));
		
		set.addAll(agenda.entrySet());
		for(Map.Entry<Integer,Contatos> entry : set) {
			System.out.println(entry.getKey()+" - "+entry.getValue().getNumero());
		}
		
		
		System.out.println(" ");
		//Ordem por nome
		//Refatorando código afim de deixa-lo mais Clean *
		Set<Map.Entry<Integer,Contatos>> set1 = new TreeSet<>(Comparator.comparing(t -> t.getValue().getNome()));
					
		set1.addAll(agenda.entrySet());
		for(Map.Entry<Integer,Contatos> entry : set1) {
			System.out.println(entry.getKey()+" - "+entry.getValue().getNome());
		}
		
		
		
	}
	
		
	

}
