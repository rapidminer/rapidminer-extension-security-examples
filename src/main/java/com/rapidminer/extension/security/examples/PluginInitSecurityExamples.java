/**
 * Copyright (C) 2013-2016 RapidMiner GmbH
 */
package com.rapidminer.extension.security.examples;

import com.rapidminer.extension.security.examples.fasterxml.JsonReflection;
import com.rapidminer.gui.MainFrame;


/**
 * This class provides hooks for initialization.
 *
 * @author Marcel Michel
 */
public class PluginInitSecurityExamples {

	static {
		// Example for preventing reflection calls in JSON libraries
		JsonReflection.parseJsonExample();
	}

	/**
	 * This method will be called directly after the extension is initialized. This is the first
	 * hook during start up. No initialization of the operators or renderers has taken place when
	 * this is called.
	 */
	public static void initPlugin() {}

	/**
	 * This method is called during start up as the second hook. It is called before the gui of the
	 * mainframe is created. The Mainframe is given to adapt the gui. The operators and renderers
	 * have been registered in the meanwhile.
	 *
	 * @param mainframe
	 *            the RapidMiner Studio {@link MainFrame}.
	 */
	public static void initGui(MainFrame mainframe) {}

	/**
	 * The last hook before the splash screen is closed. Third in the row.
	 */
	public static void initFinalChecks() {}

	/**
	 * Will be called as fourth method, directly before the UpdateManager is used for checking
	 * updates. Location for exchanging the UpdateManager. The name of this method unfortunately is
	 * a result of a historical typo, so it's a little bit misleading.
	 */
	public static void initPluginManager() {}

}
