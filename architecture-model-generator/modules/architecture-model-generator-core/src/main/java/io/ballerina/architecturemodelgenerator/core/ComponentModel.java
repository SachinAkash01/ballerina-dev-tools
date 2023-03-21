/*
 *  Copyright (c) 2022, WSO2 LLC. (http://www.wso2.com) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */

package io.ballerina.architecturemodelgenerator.core;

import io.ballerina.architecturemodelgenerator.core.model.entity.Entity;
import io.ballerina.architecturemodelgenerator.core.model.service.Service;
import io.ballerina.projects.Package;

import java.util.Map;

/**
 * Represents intermediate model to represent multi-service projects.
 *
 * @since 2201.2.2
 */
public class ComponentModel {

    private final String version;
    private final PackageId packageId;
    private final boolean hasCompilationErrors;
    private final List<ComponentModelingDiagnostics> diagnostics;
    private final Map<String, Service> services;
    private final Map<String, Entity> entities;
    private final EntryPoint entryPoint;

    public ComponentModel(String version, PackageId packageId, List<ComponentModelingDiagnostics> diagnostics,
                          Map<String, Service> services, Map<String, Entity> entities, EntryPoint entryPoint,
                          boolean hasCompilationErrors) {
        this.version = version;
        this.packageId = packageId;
        this.diagnostics = diagnostics;
        this.services = services;
        this.entities = entities;
        this.entryPoint = entryPoint;
        this.hasCompilationErrors = hasCompilationErrors;
    }

    public String getVersion() {
        return version;
    }

    public PackageId getPackageId() {
        return packageId;
    }

    public List<ComponentModelingDiagnostics> getDiagnostics() {
        return diagnostics;
    }

    public Map<String, Service> getServices() {
        return services;
    }

    public Map<String, Entity> getEntities() {
        return entities;
    }

    public EntryPoint getEntryPoint() {
        return entryPoint;
    }

    public boolean hasCompilationErrors() {
        return hasCompilationErrors;
    }

    /**
     * Represent current package information.
     */
    public static class PackageId {

        private final String name;
        private final String org;
        private final String version;

        public PackageId(Package currentPackage) {
            this.name = currentPackage.packageName().value();
            this.org = currentPackage.packageOrg().value();
            this.version = currentPackage.packageVersion().value().toString();
        }

        public String getName() {
            return name;
        }

        public String getOrg() {
            return org;
        }

        public String getVersion() {
            return version;
        }
    }
}
