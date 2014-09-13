package de.codecentric.batch;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations={"classpath:META-INF/spring/infrastructure-context.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
