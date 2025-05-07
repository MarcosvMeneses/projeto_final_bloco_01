package ingressos_online.model;


public class Show extends Evento {

	private String banda;
	
	public Show(int id, String nome, int tipo, float preco, String banda) {
		super(id, nome, tipo, preco);
		this.banda = banda;
		
	}
	
	public String getBanda() {
		return banda;
	}
	
	public void setBanda(String banda) {
		this.banda = banda;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("O nome da Banda é: "+ this.banda);
	}

}
