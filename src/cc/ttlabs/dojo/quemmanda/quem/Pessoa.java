package cc.ttlabs.dojo.quemmanda.quem;

public class Pessoa {

	private boolean _temAutoridade;

	public Pessoa() {
		super();
		setTemAutoridade(false);
	}

	public boolean temAutoridade() {
		return _temAutoridade;
	}

	public void setTemAutoridade(boolean temautoridade) {
		_temAutoridade = temautoridade;
		
	}

}