package com.biit.drools.plugin;

import com.biit.plugins.BasePlugin;
import com.biit.plugins.interfaces.IPlugin;
import org.pf4j.Extension;

@Extension
public class DroolsTestPlugin extends BasePlugin implements IPlugin {
	private static final String NAME = "drools-test-plugin";

	@Override
	public String getPluginName() {
		return NAME;
	}
}
