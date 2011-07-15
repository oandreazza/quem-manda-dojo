package cc.ttlabs.dojo.quemmanda.quem;

import java.util.List;

public class Familia {
	
	private Pessoa _marido;
	private Pessoa _mulher;
	private List<Pessoa> _filhos;

	public Familia(Pessoa marido, Mulher mulher, List<Pessoa> filhos) {
		_marido = marido;
		_mulher = mulher;
		_filhos = filhos;
	}
	
	public Pessoa marido()
	{
		return _marido;
	}

	public Pessoa mulher()
	{
		return _mulher;
	}
	
	public List<Pessoa> filhos()
	{
		return _filhos;
	}

}
