/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package javax.xml.ws.soap;

import javax.xml.ws.WebServiceFeature;

public final class AddressingFeature extends WebServiceFeature {
    /**
     * @since 2.2
     */
    public enum Responses {ANONYMOUS, NON_ANONYMOUS, ALL};


    public static final String ID = "http://www.w3.org/2005/08/addressing/module";

    protected boolean required;
    private Responses responses = Responses.ALL;

    public AddressingFeature() {
        this(true, false);
    }

    public AddressingFeature(boolean enabled) {
        this(enabled, false);
    }

    public AddressingFeature(boolean enabled, boolean required) {
        this.enabled  = enabled;
        this.required = required;
    }

    /**
     * @since 2.2
     */
    public AddressingFeature(boolean enabled, boolean required, Responses responses) {
        this.enabled  = enabled;
        this.required = required;
        this.responses = responses;
    }

    public boolean isRequired() {
        return required;
    }

    @Override
    public String getID() {
        return ID;
    }

    /**
     * @since 2.2
     */
    public Responses getResponses() {
        return responses;
    }
}
