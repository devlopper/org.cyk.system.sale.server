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
@Table(name=Checkout.TABLE)
public class Checkout extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name=COLUMN_STORE) @NotNull private Store store;
	
	/**/
	
	@Override
	public Checkout setIdentifier(String identifier) {
		return (Checkout) super.setIdentifier(identifier);
	}
	
	/**/
	public static final String FIELD_STORE = "store";
	
	public static final String COLUMN_STORE = FIELD_STORE;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"checkout";
	
	/**/

}
