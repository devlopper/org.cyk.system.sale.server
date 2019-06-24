package org.cyk.system.sale.server.persistence.entities;

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.cyk.system.sale.server.Constant;
import org.cyk.utility.server.persistence.jpa.AbstractIdentifiedByString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter @Setter @Accessors(chain=true) @Entity @Access(AccessType.FIELD)
@Table(name=StoreProduct.TABLE)
public class StoreProduct extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name=COLUMN_STORE) @NotNull private Store store;
	@ManyToOne @JoinColumn(name=COLUMN_PRODUCT) @NotNull private Product product;
	
	/**/
	
	@Override
	public StoreProduct setIdentifier(String identifier) {
		return (StoreProduct) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_STORE = "store";
	public static final String FIELD_PRODUCT = "product";
	
	public static final String COLUMN_STORE = FIELD_STORE;
	public static final String COLUMN_PRODUCT = FIELD_PRODUCT;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"storeproduct";
	
	/**/

}
