package br.com.brunatotti.projetomaven;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testSoma()
    {
        Calculadora calc = new Calculadora();
		assertTrue(calc.soma() == 2);
    }
}
