package de.codecentric.batch.item;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Dummy {@link ItemProcessor} which only logs data it receives.
 */
public class LogItemProcessor implements ItemProcessor<Object,Object> {

	private static final Log log = LogFactory.getLog(LogItemProcessor.class);
	
	ExampleService exampleService;
	
	public Object process(Object item) throws Exception {
		log.info(exampleService.echo("test"));
		return item;
	}

	public void setExampleService(ExampleService exampleService) {
		this.exampleService = exampleService;
	}
}
