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

package io.ballerina.triggermodelgenerator.extension.model;

import io.ballerina.tools.text.LineRange;

public class Codedata {
    private LineRange lineRange;
    private boolean inListenerInit;
    private boolean isBasePath;
    private boolean inDisplayAnnotation;

    public Codedata(LineRange lineRange) {
        this(lineRange, false, false, false);
    }

    public Codedata(LineRange lineRange, boolean inListenerInit, boolean isBasePath, boolean inDisplayAnnotation) {
        this.lineRange = lineRange;
        this.inListenerInit = inListenerInit;
        this.isBasePath = isBasePath;
        this.inDisplayAnnotation = inDisplayAnnotation;
    }

    public LineRange getLineRange() {
        return lineRange;
    }

    public void setLineRange(LineRange lineRange) {
        this.lineRange = lineRange;
    }

    public boolean isInListenerInit() {
        return inListenerInit;
    }

    public void setInListenerInit(boolean inListenerInit) {
        this.inListenerInit = inListenerInit;
    }

    public boolean isBasePath() {
        return isBasePath;
    }

    public void setBasePath(boolean isBasePath) {
        this.isBasePath = isBasePath;
    }

    public boolean isInDisplayAnnotation() {
        return inDisplayAnnotation;
    }

    public void setInDisplayAnnotation(boolean inDisplayAnnotation) {
        this.inDisplayAnnotation = inDisplayAnnotation;
    }
}
