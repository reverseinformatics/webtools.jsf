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
package org.eclipse.jst.pagedesigner.parts;

import org.w3c.dom.Node;

/**
 * @author mengbo
 * @version 1.5
 */
public abstract class SubNodeEditPart extends NodeEditPart {
	/**
	 * 
	 * @return could be null
	 */
	public abstract Node getNodeForFigure();
}
