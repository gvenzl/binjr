/*
 *    Copyright 2018 Frederic Thevenet
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package eu.fthevenet.binjr.data.adapters;

import eu.fthevenet.binjr.dialogs.DataAdapterDialog;
import javafx.beans.property.BooleanProperty;

/**
 * An immutable representation of a {@link DataAdapter}'s metadata
 *
 * @author Frederic Thevenet
 */
public interface DataAdapterInfo {

    /**
     * Returns the name of the data adapter.
     *
     * @return the name of the data adapter.
     */
    public String getName();

    /**
     * Returns the description associated to the data adapter.
     *
     * @return the description associated to the data adapter.
     */
    public String getDescription();

    /**
     * Returns the class that implements the data adapter.
     *
     * @return the class that implements the data adapter.
     */
    public Class<? extends DataAdapter> getAdapterClass();

    /**
     * Returns a key to uniquely identify the adapter.
     *
     * @return a key to uniquely identify the adapter.
     */
    public String getKey();
    /**
     * Returns the class that implements the dialog box used to gather the adapter's parameters from the end user.
     *
     * @return the class that implements the dialog box used to gather the adapter's parameters from the end user.
     */
    public Class<? extends DataAdapterDialog> getAdapterDialog();

    public BooleanProperty enabledProperty();

    public boolean isEnabled();

    public void setEnabled(boolean enabled);
}
