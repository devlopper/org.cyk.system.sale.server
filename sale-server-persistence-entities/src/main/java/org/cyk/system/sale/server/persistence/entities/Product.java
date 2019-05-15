package org.cyk.system.sale.server.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=Product.TABLE)
public class Product extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name=COLUMN_PRICE)
	private BigDecimal price;
	
	@Column(name=COLUMN_DISCOUNT)
	private BigDecimal discount;
	
	/**/
	
	@Override
	public Product setIdentifier(String identifier) {
		return (Product) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_PRICE = "price";
	public static final String FIELD_DISCOUNT = "discount";
	
	public static final String COLUMN_PRICE = FIELD_PRICE;
	public static final String COLUMN_DISCOUNT = FIELD_DISCOUNT;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"product";
	
	/**/

}
