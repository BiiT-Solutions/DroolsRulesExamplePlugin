package com.biit.drools.plugin;

import org.pf4j.Extension;

import com.biit.plugins.BasePlugin;
import com.biit.plugins.interfaces.IPlugin;

@Extension
public class DroolsTest extends BasePlugin implements IPlugin {
	public static final String NAME = "drools-test";

	@Override
	public String getPluginName() {
		return NAME;
	}

	public Double methodSumParameters(Double parameter1, Double parameter2) {
		return parameter1 + parameter2;
	}

}
