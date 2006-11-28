/*******************************************************************************
 * Copyright (c) 2006 Oracle Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Gerry Kessler/Oracle - initial API and implementation
 *    
 ********************************************************************************/
package org.eclipse.jst.jsf.taglibprocessing.internal.provisional.attributevalues;

import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IValidValues;

/**
 * Abstract meta-data processing type representing a numeric attribute value runtime type
 * @author Gerry Kessler - Oracle
 */
public abstract class NumberType extends EnumerationType{
	protected boolean maxFound = false;
	protected boolean minFound = false;
	
	protected String EXCEEDS_MAX = Messages.NumberType_max_val;
	protected String LESS_THAN_MIN = Messages.NumberType_min_val;
	
	/**
	 * @return maximum value from property named IValidValues.VALID_VALUES_MAX_PROP_NAME
	 */
	protected String getValidMaximumValue(){
		return getCMAttributePropertyValue(IValidValues.VALID_VALUES_MAX_PROP_NAME);
	}
		
	/**
	 * @return minimum value from property named IValidValues.VALID_VALUES_MIN_PROP_NAME
	 */
	protected String getValidMinimumValue(){
		return getCMAttributePropertyValue(IValidValues.VALID_VALUES_MIN_PROP_NAME);
	}
}
