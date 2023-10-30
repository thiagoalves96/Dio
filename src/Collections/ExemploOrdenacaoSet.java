package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import Metodos.PularLinha;

public class ExemploOrdenacaoSet {

	public static void main(String[] args) {
		
		Set<SerieSetOrdenacao> minhasSeries = new HashSet <> () {private static final long serialVersionUID = 1L;

		{
			add(new SerieSetOrdenacao("GOT","Fantasia",60));
			add(new SerieSetOrdenacao("Dark","Drama",60));
			add(new SerieSetOrdenacao("THAT '70s show","Comédia",21));
		}};
		System.out.println("Ordem aleatória:");
		for (SerieSetOrdenacao serieSetOrdenacao : minhasSeries) 
			System.out.println(serieSetOrdenacao.getNome() +" - "+serieSetOrdenacao.getGenero()+" - "+serieSetOrdenacao.getTempoEpisodio());
		
		PularLinha.jumpLine(1);
		
		Set<SerieSetOrdenacao> minhasSeries1 = new LinkedHashSet <> () {private static final long serialVersionUID = 1L;

		{
			add(new SerieSetOrdenacao("GOT","Fantasia",60));
			add(new SerieSetOrdenacao("Dark","Drama",60));
			add(new SerieSetOrdenacao("THAT '70s show","Comédia",21));
		}};
		System.out.println("Ordem Inserção:");
		for (SerieSetOrdenacao serieSetOrdenacao : minhasSeries1) 
			System.out.println(serieSetOrdenacao.getNome() +" - "+serieSetOrdenacao.getGenero()+" - "+serieSetOrdenacao.getTempoEpisodio());
		
		PularLinha.jumpLine(1);

		System.out.println("Tempo natural (Tempo dos Episodios");
		Set<SerieSetOrdenacao> minhasSeries2 = new TreeSet<>(minhasSeries1); //Tree set quando tem duas iguais ele mostrará um apenas, deverá fazer um desempate para mostrar todos
		for (SerieSetOrdenacao serieSetOrdenacao : minhasSeries2) 
			System.out.println(serieSetOrdenacao.getNome() +" - "+serieSetOrdenacao.getGenero()+" - "+serieSetOrdenacao.getTempoEpisodio());
		
		PularLinha.jumpLine(1);
		
		System.out.println("ordem Nome/Genero/Tempo");
		Set<SerieSetOrdenacao> minhasSeries3 = new TreeSet<>(new ComparatoNomeGeneroTempoEpisodio());
		minhasSeries3.addAll(minhasSeries);
		for (SerieSetOrdenacao serieSetOrdenacao : minhasSeries3) 
			System.out.println(serieSetOrdenacao.getNome() +" - "+serieSetOrdenacao.getGenero()+" - "+serieSetOrdenacao.getTempoEpisodio());
		
		
		
		}

}
