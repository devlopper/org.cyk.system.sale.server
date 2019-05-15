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
@Table(name=SaleProduct.TABLE)
public class SaleProduct extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@NotNull
	@ManyToOne @JoinColumn(name=COLUMN_SALE)
	private Sale sale;
	
	@NotNull
	@ManyToOne @JoinColumn(name=COLUMN_PRODUCT)
	private Product product;
	
	@Column(name=COLUMN_UNIT_PRICE)
	private BigDecimal unitPrice;
	
	@NotNull
	@Column(name=COLUMN_QUANTITY)
	private BigDecimal quantity;
	
	@Column(name=COLUMN_DISCOUNT)
	private BigDecimal discount;
	/**/
	
	@Override
	public SaleProduct setIdentifier(String identifier) {
		return (SaleProduct) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_SALE = "sale";
	public static final String FIELD_PRODUCT = "product";
	public static final String FIELD_UNIT_PRICE = "unitPrice";
	public static final String FIELD_QUANTITY = "quantity";
	public static final String FIELD_DISCOUNT = "discount";
	
	public static final String COLUMN_SALE = FIELD_SALE;
	public static final String COLUMN_PRODUCT = FIELD_PRODUCT;
	public static final String COLUMN_UNIT_PRICE = FIELD_UNIT_PRICE;
	public static final String COLUMN_QUANTITY = FIELD_QUANTITY;
	public static final String COLUMN_DISCOUNT = FIELD_DISCOUNT;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"saleproduct";
	
	/**/

}
