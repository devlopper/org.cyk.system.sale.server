package org.cyk.system.sale.server.business.impl;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.system.sale.server.business.api.ProductBusiness;
import org.cyk.system.sale.server.persistence.api.ProductPersistence;
import org.cyk.system.sale.server.persistence.entities.Product;
import org.cyk.utility.server.business.AbstractBusinessEntityImpl;

@Singleton
public class ProductBusinessImpl extends AbstractBusinessEntityImpl<Product, ProductPersistence> implements ProductBusiness,Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	protected Class<Product> __getPersistenceEntityClass__() {
		return Product.class;
	}
	
}
