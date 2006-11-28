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

import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jst.jsf.common.internal.types.CompositeType;
import org.eclipse.jst.jsf.common.internal.types.IAssignable;
import org.eclipse.jst.jsf.contentmodel.annotation.internal.provisional.CMAnnotationHelper;
import org.eclipse.jst.jsf.context.resolver.structureddocument.internal.provisional.IStructuredDocumentContextResolverFactory;
import org.eclipse.jst.jsf.context.resolver.structureddocument.internal.provisional.IWorkspaceContextResolver;
import org.eclipse.jst.jsf.core.internal.provisional.jsfappconfig.JSFAppConfigManager;
import org.eclipse.jst.jsf.facesconfig.edit.provider.FacesConfigEditPlugin;
import org.eclipse.jst.jsf.facesconfig.emf.DescriptionType;
import org.eclipse.jst.jsf.facesconfig.emf.DisplayNameType;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.AbstractMetaDataEnabledFeature;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.ELIsNotValidException;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IPossibleValues;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IValidELValues;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IValidValues;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IValidationMessage;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.PossibleValue;
import org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.ValidationMessage;
import org.osgi.framework.Bundle;

/**
 * Abstract meta-data processing feature representing a faces-config type
 * @author Gerry Kessler - Oracle
 */
public abstract class FacesConfigIdentifierFeatures extends AbstractMetaDataEnabledFeature  
		implements IPossibleValues, IValidValues, IValidELValues{
	
	/**
	 * Meta-data property name to use for identifying the faces-config type
	 * @see jsf_core.xml converterID and validatorID attributes
	 */
	public static final String ID_TYPE_PROP_NAME = "config-type"; //$NON-NLS-1$

	/**
	 *  Missing image descriptor
	 */
	protected static final ImageDescriptor MISSING_IMAGE = ImageDescriptor.getMissingImageDescriptor();
	
	/**
	 * Name of image file to use with content assist proposals
	 */
	protected String imageName;
	private ImageDescriptor imageDescriptor;
	/**
	 * Validation messages to return
	 */
	protected List validationMessages;
	
	/* (non-Javadoc)
	 * @see org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IPossibleValues#getPossibleValues()
	 */
	public List getPossibleValues() {
		List ret = new ArrayList();
		List idTypes = getConfigTypes();
		
		if (idTypes != null){
			for (int i=0;i<idTypes.size();i++){
				//verify this feature can deal with this type
				if (getReturnType().equals(idTypes.get(i))){
					ret.addAll(createPossibleValues());
				}
			}
		}
		
		return ret;
	}
		
	/* (non-Javadoc)
	 * @see org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IValidValues#isValidValue(java.lang.String)
	 */
	public boolean isValidValue(String value) {	
		List idTypes = getConfigTypes();
		if (idTypes != null){
			for (int i=0;i<idTypes.size();i++){
				if (getReturnType().equals(idTypes.get(i))){
					if (hasValue(getElementIDs(getJSFAppConfigMgr()), value)){
						getValidationMessages().clear();					
						return true;
					}
                    getValidationMessages().add(getValidationMessage(value));
				}
			}
		}
		return false;
	}
	
	private boolean hasValue(List elements, String value) {
		for (Iterator it=elements.iterator();it.hasNext();){
			if (value.equals(it.next()))
				return true;
		}
		return false;
	}

	/**
	 * @param attribute value
	 * @return the validation message String
	 */
	protected abstract String getMyValidationMessage(String value);
	
	/**
	 * Creates an IValidationMessage
	 * @param value
	 * @return IValidationMessage
	 */
	protected IValidationMessage getValidationMessage(String value) {
		String msg;
		msg = getCMValidationMessage();
		if (msg == null){
				msg = getMyValidationMessage(value);
		}		
		String code = getCMValidationCode();
		int severity = getCMValidationSeverity();
		
		IValidationMessage valMsg = new ValidationMessage(msg, code, severity);
		return valMsg;
	}

	/**
	 * 
	 * @param value
	 * @return single-quoted value
	 */
	protected String singleQuote(String value){
		return "'" + value+"'"; //$NON-NLS-1$ //$NON-NLS-2$
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jst.jsf.metadataprocessors.internal.provisional.features.IValidValues#getValidationMessages()
	 */
	public List getValidationMessages(){
		if (validationMessages == null){
			validationMessages = new ArrayList();
		}
		return validationMessages;
	}
	
	/**
	 * @param JSFAppConfigManager
	 * @return list of faces-config element for the specified config-type
	 */
	protected abstract List getElements(JSFAppConfigManager mgr);
	/**
	 * @param elements
	 * @return list of IPossibleValue objects for the specified list of config elements
	 */
	protected abstract List getPossibleValueProposals(List elements);
	/**
	 * @return image name relative to the FacesConfigEditPlugin where the images are stored
	 */
	protected abstract String getImageName();
	
	private List createPossibleValues() {		
		return getPossibleValueProposals(getElements(getJSFAppConfigMgr()));
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jst.jsf.metadataprocessors.internal.provisional.AbstractMetaDataEnabledFeature#getImage()
	 */
	protected ImageDescriptor getImage() {
		ImageDescriptor ret = super.getImage();
		if (ret != null && ret != MISSING_IMAGE)
			return ret;

		if (imageDescriptor == null){				
			imageDescriptor = getImageDesc(getImageName());
		}
		return imageDescriptor;

	}
	
	//return FacesConfigEditPlugin relative image descriptor
	private ImageDescriptor getImageDesc(String img) {
		Bundle bundle = FacesConfigEditPlugin.getPlugin().getBundle();
		URL url = FileLocator.find(bundle, new Path(img), null);
		ImageDescriptor desc = ImageDescriptor.createFromURL(url);
		if (desc == MISSING_IMAGE){
			return null;
		}
		return desc;
	}

	/**
	 * @param value
	 * @param displayName
	 * @param description
	 * @return PossibleValue object
	 */
	protected PossibleValue createProposal(String value, EList displayName, EList description) {
		String display = value;
		if (displayName.size() > 0) {
			DisplayNameType displayNameType= (DisplayNameType) displayName.get(0);
			display = displayNameType.getTextContent();
		}
		String desc = null;
		if (description.size() > 0) {
			DescriptionType descType= (DescriptionType) description.get(0);
			desc = descType.getTextContent();
		}		
		PossibleValue pv = new PossibleValue(value, display);
		if (desc != null)
			pv.setAdditionalInformation(desc);
		
		return pv;
		
	}

	private List getConfigTypes() {
		return CMAnnotationHelper.getCMAttributePropertyValues(getCMAnnotationContext().getBundleId(), 
				getCMAnnotationContext().getUri(), getCMAnnotationContext().getElementName(),
				getCMAnnotationContext().getAttributeName(), ID_TYPE_PROP_NAME);
	}

	private JSFAppConfigManager getJSFAppConfigMgr(){
		return JSFAppConfigManager.getInstance(getProject());
	}

	private IProject getProject() {
		IWorkspaceContextResolver resolver = IStructuredDocumentContextResolverFactory.INSTANCE.getWorkspaceContextResolver(getStructuredDocumentContext());
		if (resolver != null)
			return resolver.getProject();
		
		return null;
	}

	/**
	 * @param JSFAppConfigManager
	 * @return list of identifier Strings for config-type
	 */
	protected abstract List getElementIDs(JSFAppConfigManager mgr);

	/**
	 * @return the config-type
	 */
	protected abstract String getReturnType();
	protected int getAssignmentType(){
		//TODO: fix me to get from meta-data(?)
		return IAssignable.ASSIGNMENT_TYPE_RHS & IAssignable.ASSIGNMENT_TYPE_LHS;
	}
	public CompositeType getExpectedRuntimeType() throws ELIsNotValidException {
		String type = Signature.createTypeSignature(getReturnType(), true);
		return new CompositeType(type, getAssignmentType());
	}
	
	//Standard Validation stuff - should be moved somewhere else
	protected String getCMValidationMessage() {
		return getCMAttributePropertyValue(IValidValues.VALID_VALUES_MESSAGE_PROP_NAME);			
	}

	protected int getCMValidationSeverity() {
		String val = getCMAttributePropertyValue(IValidValues.VALID_VALUES_SEVERITY_PROP_NAME);		
		if (val == null)
			return IStatus.WARNING;
		
		int severity = Integer.valueOf(val).intValue();
		return severity;
	}

	protected String getCMValidationCode() {
		return getCMAttributePropertyValue(IValidValues.VALID_VALUES_CODE_PROP_NAME);		
	}
	
}


