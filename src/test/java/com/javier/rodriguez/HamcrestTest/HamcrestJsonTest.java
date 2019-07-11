package com.javier.rodriguez.HamcrestTest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import static com.jayway.jsonpath.matchers.JsonPathMatchers.*;

public class HamcrestJsonTest {

	@Test
	public void  testVerificarJSON() {
		String json = "{ message: 'Hi there', quantity: 5, price: 34.56, store: { book: [ {author: 'Evelyn Waugh'}] }}";
		
		assertThat(json, hasJsonPath("$.message", equalTo("Hi there")));
		assertThat(json, hasJsonPath("$.store.book[*].author", hasItem("Evelyn Waugh")));
		
	}
}
