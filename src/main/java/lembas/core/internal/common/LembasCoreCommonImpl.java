/*******************************************************************************
 * Copyright (C) 2019-2020 Lembas Modding Team
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package lembas.core.internal.common;

import cpw.mods.fml.common.event.*;
import lembas.core.api.common.*;

/*
 * The implementation of the common proxy
 */
public class LembasCoreCommonImpl implements LembasCoreCommon
{

    protected SimpleLogger logger;

    public void onPreInit (FMLPreInitializationEvent event)
    {
        logger = new SimpleLoggerImpl (event.getModLog ());
    }

    public void onInit (FMLInitializationEvent event)
    {

    }

    public void onPostInit (FMLPostInitializationEvent event)
    {

    }

    public void onLoadingComplete (FMLLoadCompleteEvent event)
    {

    }

    @Override
    public SimpleLogger getLogger ()
    {
        return logger;
    }

}
