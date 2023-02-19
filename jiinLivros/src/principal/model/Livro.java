package principal.model;

public class Livro {
	private String nome;
	private String editora;
	private String sinopse;
	private String genero;
	private String idioma;
	
	public Livro(String nome, String editora, String sinopse, String genero, String idioma) {
		this.nome = nome;
		this.editora = editora;
		this.sinopse = sinopse;
		this.genero = genero;
		this.idioma = idioma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getSinopse() {
		return sinopse;
	}

	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	
	
}
