/* Faça um programa que receba a temperatura
 * média dos 6 primeiros meses do ano e armazene-as
 * em uma lista.
 * Após isto, calcule a média semestral das temperaturas
 * e mostre todas as temperaturas acima desta média,
 *  e em que mês elas ocorreram (mostrar o mês por
 *  extenso: 1 - janeiro, 2 - fevereiro e etc..).
 */

package Desafios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import Metodos.PularLinha;

public class TemperaturaList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Double> temperatura = new ArrayList<>();
		temperatura.add(36.7);
		temperatura.add(37.7);
		temperatura.add(40.7);
		temperatura.add(35.7);
		temperatura.add(39.7);
		temperatura.add(36.9);

		Iterator<Double> iterator = temperatura.iterator();
		double soma = 0;
		while (iterator.hasNext()) {
			Double next = iterator.next();
			soma += next;
		}
		double media = soma / 6;
//		System.out.println(media);

		System.out.println("As temperaturas maiores que a média do semestre: ");
		Iterator<Double> iterator2 = temperatura.iterator();
		while (iterator2.hasNext()) {
			Double next = iterator2.next();
			if (next > media) {
				System.out.print(next + " ");
			}
		}
		// Rodear as listas com o For
		double soma1 = 0;
		for (int i = 0; i < temperatura.size(); i++) {
			soma1 += temperatura.get(i);
		}
		PularLinha.jumpLine(2);
		System.out.println(soma1 / 6);

		sc.close();
	}

}
