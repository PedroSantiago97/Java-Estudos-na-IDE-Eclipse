package estudosSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Double> notas = new HashSet<>(Arrays.asList(8d,5.8,8.5,9.6,3.5,4.7,2.5,8d,9d));
		System.out.println(notas);
		
		//Nao é possivel ADICIONAR ou EXIBIR UMA NOTA ESPECIFICA no HashSet de forma convencional
		
		//Para manipular o Set é preciso usar o iterator:
		Iterator<Double> iterator1 = notas.iterator();
		while(iterator1.hasNext()) {
			Double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		//Para exibir os valores na ordem em que foram declarados usamos LinkedHashSet<>();
		Set<Double> notas2 = new LinkedHashSet<>();
		
		notas2.add(1.5);
		notas2.add(3.5);
		notas2.add(4.5);
		notas2.add(8d);
		notas2.add(9.75);
		notas2.add(0.35);
		
		System.out.println(notas2);
		
		//Para colocar na ordem crescente é necessario Criar uma lista com TreeSet<>();
		
		Set<Double> notas3 = new TreeSet<>(notas2);
		
		System.out.println(notas3);
		notas2.clear();
		System.out.println(notas2);
		System.out.println(notas3);
		
		//Para conferir se a lista está vazia use o método isEmpty
		System.out.println(notas2.isEmpty());
		
		
		
		
		
	}

}
