package de.codecentric.batch.item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ExampleService {
	
	@Autowired
	@Qualifier("subExampleService")
	SubExampleService subExampleService;
	
	public String echo(String echo){
		return subExampleService.echo(echo);
	}

}
