package praticaAPIStream;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		//Jeito simplificado de imprimir uma lista em ordem numérica
		//Exemplos para a refatoração de códigos extensos
		List<String> numerosAleatorios = Arrays.asList("1","6","5","6","7","8","88","15","36","25","37","11","0");
		numerosAleatorios.forEach(System.out::println);
		System.out.println("/////////////////////////////////");
		System.out.println("");
		//Situação: Pegue os 5 primeiros números dessa lista e os mostre
		//Declaro o .stream()
		System.out.println("/////////////////////////////////");
		System.out.println("");
		numerosAleatorios.stream()
			//Coloco a quantidade de números que preciso pegar da lista
			.limit(5)
			//Coleto os 5 elementos nesse caso
			.collect(Collectors.toSet())
			//exibo
			.forEach(System.out::println);
		System.out.println("/////////////////////////////////");
		System.out.println("");
		//***Observação: Se houver números repetidos na lista, o .limit nao irá repetir!!!!
		
		//Transformando uma lista de números Strings em Inteiros!!!
		List<Integer> collectList = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		collectList.stream().forEach(System.out::println);
		System.out.println("/////////////////////////////////");
		System.out.println("");
		//filter(); vai fazer uma condicional e o .collect vai coletar os dados que ele puxar, como o limit(); mas dessa vez de forma condicional nao por ordem!!
		List<Integer> collectListfilter = numerosAleatorios.stream()
		.map(Integer::parseInt)
		.filter(i->i % 2 == 0 && i> 2)
		.collect(Collectors.toList());
		
		collectListfilter.stream().forEach(System.out::println);
		
		System.out.println("/////////////////////////////////");
		System.out.println("");
		
		//average(): Mostra a média de inteiros de uma lista
		
		numerosAleatorios.stream()
		.mapToInt(Integer::parseInt)
		.average()
		.ifPresent(System.out::println);
		
		
		System.out.println("/////////////////////////////////");
		System.out.println("");
		
		//removeIf(): Remove itens da lista com base em uma condição
		List<Integer> collectList1 = numerosAleatorios.stream()
				.map(Integer::parseInt)
				.collect(Collectors.toList());
		collectList1.removeIf(integer -> integer%2==0);
		collectList1.stream().forEach(System.out::println);
		
		
		
		
		
		
		
		
		
				
	}

}
