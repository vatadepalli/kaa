/*
 * Copyright 2014 CyberVision, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kaaproject.kaa.server.control.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.kaaproject.kaa.server.common.thrift.gen.control.SdkPlatform;
import org.kaaproject.kaa.server.control.service.sdk.SdkGenerator;
import org.kaaproject.kaa.server.control.service.sdk.SdkGeneratorFactory;

/**
 * The Class SdkGeneratorTest.
 */
public class SdkGeneratorTest {

    /**
     * Test create sdk generator.
     *
     * @throws Exception the exception
     */
    @SuppressWarnings("static-access")
    @Test
    public void testCreateSdkGenerator() throws Exception {
        SdkGeneratorFactory factory = new SdkGeneratorFactory();
        SdkGenerator generator = factory.createSdkGenerator(SdkPlatform.JAVA);
        Assert.assertNotNull(generator);
        generator = factory.createSdkGenerator(SdkPlatform.CPP);
        Assert.assertNotNull(generator);
    }
}