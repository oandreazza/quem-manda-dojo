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

	// TODO testes devem ser expressivos e não precisar de nenhum comentário
	
	// Fulano é empregado de uma grande corporação
	// Fulano quando está no [trabalho] não tem autoridade
	// e quem manda por lá é o seu Chefe
	
	@Test
	public void chefeMandaNoTrabalho()
	{
		
		ContextoDeAutoridade contexto = new Trabalho(f);
		
		Object pessoa = contexto.quemManda();
		
		assertTrue(pessoa instanceof Chefe);

	}
	
	// Fulano é lider de uma banda
	// E quando está no [palco] é o dono da situação
	// e junto com seus parceiros de banda fazem 
	// a alegria do público

	//TODO implementar contexto do palco
	
	// Fulano tem uma familia, mulher e dois filhos
	// mas em [casa] ele sempre tem autoridade
	// de dizer a sua mulher quem é que manda: ela. 
	
	//TODO contexto do fulano com a familia é a casa, não a familia. 
	
	@Test
	public void mulherMandaEmCasa(){
	    
		ContextoDeAutoridade contexto = new Casa(f);
		
		Object pessoa = contexto.quemManda();
		
		assertTrue(pessoa instanceof Mulher);
	}
	
	// Fulano é empregado de uma grande corporação
	// Fulano quando está no [trabalho] não tem autoridade
	// e quem manda por lá é o seu Chefe

	
	@Test 
	public void fulanoQuandoFazCheckinNoTrabalhoNaoTemAutoridade()
	{
		Trabalho trabalho = new Trabalho();
		trabalho.checkin(f);
		
		assertFalse(f.temAutoridade());
		
	}
	
	
}
