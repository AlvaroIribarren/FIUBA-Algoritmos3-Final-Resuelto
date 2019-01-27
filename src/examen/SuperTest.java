package examen;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SuperTest {

	private Goku goku1 = new Goku();
	private Goku goku2 = new Goku();

	private Freezer freezer1 = new Freezer();
	private Freezer freezer2 = new Freezer();

	@Test
	public void test01GokuNoDaniaAliado(){
		goku1.atacar(goku2);
		assertTrue(goku2.tieneEstaVida(100));

	}

	@Test
	public void test02FreezerNoDaniaAliado() {
		freezer1.atacar(freezer2);
		assertTrue(freezer2.tieneEstaVida(100));
	}

	@Test
	public void test03GokuDaniaEnemigo(){
		assertTrue(freezer1.tieneVidaLlena());
		goku1.atacar(freezer1);
		assertFalse(freezer1.tieneVidaLlena());
	}

	@Test
	public void test04FreezerDaniaEnemigo(){
		assertTrue(goku1.tieneVidaLlena());
		freezer1.atacar(goku1);
		assertFalse(goku1.tieneVidaLlena());
	}

	@Test
	public void test05GokuSeConvierteYAtacaMasFuerte(){

		assertTrue(freezer1.tieneVidaLlena());
		goku1.atacar(freezer1);
		assertTrue(freezer1.tieneEstaVida(85));
		goku1.furia();
		goku1.atacar(freezer1);
		assertTrue(freezer1.tieneEstaVida(55));

	}

	@Test
	public void test06FreezerSeConvierteYAtacaMasFuerte(){

		assertTrue(freezer1.tieneVidaLlena());
		goku1.atacar(freezer1);

		assertTrue(freezer1.tieneEstaVida(85));
        goku1.atacar(freezer1);
        assertTrue(freezer1.tieneEstaVida(70));
        goku1.atacar(freezer1);
        assertTrue(freezer1.tieneEstaVida(55));
        goku1.atacar(freezer1);
        assertTrue(freezer1.tieneEstaVida(40));

        freezer1.atacar(goku1);
        goku1.tieneEstaVida(80);


	}
}
