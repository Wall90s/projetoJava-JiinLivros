package principal;

import java.io.IOException;
import java.util.Scanner;

import principal.model.Digital;
import principal.model.Fisico;
import principal.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int isbn, anoDePublicacao, qtdPagina, voltarmenu, opcao;
		String titulo, editora, sinopse, genero, idioma, autor, nome;
		int tipo = 0, codigo = 0;
		
		System.out.println(Cores.ANSI_PURPLE_BACKGROUND_BRIGHT + Cores.TEXT_BLACK +  "Digite seu nome: ");
		nome = leia.nextLine();
		
		Digital d1 = new Digital("Ricardo III", "L&PM", "História sobre O Rei Ricardo III", "Romance", "PT - BR", "8525415847", "William Shakespeare", 2014, 1, 320, 1, "25MB", false, false, false, "PDF");
		Fisico f1 = new Fisico("Carol", "Aletria", "Carol não é uma menininha chata daquelas que morre de medo", "Humor", "PT - BR", "856116770X", "Learte", 2014, 2, 36, 2, "Brochura", false, "-", 5, "-");
			while(true) {
				System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_PURPLE_BACKGROUND + "    *    *    *    *    *    *    *    *    *    *    *    *    *");
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
				System.out.println(Cores.TEXT_YELLOW_BOLD + "           Olá " + nome + ", digite a opção que deseja:          ");
				System.out.println("                                                                 ");
				System.out.println("                                                                 ");
				System.out.println("           < 1 >  Consultar livro                                ");
				System.out.println("           < 2 >  Cadastrar livro                                ");
				System.out.println("           < 3 >  Atualizar  livro                               ");
				System.out.println("           < 4 >  Excluir livro                                  ");
				System.out.println("           < 0 >  Sair                                           ");
				System.out.println("                                                                 ");
				System.out.println("-----------------------------------------------------------------");
									opcao = leia.nextInt();/*é a variavel das opções do menu*/
						if(opcao == 0) {
										
						System.out.println(Cores.ANSI_RED_BACKGROUND +  "Encerrando JIIN livros... ");
						System.exit(0);
						}
					/*O switch do menu, switch de fora*/
				switch(opcao) {
				case 1:
				System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_WHITE + "Você selecionou consultar livro!");
				System.out.println("Você deseja: ");
				System.out.println("           < 1 >  Consultar por nome");
				System.out.println("           < 2 >  Consultar por autor");
				System.out.println("           < 3 >  Consultar por gênero");
				System.out.println("           < 4 >  consultar por ISBN");
				System.out.println("           < 0 >  voltar para o menu");
						opcao = leia.nextInt();
							/*O switch de dentro do consultar, switch de dentro*/
						switch(opcao) {
						case 1:
						System.out.println("Digite o título do livro: ");
						leia.skip("\\R?");
						titulo = leia.nextLine();
						keyPress();	
						break;
							
						case 2:
							System.out.println("Digite o autor do livro: ");
							leia.skip("\\R?");
							autor = leia.nextLine();
							keyPress();	
							break;
						
						case 3:
							System.out.println("Digite o genêro do livro: ");
							leia.skip("\\R?");
							genero = leia.nextLine();
							keyPress();	
							break;
								
						case 4:
							System.out.println("Digite o ISBN do livro: ");
							isbn = leia.nextInt();
							keyPress();	
							break;
						
						case 0:
							System.out.println("Retornando ao menu...");
							keyPress();	
							break;
						}
						keyPress();
						break;
		
					/*O switch do menu, switch de fora*/
				case 2:
					System.out.println(Cores.ANSI_GREEN_BACKGROUND + Cores.TEXT_WHITE + "Você selecionou cadastrar livro");
					
						System.out.println("Digite o título: ");
						leia.skip("\\R?");
						titulo = leia.nextLine();
						
				        System.out.println("Digite a editora: ");
				        leia.skip("\\R?");
				        editora = leia.nextLine();
						
				        
				        System.out.println("Digite gênero: ");
				        leia.skip("\\R?");
				        genero = leia.nextLine();
				        
				        System.out.println("Digite o Idioma: ");
				        leia.skip("\\R?");
				        idioma = leia.nextLine();
				        
				        System.out.println("Digite o ISBN: ");
				        isbn = leia.nextInt();
				        
				        System.out.println("Digite o autor: ");
				        leia.skip("\\R?");
				        autor = leia.nextLine();
				        
				        System.out.println("Digite o ano de publicação: ");
				        anoDePublicacao = leia.nextInt();
				        
				        System.out.println("Digite a quantidade de páginas: ");
				        qtdPagina = leia.nextInt();
				        
				        System.out.println("Digite tipo de livro: 1 para Digital, 2 para Físico ");
				        tipo = leia.nextInt();
				        
				        switch(tipo) {
				        case 1 : 
				        	keyPress();
				        	break;
				        	
				        case 2:
				        	keyPress();
				        	break;
				        	
				        default:
				        		System.out.println("Opção Inválida!");
				        }
				        /*variavelcodigo ainda não recebeu valor, precisa ser gerada.*/
				        System.out.println("O livro foi cadastrado com sucesso! ");
				        System.out.println("O código gerado foi: " + codigo);
				   
				/*	System.out.println("Para voltar ao menu, digite 0");
					System.out.println("Para continuar, digite 1");
					cod = leia.nextInt();*/
				
				/*	switch(cod) {
					case 0:
					System.out.println(Cores.TEXT_BLACK + Cores.ANSI_PURPLE_BACKGROUND + "Voltando ao menu...");
						break;
					
					case 1:
						System.out.println("Voltando ao menu...");
						break;
						}*/
				       
				  /*O switch do menu, switch de fora*/
				case 3:
					System.out.println("Você selecionou atualizar livro!");
			
					// adicionar a atualização
					
					System.out.println("Digite o título: ");
					leia.skip("\\R?");
					titulo = leia.nextLine();
					
			        System.out.println("Digite a editora: ");
			        leia.skip("\\R?");
			        editora = leia.nextLine();
					
			        System.out.println("Digite tipo de livro: 1 para Digital, 2 para Físico " + tipo);
			        tipo = leia.nextInt();
			        
			        System.out.println("Digite gênero: ");
			        leia.skip("\\R?");
			        genero = leia.nextLine();
			        
			        System.out.println("Digite o Idioma: ");
			        leia.skip("\\R?");
			        idioma = leia.nextLine();
			        
			        System.out.println("Digite o ISBN: ");
			        isbn = leia.nextInt();
			        
			        System.out.println("Digite o autor: ");
			        leia.skip("\\R?");
			        autor = leia.nextLine();
			        
			        System.out.println("Digite o ano de publicação: ");
			        anoDePublicacao = leia.nextInt();
			        
			        System.out.println("Digite a quantidade de páginas: ");
			        qtdPagina = leia.nextInt();
			      
			        System.out.println("O livro foi atualizado com sucesso! ");
			        keyPress();
			        break;
					
					/*O switch do menu, switch de fora*/
				case 4:
					System.out.println("Você selecionou excluir!");
					// adicionar excluir
					System.out.println("Digite o código ISBN do livro que deseja excluir");
					isbn = leia.nextInt();
					keyPress();
					break;
				
				default:
					System.out.println("Opção inválida.");
					
					
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
