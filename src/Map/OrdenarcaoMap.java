package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class OrdenarcaoMap {
	public static void main(String[] args) {
		System.out.println("Ordem aleatória: ");
		Map<String, Livro> meusLivros = new HashMap<>() {
			{
				put("Hawking, Sthphen", new Livro("Uma Breve História do tempo", 264));
				put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
				put("Harari, Yuval Noah", new Livro("21 lições Para Século 21", 432));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		System.out.println("Ordem de Inserção: ");
		Map<String, Livro> meusLivros1 = new LinkedHashMap<>() {
			{
				put("Hawking, Sthphen", new Livro("Uma Breve História do tempo", 264));
				put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
				put("Harari, Yuval Noah", new Livro("21 lições Para Século 21", 432));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros1.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}
		System.out.println("Ordem alfabetica autores: ");
		Map<String, Livro> meusLivros2 = new TreeMap<>() {
			{
				put("Hawking, Sthphen", new Livro("Uma Breve História do tempo", 264));
				put("Duhigg, Charles", new Livro("O poder do Hábito", 408));
				put("Harari, Yuval Noah", new Livro("21 lições Para Século 21", 432));
			}
		};
		for (Map.Entry<String, Livro> livro : meusLivros2.entrySet()) {
			System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
		}

	}

}

class Livro {
	private String nome;
	private Integer paginas;

	public Livro(String nome, Integer paginas) {
		super();
		this.nome = nome;
		this.paginas = paginas;
	}

	public String getNome() {
		return nome;
	}

	public Integer getPaginas() {
		return paginas;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, paginas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(paginas, other.paginas);
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", paginas=" + paginas + "]";
	}

}