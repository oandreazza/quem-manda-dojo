package cc.ttlabs.dojo.quemmanda;

public class Trabalho implements ContratoDeAutoridade{

	Chefe c = new Chefe();
	
	public Trabalho(Fulano f) {
		// TODO Auto-generated constructor stub
	}

	public Trabalho() {
		// TODO Auto-generated constructor stub
	}

	public Object quemManda() {
		// TODO Auto-generated method stub
		return c;
	}

	public void checkin(Fulano f) {
		
		f.setTemAutoridade(false);
		// TODO Auto-generated method stub
		
	}

}
