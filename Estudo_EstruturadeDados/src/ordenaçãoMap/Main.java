package ordenaçãoMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Map<String, Double> garagem = new HashMap<>();
		garagem.put("Gol",15.4);
		garagem.put("Kaddet",11.4);
		garagem.put("i320",8.7);
		garagem.put("Opala",5.4);
		garagem.put("Uno",11.7);
		
		garagem.put("Gol", 12.2);
		garagem.put("Celta", 12.2);
		System.out.println(garagem);
		
		System.out.println(garagem.keySet());
		System.out.println(garagem.values());
		
		System.out.println("");
		Double maisEconomico = Collections.max(garagem.values());
		//Criação do Set para ordenação de meu Map, usando Mao.Entry
		Set<Map.Entry<String, Double>> entries = garagem.entrySet();
		String modeloMaisEconomico = "";
		for(Map.Entry<String, Double> entry: entries) {
			if(entry.getValue().equals(maisEconomico)) {
				modeloMaisEconomico = entry.getKey();
				System.out.println(" O modelo mais economico é o: "+modeloMaisEconomico+" - "+maisEconomico+"Km/L");
				
			}
		}
		
		System.out.println("");
		
		Double menosEconomico = Collections.min(garagem.values());
		
		Set<Map.Entry<String, Double>> entries2 = garagem.entrySet();
		String modeloMenosEconomico = "";
		for(Map.Entry<String, Double> entry: entries2) {
			if(entry.getValue().equals(menosEconomico)) {
				modeloMenosEconomico = entry.getKey();
				System.out.println(" O modelo menos economico é o: "+modeloMenosEconomico+" - "+menosEconomico+"Km/L");
				
			}
		}
		
		Iterator<Double> iterator = garagem.values().iterator();
		Double soma = 0d;
		while(iterator.hasNext()) {
			soma+=iterator.next();
		}
		String somaFormat = String.format("%.2f", soma);
		
		System.out.println("A soma dos consumos é: "+somaFormat+"Km/L");
		
		Double media = soma/garagem.size();
		String mediaFormat = String.format("%.2f", media);
		
		System.out.println("A Média dos consumos é: "+mediaFormat+"Km/L");
		
		Iterator<Double> iterator1 = garagem.values().iterator();
		while(iterator1.hasNext()) {
			if(iterator1.next()<10d) {
				iterator1.remove();
			}
		}
		System.out.println(garagem);
		
		
		Map<String, Double> garagem1 = new LinkedHashMap<>();
		garagem1.put("Gol",15.4);
		garagem1.put("Kaddet",11.4);
		garagem1.put("BMW",8.7);
		garagem1.put("Opala",5.4);
		garagem1.put("Uno",11.7);
		
		System.out.println(garagem1);
		
		Map<String, Double> garagem2 = new TreeMap<>(garagem1);
		
		
		System.out.println(garagem2.toString());
		
	}

}
