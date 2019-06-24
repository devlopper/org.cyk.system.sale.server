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
@Table(name=CheckoutPeriod.TABLE)
public class CheckoutPeriod extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name=COLUMN_CHECKOUT) @NotNull private Checkout checkout;
	
	/**/
	
	@Override
	public CheckoutPeriod setIdentifier(String identifier) {
		return (CheckoutPeriod) super.setIdentifier(identifier);
	}
	
	/**/
	public static final String FIELD_CHECKOUT = "checkout";
	
	public static final String COLUMN_CHECKOUT = FIELD_CHECKOUT;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"checkoutperiod";
	
	/**/

}
