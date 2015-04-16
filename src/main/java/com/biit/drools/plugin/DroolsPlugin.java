package com.biit.drools.plugin;

import net.xeoh.plugins.base.annotations.PluginImplementation;

import com.biit.plugins.BasePlugin;

@PluginImplementation
public class DroolsPlugin extends BasePlugin {

	// Plugin name (must be unique)
	public static String NAME = "DroolsFunctions";

	public String getPluginName() {
		return NAME;
	}

	public Double methodSumParameters(Double parameter1, Double parameter2) {
		return parameter1 + parameter2;
	}

}
