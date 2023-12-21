/*
 *  Copyright (c) 2023, WSO2 LLC. (http://www.wso2.com) All Rights Reserved.
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

package io.ballerina.workermodelgenerator.core.model;

import java.util.List;

/**
 * Represents a flow of workers.
 *
 * @param id               id of the flow
 * @param name             name of the flow
 * @param fileName         name of the file containing the flow
 * @param bodyCodeLocation code location of the body of the flow
 * @param endpoints        endpoints defined for the flows
 * @param nodes            nodes in the flow
 * @since 2201.9.0
 */
public record Flow(String id, String name, String fileName, CodeLocation bodyCodeLocation, List<Endpoint> endpoints,
                   List<WorkerNode> nodes) {

}
