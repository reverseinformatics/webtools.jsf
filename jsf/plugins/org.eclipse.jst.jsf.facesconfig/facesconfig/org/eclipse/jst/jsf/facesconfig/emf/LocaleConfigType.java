/***************************************************************************************************
 * Copyright (c) 2005, 2006 IBM Corporation and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors: 
 *   IBM Corporation - initial API and implementation
 *   Oracle Corporation - revision
 **************************************************************************************************/
package org.eclipse.jst.jsf.facesconfig.emf;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Locale Config Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType#getDefaultLocale <em>Default Locale</em>}</li>
 *   <li>{@link org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType#getSupportedLocale <em>Supported Locale</em>}</li>
 *   <li>{@link org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesConfigPackage#getLocaleConfigType()
 * @model extendedMetaData="name='locale-config_._type' kind='elementOnly'"
 * @generated
 */
public interface LocaleConfigType extends EObject {
    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright (c) 2005, 2006 IBM Corporation and others"; //$NON-NLS-1$

    /**
	 * Returns the value of the '<em><b>Default Locale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Locale</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Locale</em>' containment reference.
	 * @see #setDefaultLocale(DefaultLocaleType)
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesConfigPackage#getLocaleConfigType_DefaultLocale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='default-locale' namespace='##targetNamespace'"
	 * @generated
	 */
	DefaultLocaleType getDefaultLocale();

    /**
	 * Sets the value of the '{@link org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType#getDefaultLocale <em>Default Locale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Locale</em>' containment reference.
	 * @see #getDefaultLocale()
	 * @generated
	 */
	void setDefaultLocale(DefaultLocaleType value);

    /**
	 * Returns the value of the '<em><b>Supported Locale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.jst.jsf.facesconfig.emf.SupportedLocaleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supported Locale</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Locale</em>' containment reference list.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesConfigPackage#getLocaleConfigType_SupportedLocale()
	 * @model type="org.eclipse.jst.jsf.facesconfig.emf.SupportedLocaleType" containment="true"
	 *        extendedMetaData="kind='element' name='supported-locale' namespace='##targetNamespace'"
	 * @generated
	 */
	EList getSupportedLocale();

    /**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesConfigPackage#getLocaleConfigType_Id()
	 * @model unique="false" id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

    /**
	 * Sets the value of the '{@link org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // LocaleConfigType
