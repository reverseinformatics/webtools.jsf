/***************************************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM Corporation - initial API and implementation
 **************************************************************************************************/
package org.eclipse.jst.jsf.facesconfig.util;

/**
 * Not intended for external use.
 * 
 * @author xnjiang
 *
 */
/*package*/ interface IFacesConfigChangeEvent {

	/**
	 * @return true if a managed bean has changed
	 */
	public boolean isManagedBeanChanged();
	/**
	 * @return true if a navigation rule has changed
	 */
	public boolean isNavigationRuleChanged();
	
}