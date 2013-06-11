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

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.hadoop.hive.ql.exec.Description;
import org.apache.hadoop.hive.ql.exec.UDF;

/**
 * A simple UDF to SHA1 hash a String
 *
 * @author rob@simplymeasured.com
 * @since 6/11/13
 */
@Description(name = "sha1hash",
        value = "_FUNC_(string) - from the input string, return a SHA1 hash of that string",
        extended = "Example:\n"
                 + "  > SELECT _FUNC_(string) FROM src;")
public class UDFSHA1Hash extends UDF {
    public UDFSHA1Hash() {
    }

    public String evaluate(String valueToHash) {
        return Hex.encodeHexString(DigestUtils.sha(valueToHash));
    }
}
