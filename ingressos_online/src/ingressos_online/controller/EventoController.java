package ingressos_online.controller;

import java.util.ArrayList;
import java.util.Optional;

import ingressos_online.model.Evento;
import ingressos_online.repository.EventosRepository;

public class EventoController implements EventosRepository{
	
	private ArrayList<Evento> listaEventos = new ArrayList<Evento>();

	int id = 0;
	
		@Override
	public void procurarPorId(int id) {
			
		Optional<Evento> evento = buscarNaCollection(id);
		if (evento.isPresent())
			evento.get().visualizar();
		else System.out.printf("\nO Evento número %d não foi encontrado", id);
		
	}

	@Override
	public void listarTodas() {
		for (var produto : listaEventos) {
			produto.visualizar();
		}
		
	}

	@Override
	public void cadastrar(Evento evento) {
		listaEventos.add(evento);
		System.out.println("O Evento foi cadastrado com sucesso!");
	}

	@Override
	public void atualizar(Evento evento) {
		Optional<Evento> buscaEvento = buscarNaCollection(evento.getId());

		if (buscaEvento.isPresent()) {
			listaEventos.set(listaEventos.indexOf(buscaEvento.get()), evento);
			System.out.printf("\nO Evento ID %d foi atualizado com sucesso!", evento.getId());
		} else
			System.out.printf("\nO Evento ID %d não foi encontrado", evento.getId());

	}

	@Override
	public void deletar(int id) {
		Optional<Evento> evento = buscarNaCollection(id);

		if (evento.isPresent()) {
			if (listaEventos.remove(evento.get()) == true)
				System.out.printf("\nO Evento ID %d foi excluído com sucesso!", id);
		} else
			System.out.printf("\nO Evento ID %d não foi encontrado", id);

	}
	
	public int gerarId() {
		return ++id;
	}


	
	private Optional<Evento> buscarNaCollection(int id2) {
		for (var evento : listaEventos) {
			if (evento.getId() == id)
				return Optional.of(evento);
		}

		return Optional.empty();
	}
	
}
