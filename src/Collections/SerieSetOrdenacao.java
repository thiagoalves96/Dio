package Collections;

import java.util.Comparator;
import java.util.Objects;

public class SerieSetOrdenacao implements Comparable<SerieSetOrdenacao> {
	private String nome;
	private String genero;
	private Integer tempoEpisodio;

	public SerieSetOrdenacao(String nome, String genero, Integer tempoEpisodio) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	public void setTempoEpisodio(Integer tempoEpisodio) {
		this.tempoEpisodio = tempoEpisodio;
	}

	@Override
	public String toString() {
		return "Serie [nome=" + nome + ", genero=" + genero + ", tempoEpisodio=" + tempoEpisodio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genero, nome, tempoEpisodio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SerieSetOrdenacao other = (SerieSetOrdenacao) obj;
		return Objects.equals(genero, other.genero) && Objects.equals(nome, other.nome)
				&& Objects.equals(tempoEpisodio, other.tempoEpisodio);
	}

	@Override
	public int compareTo(SerieSetOrdenacao serie) {
		// TODO Auto-generated method stub
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0)
			return tempoEpisodio;
		return this.getGenero().compareTo(serie.getGenero());
	}

}

class ComparatoNomeGeneroTempoEpisodio implements Comparator<SerieSetOrdenacao> {

	@Override
	public int compare(SerieSetOrdenacao s1, SerieSetOrdenacao s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0)
			return nome;

		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0)
			return genero;

		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());

	}

}
