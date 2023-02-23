package principal.model;

public abstract class Livro { //abstratct Impede de criar o objeto livro, somente se criar apartir da classe LivroDigital e LivroFísico.
	private String titulo;
	private String editora;
	private String sinopse;
	private String genero;
	private String idioma;
	private int isbn;
	private String autor;
	private int anoDePublicacao;
	private int codigo;
	private int qtdPagina;
	private int tipo;
	
	
	
	public Livro(String titulo, String editora, String sinopse, String genero, String idioma, int isbn, String autor, int anoDePublicacao, int codigo, int qtdPagina, int tipo) {
		this.titulo = titulo;
		this.editora = editora;
		this.sinopse = sinopse;
		this.genero = genero;
		this.idioma = idioma;
		this.isbn = isbn;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
		this.codigo = codigo;
		this.qtdPagina = qtdPagina;
		this.tipo = tipo;
	}

	public int getQtdPagina() { //Mostra a informação contida na variavel.
		return qtdPagina;
	}

	public void setQtdPagina(int qtdPagina) { //altera a informação contida na variavel.
		this.qtdPagina = qtdPagina;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	
public void visualizar () {
        
        String tipo = "";
        
        switch(this.tipo) {
            case 1 -> tipo = "Livro digital";
            case 2 -> tipo = "Livro físico";
        }
        
        System.out.println("*******************************");
        System.out.println("        DADOS DO LIVRO        ");
        System.out.println("*******************************");
        System.out.println("Título: " + this.titulo);
        System.out.println("editora: " + this.editora);
        System.out.println("tipo: " + tipo);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Idioma: " + this.idioma);
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoDePublicacao);
        System.out.println("codigo: " + this.codigo);
        System.out.println("Quantidade de páginas: " + this.qtdPagina);
   
    }
	
	
}
