package org.cyk.system.sale.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.cyk.system.sale.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=Product.TABLE)
public class Product extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	/**/
	
	@Override
	public Product setIdentifier(String identifier) {
		return (Product) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"product";
	
	/**/

}
