package cc.ttlabs.dojo.quemmanda;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cc.ttlabs.dojo.quemmanda.onde.Casa;
import cc.ttlabs.dojo.quemmanda.onde.ContextoDeAutoridade;
import cc.ttlabs.dojo.quemmanda.onde.Local;
import cc.ttlabs.dojo.quemmanda.quem.Familia;
import cc.ttlabs.dojo.quemmanda.quem.Fulano;
import cc.ttlabs.dojo.quemmanda.quem.Mulher;
import cc.ttlabs.dojo.quemmanda.quem.Pessoa;

import static org.junit.Assert.*;

public class QuemMandaEmCasaTest {

	private Pessoa fulano;
	private Mulher mulher;
	private Local emCasa;
	private Familia familia;
	private List<Pessoa> filhos;

	@Before
	public void setUp() throws Exception {
		fulano = new Fulano();
		mulher = new Mulher();
		
		filhos = filhosBuilder();
		familia = new Familia(fulano, mulher, filhos);
		
		emCasa = new Local(fulanoEmCasa());
	}

	@After
	public void tearDown() throws Exception {
		fulano = null;
		mulher = null;
	}

	@Test
	public void emCasaFulanoTemAutoridadeMasQuemMandaEhAMulher() {
		assertTrue(fulano.temAutoridade());
		assertSame(mulher, emCasa.quemManda());
	}
	
	@Test
	public void aFamiliaTemUmMaridoMulherEDoisFilhos(){
		assertSame(fulano, familia.marido());
		assertSame(mulher, familia.mulher());
		assertSame(filhos, familia.filhos());
	}
	
	private ContextoDeAutoridade fulanoEmCasa() {
		ContextoDeAutoridade contexto = new Casa(familia);
		return contexto;
	}

	private List<Pessoa> filhosBuilder() {
		Pessoa filho1 = new Pessoa();
		Pessoa filho2 = new Pessoa();
		List<Pessoa> filhos = new ArrayList<Pessoa>();
		filhos.add(filho1);
		filhos.add(filho2);
		return filhos;
	}

}
