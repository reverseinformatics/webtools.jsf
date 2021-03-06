/*******************************************************************************
 * Copyright (c) 2004, 2006 Sybase, Inc. and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Sybase, Inc. - initial API and implementation
 *******************************************************************************/

package org.eclipse.jst.jsf.facesconfig.ui.preference;

/**
 * @author Bob Brodt
 * 
 * Defines an interface for notifying listeners of page switches on a tabbed
 * window figure.
 */
/*package*/ interface WindowFigureListener {
	/**
	 * @param oldIndex
	 * @param newIndex
	 */
	void tabChanged(int oldIndex, int newIndex);
}
