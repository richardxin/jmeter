// $Header$
/*
 * Copyright 2001-2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
*/

package org.apache.jmeter.config;

import java.io.Serializable;

import org.apache.jmeter.testelement.AbstractTestElement;
import org.apache.jmeter.testelement.property.StringProperty;

//Mark Walsh, 2002-08-03, add metadata attribute
// add constructor Argument(String name, Object value, Object metadata)
// add MetaData get and set methods

/**
 * Class representing an argument.  Each argument consists of a name/value pair,
 * as well as (optional) metadata.
 * 
 * @author    Michael Stover
 * @author    Mark Walsh
 * @version   $Revision$
 */
public class Argument extends AbstractTestElement implements Serializable
{
    /** Name used to store the argument's name. */
    public static final String NAME = "Argument.name";

    /** Name used to store the argument's value. */
    public static final String VALUE = "Argument.value";

    /** Name used to store the argument's metadata. */
    public static final String METADATA = "Argument.metadata";

    /**
     * Create a new Argument without a name, value, or metadata.
     */
    public Argument()
    {
    }

    /**
     * Create a new Argument with the specified name and value, and no
     * metadata.
     *
     * @param name   the argument name
     * @param value  the argument value
     */
    public Argument(String name, String value)
    {
        setProperty(new StringProperty(NAME, name));
        setProperty(new StringProperty(VALUE, value));
    }

    /**
     * Create a new Argument with the specified name, value, and metadata.
     *
     * @param name     the argument name
     * @param value    the argument value
     * @param metadata the argument metadata
     */
    public Argument(String name, String value, String metadata)
    {
        setProperty(new StringProperty(NAME, name));
        setProperty(new StringProperty(VALUE, value));
        setProperty(new StringProperty(METADATA, metadata));
    }

    /**
     * Set the name of the Argument.
     *
     * @param newName  the new name
     */
    public void setName(String newName)
    {
        setProperty(new StringProperty(NAME, newName));
    }

    /**
     * Get the name of the Argument.
     * 
     * @return the attribute's name
     */
    public String getName()
    {
        return getPropertyAsString(NAME);
    }

    /**
     * Sets the value of the Argument.
     *
     * @param newValue  the new value
     */
    public void setValue(String newValue)
    {
        setProperty(new StringProperty(VALUE, newValue));
    }

    /**
     * Gets the value of the Argument object.
     *
     * @return the attribute's value
     */
    public String getValue()
    {
        return getPropertyAsString(VALUE);
    }

    /**
     * Sets the Meta Data attribute of the Argument.
     *
     * @param newMetaData  the new metadata
     */
    public void setMetaData(String newMetaData)
    {
        setProperty(new StringProperty(METADATA, newMetaData));
    }

    /**
     * Gets the Meta Data attribute of the Argument.
     *
     * @return   the MetaData value
     */
    public String getMetaData()
    {
        return getPropertyAsString(METADATA);
    }
    
    public String toString()
    {
        return getName()+getMetaData()+getValue();
    }
}
