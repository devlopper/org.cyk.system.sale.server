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
@Table(name=ValueAddedTax.TABLE)
public class ValueAddedTax extends AbstractIdentifiedByString implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name=COLUMN_VALUE)
	private BigDecimal value;
	
	/**/
	
	@Override
	public ValueAddedTax setIdentifier(String identifier) {
		return (ValueAddedTax) super.setIdentifier(identifier);
	}
	
	/**/
	
	public static final String FIELD_VALUE = "value";
	
	public static final String COLUMN_VALUE = FIELD_VALUE;
	
	public static final String TABLE = Constant.TABLE_NAME_PREFIX+"valueaddedtax";
	
	/**/

}
