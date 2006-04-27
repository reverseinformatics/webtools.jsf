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
package org.eclipse.jst.jsf.facesconfig.emf.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jst.jsf.facesconfig.emf.*;


/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesConfigPackage
 * @generated
 */
public class FacesConfigAdapterFactory extends AdapterFactoryImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2005, 2006 IBM Corporation and others";

	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FacesConfigPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacesConfigAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FacesConfigPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
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
	protected FacesConfigSwitch modelSwitch =
		new FacesConfigSwitch() {
			public Object caseActionListenerType(ActionListenerType object) {
				return createActionListenerTypeAdapter();
			}
			public Object caseApplicationFactoryType(ApplicationFactoryType object) {
				return createApplicationFactoryTypeAdapter();
			}
			public Object caseApplicationType(ApplicationType object) {
				return createApplicationTypeAdapter();
			}
			public Object caseAttributeClassType(AttributeClassType object) {
				return createAttributeClassTypeAdapter();
			}
			public Object caseAttributeExtensionType(AttributeExtensionType object) {
				return createAttributeExtensionTypeAdapter();
			}
			public Object caseAttributeNameType(AttributeNameType object) {
				return createAttributeNameTypeAdapter();
			}
			public Object caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			public Object caseComponentClassType(ComponentClassType object) {
				return createComponentClassTypeAdapter();
			}
			public Object caseComponentExtensionType(ComponentExtensionType object) {
				return createComponentExtensionTypeAdapter();
			}
			public Object caseComponentFamilyType(ComponentFamilyType object) {
				return createComponentFamilyTypeAdapter();
			}
			public Object caseComponentType(ComponentType object) {
				return createComponentTypeAdapter();
			}
			public Object caseComponentTypeType(ComponentTypeType object) {
				return createComponentTypeTypeAdapter();
			}
			public Object caseConverterClassType(ConverterClassType object) {
				return createConverterClassTypeAdapter();
			}
			public Object caseConverterForClassType(ConverterForClassType object) {
				return createConverterForClassTypeAdapter();
			}
			public Object caseConverterIdType(ConverterIdType object) {
				return createConverterIdTypeAdapter();
			}
			public Object caseConverterType(ConverterType object) {
				return createConverterTypeAdapter();
			}
			public Object caseDefaultLocaleType(DefaultLocaleType object) {
				return createDefaultLocaleTypeAdapter();
			}
			public Object caseDefaultRenderKitIdType(DefaultRenderKitIdType object) {
				return createDefaultRenderKitIdTypeAdapter();
			}
			public Object caseDefaultValueType(DefaultValueType object) {
				return createDefaultValueTypeAdapter();
			}
			public Object caseDescriptionType(DescriptionType object) {
				return createDescriptionTypeAdapter();
			}
			public Object caseDisplayNameType(DisplayNameType object) {
				return createDisplayNameTypeAdapter();
			}
			public Object caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			public Object caseFacesConfigType(FacesConfigType object) {
				return createFacesConfigTypeAdapter();
			}
			public Object caseFacesContextFactoryType(FacesContextFactoryType object) {
				return createFacesContextFactoryTypeAdapter();
			}
			public Object caseFacetExtensionType(FacetExtensionType object) {
				return createFacetExtensionTypeAdapter();
			}
			public Object caseFacetNameType(FacetNameType object) {
				return createFacetNameTypeAdapter();
			}
			public Object caseFacetType(FacetType object) {
				return createFacetTypeAdapter();
			}
			public Object caseFactoryType(FactoryType object) {
				return createFactoryTypeAdapter();
			}
			public Object caseFromActionType(FromActionType object) {
				return createFromActionTypeAdapter();
			}
			public Object caseFromOutcomeType(FromOutcomeType object) {
				return createFromOutcomeTypeAdapter();
			}
			public Object caseFromViewIdType(FromViewIdType object) {
				return createFromViewIdTypeAdapter();
			}
			public Object caseIconType(IconType object) {
				return createIconTypeAdapter();
			}
			public Object caseKeyClassType(KeyClassType object) {
				return createKeyClassTypeAdapter();
			}
			public Object caseKeyType(KeyType object) {
				return createKeyTypeAdapter();
			}
			public Object caseLargeIconType(LargeIconType object) {
				return createLargeIconTypeAdapter();
			}
			public Object caseLifecycleFactoryType(LifecycleFactoryType object) {
				return createLifecycleFactoryTypeAdapter();
			}
			public Object caseLifecycleType(LifecycleType object) {
				return createLifecycleTypeAdapter();
			}
			public Object caseListEntriesType(ListEntriesType object) {
				return createListEntriesTypeAdapter();
			}
			public Object caseLocaleConfigType(LocaleConfigType object) {
				return createLocaleConfigTypeAdapter();
			}
			public Object caseManagedBeanClassType(ManagedBeanClassType object) {
				return createManagedBeanClassTypeAdapter();
			}
			public Object caseManagedBeanNameType(ManagedBeanNameType object) {
				return createManagedBeanNameTypeAdapter();
			}
			public Object caseManagedBeanScopeType(ManagedBeanScopeType object) {
				return createManagedBeanScopeTypeAdapter();
			}
			public Object caseManagedBeanType(ManagedBeanType object) {
				return createManagedBeanTypeAdapter();
			}
			public Object caseManagedPropertyType(ManagedPropertyType object) {
				return createManagedPropertyTypeAdapter();
			}
			public Object caseMapEntriesType(MapEntriesType object) {
				return createMapEntriesTypeAdapter();
			}
			public Object caseMapEntryType(MapEntryType object) {
				return createMapEntryTypeAdapter();
			}
			public Object caseMessageBundleType(MessageBundleType object) {
				return createMessageBundleTypeAdapter();
			}
			public Object caseNavigationCaseType(NavigationCaseType object) {
				return createNavigationCaseTypeAdapter();
			}
			public Object caseNavigationHandlerType(NavigationHandlerType object) {
				return createNavigationHandlerTypeAdapter();
			}
			public Object caseNavigationRuleType(NavigationRuleType object) {
				return createNavigationRuleTypeAdapter();
			}
			public Object caseNullValueType(NullValueType object) {
				return createNullValueTypeAdapter();
			}
			public Object casePhaseListenerType(PhaseListenerType object) {
				return createPhaseListenerTypeAdapter();
			}
			public Object casePropertyClassType(PropertyClassType object) {
				return createPropertyClassTypeAdapter();
			}
			public Object casePropertyExtensionType(PropertyExtensionType object) {
				return createPropertyExtensionTypeAdapter();
			}
			public Object casePropertyNameType(PropertyNameType object) {
				return createPropertyNameTypeAdapter();
			}
			public Object casePropertyResolverType(PropertyResolverType object) {
				return createPropertyResolverTypeAdapter();
			}
			public Object casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			public Object caseRedirectType(RedirectType object) {
				return createRedirectTypeAdapter();
			}
			public Object caseReferencedBeanClassType(ReferencedBeanClassType object) {
				return createReferencedBeanClassTypeAdapter();
			}
			public Object caseReferencedBeanNameType(ReferencedBeanNameType object) {
				return createReferencedBeanNameTypeAdapter();
			}
			public Object caseReferencedBeanType(ReferencedBeanType object) {
				return createReferencedBeanTypeAdapter();
			}
			public Object caseRendererClassType(RendererClassType object) {
				return createRendererClassTypeAdapter();
			}
			public Object caseRendererExtensionType(RendererExtensionType object) {
				return createRendererExtensionTypeAdapter();
			}
			public Object caseRendererType(RendererType object) {
				return createRendererTypeAdapter();
			}
			public Object caseRendererTypeType(RendererTypeType object) {
				return createRendererTypeTypeAdapter();
			}
			public Object caseRenderKitClassType(RenderKitClassType object) {
				return createRenderKitClassTypeAdapter();
			}
			public Object caseRenderKitFactoryType(RenderKitFactoryType object) {
				return createRenderKitFactoryTypeAdapter();
			}
			public Object caseRenderKitIdType(RenderKitIdType object) {
				return createRenderKitIdTypeAdapter();
			}
			public Object caseRenderKitType(RenderKitType object) {
				return createRenderKitTypeAdapter();
			}
			public Object caseSmallIconType(SmallIconType object) {
				return createSmallIconTypeAdapter();
			}
			public Object caseStateManagerType(StateManagerType object) {
				return createStateManagerTypeAdapter();
			}
			public Object caseSuggestedValueType(SuggestedValueType object) {
				return createSuggestedValueTypeAdapter();
			}
			public Object caseSupportedLocaleType(SupportedLocaleType object) {
				return createSupportedLocaleTypeAdapter();
			}
			public Object caseToViewIdType(ToViewIdType object) {
				return createToViewIdTypeAdapter();
			}
			public Object caseValidatorClassType(ValidatorClassType object) {
				return createValidatorClassTypeAdapter();
			}
			public Object caseValidatorIdType(ValidatorIdType object) {
				return createValidatorIdTypeAdapter();
			}
			public Object caseValidatorType(ValidatorType object) {
				return createValidatorTypeAdapter();
			}
			public Object caseValueClassType(ValueClassType object) {
				return createValueClassTypeAdapter();
			}
			public Object caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			public Object caseVariableResolverType(VariableResolverType object) {
				return createVariableResolverTypeAdapter();
			}
			public Object caseViewHandlerType(ViewHandlerType object) {
				return createViewHandlerTypeAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ActionListenerType <em>Action Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ActionListenerType
	 * @generated
	 */
	public Adapter createActionListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ApplicationFactoryType <em>Application Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ApplicationFactoryType
	 * @generated
	 */
	public Adapter createApplicationFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ApplicationType <em>Application Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ApplicationType
	 * @generated
	 */
	public Adapter createApplicationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.AttributeClassType <em>Attribute Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.AttributeClassType
	 * @generated
	 */
	public Adapter createAttributeClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.AttributeExtensionType <em>Attribute Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.AttributeExtensionType
	 * @generated
	 */
	public Adapter createAttributeExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.AttributeNameType <em>Attribute Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.AttributeNameType
	 * @generated
	 */
	public Adapter createAttributeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ComponentClassType <em>Component Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ComponentClassType
	 * @generated
	 */
	public Adapter createComponentClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ComponentExtensionType <em>Component Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ComponentExtensionType
	 * @generated
	 */
	public Adapter createComponentExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ComponentFamilyType <em>Component Family Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ComponentFamilyType
	 * @generated
	 */
	public Adapter createComponentFamilyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ComponentType <em>Component Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ComponentType
	 * @generated
	 */
	public Adapter createComponentTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ComponentTypeType <em>Component Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ComponentTypeType
	 * @generated
	 */
	public Adapter createComponentTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ConverterClassType <em>Converter Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ConverterClassType
	 * @generated
	 */
	public Adapter createConverterClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ConverterForClassType <em>Converter For Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ConverterForClassType
	 * @generated
	 */
	public Adapter createConverterForClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ConverterIdType <em>Converter Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ConverterIdType
	 * @generated
	 */
	public Adapter createConverterIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ConverterType <em>Converter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ConverterType
	 * @generated
	 */
	public Adapter createConverterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.DefaultLocaleType <em>Default Locale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.DefaultLocaleType
	 * @generated
	 */
	public Adapter createDefaultLocaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.DefaultRenderKitIdType <em>Default Render Kit Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.DefaultRenderKitIdType
	 * @generated
	 */
	public Adapter createDefaultRenderKitIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.DefaultValueType <em>Default Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.DefaultValueType
	 * @generated
	 */
	public Adapter createDefaultValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.DescriptionType <em>Description Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.DescriptionType
	 * @generated
	 */
	public Adapter createDescriptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.DisplayNameType <em>Display Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.DisplayNameType
	 * @generated
	 */
	public Adapter createDisplayNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FacesConfigType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesConfigType
	 * @generated
	 */
	public Adapter createFacesConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FacesContextFactoryType <em>Faces Context Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacesContextFactoryType
	 * @generated
	 */
	public Adapter createFacesContextFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FacetExtensionType <em>Facet Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacetExtensionType
	 * @generated
	 */
	public Adapter createFacetExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FacetNameType <em>Facet Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacetNameType
	 * @generated
	 */
	public Adapter createFacetNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FacetType <em>Facet Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FacetType
	 * @generated
	 */
	public Adapter createFacetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FactoryType <em>Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FactoryType
	 * @generated
	 */
	public Adapter createFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FromActionType <em>From Action Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FromActionType
	 * @generated
	 */
	public Adapter createFromActionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FromOutcomeType <em>From Outcome Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FromOutcomeType
	 * @generated
	 */
	public Adapter createFromOutcomeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.FromViewIdType <em>From View Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.FromViewIdType
	 * @generated
	 */
	public Adapter createFromViewIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.IconType <em>Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.IconType
	 * @generated
	 */
	public Adapter createIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.KeyClassType <em>Key Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.KeyClassType
	 * @generated
	 */
	public Adapter createKeyClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.KeyType <em>Key Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.KeyType
	 * @generated
	 */
	public Adapter createKeyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.LargeIconType <em>Large Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.LargeIconType
	 * @generated
	 */
	public Adapter createLargeIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.LifecycleFactoryType <em>Lifecycle Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.LifecycleFactoryType
	 * @generated
	 */
	public Adapter createLifecycleFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.LifecycleType <em>Lifecycle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.LifecycleType
	 * @generated
	 */
	public Adapter createLifecycleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ListEntriesType <em>List Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ListEntriesType
	 * @generated
	 */
	public Adapter createListEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType <em>Locale Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.LocaleConfigType
	 * @generated
	 */
	public Adapter createLocaleConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanClassType <em>Managed Bean Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanClassType
	 * @generated
	 */
	public Adapter createManagedBeanClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanNameType <em>Managed Bean Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanNameType
	 * @generated
	 */
	public Adapter createManagedBeanNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanScopeType <em>Managed Bean Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanScopeType
	 * @generated
	 */
	public Adapter createManagedBeanScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanType <em>Managed Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ManagedBeanType
	 * @generated
	 */
	public Adapter createManagedBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ManagedPropertyType <em>Managed Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ManagedPropertyType
	 * @generated
	 */
	public Adapter createManagedPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.MapEntriesType <em>Map Entries Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.MapEntriesType
	 * @generated
	 */
	public Adapter createMapEntriesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.MapEntryType <em>Map Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.MapEntryType
	 * @generated
	 */
	public Adapter createMapEntryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.MessageBundleType <em>Message Bundle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.MessageBundleType
	 * @generated
	 */
	public Adapter createMessageBundleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.NavigationCaseType <em>Navigation Case Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.NavigationCaseType
	 * @generated
	 */
	public Adapter createNavigationCaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.NavigationHandlerType <em>Navigation Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.NavigationHandlerType
	 * @generated
	 */
	public Adapter createNavigationHandlerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.NavigationRuleType <em>Navigation Rule Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.NavigationRuleType
	 * @generated
	 */
	public Adapter createNavigationRuleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.NullValueType <em>Null Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.NullValueType
	 * @generated
	 */
	public Adapter createNullValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.PhaseListenerType <em>Phase Listener Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.PhaseListenerType
	 * @generated
	 */
	public Adapter createPhaseListenerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.PropertyClassType <em>Property Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.PropertyClassType
	 * @generated
	 */
	public Adapter createPropertyClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.PropertyExtensionType <em>Property Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.PropertyExtensionType
	 * @generated
	 */
	public Adapter createPropertyExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.PropertyNameType <em>Property Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.PropertyNameType
	 * @generated
	 */
	public Adapter createPropertyNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.PropertyResolverType <em>Property Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.PropertyResolverType
	 * @generated
	 */
	public Adapter createPropertyResolverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RedirectType <em>Redirect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RedirectType
	 * @generated
	 */
	public Adapter createRedirectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ReferencedBeanClassType <em>Referenced Bean Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ReferencedBeanClassType
	 * @generated
	 */
	public Adapter createReferencedBeanClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ReferencedBeanNameType <em>Referenced Bean Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ReferencedBeanNameType
	 * @generated
	 */
	public Adapter createReferencedBeanNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ReferencedBeanType <em>Referenced Bean Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ReferencedBeanType
	 * @generated
	 */
	public Adapter createReferencedBeanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RendererClassType <em>Renderer Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RendererClassType
	 * @generated
	 */
	public Adapter createRendererClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RendererExtensionType <em>Renderer Extension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RendererExtensionType
	 * @generated
	 */
	public Adapter createRendererExtensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RendererType <em>Renderer Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RendererType
	 * @generated
	 */
	public Adapter createRendererTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RendererTypeType <em>Renderer Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RendererTypeType
	 * @generated
	 */
	public Adapter createRendererTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RenderKitClassType <em>Render Kit Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RenderKitClassType
	 * @generated
	 */
	public Adapter createRenderKitClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RenderKitFactoryType <em>Render Kit Factory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RenderKitFactoryType
	 * @generated
	 */
	public Adapter createRenderKitFactoryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RenderKitIdType <em>Render Kit Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RenderKitIdType
	 * @generated
	 */
	public Adapter createRenderKitIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.RenderKitType <em>Render Kit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.RenderKitType
	 * @generated
	 */
	public Adapter createRenderKitTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.SmallIconType <em>Small Icon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.SmallIconType
	 * @generated
	 */
	public Adapter createSmallIconTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.StateManagerType <em>State Manager Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.StateManagerType
	 * @generated
	 */
	public Adapter createStateManagerTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.SuggestedValueType <em>Suggested Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.SuggestedValueType
	 * @generated
	 */
	public Adapter createSuggestedValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.SupportedLocaleType <em>Supported Locale Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.SupportedLocaleType
	 * @generated
	 */
	public Adapter createSupportedLocaleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ToViewIdType <em>To View Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ToViewIdType
	 * @generated
	 */
	public Adapter createToViewIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ValidatorClassType <em>Validator Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ValidatorClassType
	 * @generated
	 */
	public Adapter createValidatorClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ValidatorIdType <em>Validator Id Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ValidatorIdType
	 * @generated
	 */
	public Adapter createValidatorIdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ValidatorType <em>Validator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ValidatorType
	 * @generated
	 */
	public Adapter createValidatorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ValueClassType <em>Value Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ValueClassType
	 * @generated
	 */
	public Adapter createValueClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.VariableResolverType <em>Variable Resolver Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.VariableResolverType
	 * @generated
	 */
	public Adapter createVariableResolverTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.jst.jsf.facesconfig.emf.ViewHandlerType <em>View Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.jst.jsf.facesconfig.emf.ViewHandlerType
	 * @generated
	 */
	public Adapter createViewHandlerTypeAdapter() {
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

} //FacesConfigAdapterFactory
