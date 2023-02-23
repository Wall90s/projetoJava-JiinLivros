package principal.model;

public class Digital extends Livro{

	private String tamanhoDoArquivo;
	private boolean configFonte;
	private boolean leitorDeTela;
	private boolean pageFlip;
	private String tipoDeArquivo;
	//mudar 'nome' para 'titulo'
	public Digital(String nome, String editora, String sinopse, String genero, String idioma, String tamanhoDoArquivo,
			boolean configFonte, boolean leitorDeTela, boolean pageFlip, String tipoDeArquivo) {
		super(nome, editora, sinopse, genero, idioma);
		this.tamanhoDoArquivo = tamanhoDoArquivo;
		this.configFonte = configFonte;
		this.leitorDeTela = leitorDeTela;
		this.pageFlip = pageFlip;
		this.tipoDeArquivo = tipoDeArquivo;
	}
	public String getTamanhoDoArquivo() {
		return tamanhoDoArquivo;
	}
	public void setTamanhoDoArquivo(String tamanhoDoArquivo) {
		this.tamanhoDoArquivo = tamanhoDoArquivo;
	}
	public boolean isConfigFonte() {
		return configFonte;
	}
	public void setConfigFonte(boolean configFonte) {
		this.configFonte = configFonte;
	}
	public boolean isLeitorDeTela() {
		return leitorDeTela;
	}
	public void setLeitorDeTela(boolean leitorDeTela) {
		this.leitorDeTela = leitorDeTela;
	}
	public boolean isPageFlip() {
		return pageFlip;
	}
	public void setPageFlip(boolean pageFlip) {
		this.pageFlip = pageFlip;
	}
	public String getTipoDeArquivo() {
		return tipoDeArquivo;
	}
	public void setTipoDeArquivo(String tipoDeArquivo) {
		this.tipoDeArquivo = tipoDeArquivo;
	}
	
	public void visualizar() {
		//adicionar o super.visualizar();
		System.out.println("Tamanho do arquivo: " + this.tamanhoDoArquivo);
		System.out.println("Configuração de fonte: " + this.configFonte);
		System.out.println("Page Flip: " + this.pageFlip);
		System.out.println("Leitor de tela: " + this.leitorDeTela);
		System.out.println("Tipo de arquivo: " + this.tipoDeArquivo);
	}
}
