package cc.ttlabs.dojo.quemmanda;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuemMandaTest {

	Fulano f;
	
	@Before
	public void setUp() throws Exception {
	   f = new Fulano();
	}

	@After
	public void tearDown() throws Exception {
	}

	// Fulano é empregado de uma grande corporação
	// Fulano quando está no [trabalho] não tem autoridade
	// e quem manda por lá é o seu Chefe
	
	@Test
	public void chefeMandaNoTrabalho()
	{
		Trabalho t = new Trabalho(f);
		
		Object o = t.quemManda();
		
		assertTrue(o instanceof Chefe);

	}
	
	// Fulano é lider de uma banda
	// E quando está no [palco] é o dono da situação
	// e junto com seus parceiros de banda fazem 
	// a alegria do público

	//TODO
	
	// Fulano tem uma familia, mulher e dois filhos
	// mas em [casa] ele sempre tem autoridade
	// de dizer a sua mulher quem é que manda: ela. 
	
	@Test
	public void mulherMandaNaFamilia(){
	    
		Familia fam = new Familia(f);
		
		Object o = fam.quemManda();
		
		assertTrue(o instanceof Mulher);
	}
	
	@Test
	public void testaContratoDeAutoridadeComFamilia() {
		assertTrue("Deveria ser uma instancia de ContratoDeAutoridade", new Familia(f) instanceof ContratoDeAutoridade);
	}
	
	
}
