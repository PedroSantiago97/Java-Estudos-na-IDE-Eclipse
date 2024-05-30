package collectionsJAVA;

import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
	
public class Main {
	public static void main(String[] args) {
		
		List<Hortifruti> sacola = new ArrayList<>();
		
		sacola.add(new Hortifruti("banana",1.5,8.5));
		sacola.add(new Hortifruti("maca",0.8,6.75));
		sacola.add(new Hortifruti("limao",0.7,11.25));
		sacola.add(new Hortifruti("alface",0.3,2.0));
		sacola.add(new Hortifruti("rucula",0.8,3.0));
		
		// Collections.shuffle(); => mostra os Itens da lista de forma aleatória
		//Collections.shuffle(sacola);
		//Collections.sort(); => Organiza os itens em ordem alfabética
		//Collections.sort(sacola);
		//Compartor => quando usado pode me retornar um valor ordenado de acordo a uma sentença especifica
		//em uma classe criada exatamente para esse proposito
		//Sentença: return Double.compare(o1.getPeso(), o2.getPeso());
		//Collections.sort(sacola, new ComparatorPeso());
		//sacola.sort(new ComparatorPeso());
		
		Double soma = 0.0;
		for(int i = 0;i<=sacola.size()-1;i++) {
			Double valorPeso = sacola.get(i).getPeso()*sacola.get(i).getPreco();
			soma+=valorPeso;
		}
		
		String somaFormat = String.format("%.2f", soma);
		
		
		System.out.println(sacola);
		System.out.println("Sua compra deu o valor de: R$"+somaFormat);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}