package cc.ttlabs.dojo.quemmanda;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import cc.ttlabs.dojo.quemmanda.onde.Local;
import cc.ttlabs.dojo.quemmanda.onde.Trabalho;
import cc.ttlabs.dojo.quemmanda.quem.Chefe;
import cc.ttlabs.dojo.quemmanda.quem.Fulano;
import cc.ttlabs.dojo.quemmanda.quem.Pessoa;

public class QuemMandaNoTrabalhoTest {

	private Pessoa fulano;
	private Chefe chefe;
	private Local noTrabalho;

	@Before
	public void setUp() throws Exception {
		fulano = new Fulano();
		chefe = new Chefe();
		noTrabalho = new Local(
				          new Trabalho()
				             .checkin(fulano)
		                	 .setChefe(chefe));
	}

	@After
	public void tearDown() throws Exception {
		fulano = null;
		chefe = null;
	}

	@Test
	public void noTrabalhoQuemMandaEhOChefe() {
		assertSame(chefe, noTrabalho.quemManda());
	}

	@Test
	public void fulanoQuandoEstaNoTrabalhoNaoTemAutoridade() {
		assertFalse(fulano.temAutoridade());
	}
}
