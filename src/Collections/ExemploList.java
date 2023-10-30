package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {

	public static void main(String[] args) {

		System.out.println("Crie uma lista e adicione as setes notas:");
		List<Double> notas = new ArrayList<>();
		notas.add(7.0);
		notas.add(8.0);
		notas.add(9.0);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(8.0);
		notas.add(6.0);
		
		System.out.println(notas);
//		System.out.println(notas.toString());
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8d);
		System.out.println(notas);
		System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
		System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
		for (double nota : notas)
			System.out.println(nota);
		System.out.println("Exibir a terceira nota adicionada " + notas.get(3));
		System.out.println("Exibir a menor nota " + Collections.min(notas));
		System.out.println("exiba a maior nota " + Collections.max(notas));
		System.out.println("Exiba a soma dos valores ");
		Iterator<Double> iterator = notas.iterator();
		double soma = 0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		System.out.println(soma);
		System.out.println("Exibir a media das notas: " + (soma / notas.size()));
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println("Remova a nota na posicao 0: ");
		notas.remove(0);
		
		System.out.println("Remova as notas menores de 7: ");
		Iterator <Double> iterator2 = notas.iterator();
		while (iterator2.hasNext()) {
			Double next = iterator2.next();
			if (next < 7)
				iterator2.remove();
		}
		System.out.println(notas);
		System.out.println("Apaga toda a lista: ");
		notas.clear();
		System.out.println("Confira se está vazia: "+notas.isEmpty());

	}

}
