/**
 * Copyright © Microsoft Open Technologies, Inc.
 *
 * All Rights Reserved
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * THIS CODE IS PROVIDED *AS IS* BASIS, WITHOUT WARRANTIES OR CONDITIONS
 * OF ANY KIND, EITHER EXPRESS OR IMPLIED, INCLUDING WITHOUT LIMITATION
 * ANY IMPLIED WARRANTIES OR CONDITIONS OF TITLE, FITNESS FOR A
 * PARTICULAR PURPOSE, MERCHANTABILITY OR NON-INFRINGEMENT.
 *
 * See the Apache License, Version 2.0 for the specific language
 * governing permissions and limitations under the License.
 */
package com.msopentech.odatajclient.engine.communication.header;

/**
 * Constant header values class.
 */
public class ODataHeaderValues {

    /**
     * <code>Prefer</code> header, return content.
     *
     * @see ODataHeaders.HeaderName#prefer
     */
    public static final String preferReturnContent = "return-content";

    /**
     * <code>Prefer</code> header, return no content.
     *
     * @see ODataHeaders.HeaderName#prefer
     */
    public static final String preferReturnNoContent = "return-no-content";

    /**
     * @see ODataHeaders.HeaderName#dataServiceUrlConventions
     */
    public static final String keyAsSegment = "KeyAsSegment";

}
