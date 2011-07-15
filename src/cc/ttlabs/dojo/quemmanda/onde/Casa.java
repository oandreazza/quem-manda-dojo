package cc.ttlabs.dojo.quemmanda.onde;

import cc.ttlabs.dojo.quemmanda.quem.Familia;
import cc.ttlabs.dojo.quemmanda.quem.Pessoa;

public class Casa implements ContextoDeAutoridade {
	
	private Familia familia;

	public Casa(Familia familia) {
		this.familia = familia;
		this.familia.marido().setTemAutoridade(true);
		this.familia.mulher().setTemAutoridade(true);
	}

	public Pessoa quemManda() {
		return familia.mulher();
	}
  
}
