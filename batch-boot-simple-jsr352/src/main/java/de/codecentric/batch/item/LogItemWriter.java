package de.codecentric.batch.item;

import java.util.List;

import javax.batch.api.chunk.AbstractItemWriter;
import javax.batch.api.chunk.ItemWriter;
import javax.inject.Inject;
import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.util.Assert;


/**
 * Dummy {@link ItemWriter} which only logs data it receives.
 * 
 * It also serves as an example how to inject resources (Spring beans) from the parent context
 * into batch artifacts even if they are referenced by full class name in the batch job xml.
 */
public class LogItemWriter extends AbstractItemWriter {

	private static final Logger log = Logger.getLogger(LogItemWriter.class);
	
	@Inject
	private DataSource dataSource;
	
	@Override
	public void writeItems(List<Object> items) throws Exception {
		Assert.notNull(dataSource);
		log.info("ItemWriter: "+items.toString());
	}
	
}
