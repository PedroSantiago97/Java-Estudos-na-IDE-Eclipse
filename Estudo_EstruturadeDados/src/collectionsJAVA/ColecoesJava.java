package collectionsJAVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
//import java.util.Arrays;
import java.util.List;

public class ColecoesJava {
	
	public static void main(String[] args) {
		
		//Posso criar dessa maneira abaixo com o comando Arrays.asList();
		//List<Double> notas = new ArrayList<>(Arrays.asList(1.5,5.6,9.8));
		List<Double> notas = new ArrayList<>();
		
		notas.add(5.4);
		notas.add(8.9);
		notas.add(5.5);
		notas.add(3.6);
		notas.add(8.5);
		notas.add(1.2);
		notas.add(8.8);
		
		System.out.println(notas);
		//indexOf: Exibe a posição de um valor. Coloque o valor seguido da letra d
		System.out.println(notas.indexOf(5.4d));
		
		notas.add(4, 8.0);
		
		//.set();-> pede no parâmetro um int para a posição e um valor<> para substituição
		notas.set(0, 9.1);
		System.out.println(notas);
		
		//.contains(); --> Pede um parâmetro para verifação booleana da existência do parâmetro
		System.out.println(notas.contains(1.0));
		
		System.out.println("A terceira nota é: "+notas.get(2));
		
		System.out.println("A menor nota é: " + Collections.min(notas));
		System.out.println("A maior nota é: "+ Collections.max(notas));
		double soma = 0.0;
		for(int i = 0;i <= notas.size()-1;i++) {
			soma+=notas.get(i);
		}
		String somaFormat = String.format("%.2f", soma);
		double media = soma/notas.size();
		String mediaFormat = String.format("%.2f", media);
		System.out.println("A soma das notas é: "+somaFormat);
		System.out.println("A medias das notas é: "+mediaFormat);
		
		//Muito cuidado com a netureza do remove();
		//Aqui ele tira o objeto, mas esse parametro tambem pode indicar posição
		//Atenção na hora de criar !!!
		notas.remove(5.5);
		
		System.out.println(notas);
		
		//Utilização do iterator, aonde eu pego os elementos que estão Apos o primeiro e assim sucessivamente
		//Bom pra uso de validação, soma de termos, e média
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next<7) {
				iterator1.remove();
			}
		}
		
		System.out.println(notas);
		
		//Apaga toda a lista
		notas.clear();
		System.out.println(notas);
		
		
		
		
		
		
		
		
	}

}
