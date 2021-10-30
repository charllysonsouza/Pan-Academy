package repeticao;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Compare {
	public static boolean encontraNomeEquals(String nomeBusca, List<String> nomesAleatorios) {
		for (String nome : nomesAleatorios) {
			if (nomeBusca.equals(nome)) {
				return true;
			}
		}
		return false;
	}

	public static boolean encontraNomeHashCode(String nomeBusca, List<String> nomesAleatorios) {
		for (String nome : nomesAleatorios) {
			if (nomeBusca.hashCode() == nome.hashCode()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Random random = new Random();
		
		List<String> dezNomes = Arrays.asList("Benjamin", "Levi", "Salomão", "Zacarias", "Habacuque", "Rute", "Maria",
				"Maria Madalena", "Jezebel", "Sarai");
		List<String> algunsNomesAMais = new ArrayList<>();
		
		while (algunsNomesAMais.size() < 150000000) {
			algunsNomesAMais.add(dezNomes.get(random.nextInt(dezNomes.size())));
		}
		
		algunsNomesAMais.add("Chosen One");
		Instant now = Instant.now();
		if (encontraNomeHashCode("Chosen One", algunsNomesAMais)) {
			Instant later = Instant.now();
			System.out.println("Tempo no metodo Hash code: " + Duration.between(now, later));
		}
		now = Instant.now();
		if (encontraNomeEquals("Chosen One", algunsNomesAMais)) {
			Instant later = Instant.now();
			System.out.println("Tempo no metodo Equals: " + Duration.between(now, later));
		}
	}
}
