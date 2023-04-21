package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// <> serve pra 
		List<String> list = new ArrayList<>(); // List NO FINAL, +e o nome da lista, pode ser qqr um.
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");// adc itens na lista
		
		list.add(2,"Marco"); // adc alguem numa lista criada na psoicao 2.
		
		//list.remove("Anna"); // remove um dado se ele for identico, comparando.
		//list.remove(1); // remove a posicao 1 da lista, no caso alex.
		
		
		
		
		System.out.println(list.size()); // ver o tamanho da lista.
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("--------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M'); // remove todas as dados que começam com "M".
		
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("--------------------------");
		
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // encontrar a posicao de um elemento
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // qd ele n encontra o elemento retorna (-1).
		
		System.out.println("--------------------------");
		
		// filtrar lista, vai precisar converter a lista em lambda e por isso tem essa parte de collect para lista.
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("--------------------------");
		
		// Encontrar primeiro elemento com o predicado ( Iniciar com letra A).
		
		//String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		//System.out.println(name);
		// quando ele n encontra ngm com 'J' ele retorna null.
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
