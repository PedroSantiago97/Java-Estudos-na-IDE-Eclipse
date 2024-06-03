package principais_Implementações;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//hashCode, contains e equals
		System.out.println("//Arrays: hashCode, contains e equals//");
		System.out.println("");
		
		List<Carro> listaCarros = new ArrayList<>();
		listaCarros.add(new Carro("Ford"));
		listaCarros.add(new Carro("Chevrolet"));
		listaCarros.add(new Carro("BMW"));
		listaCarros.add(new Carro("Fiat"));
		System.out.println(listaCarros.contains(new Carro("Ford")));
		System.out.println(listaCarros.contains(new Carro("Ferrari")));
		System.out.println(new Carro("Ford").hashCode());
		System.out.println(new Carro(" ").hashCode());
		Carro carro1 = new Carro("Ford");
		Carro carro2 = new Carro("Renaut");
		System.out.println(carro1.equals(carro2));
		
		System.out.println("");
		System.out.println("//Stack//");
		System.out.println("");
		
		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("Ford"));
		stackCarros.push(new Carro("Chevrolet"));
		stackCarros.push(new Carro("BMW"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros);
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);
		System.out.println(stackCarros.empty());
		
		System.out.println("");
		System.out.println("//Queue -> Fila, LikedList//");
		System.out.println("");
		
		Queue<Carro> queueCarros = new LinkedList<>();
		
		queueCarros.add(new Carro("Fiat"));
		queueCarros.add(new Carro("Peugeout"));
		
		
		System.out.println(queueCarros.add(new Carro("Nissan")));
		System.out.println(queueCarros.offer(new Carro("BMW")));
		System.out.println(queueCarros.peek());
		System.out.println(queueCarros.poll());
		System.out.println(queueCarros.isEmpty());
		System.out.println(queueCarros.size());
		System.out.println(queueCarros);
		
		System.out.println("");
		System.out.println("//Arrays(deNovo) -> Fila, LikedList//");
		System.out.println("");
		
		List<Carro> listCarros = new ArrayList<>();
		listCarros.add(new Carro("Toyota"));
		listCarros.add(new Carro("Masserati"));
		listCarros.add(new Carro("Honda"));
		listCarros.add(new Carro("Hyundai"));
		
		System.out.println(listCarros.contains(new Carro("Ford")));
		System.out.println(listCarros.get(1));
		System.out.println(listCarros.indexOf(new Carro("Honda")));
		System.out.println(listCarros.remove(2));
		System.out.println(listCarros);
		
		System.out.println("");
		System.out.println("//Set -> HashSet//");
		System.out.println("");
		
		Set<Carro> hashSetCarros = new HashSet<>();	
		
		hashSetCarros.add(new Carro("Ford"));
		hashSetCarros.add(new Carro("Chevrolet"));
		hashSetCarros.add(new Carro("Fiat"));
		hashSetCarros.add(new Carro("Peugeout"));
		hashSetCarros.add(new Carro("Zep"));
		
		System.out.println(hashSetCarros);
		
		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Ford"));
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Fiat"));
		treeSetCarros.add(new Carro("Peugeout"));
		treeSetCarros.add(new Carro("Zep"));
		
		System.out.println(treeSetCarros);
		
		System.out.println("");
		System.out.println("//Map -> HashMap//");
		System.out.println("");
		
		Map<String, String> aluno = new HashMap<>();
		
		//Put: insere valores em um objeto
		aluno.put("Nome", "João");
		aluno.put("Idade", "17");
		aluno.put("Media", "8.5");
		aluno.put("Turma", "3a");
		
		Map<String, String> aluno2 = new HashMap<>();
		
		//Put: insere valores em um objeto
		aluno2.put("Nome", "Maria");
		aluno2.put("Idade", "16");
		aluno2.put("Media", "9.5");
		aluno2.put("Turma", "2a");
		
		System.out.println(aluno);
		
		//Mostra o nome do primeiro string desses valores do objeto
		System.out.println(aluno.keySet());
		//Mostra o segundo Valor 
		
		System.out.println(aluno.values());
		
		// ***Esses valores sao coorelacionados
		//, ou seja, o primeiro é o titulo e o segundo é o valor do meu titulo referente ao meu objeto 
		//Ex: obj1= "Nome" "Joao", obj2 = "Nome" "Maria"
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);
		
		
		
		
		
		
		
		
	}
}
