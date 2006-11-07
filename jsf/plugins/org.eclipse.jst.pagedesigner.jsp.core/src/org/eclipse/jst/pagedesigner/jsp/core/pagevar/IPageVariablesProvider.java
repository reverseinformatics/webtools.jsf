/*******************************************************************************
 * Copyright (c) 2006 Sybase, Inc. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sybase, Inc. - initial API and implementation
 *******************************************************************************/
package org.eclipse.jst.pagedesigner.jsp.core.pagevar;

/**
 * @author mengbo
 * @version 1.5
 */
public interface IPageVariablesProvider {
	public void refresh();

	public IVariableInfo[] getBeanInfos();

	public void addChangeListener(IChangeListener listener);

	public void removeChangeListener(IChangeListener listener);
}