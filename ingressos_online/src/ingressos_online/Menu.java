package ingressos_online;

import java.io.IOException;
import java.util.Scanner;
import ingressos_online.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		int numero, telefone, opcao;
		String nomeEvento, nomeTitular;
		float valor;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 INGRESSOS ONLINE                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar todos os eventos              ");
			System.out.println("            3 - Buscar evento pot nome               ");
			System.out.println("            4 - Atualizar Dados da Conta             ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Comprar Ingresso                     ");
			System.out.println("            7 - Transferir Ingresso                  ");
			System.out.println("            8 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = scanner.nextInt();
			
			if (opcao == 8) {
				System.out.println("\nIngressos online agradece o acesso e otimos shows!!");
				sobre();
                scanner.close();
				System.exit(0);
			}
		

		switch (opcao) {
			case 1:
				System.out.println("Criar Conta\n\n");
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os eventos \n\n");
				keyPress();
				break;
			case 3:
				System.out.println("Buscar evento pot nome\n\n");
				keyPress();
				break;
			case 4:
				System.out.println("Comprar Ingresso \n\n");
				keyPress();
				break;
			case 5:
				System.out.println("Transferir Ingresso \n\n");
				keyPress();
				break;
			case 6:
				System.out.println("Atualizar Dados da Conta \n\n");
				keyPress();
				break;
			case 7:
				System.out.println("Apagar a Conta\n\n");
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
		}
	}
}


	public static void sobre() {
	System.out.println(Cores.TEXT_RESET+ "\n*********************************************************");
	System.out.println("Projeto Desenvolvido por: ");
	System.out.println("Marcos Vinicius Nogueira Meneses - Marcosvnm1@hotmail.com");
	System.out.println("https://github.com/MarcosvMeneses");
	System.out.println("*********************************************************");
	}
	public static void keyPress() {

		try {
	        System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
	        
	        // Lê apenas a tecla Enter e ignora outras teclas
	        int input;
	        while ((input = System.in.read()) != '\n') {
	            // Ignora qualquer outra tecla diferente do Enter
	            if (input == -1) {
	                throw new IOException("Entrada encerrada inesperadamente");
	            }
	        }
	        
	    } catch (IOException e) {
	        System.err.println("Erro de entrada/saída: " + e.getMessage());
	    } catch (Exception e) {
	        System.err.println("Ocorreu um erro ao processar a entrada: " + e.getMessage());
	    }
	}

}
