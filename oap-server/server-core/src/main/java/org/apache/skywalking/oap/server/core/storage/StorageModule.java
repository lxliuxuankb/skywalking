/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.core.storage;

import org.apache.skywalking.oap.server.core.storage.cache.IEndpointInventoryCacheDAO;
import org.apache.skywalking.oap.server.core.storage.cache.INetworkAddressInventoryCacheDAO;
import org.apache.skywalking.oap.server.core.storage.cache.IServiceInstanceInventoryCacheDAO;
import org.apache.skywalking.oap.server.core.storage.cache.IServiceInventoryCacheDAO;
import org.apache.skywalking.oap.server.core.storage.profile.IProfileTaskLogQueryDAO;
import org.apache.skywalking.oap.server.core.storage.profile.IProfileTaskQueryDAO;
import org.apache.skywalking.oap.server.core.storage.profile.IProfileThreadSnapshotQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.IAggregationQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.IAlarmQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.ILogQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.IMetadataQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.IMetricsQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.ITopNRecordsQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.ITopologyQueryDAO;
import org.apache.skywalking.oap.server.core.storage.query.ITraceQueryDAO;
import org.apache.skywalking.oap.server.library.module.ModuleDefine;

public class StorageModule extends ModuleDefine {

    public static final String NAME = "storage";

    public StorageModule() {
        super(NAME);
    }

    @Override
    public Class[] services() {
        return new Class[] {
            IBatchDAO.class,
            StorageDAO.class,
            IRegisterLockDAO.class,
            IHistoryDeleteDAO.class,
            IServiceInventoryCacheDAO.class,
            IServiceInstanceInventoryCacheDAO.class,
            IEndpointInventoryCacheDAO.class,
            INetworkAddressInventoryCacheDAO.class,
            ITopologyQueryDAO.class,
            IMetricsQueryDAO.class,
            ITraceQueryDAO.class,
            IMetadataQueryDAO.class,
            IAggregationQueryDAO.class,
            IAlarmQueryDAO.class,
            ITopNRecordsQueryDAO.class,
            ILogQueryDAO.class,
            IProfileTaskQueryDAO.class,
            IProfileTaskLogQueryDAO.class,
            IProfileThreadSnapshotQueryDAO.class
        };
    }
}
