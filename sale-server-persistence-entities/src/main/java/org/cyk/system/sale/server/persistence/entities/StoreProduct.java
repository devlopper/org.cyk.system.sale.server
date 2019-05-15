package org.cyk.system.sale.server.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=StoreProduct.TABLE)
public class StoreProduct extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	@ManyToOne @JoinColumn(name=COLUMN_STORE)
	private Store store;
	
	@NotNull
	@ManyToOne @JoinColumn(name=COLUMN_PRODUCT)
	private Product product;
	
	@Column(name=COLUMN_UNIT_PRICE)
	private BigDecimal unitPrice;
	
	@Column(name=COLUMN_DISCOUNT)
	private BigDecimal discount;
	/**/
	
	@Override
	public StoreProduct setIdentifier(String identifier) {
		return (StoreProduct) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_STORE = "store";
	public static final String FIELD_PRODUCT = "product";
	public static final String FIELD_UNIT_PRICE = "unitPrice";
	public static final String FIELD_DISCOUNT = "discount";
	
	public static final String COLUMN_STORE = FIELD_STORE;
	public static final String COLUMN_PRODUCT = FIELD_PRODUCT;
	public static final String COLUMN_UNIT_PRICE = FIELD_UNIT_PRICE;
	public static final String COLUMN_DISCOUNT = FIELD_DISCOUNT;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"storeproduct";
	
	/**/

}
