package org.cyk.system.sale.server.persistence.impl;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.system.sale.server.persistence.api.ProductPersistence;
import org.cyk.system.sale.server.persistence.entities.Product;
import org.cyk.utility.server.persistence.AbstractPersistenceEntityImpl;

@Singleton
public class ProductPersistenceImpl extends AbstractPersistenceEntityImpl<Product> implements ProductPersistence,Serializable {
	private static final long serialVersionUID = 1L;

}
