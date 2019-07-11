package com.javier.rodriguez.HamcrestTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.hamcrest.number.IsCloseTo;
import org.junit.Test;

public class HamCrestTest {

	
	@Test
	public void testComparacionDeNumerosDePuntoFlotante() {
		
		//PI ~ 3 +- 0.2
		assertThat(Math.PI, Matchers.closeTo(3, 0.2));
	}
	
	@Test
	public void testComparacionTexto() {
		assertThat ("El Señor de los Anillos",  Matchers.equalToIgnoringCase("el señor de los anillos"));
	}
	
	@Test
	public void testColecciones() {
		List<String> collection= Arrays.asList("ab","cd","ef");
		assertThat(collection,Matchers.hasItem("cd"));
		assertThat(collection, Matchers.not(Matchers.hasItem("zx")));
	}
}
