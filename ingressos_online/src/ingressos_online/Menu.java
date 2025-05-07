package ingressos_online;

import java.io.IOException;
import java.util.Optional;
import java.util.Scanner;
import ingressos_online.util.Cores;

import ingressos_online.model.Evento;
import ingressos_online.model.Festival;
import ingressos_online.model.Show;
import ingressos_online.controller.EventoController;




public class Menu {

	public static void main(String[] args) {
		
		int opcao;

//		
//		Festival f1 = new Festival(1, "I Wanna Be Tour", 2, 700.99f, "Fall Out Boy, NX Zero, Pitty");
//		f1.visualizar();

		Scanner scanner = new Scanner(System.in);
		EventoController evento = new EventoController();
		
		int id, tipo;
		String nome, show, festival;
		float preco;
		
		Show s1 = new Show(evento.gerarId(),  "From Zero World Tour", 1, 1500.99f, "Linkin Park");
		evento.cadastrar(s1);

		Festival f1 = new Festival(evento.gerarId(), "I Wanna Be Tour", 2, 700.99f, "Fall Out Boy, NX Zero, Pitty");
		evento.cadastrar(f1);
		
		
		
		
		
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
