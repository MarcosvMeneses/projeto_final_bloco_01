package ingressos_online.model;

public class Festival extends Evento {
	
	private String atracoes;
	
	public Festival(int id, String nome, int tipo, float preco, String atracoes) {
		super(id, nome, tipo, preco);
		this.atracoes = atracoes;
		// TODO Auto-generated constructor stub
	}

	public String getAtracoes() {
		return atracoes;
	}
	
	public void setAtracoes(String atracao) {
		this.atracoes = atracoes;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Atrações do evento: " + this.atracoes);
	}


}
