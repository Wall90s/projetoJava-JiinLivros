package principal.repository;

import principal.model.Livro;

public interface LivroRepository {
	public void consultarPorNome(String titulo);
	
	public void consultarPorGenero(String genero);
	
	public void consultarPorAutor(String autor);
	
	public void consultarPorIsbn(int isbn);
	
	public void cadastrarLivro(Livro livro);
	
	public void listarLivros();
	
	public void atualizarLivro(Livro livro);
	
	public void excluirLivro(int codigo);
	
}
