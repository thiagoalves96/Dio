package Map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ConhecendoMetodosMap {

	public static void main(String[] args) {
		System.out.println("Crie um dicionário que relacione os modelos e seus respectivas consumos:");

		Map<String, Double> carrosPopulares = new HashMap<>() {
			private static final long serialVersionUID = 1L;

			{
				put("Gol", 2.4);
				put("Uno", 14.4);
				put("Mobi", 15.4);
				put("Hb20", 15.6);
				put("Kwid", 16.1);
			}
		};
		System.out.println(carrosPopulares.toString());

		System.out.println("Substitua o consumo do gol por 15.2 km/l: ");
		carrosPopulares.put("Gol", 15.2);
		System.out.println(carrosPopulares.toString());
		System.out.println("Confira se o modelo Tucson está adicionado: " + carrosPopulares.containsKey("tucson"));
		System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("Uno"));
		// System.out.println("Exiba o terceiro modelo adicionado: "); nao tem metodo
		System.out.println("exiba os modelos: " + carrosPopulares.keySet());
		System.out.println("Exiba os consumos dos carros: " + carrosPopulares.values());
		System.out.println("Exiba o modelo mais economico e seu consumo: ");

		Double max = Collections.max(carrosPopulares.values());

		System.out.println("Exiba o modelo menos economico e seu consumo: ");
		Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
		// Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
		String modeloMenosEficiente = "";

		for (Map.Entry<String, Double> entry : carrosPopulares.entrySet()) {
			if (entry.getValue().equals(consumoMenosEficiente)) {
				modeloMenosEficiente = entry.getKey();
				System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
			}
		}

		System.out.println("Exiba a soma dos consumos: ");
		Iterator<Double> iterator = carrosPopulares.values().iterator();
		Double soma = 0d;
		while (iterator.hasNext()) {
			soma += iterator.next();
		}
		System.out.println(soma);
		System.out.println("Exiba a media de consumos dos carros: " + (soma / carrosPopulares.size()));
		System.out.println("Remova os modelos com o conf=sumo igual a 15,6 kml/l: ");
		Iterator<Double> iterator1 = carrosPopulares.values().iterator();
		while (iterator1.hasNext()) {
			if (iterator1.next().equals(15.6)) {
				iterator1.remove();
			}
		}
		System.out.println(carrosPopulares);
		System.out.println("Exiba todos os carros na ordem que foram informados: ");
		Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {

			{
				put("Gol", 2.4);
				put("Uno", 14.4);
				put("Mobi", 15.4);
				put("Hb20", 15.6);
				put("Kwid", 16.1);
			}
		};
		System.out.println(carrosPopulares2.toString());
		System.out.println("Exiba o dicionário ordenado pelo modelo e confira se está vazio: ");
		Map<String, Double> carrosPopulares21 = new TreeMap<>(carrosPopulares2);
		System.out.println(carrosPopulares21.toString());
		System.out.println("Apague o dicionário de carros: ");
		carrosPopulares.clear();
		carrosPopulares2.clear();
		carrosPopulares21.clear();
		System.out.println(carrosPopulares.isEmpty());
		System.out.println(carrosPopulares2.isEmpty());
		System.out.println(carrosPopulares21.isEmpty());

	}

}
