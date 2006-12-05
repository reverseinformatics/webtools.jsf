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
package org.eclipse.jst.jsf.context.symbol.internal.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jst.jsf.context.symbol.SymbolPackage;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.*;

import org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanInstanceSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanMethodSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanPropertySymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IComponentSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IDescribedInDetail;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IInstanceSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaTypeDescriptor2;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IMapTypeDescriptor;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IMethodSymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.IPropertySymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.ISymbol;
import org.eclipse.jst.jsf.context.symbol.internal.provisional.ITypeDescriptor;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jst.jsf.context.symbol.SymbolPackage
 * @generated
 */
public class SymbolAdapterFactory extends AdapterFactoryImpl {
    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final String copyright = "Copyright 2006 Oracle";

    /**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static SymbolPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public SymbolAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = SymbolPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * @param object 
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch the delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SymbolSwitch modelSwitch =
        new SymbolSwitch() {
            public Object caseIBeanInstanceSymbol(IBeanInstanceSymbol object) {
                return createIBeanInstanceSymbolAdapter();
            }
            public Object caseIBeanPropertySymbol(IBeanPropertySymbol object) {
                return createIBeanPropertySymbolAdapter();
            }
            public Object caseIInstanceSymbol(IInstanceSymbol object) {
                return createIInstanceSymbolAdapter();
            }
            public Object caseIJavaSymbol(IJavaSymbol object) {
                return createIJavaSymbolAdapter();
            }
            public Object caseISymbol(ISymbol object) {
                return createISymbolAdapter();
            }
            public Object caseITypeDescriptor(ITypeDescriptor object) {
                return createITypeDescriptorAdapter();
            }
            public Object caseIDescribedInDetail(IDescribedInDetail object) {
                return createIDescribedInDetailAdapter();
            }
            public Object caseIJavaTypeDescriptor2(IJavaTypeDescriptor2 object) {
                return createIJavaTypeDescriptor2Adapter();
            }
            public Object caseIBeanMethodSymbol(IBeanMethodSymbol object) {
                return createIBeanMethodSymbolAdapter();
            }
            public Object caseIComponentSymbol(IComponentSymbol object) {
                return createIComponentSymbolAdapter();
            }
            public Object caseIPropertySymbol(IPropertySymbol object) {
                return createIPropertySymbolAdapter();
            }
            public Object caseIMapTypeDescriptor(IMapTypeDescriptor object) {
                return createIMapTypeDescriptorAdapter();
            }
            public Object caseIMethodSymbol(IMethodSymbol object) {
                return createIMethodSymbolAdapter();
            }
            public Object caseIObjectSymbol(IObjectSymbol object) {
                return createIObjectSymbolAdapter();
            }
            public Object caseIBoundedTypeDescriptor(IBoundedTypeDescriptor object) {
                return createIBoundedTypeDescriptorAdapter();
            }
            public Object caseIBoundedMapTypeDescriptor(IBoundedMapTypeDescriptor object) {
                return createIBoundedMapTypeDescriptorAdapter();
            }
            public Object caseIBoundedJavaTypeDescriptor(IBoundedJavaTypeDescriptor object) {
                return createIBoundedJavaTypeDescriptorAdapter();
            }
            public Object caseIListTypeDescriptor(IListTypeDescriptor object) {
                return createIListTypeDescriptorAdapter();
            }
            public Object caseIBoundedListTypeDescriptor(IBoundedListTypeDescriptor object) {
                return createIBoundedListTypeDescriptorAdapter();
            }
            public Object defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	public Adapter createAdapter(Notifier target) {
        return (Adapter)modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanInstanceSymbol <em>IBean Instance Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanInstanceSymbol
     * @generated
     */
	public Adapter createIBeanInstanceSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanPropertySymbol <em>IBean Property Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanPropertySymbol
     * @generated
     */
	public Adapter createIBeanPropertySymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IInstanceSymbol <em>IInstance Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IInstanceSymbol
     * @generated
     */
	public Adapter createIInstanceSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaSymbol <em>IJava Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaSymbol
     * @generated
     */
	public Adapter createIJavaSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.ISymbol <em>ISymbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.ISymbol
     * @generated
     */
	public Adapter createISymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.ITypeDescriptor <em>IType Descriptor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.ITypeDescriptor
     * @generated
     */
	public Adapter createITypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IDescribedInDetail <em>IDescribed In Detail</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IDescribedInDetail
     * @generated
     */
	public Adapter createIDescribedInDetailAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaTypeDescriptor2 <em>IJava Type Descriptor2</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IJavaTypeDescriptor2
     * @generated
     */
	public Adapter createIJavaTypeDescriptor2Adapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanMethodSymbol <em>IBean Method Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBeanMethodSymbol
     * @generated
     */
	public Adapter createIBeanMethodSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IComponentSymbol <em>IComponent Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IComponentSymbol
     * @generated
     */
	public Adapter createIComponentSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IPropertySymbol <em>IProperty Symbol</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IPropertySymbol
     * @generated
     */
	public Adapter createIPropertySymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IMapTypeDescriptor <em>IMap Type Descriptor</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IMapTypeDescriptor
     * @generated
     */
	public Adapter createIMapTypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IMethodSymbol <em>IMethod Symbol</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IMethodSymbol
     * @generated
     */
    public Adapter createIMethodSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IObjectSymbol <em>IObject Symbol</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IObjectSymbol
     * @generated
     */
    public Adapter createIObjectSymbolAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedTypeDescriptor <em>IBounded Type Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedTypeDescriptor
     * @generated
     */
    public Adapter createIBoundedTypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedMapTypeDescriptor <em>IBounded Map Type Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedMapTypeDescriptor
     * @generated
     */
    public Adapter createIBoundedMapTypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedJavaTypeDescriptor <em>IBounded Java Type Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedJavaTypeDescriptor
     * @generated
     */
    public Adapter createIBoundedJavaTypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IListTypeDescriptor <em>IList Type Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IListTypeDescriptor
     * @generated
     */
    public Adapter createIListTypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedListTypeDescriptor <em>IBounded List Type Descriptor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.jst.jsf.context.symbol.internal.provisional.IBoundedListTypeDescriptor
     * @generated
     */
    public Adapter createIBoundedListTypeDescriptorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //SymbolAdapterFactory
