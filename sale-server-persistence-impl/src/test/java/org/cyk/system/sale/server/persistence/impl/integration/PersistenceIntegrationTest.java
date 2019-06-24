package org.cyk.system.sale.server.persistence.impl.integration;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.cyk.system.sale.server.persistence.entities.Checkout;
import org.cyk.system.sale.server.persistence.entities.CheckoutPeriod;
import org.cyk.system.sale.server.persistence.entities.Sale;
import org.cyk.system.sale.server.persistence.entities.Store;
import org.cyk.utility.server.persistence.test.TestPersistenceCreate;
import org.cyk.utility.server.persistence.test.arquillian.AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment;
import org.junit.Test;

public class PersistenceIntegrationTest extends AbstractPersistenceArquillianIntegrationTestWithDefaultDeployment {
	private static final long serialVersionUID = 1L;
	
	@Test
	public void create_sale() throws Exception{
		Store store = new Store();
		Checkout checkout = new Checkout().setStore(store);
		CheckoutPeriod checkoutPeriod = new CheckoutPeriod().setCheckout(checkout);
		Sale sale = new Sale().setCheckoutPeriod(checkoutPeriod).setDate(LocalDateTime.now()).setCost(new BigDecimal("100"));
		__inject__(TestPersistenceCreate.class).addObjectsToBeCreatedArray(store,checkout,checkoutPeriod).addObjects(sale).execute();
	}
	
}
