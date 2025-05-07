package ingressos_online.repository;

import ingressos_online.model.Evento;

public interface EventosRepository {
		
		public void procurarPorId(int id);
		public void listarTodas();
		public void cadastrar(Evento evento);
		public void atualizar(Evento evento);
		public void deletar(int id);
}
