package ordenacaoSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Set<Serie> minhasSeries = new HashSet<>() {{
			add(new Serie("GOT","Ação",60));
			add(new Serie("Futurama","Comédia",20));
			add(new Serie("Cyberpunk 2077","Ação",85));
			add(new Serie("Ricky & Morty","Sci-Fi",14));
			add(new Serie("S.W.A.T","Ação",27));
		}};
		
		System.out.println(minhasSeries);
		for(Serie serie: minhasSeries) {
			System.out.println("");
			System.out.println(serie.getNome()+" // Gênero: "+serie.getGenero()+" // Duração"+serie.getTempoEpisodio()+"min.");}
		
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////");
		//Ordem de declaração
		@SuppressWarnings("serial")
		Set<Serie> minhasSeries1 = new LinkedHashSet<>() {{
			add(new Serie("GOT","Ação",60));
			add(new Serie("Futurama","Comédia",20));
			add(new Serie("Cyberpunk 2077","Ação",85));
			add(new Serie("Ricky & Morty","Sci-Fi",14));
			add(new Serie("S.W.A.T","Ação",27));
		}};
		
		for(Serie serie: minhasSeries1) {
			System.out.println("");
			System.out.println(serie.getNome()+" // Gênero: "+serie.getGenero()+" // Duração "+serie.getTempoEpisodio()+"min.");}
		
		System.out.println("");
		System.out.println("////////////////////////////////////////////////////////////");
		//Ordem Crescente
		Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
		for(Serie serie: minhasSeries2) {
			System.out.println("");
			System.out.println(serie.getNome()+" // Gênero: "+serie.getGenero()+" // Duração "+serie.getTempoEpisodio()+"min.");}
		
		
		
		
		
		
			
		
		
	}

}
