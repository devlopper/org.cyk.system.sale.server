package org.cyk.system.sale.server.representation.impl.integration;

import org.cyk.system.sale.server.representation.entities.ProductDto;
import org.cyk.utility.server.representation.AbstractEntityCollection;
import org.cyk.utility.server.representation.test.TestRepresentationCreate;
import org.cyk.utility.server.representation.test.arquillian.AbstractRepresentationArquillianIntegrationTestWithDefaultDeployment;
import org.junit.Test;

public class RepresentationIntegrationTest extends AbstractRepresentationArquillianIntegrationTestWithDefaultDeployment {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void createOneFile() throws Exception{
		String identifier = __getRandomIdentifier__();
		ProductDto product = new ProductDto().setIdentifier(identifier);
		__inject__(TestRepresentationCreate.class).addObjects(product).execute();
	}
	
	@Override
	protected <ENTITY> Class<? extends AbstractEntityCollection<ENTITY>> __getEntityCollectionClass__(Class<ENTITY> aClass) {
		return null;
	}
	

}
