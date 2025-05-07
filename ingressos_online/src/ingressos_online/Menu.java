package ingressos_online;

import java.io.IOException;
import java.util.Scanner;
import ingressos_online.util.Cores;

public class Menu {

	public static void main(String[] args) {
		
		int opcao;

		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                 INGRESSOS ONLINE                    ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Evento                         ");
			System.out.println("            2 - Listar todos os eventos              ");
			System.out.println("            3 - Buscar evento por ID                 ");
			System.out.println("            4 - Atualizar Dados do Evento            ");
			System.out.println("            5 - Apagar Conta                         ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");
			
			opcao = scanner.nextInt();
			
			if (opcao == 6) {
				System.out.println("\nIngressos online agradece o acesso e otimos shows!!");
				sobre();
                scanner.close();
				System.exit(0);
			}
		

		switch (opcao) {
			case 1:
				System.out.println("Criar Evento\n\n");
				keyPress();
				break;
			case 2:
				System.out.println("Listar todos os eventos \n\n");
				keyPress();
				break;
			case 3:
				System.out.println("Buscar evento por ID\n\n");
				keyPress();
				break;
			case 4:
				System.out.println("Atualizar dados do evento\n\n");
				keyPress();
				break;
			case 5:
				System.out.println("Apagar conta\n\n");
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
