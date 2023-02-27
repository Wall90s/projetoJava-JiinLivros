package principal;

import java.io.IOException;
import java.util.Scanner;

import principal.controller.LivroController;
import principal.model.Digital;
import principal.model.Fisico;
import principal.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int anoDePublicacao, qtdPagina, opcao, tipo = 0, codigo = 0;
		String titulo, editora, sinopse, genero, idioma, autor, nome, isbn;

		System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_WHITE + "Digite seu nome: \n");
		nome = leia.nextLine();

		LivroController livros = new LivroController();

		Digital d1 = new Digital("Ricardo III", "L&PM", "História sobre O Rei Ricardo III", "Romance", "PT - BR",
				"8525415847", "William Shakespeare", 2014, livros.gerarCodigo(), 320, 1, "25MB", false, false, false,
				"PDF");
		livros.cadastrarLivro(d1);

		Fisico f1 = new Fisico("Carol", "Aletria", "Carol não é uma menininha chata daquelas que morre de medo",
				"Humor", "PT - BR", "856116770X", "Laerte", 2014, livros.gerarCodigo(), 36, 2, "Brochura", false, "-",
				5, "-");
		livros.cadastrarLivro(f1);

		while (true) {
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_PURPLE_BACKGROUND
					+ "\n    *    *    *    *    *    *    *    *    *    *    *    *    *");
			System.out.println(" *    *    *____*    *____*    *____*    *_______   *    ____  * ");
			System.out.println("   *    *  |    | *  |    | *  |    | *  |       \\ *   |    |  *");
			System.out.println(" *    *    |    |   *|    |   *|    |   *|        \\  * |    | * ");
			System.out.println("    *   *  |    | *  |    | *  |    | *  |         \\   |    |   ");
			System.out.println(" *    *    |    |   *|    |   *|    |   *|    |\\    \\*|    | * ");
			System.out.println("    *    * |    |*   |    |*   |    |*   |    |*\\    \\|    |  *");
			System.out.println(" *  ___*   |    |  * |    |   *|    |  * |    |  \\    \\|   | * ");
			System.out.println("   |   |___|    |*   |    |*   |    |*   |    | * \\         |   ");
			System.out.println("*  |	        |  * |    |   *|    |   *|    |   *\\        | * ");
			System.out.println("   |____________|*   |____|*   |____|*   |____|*    \\_______|   ");
			System.out.println("*    *    *    *    *    *    *    *    *    *    *    *    *    ");
			System.out.println("    *    *    *    *    *    *    *    *    *    *    *    *    *");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                Sistema gerenciador de biblioteca                ");
			System.out.println("-----------------------------------------------------------------");
			System.out.println("                                                                 ");
			System.out.println(Cores.TEXT_YELLOW_BOLD + "           Olá " + nome + ", digite a opção que deseja:                ");
			System.out.println("                                                                 ");
			System.out.println("                                                                 ");
			System.out.println("           < 1 >  Consultar livros                               ");
			System.out.println("           < 2 >  Cadastrar livro                                ");
			System.out.println("           < 3 >  Atualizar livro                                ");
			System.out.println("           < 4 >  Excluir livro                                  ");
			System.out.println("           < 0 >  Sair                                           ");
			System.out.println("                                                                 ");
			System.out.println("-----------------------------------------------------------------");
			opcao = leia.nextInt();/* é a variavel das opções do menu */
			if (opcao == 0) {

				System.out.println(Cores.ANSI_PURPLE_BACKGROUND + "\nEncerrando JIIN livros... ");
				System.exit(0);
			}
			/* O switch do menu, switch de fora */
			switch (opcao) {
			case 1:
				System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_WHITE + "\nVocê selecionou consultar livro!\n");
				System.out.println("Você deseja:                                  ");
				System.out.println("           < 1 >  Consultar por título        ");
				System.out.println("           < 2 >  Consultar por autor         ");
				System.out.println("           < 3 >  Consultar por gênero        ");
				System.out.println("           < 4 >  Consultar por ISBN          ");
				System.out.println("           < 5 >  Listar todos os livros      ");
				System.out.println("           < 0 >  Voltar para o menu          \n");
				opcao = leia.nextInt();
				/* O switch de dentro do consultar, switch de dentro */
				switch (opcao) {
				case 1:
					System.out.println("\nDigite o título do livro: \n");
					leia.skip("\\R?");
					titulo = leia.nextLine();
					livros.consultarPorTitulo(titulo);
					keyPress();
					break;

				case 2:
					System.out.println("Digite o autor do livro: \n");
					leia.skip("\\R?");
					autor = leia.nextLine();
					livros.consultarPorAutor(autor);
					keyPress();
					break;

				case 3:
					System.out.println("Digite o genêro do livro: \n");
					leia.skip("\\R?");
					genero = leia.nextLine();
					livros.consultarPorGenero(genero);
					keyPress();
					break;

				case 4:
					System.out.println("Digite o ISBN do livro: \n");
					leia.skip("\\R?");
					isbn = leia.nextLine();
					livros.consultarPorIsbn(isbn);
					keyPress();
					break;
				case 5:
					System.out.println("Listando todos os livros\n");
					
					livros.listarLivros();
					
					keyPress();
					break;
				case 0:
					System.out.println("Retornando ao menu...\n");
					keyPress();
					break;
				}

				break;

			/* O switch do menu, switch de fora */
			case 2:
				System.out.println(Cores.ANSI_PURPLE_BACKGROUND + Cores.TEXT_WHITE + "Você selecionou cadastrar livro\n");

				System.out.println("Digite o título: \n");
				leia.skip("\\R?");
				titulo = leia.nextLine();

				System.out.println("Digite a editora: \n");
				leia.skip("\\R?");
				editora = leia.nextLine();

				System.out.println("Digite gênero: \n");
				leia.skip("\\R?");
				genero = leia.nextLine();

				System.out.println("Digite o Idioma: \n");
				leia.skip("\\R?");
				idioma = leia.nextLine();

				System.out.println("Digite o ISBN: \n");
				leia.skip("\\R?");
				isbn = leia.nextLine();

				System.out.println("Digite o autor: \n");
				leia.skip("\\R?");
				autor = leia.nextLine();

				System.out.println("Digite o ano de publicação: \n");
				anoDePublicacao = leia.nextInt();

				System.out.println("Digite a quantidade de páginas: \n");
				qtdPagina = leia.nextInt();

				System.out.println("Digite uma sinopse: \n");
				leia.skip("\\R?");
				sinopse = leia.nextLine();

				do {
					System.out.println("\nDigite tipo de livro: 1 para Digital, 2 para Físico \n");
					tipo = leia.nextInt();

				} while (tipo != 1 && tipo != 2);

				switch (tipo) {
				case 1:
					String tamanhoDoArquivo, tipoDeArquivo;
					boolean configFonte, leitorDeTela, pageFlip;

					System.out.println("Digite o tamanho do arquivo: \n");
					leia.skip("\\R?");
					tamanhoDoArquivo = leia.nextLine();

					System.out.println("Informe se possui Configuração de Fonte: ");
					System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
					leia.skip("\\R?");
					configFonte = leia.nextBoolean();

					System.out.println("Informe se possui Leitor de Tela:");
					System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
					leia.skip("\\R?");
					leitorDeTela = leia.nextBoolean();

					System.out.println("Informe se possui Page Flip:");
					System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
					leia.skip("\\R?");
					pageFlip = leia.nextBoolean();

					System.out.println("Informe o Tipo de arquivo: \n");
					leia.skip("\\R?");
					tipoDeArquivo = leia.nextLine();

					livros.cadastrarLivro(new Digital(titulo, editora, sinopse, genero, idioma, isbn, autor,
							anoDePublicacao, codigo = livros.gerarCodigo(), qtdPagina, tipo, tamanhoDoArquivo,
							configFonte, leitorDeTela, pageFlip, tipoDeArquivo));

					break;

				case 2:
					String tipoDeCapa, papelCapa, papelMiolo;
					boolean reformado;
					int estadoDeConsevacao;

					System.out.println("Informe o Tipo de capa: \n");
					leia.skip("\\R?");
					tipoDeCapa = leia.nextLine();

					System.out.println("Informe se o livro é Reformado:");
					System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
					reformado = leia.nextBoolean();

					System.out.println("Informe o Tipo do papel da capa: \n");
					leia.skip("\\R?");
					papelCapa = leia.nextLine();

					System.out.println("Informe o estado de conservação: \n");
					System.out.println("Digite um número entre 1 e 5");
					System.out.println("Sendo que para 1, em péssima condição");
					System.out.println("e 5 para em ótima condição \n");
					estadoDeConsevacao = leia.nextInt();

					System.out.println("Informe o tipo de Papel do miolo: \n");
					leia.skip("\\R?");
					papelMiolo = leia.nextLine();

					livros.cadastrarLivro(new Fisico(titulo, editora, sinopse, genero, idioma, isbn, autor,
							anoDePublicacao, codigo = livros.gerarCodigo(), qtdPagina, tipo, tipoDeCapa, reformado,
							papelCapa, estadoDeConsevacao, papelMiolo));

					break;

				default:
					System.out.println("Opção Inválida! \n");
				}

				System.out.println("O livro foi cadastrado com sucesso! \n");
				System.out.println("O código gerado foi: " + codigo + "\n");
				keyPress();

				break;
			case 3:
				System.out.println("Você selecionou atualizar livro! \n");

				// adicionar a atualização

				System.out.print("Digite o código do livro para atualização: \n");
				codigo = leia.nextInt();

				if (livros.buscarNaCollection(codigo) != null) {

					System.out.println("Digite o título: \n");
					leia.skip("\\R?");
					titulo = leia.nextLine();

					System.out.println("Digite a editora: \n");
					leia.skip("\\R?");
					editora = leia.nextLine();

					System.out.println("Digite a sinopse: \n");
					leia.skip("\\R?");
					sinopse = leia.nextLine();

					System.out.println("Digite gênero: \n");
					leia.skip("\\R?");
					genero = leia.nextLine();

					System.out.println("Digite o Idioma: \n");
					leia.skip("\\R?");
					idioma = leia.nextLine();

					System.out.println("Digite o ISBN: \n");
					leia.skip("\\R?");
					isbn = leia.nextLine();

					System.out.println("Digite o autor: \n");
					leia.skip("\\R?");
					autor = leia.nextLine();

					System.out.println("Digite o ano de publicação: \n");
					anoDePublicacao = leia.nextInt();

					System.out.println("Digite a quantidade de páginas: \n");
					qtdPagina = leia.nextInt();

					do {
						System.out.println("Digite tipo de livro: 1 para Digital, 2 para Físico \n");
						tipo = leia.nextInt();

					} while (tipo != 1 && tipo != 2);

					switch (tipo) {
					case 1:
						String tamanhoDoArquivo, tipoDeArquivo;
						boolean configFonte, leitorDeTela, pageFlip;

						System.out.println("Digite o tamanho do arquivo: \n");
						leia.skip("\\R?");
						tamanhoDoArquivo = leia.nextLine();

						System.out.println("Informe se possui Configuração de Fonte: ");
						System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
						leia.skip("\\R?");
						configFonte = leia.nextBoolean();

						System.out.println("Informe se possui Leitor de Tela:");
						System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
						leia.skip("\\R?");
						leitorDeTela = leia.nextBoolean();

						System.out.println("Informe se possui Page Flip:");
						System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
						leia.skip("\\R?");
						pageFlip = leia.nextBoolean();

						System.out.println("Informe o Tipo de arquivo: \n");
						leia.skip("\\R?");
						tipoDeArquivo = leia.nextLine();

						livros.atualizarLivro(new Digital(titulo, editora, sinopse, genero, idioma, isbn, autor,
								anoDePublicacao, codigo, qtdPagina, tipo, tamanhoDoArquivo, configFonte, leitorDeTela,
								pageFlip, tipoDeArquivo));

						break;

					case 2:
						String tipoDeCapa, papelCapa, papelMiolo;
						boolean reformado;
						int estadoDeConsevacao;

						System.out.println("Informe o Tipo de capa: \n");
						leia.skip("\\R?");
						tipoDeCapa = leia.nextLine();

						System.out.println("Informe se o livro é Reformado:");
						System.out.println("Digite \"true\" para sim, e \"false\" para não \n");
						reformado = leia.nextBoolean();

						System.out.println("Informe o Tipo do papel da capa: \n");
						leia.skip("\\R?");
						papelCapa = leia.nextLine();

						System.out.println("Informe o estado de conservação: ");
						System.out.println("Digite um número entre 1 e 5");
						System.out.println("Sendo que para 1, em péssima condição");
						System.out.println("e 5 para em ótima condição \n");
						estadoDeConsevacao = leia.nextInt();

						System.out.println("Informe o tipo de Papel do miolo: \n");
						leia.skip("\\R?");
						papelMiolo = leia.nextLine();

						livros.atualizarLivro(new Fisico(titulo, editora, sinopse, genero, idioma, isbn, autor,
								anoDePublicacao, codigo, qtdPagina, tipo, tipoDeCapa, reformado, papelCapa,
								estadoDeConsevacao, papelMiolo));

						break;

					default:
						System.out.println("Opção Inválida! \n");
					}

				}else {
					System.out.println("O livro foi atualizado com sucesso! \n");
				}
				

				keyPress();
				break;

			/* O switch do menu, switch de fora */
			case 4:
				System.out.println("Você selecionou excluir!\n");
	
				System.out.println("Digite o código do livro que deseja excluir: \n");
				codigo = leia.nextInt();
				
				livros.excluirLivro(codigo);
				
				keyPress();
				break;

			default:
				System.out.println("Opção inválida. \n");

			}
		}
	}

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}
