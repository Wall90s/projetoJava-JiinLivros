package principal.model;

public class Fisico extends Livro{
	
	private int tipoDeCapa;
	private boolean reformado;
	private String papelCapa;
	private int estadoDeConsevacao;
	private String papelMiolo;
	
	public Fisico(String titulo, String editora, String sinopse, String genero, String idioma, int isbn, String autor,
			int anoDePublicacao, int codigo, int qtdPagina, int tipo, int tipoDeCapa, boolean reformado,
			String papelCapa, int estadoDeConsevacao, String papelMiolo) {
		super(titulo, editora, sinopse, genero, idioma, isbn, autor, anoDePublicacao, codigo, qtdPagina, tipo);
		this.tipoDeCapa = tipoDeCapa;
		this.reformado = reformado;
		this.papelCapa = papelCapa;
		this.estadoDeConsevacao = estadoDeConsevacao;
		this.papelMiolo = papelMiolo;
	}
	
	
	public int getTipoDeCapa() {
		return tipoDeCapa;
	}
	public void setTipoDeCapa(int tipoDeCapa) {
		this.tipoDeCapa = tipoDeCapa;
	}
	public boolean isReformado() {
		return reformado;
	}
	public void setReformado(boolean reformado) {
		this.reformado = reformado;
	}
	public String getPapelCapa() {
		return papelCapa;
	}
	public void setPapelCapa(String papelCapa) {
		this.papelCapa = papelCapa;
	}
	public int getEstadoDeConsevacao() {
		return estadoDeConsevacao;
	}
	public void setEstadoDeConsevacao(int estadoDeConsevacao) {
		this.estadoDeConsevacao = estadoDeConsevacao;
	}
	public String getPapelMiolo() {
		return papelMiolo;
	}
	public void setPapelMiolo(String papelMiolo) {
		this.papelMiolo = papelMiolo;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Tipo de Capa: " + this.tipoDeCapa);
		System.out.println("O livro está reformado? " + this.reformado);
		System.out.println("Papel da Capa: " + this.papelCapa);
		System.out.println("Estado de Conservação: " + this.estadoDeConsevacao);
		System.out.println("Papel Miolo: " + this.papelMiolo);
		

	}
}
