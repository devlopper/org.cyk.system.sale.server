package org.cyk.system.sale.server.persistence.impl.integration;

import org.cyk.system.sale.server.persistence.entities.Product;
import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment;
import org.junit.Test;

public class PersistenceIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void create_product() throws Exception{
		String identifier = __getRandomIdentifier__();
		Product product = new Product().setIdentifier(identifier);
		__inject__(TestPersistenceCreate.class).addObjects(product).execute();
	}
	
}
