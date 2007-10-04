/******************************************************************************* * Copyright (c) 2004, 2006 Sybase, Inc. and others. * * All rights reserved. This program and the accompanying materials * are made available under the terms of the Eclipse Public License v1.0 * which accompanies this distribution, and is available at * http://www.eclipse.org/legal/epl-v10.html * * Contributors: *     Sybase, Inc. - initial API and implementation *******************************************************************************/package org.eclipse.jst.jsf.facesconfig.ui.preference;import org.eclipse.draw2d.Layer;/** *  * @author bbrodt *  *  *  * This class extends IBaseFigure by including a layer accessor. *  *//*package*/ interface IContainerFigure extends IBaseFigure{	/**	 * @param key	 * @return the layer of key	 */	public Layer getLayer(Object key);}