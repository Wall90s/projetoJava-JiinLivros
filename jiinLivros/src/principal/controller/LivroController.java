package principal.controller;

import java.util.ArrayList;

import principal.model.Livro;
import principal.repository.LivroRepository;

public class LivroController implements LivroRepository {

	private ArrayList<Livro> listaLivros = new ArrayList<Livro>();
	private int numero = 1;
	
	@Override
	public void consultarPorTitulo(String titulo) {
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();

		for (var livro : listaLivros) {
			String livroTitulo = livro.getTitulo();
			if (livroTitulo.equalsIgnoreCase(titulo)) {
				livrosEncontrados.add(livro);
			}
		}

		if (livrosEncontrados.size() == 0) {
			System.out.println("\nLivro não encontrado na lista\n");
		} else {
			for (Livro livro : livrosEncontrados) {
				livro.visualizar();
			}
		}

	}

	@Override
	public void consultarPorGenero(String genero) {
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();

		for (var livro : listaLivros) {
			String livroGenero = livro.getGenero();
			if (livroGenero.equalsIgnoreCase(genero)) {
				livrosEncontrados.add(livro);
			}
		}

		if (livrosEncontrados.size() == 0) {
			System.out.println("\nGênero não encontrado na lista\n");
		} else {
			for (Livro livro : livrosEncontrados) {
				livro.visualizar();
			}
		}

	}

	@Override
	public void consultarPorAutor(String autor) {
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();

		for (var livro : listaLivros) {
			String livroAutor = livro.getAutor();
			if (livroAutor.equalsIgnoreCase(autor)) {
				livrosEncontrados.add(livro);
			}
		}

		if (livrosEncontrados.size() == 0) {
			System.out.println("\nAutor não encontrado na lista\n");
		} else {
			for (Livro livro : livrosEncontrados) {
				livro.visualizar();
			}
		}

	}

	@Override
	public void consultarPorIsbn(String isbn) {
		ArrayList<Livro> livrosEncontrados = new ArrayList<Livro>();

		for (var livro : listaLivros) {
			String livroIsbn = livro.getIsbn();
			if (livroIsbn.equalsIgnoreCase(isbn)) {
				livrosEncontrados.add(livro);
			}
		}

		if (livrosEncontrados.size() == 0) {
			System.out.println("\nISBN não encontrado na lista\n");
		} else {
			for (Livro livro : livrosEncontrados) {
				livro.visualizar();
			}
		}

	}

	@Override
	public void cadastrarLivro(Livro livro) {
		listaLivros.add(livro);
	}

	@Override
	public void listarLivros() {
		
		if(listaLivros.size() != 0) {
			for (Livro livro : listaLivros) {
			livro.visualizar();
			}
		} else {
			System.out.println("\nA Lista está vazia!\n");
		}

	}

	@Override
	public void atualizarLivro(Livro livro) {
		var buscaLivro = buscarNaCollection(livro.getCodigo());
		
		if(buscaLivro != null) {
			listaLivros.set(listaLivros.indexOf(buscaLivro), livro);
			System.out.println("\nO Livro: " + livro.getTitulo() + " do código" + livro.getCodigo() +  " foi atualizada com sucesso!\n");
		} else {
			System.out.println("\nO Livro com o código: " + livro.getCodigo() + " não foi encontrada!\n");
		}

	}

	@Override
	public void excluirLivro(int codigo) {
		var buscaLivro = buscarNaCollection(codigo);
		
		if(buscaLivro != null) {
			if(listaLivros.remove(buscaLivro) == true) {
				System.out.print("\nO Livro com o " + codigo + " foi excluido com sucesso!\n");
			}
		} else {
			System.out.println("\nO Livro com o código: " + codigo + " não foi encontrada!\n");
		}
	}
	
	public Livro buscarNaCollection(int codigo) {
		for (var livro : listaLivros)
			if (livro.getCodigo() == codigo) {
				return livro;
			}
		return null;
	}
	
	public int gerarCodigo() {		
		if (listaLivros.size() == 0 ) {
			return numero;
		}else {
			numero++;
			return numero;
		}
	}

}
