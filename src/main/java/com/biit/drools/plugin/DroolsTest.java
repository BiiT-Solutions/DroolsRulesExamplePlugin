package com.biit.drools.plugin;

/*-
 * #%L
 * Drools Rules Plugin
 * %%
 * Copyright (C) 2022 - 2025 BiiT Sourcing Solutions S.L.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */

import com.biit.plugins.BasePlugin;
import com.biit.plugins.interfaces.IPlugin;
import org.pf4j.Extension;

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
