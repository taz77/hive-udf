/*
 * Copyright 2013 Simply Measured, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.simplymeasured.hive;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author rob@simplymeasured.com
 * @since 6/11/13
 */
public class UDFSHA1HashTest {
    @Test
    public void testHash() {
        UDFSHA1Hash function = new UDFSHA1Hash();

        Assert.assertEquals("d82007aa5036bf3a72ddc2ba9e0033a8346c9a06", function.evaluate("testString1"));
    }
}
