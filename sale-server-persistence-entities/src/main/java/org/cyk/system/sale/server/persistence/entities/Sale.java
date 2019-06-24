package org.cyk.system.sale.server.persistence.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
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
@Table(name=Sale.TABLE)
public class Sale extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@ManyToOne @JoinColumn(name=COLUMN_CHECKOUT_PERIOD) @NotNull private CheckoutPeriod checkoutPeriod;
	@Column(name=COLUMN_DATE) @NotNull private LocalDateTime date;
	@Column(name=COLUMN_COST) @NotNull private BigDecimal cost;
	
	/**/
	
	@Override
	public Sale setIdentifier(String identifier) {
		return (Sale) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_CHECKOUT_PERIOD = "checkoutPeriod";
	public static final String FIELD_DATE = "date";
	public static final String FIELD_COST = "cost";
	
	public static final String COLUMN_CHECKOUT_PERIOD = FIELD_CHECKOUT_PERIOD;
	public static final String COLUMN_DATE = FIELD_DATE;
	public static final String COLUMN_COST = FIELD_COST;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"sale";
	
	/**/

}
