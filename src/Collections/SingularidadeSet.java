package Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SingularidadeSet {

	public static void main(String[] args) {
		
		System.out.println("Crie conjunto e adicione as notas: ");
		Set<Double> notas = new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
		
		System.out.println(notas.toString());
		
//		System.out.println("Exiba a posição da nota 5.0: "); nao é possivel no set
//		System.out.println("Adicione na lista a nota 8.0 na posicao 4: "); nao é possivel no set
//		System.out.println("Substitua a nota 5.0 pela nota 6.0: "); Não e possivel no set
		System.out.println("Confira se tem nota 5.0 na lista: "+notas.contains(5d));
		
		System.out.println("Exiba a menor nota: "+Collections.min(notas));
		System.out.println("Exiba a maior nota: "+Collections.max(notas));
		
		System.out.println("Exiba a soma dos valores: ");
		Iterator<Double> notasIterator = notas.iterator();
		double soma = 0;
		
		while(notasIterator.hasNext()) {
			double next = notasIterator.next();
			soma+=next;
		}
		System.out.println(String.format("%.2f", soma));
		
		System.out.println("Exiba a média da notas: "+(soma/notas.size()));
		System.out.println("Remova a nota 0: ");
		notas.remove(0d);
		System.out.println(notas);
		System.out.println("Remova as notas menores do que 7: ");
		Iterator<Double> notasIterator1 = notas.iterator();
		while(notasIterator1.hasNext()) {
			double proximo = notasIterator1.next();
			if(proximo < 7) notasIterator1.remove();
		}
		System.out.println(notas);
		System.out.println("Exiba a ordem de comom foram criadas: ");
		Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d,8.5,9.3,5d,0d,3.6));
		System.out.println(notas2);
		Set<Double> notas3 = new TreeSet<>(notas2);
		System.out.println(notas3);
		notas.clear();
		System.out.println("Confira se o conjunto está vazio: "+notas.isEmpty());
		System.out.println("Confira se o conjunto 2 está vazio: "+notas2.isEmpty());
		System.out.println("Confira se o conjunto 3 está vazio: "+notas3.isEmpty());
		
		
		
		

	}

}
