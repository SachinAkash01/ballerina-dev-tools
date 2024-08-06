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

package io.ballerina.flowmodelgenerator.core.model.node;

import io.ballerina.compiler.syntax.tree.SyntaxKind;
import io.ballerina.flowmodelgenerator.core.model.Codedata;
import io.ballerina.flowmodelgenerator.core.model.FlowNode;
import io.ballerina.flowmodelgenerator.core.model.NodeBuilder;
import io.ballerina.flowmodelgenerator.core.model.Property;
import io.ballerina.flowmodelgenerator.core.model.SourceBuilder;

import java.util.Optional;

/**
 * Represents the properties of a fail node.
 *
 * @since 1.4.0
 */
public class Fail extends NodeBuilder {

    public static final String LABEL = "Fail";
    public static final String DESCRIPTION = "Fail the execution";
    public static final String FAIL_EXPRESSION_DOC = "Fail value";

    @Override
    public void setConcreteConstData() {
        metadata().label(LABEL).description(DESCRIPTION);
        codedata().node(FlowNode.Kind.FAIL);
    }

    @Override
    public String toSource(FlowNode flowNode) {
        SourceBuilder sourceBuilder = new SourceBuilder(flowNode);

        sourceBuilder.token().keyword(SyntaxKind.FAIL_KEYWORD);
        Optional<Property> property = flowNode.getProperty(Property.EXPRESSION_KEY);
        property.ifPresent(value -> sourceBuilder.token()
                .whiteSpace()
                .expression(value));
        sourceBuilder.token().endOfStatement();
        return sourceBuilder.build(false);
    }

    @Override
    public void setConcreteTemplateData(Codedata codedata) {
        properties().defaultExpression(FAIL_EXPRESSION_DOC);
    }
}
