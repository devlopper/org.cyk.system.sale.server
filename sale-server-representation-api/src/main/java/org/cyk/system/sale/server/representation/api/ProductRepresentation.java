package org.cyk.system.sale.server.representation.api;

import javax.ws.rs.Path;

import org.cyk.system.sale.server.persistence.entities.Product;
import org.cyk.system.sale.server.representation.entities.ProductDto;
import org.cyk.system.sale.server.representation.entities.ProductDtoCollection;
import org.cyk.utility.server.representation.RepresentationEntity;

@Path(ProductRepresentation.PATH)
public interface ProductRepresentation extends RepresentationEntity<Product,ProductDto,ProductDtoCollection> {
	
	String PATH = "product";
}
