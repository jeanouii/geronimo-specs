/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with this
 * work for additional information regarding copyright ownership. The ASF
 * licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package javax.validation.spi;

import javax.validation.ClockProvider;
import javax.validation.ConstraintValidatorFactory;
import javax.validation.MessageInterpolator;
import javax.validation.ParameterNameProvider;
import javax.validation.TraversableResolver;
import javax.validation.valueextraction.ValueExtractor;

import java.io.InputStream;
import java.util.Map;
import java.util.Set;

/**
 * @version $Rev$ $Date$
 */
public interface ConfigurationState {

    boolean isIgnoreXmlConfiguration();

    MessageInterpolator getMessageInterpolator();

    Set<InputStream> getMappingStreams();

    ConstraintValidatorFactory getConstraintValidatorFactory();

    TraversableResolver getTraversableResolver();

    Map<String, String> getProperties();

    /** @since 1.1 */
    ParameterNameProvider getParameterNameProvider();

    /** @since 2.0 */
    Set<ValueExtractor<?>> getValueExtractors();

    /** @since 2.0 */
    ClockProvider getClockProvider();
}
