package net.rashack.externalvalues.implementation.convert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class TestPrimitiveShortConverter {

	@Test
	public void testEmptyValueConvertsToZero() {
		assertThat(new PrimitiveShortConverter().convert(""), equalTo((short) 0));
	}
}
