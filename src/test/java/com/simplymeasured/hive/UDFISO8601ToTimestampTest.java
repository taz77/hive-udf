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
public class UDFISO8601ToTimestampTest {
    @Test
    public void testISO8601Parser() {
        UDFISO8601ToTimestamp udf = new UDFISO8601ToTimestamp();

        Assert.assertEquals(1370892660, udf.evaluate("2013-06-10T12:31:00-0700"));
        Assert.assertEquals(1296563964, udf.evaluate("2011-02-01T11:39:24-0100"));
    }
}
