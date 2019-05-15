package org.cyk.system.sale.server.representation.impl;
import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;

import org.cyk.utility.__kernel__.AbstractApplicationScopeLifeCycleListener;

@ApplicationScoped
public class ApplicationScopeLifeCycleListener extends AbstractApplicationScopeLifeCycleListener implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public void __initialize__(Object object) {
		
	}
	 
	@Override
	public void __destroy__(Object object) {}
	
	/**/
	
	//public static final Integer LEVEL = new Integer(org.cyk.system.file.server.representation.api.ApplicationScopeLifeCycleListener.LEVEL+1);
}