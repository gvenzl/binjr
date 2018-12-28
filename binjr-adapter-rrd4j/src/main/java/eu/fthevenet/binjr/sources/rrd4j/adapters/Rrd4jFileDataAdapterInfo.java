/*
 *    Copyright 2017-2018 Frederic Thevenet
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
 */

package eu.fthevenet.binjr.sources.rrd4j.adapters;

import eu.fthevenet.binjr.data.adapters.BaseDataAdapterInfo;
import eu.fthevenet.binjr.preferences.AppEnvironment;

public class Rrd4jFileDataAdapterInfo extends BaseDataAdapterInfo {

    public Rrd4jFileDataAdapterInfo() {
        super("RRD Files",
                "Round Robin Database Data Adapter",
                AppEnvironment.COPYRIGHT_NOTICE,
                AppEnvironment.LICENSE,
                AppEnvironment.HTTP_WWW_BINJR_EU,
                Rrd4jFileAdapter.class,
                Rrd4jFileAdapterDialog.class);
    }
}
