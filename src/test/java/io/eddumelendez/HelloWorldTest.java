package io.eddumelendez;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * @author Eddú Meléndez
 */
public class HelloWorldTest {

	@Test
	public void init() {
		HelloWorld world = new HelloWorld();
		world.setMessage("hi");
		Assert.assertThat(world.getMessage(), is("hi"));
	}

}
