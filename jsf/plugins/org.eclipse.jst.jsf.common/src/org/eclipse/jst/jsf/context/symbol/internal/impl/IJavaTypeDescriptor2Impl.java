/*******************************************************************************
 * Copyright (c) 2006 Oracle Corporation.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Cameron Bateman/Oracle - initial API and implementation
 *    
 ********************************************************************************/
package org.eclipse.jst.jsf.context.symbol.internal.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeHierarchy;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jst.jsf.common.JSFCommonPlugin;
import org.eclipse.jst.jsf.common.internal.provisional.util.JDTBeanIntrospector;
import org.eclipse.jst.jsf.common.internal.provisional.util.JDTBeanProperty;
import org.eclipse.jst.jsf.common.internal.provisional.util.TypeUtil;
import org.eclipse.jst.jsf.context.symbol.SymbolFactory;
import org.eclipse.jst.jsf.context.symbol.SymbolPackage;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanMethodSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanPropertySymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaTypeDescriptor2;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IJava Type Descriptor2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.jst.jsf.context.symbol.internal.impl.IJavaTypeDescriptor2Impl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.jst.jsf.context.symbol.internal.impl.IJavaTypeDescriptor2Impl#getBeanProperties <em>Bean Properties</em>}</li>
 *   <li>{@link org.eclipse.jst.jsf.context.symbol.internal.impl.IJavaTypeDescriptor2Impl#getBeanMethods <em>Bean Methods</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IJavaTypeDescriptor2Impl extends ITypeDescriptorImpl implements IJavaTypeDescriptor2 {

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final String copyright = "Copyright 2006 Oracle";

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IType TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IType type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IJavaTypeDescriptor2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * @return the static class 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SymbolPackage.Literals.IJAVA_TYPE_DESCRIPTOR2;
	}

	/**
	 * <!-- begin-user-doc -->
     * @return the JDT type descriptor 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
     * @param newType 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IType newType) {
		IType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__TYPE, oldType, type));
	}

	public EList getInterfaceTypeSignatures() 
    {
        EList  interfaces = new BasicEList();
        
        IType type_ = getType();
        
        if (type_ != null)
        {
            // TODO: type hierarchy is potentially expensive, should
            // cache once and listen for changes
            try {
                final ITypeHierarchy  hierarchy = 
                    type_.newSupertypeHierarchy(new NullProgressMonitor());
                final IType[] interfaceTypes = hierarchy.getAllInterfaces();
                copySignatures(interfaces, interfaceTypes);
            } catch (JavaModelException e) {
                JSFCommonPlugin.log(e);
            }

        }
        
        return interfaces;
    }

    public EList getSuperTypeSignatures() 
    {
        EList  interfaces = new BasicEList();
        
        IType type_ = getType();
        
        if (type_ != null)
        {
            // TODO: type hierarchy is potentially expensive, should
            // cache once and listen for changes
            try {
                final ITypeHierarchy  hierarchy = 
                    type_.newSupertypeHierarchy(new NullProgressMonitor());
                final IType[] interfaceTypes = hierarchy.getAllSuperclasses(type_);
                copySignatures(interfaces, interfaceTypes);
            } catch (JavaModelException e) {
                JSFCommonPlugin.log(e);
            }
        }
        
        return interfaces;
    }
    
    
    private void copySignatures(List  list, IType[]  types)
    {
        for (int i = 0; i < types.length; i++)
        {
            final IType type_ = types[i];
            final String signature = TypeUtil.getSignature(type_);
            
            if (signature != null)
            {
                list.add(signature);
            }
        }
    }

    public EList getProperties() 
    {
        return getBeanProperties();
    }

    
    public EList getMethods() 
    {
        return getBeanMethods();
    }

    /**
	 * <!-- begin-user-doc -->
     * @return the bean props for this java type 
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getBeanProperties() {
		BasicEList list = new BasicEList();
		list.addAll(getPropertiesInternal());
		return list;
	}

	/**
	 * <!-- begin-user-doc -->
     * @return the bean methods for this type  
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getBeanMethods() {
		BasicEList list = new BasicEList();
		list.addAll(getMethodsInternal());
		return list;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.jst.jsf.context.symbol.internal.impl.ITypeDescriptorImpl#getTypeSignature()
     * @generated NOT
	 */
	public String getTypeSignature() 
    {
        if (getType() == null)
        {
            if (eIsSet(SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__TYPE_SIGNATURE_DELEGATE))
            {
                return getTypeSignatureDelegate();
            }

            return null;
        }
       
        return TypeUtil.getSignature(getType());
    }

    private Collection getPropertiesInternal()
	{
        final JDTBeanIntrospector  introspector = 
            new JDTBeanIntrospector(getType());
        
		final Map properties = introspector.getProperties();
		final Collection calculatedProps = new ArrayList(properties.size());
        
		for (final Iterator it = properties.keySet().iterator(); it.hasNext();)
		{
		    final String propertyName = (String) it.next();
            final JDTBeanProperty property = 
                (JDTBeanProperty) properties.get(propertyName);
			
			final IBeanPropertySymbol workingCopy =
			    SymbolFactory.eINSTANCE.createIBeanPropertySymbol();
			workingCopy.setName(propertyName);
			workingCopy.setOwner(this);
                        
            final IJavaTypeDescriptor2 workingCopyDesc = 
                SymbolFactory.eINSTANCE.createIJavaTypeDescriptor2();
            workingCopy.setTypeDescriptor(workingCopyDesc);
			workingCopy.setReadable(property.isReadable());
            workingCopy.setWritable(property.isWritable());
                            
            final String signature = property.getTypeSignature();
            final IType newType = property.getType();
            
            if (newType != null)
            {
                workingCopyDesc.setType(newType);
            }
            else
            {
                workingCopyDesc.setTypeSignatureDelegate(signature);
            }
            
            calculatedProps.add(workingCopy);
		}

		return calculatedProps;
	}

    private Collection getMethodsInternal()
	{
        JDTBeanIntrospector introspector =
            new JDTBeanIntrospector(getType());
        
		IMethod[] methods = introspector.getAllMethods();

        List methodSymbols = new ArrayList();

		for (int i = 0; i < methods.length; i++)
		{
			IMethod method = methods[i];
			
			try
			{
				// to be a bean method, it must not a constructor, must be public
				// and must not be static
				if (!method.isConstructor()
						&& (method.getFlags() & Flags.AccPublic) != 0
						&& (method.getFlags() & Flags.AccStatic) == 0)
				{
					String methodName = method.getElementName();
					IBeanMethodSymbol workingCopy = SymbolFactory.eINSTANCE.createIBeanMethodSymbol();
					workingCopy.setName(methodName);
					workingCopy.setOwner(this);
                    workingCopy.setSignature(TypeUtil.
                                                resolveMethodSignature
                                                    (getType(), 
                                                     method.getSignature()));
					methodSymbols.add(workingCopy);
				}
			}
			catch (JavaModelException jme)
			{
				// error reading meta-data.  Skip to next one
                JSFCommonPlugin.log(jme);
			}
		}
		
		return methodSymbols;
	}

	/**
	 * <!-- begin-user-doc -->
     * @param featureID 
     * @param resolve 
     * @param coreType 
     * @return the value of featureID 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__TYPE:
				return getType();
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_PROPERTIES:
				return getBeanProperties();
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_METHODS:
				return getBeanMethods();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
     * @param featureID 
     * @param newValue 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__TYPE:
				setType((IType)newValue);
				return;
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_PROPERTIES:
				getBeanProperties().clear();
				getBeanProperties().addAll((Collection)newValue);
				return;
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_METHODS:
				getBeanMethods().clear();
				getBeanMethods().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
     * @param featureID 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_PROPERTIES:
				getBeanProperties().clear();
				return;
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_METHODS:
				getBeanMethods().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
     * @param featureID 
     * @return true if the feature is set 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_PROPERTIES:
				return !getBeanProperties().isEmpty();
			case SymbolPackage.IJAVA_TYPE_DESCRIPTOR2__BEAN_METHODS:
				return !getBeanMethods().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
     * @return the default string rep 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //IJavaTypeDescriptor2Impl
