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

import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * A UDF to convert an ISO8601 date/time string to a UNIX timestamp (seconds since 1970-01-01T00:00:00Z)
 *
 * @author rob@simplymeasured.com
 * @since 6/11/13
 */
@Description(name = "iso8601_to_unix_timestamp",
        value = "_FUNC_(string) - convert an ISO 8601 datetime string to a UNIX timestamp",
        extended = "Example:\n"
                 + "  > SELECT * FROM src WHERE _FUNC_(date_string) > 1370991663;")
public class UDFISO8601ToTimestamp extends UDF {
    public UDFISO8601ToTimestamp() {

    }

    public long evaluate(String iso8601Date) {
        DateTime dateTime = new DateTime(iso8601Date, DateTimeZone.UTC);

        return dateTime.getMillis() / 1000;
    }
}
