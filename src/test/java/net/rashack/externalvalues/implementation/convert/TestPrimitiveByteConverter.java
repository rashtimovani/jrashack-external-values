package net.rashack.externalvalues.implementation.convert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class TestPrimitiveByteConverter {

	@Test
	public void testEmptyValueConvertsToZero() {
		assertThat(new PrimitiveByteConverter().convert(""), equalTo((byte) 0));
	}
}
