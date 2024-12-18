/*
 *  Copyright (c) 2024, WSO2 LLC. (http://www.wso2.com)
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
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

package io.ballerina.triggermodelgenerator.extension;

import org.ballerinalang.annotation.JavaSPIService;
import org.ballerinalang.langserver.commons.registration.BallerinaServerCapabilitySetter;

import java.util.Optional;

/**
 * Represents server capability setter for the trigger model generator service.
 *
 * @since 2.0.0
 */
@JavaSPIService("org.ballerinalang.langserver.commons.registration.BallerinaServerCapabilitySetter")
public class TriggerModelGeneratorServerCapabilitySetter extends
        BallerinaServerCapabilitySetter<TriggerModelGeneratorServerCapabilities> {

    @Override
    public Optional<TriggerModelGeneratorServerCapabilities> build() {
        TriggerModelGeneratorServerCapabilities capabilities = new TriggerModelGeneratorServerCapabilities();
        return Optional.of(capabilities);
    }

    @Override
    public String getCapabilityName() {
        return TriggerModelGeneratorConstants.CAPABILITY_NAME;
    }

    @Override
    public Class<TriggerModelGeneratorServerCapabilities> getCapability() {
        return TriggerModelGeneratorServerCapabilities.class;
    }
}