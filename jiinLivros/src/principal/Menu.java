package principal;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int cod, isbnlivro, voltarmenu;
		String nome, nomelivro, generolivro, autorlivro;

		System.out.println("Digite seu nome: ");
		nome = leia.nextLine();

				while(true) {
				System.out.println("    *    *    *    *    *    *    *    *    *    *    *    *    *");
				System.out.println(" *    *    *____*    *____*    *____*    *_______   *   ____  *  ");
				System.out.println("   *    *  |    | *  |    | *  |    | *  |       \\ *   |    |   *");
				System.out.println(" *    *    |    |   *|    |   *|    |   *|        \\  * |    | *  ");
				System.out.println("    *   *  |    | *  |    | *  |    | *  |         \\   |    |   ");
				System.out.println(" *    *    |    |   *|    |   *|    |   *|    |\\    \\* |    | * ");
				System.out.println("    *    * |    |*   |    |*   |    |*   |    |*\\    \\ |    |  *");
				System.out.println(" *  ___*   |    |  * |    |   *|    |  * |    |  \\    \\|    | * ");
				System.out.println("   |   |___|    |*   |    |*   |    |*   |    | * \\         |   ");
				System.out.println("*  |	        |  * |    |   *|    |   *|    |   *\\        | * ");
				System.out.println("   |____________|*   |____|*   |____|*   |____|*    \\_______|   ");
				System.out.println("*    *    *    *    *    *    *    *    *    *    *    *    *    ");
				System.out.println("    *    *    *    *    *    *    *    *    *    *    *    *    *");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                Sistema gerenciador de biblioteca                ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("                                                                 ");
				System.out.println("           Olá " + nome + ", digite a opção que deseja:            ");
				System.out.println("                                                                 ");
				System.out.println("                                                                 ");
				System.out.println("           < 1 >  Consultar livro                                ");
				System.out.println("           < 2 >  Cadastrar livro                                ");
				System.out.println("           < 3 >  Atualizar  livro                               ");
				System.out.println("           < 4 >  Excluir livro                                  ");
				System.out.println("           < 0 >  Sair                                           ");
				System.out.println("                                                                 ");
				System.out.println("-----------------------------------------------------------------");
									cod = leia.nextInt();
						if(cod == 0) {
										
						System.out.println("Encerrando JIIN livros... ");
						System.exit(0);
						}

				switch(cod) {
				case 1:
				System.out.println("Você selecionou consultar livro!");
				System.out.println("Você deseja: ");
				System.out.println("           < 1 >  Consultar por nome");
				System.out.println("           < 2 >  Consultar por autor");
				System.out.println("           < 3 >  Consultar por gênero");
				System.out.println("           < 4 >  consultar por ISBN");
				System.out.println("           < 0 >  voltar para o menu");
						cod = leia.nextInt();
				
						switch(cod) {
						case 1:
						System.out.println("Digite o nome do livro: ");
						nomelivro = leia.nextLine();
							break;
							
						case 2:
							System.out.println("Digite o autor do livro: ");
							autorlivro = leia.nextLine();
								break;
						
						case 3:
							System.out.println("Digite o genêro do livro: ");
							generolivro = leia.nextLine();
								break;
								
						case 4:
							System.out.println("Digite o ISBN do livro: ");
							isbnlivro = leia.nextInt();
								break;
						
						case 0:
							System.out.println("Retornando ao menu...");
								break;
						}
					break;
					
				case 2:
					System.out.println("Você selecionou cadastrar livro");
					System.out.println("Para voltar ao menu, digite 0");
					System.out.println("Para continuar, digite 1");
					cod = leia.nextInt();
					
					switch(cod) {
					case 0:
					System.out.println("Voltando ao menu...");
						break;
					
					case 1:
						System.out.println("Voltando ao menu...");
						break;
						}
					
				case 3:
					System.out.println("Você selecionou atualizar livro!");
					System.out.println("Digite o código ISBN do livro que deseja atualizar");
					System.out.println("Para voltar ao menu, digite 0");
					break;
					
				case 4:
					System.out.println("Você selecionou excluir!");
					System.out.println("Digite o código ISBN do livro que deseja excluir");
					isbnlivro = leia.nextInt();
					break;
				
				default:
					System.out.println("Opção inválida.");
					System.out.println("Para voltar ao menu, digite 0");
					cod = leia.nextInt();
					
						if(cod == 0) {
						System.out.println("Retornando ao menu...");
						}else{
							System.out.println("Código inválido.");
						}
				}
				}
	}
}