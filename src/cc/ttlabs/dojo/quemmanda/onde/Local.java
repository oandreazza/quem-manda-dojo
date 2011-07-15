package cc.ttlabs.dojo.quemmanda.onde;

import cc.ttlabs.dojo.quemmanda.quem.Pessoa;

public class Local implements ContextoDeAutoridade{

	public Local(ContextoDeAutoridade contexto){
		this.contexto = contexto;
	}
	
	private ContextoDeAutoridade contexto;

	@Override
	public Pessoa quemManda() {
		return contexto.quemManda();
	}
	
}
