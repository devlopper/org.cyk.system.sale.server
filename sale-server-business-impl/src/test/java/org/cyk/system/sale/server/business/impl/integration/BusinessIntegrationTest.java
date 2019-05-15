package org.cyk.system.sale.server.business.impl.integration;

import org.cyk.system.sale.server.persistence.entities.Product;
import org.cyk.utility.server.business.test.TestBusinessCreate;
import org.cyk.utility.server.business.test.arquillian.AbstractBusinessArquillianIntegrationTestWithDefaultDeployment;
import org.junit.Test;

public class BusinessIntegrationTest extends AbstractBusinessArquillianIntegrationTestWithDefaultDeployment {
	private static final long serialVersionUID = 1L;
	
	/* Create */
	
	@Test
	public void create_product() throws Exception{
		String identifier = __getRandomIdentifier__();
		Product product = new Product().setIdentifier(identifier);
		__inject__(TestBusinessCreate.class).addObjects(product).execute();
				
	}
	
}
