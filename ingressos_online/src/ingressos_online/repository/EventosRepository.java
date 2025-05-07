package ingressos_online.repository;

import ingressos_online.model.Evento;

public interface EventosRepository {
		
		public void procurarPorId(int id);
		public void listarTodas();
		public void cadastrar(Evento produto);
		public void atualizar(Evento produto);
		public void deletar(int id);
}
