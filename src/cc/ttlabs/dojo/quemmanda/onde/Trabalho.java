package cc.ttlabs.dojo.quemmanda.onde;

import cc.ttlabs.dojo.quemmanda.quem.Chefe;
import cc.ttlabs.dojo.quemmanda.quem.Fulano;
import cc.ttlabs.dojo.quemmanda.quem.Pessoa;

public class Trabalho implements ContextoDeAutoridade{

	private Chefe chefe = null;
	
	public Trabalho(Chefe chefe) {
		this.chefe = chefe;
	}

	public Pessoa quemManda() {
		return chefe;
	}

	public Trabalho checkin(Pessoa pessoa) {
		if(pessoa instanceof Fulano)
			pessoa.setTemAutoridade(false);
		return this;
	}
}
