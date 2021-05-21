/*
 * Copyright (c) 2002-2021 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.htmlunit.javascript.host.media;

import com.gargoylesoftware.htmlunit.javascript.configuration.JsxClass;
import com.gargoylesoftware.htmlunit.javascript.configuration.JsxConstructor;
import com.gargoylesoftware.htmlunit.javascript.configuration.JsxStaticFunction;
import com.gargoylesoftware.htmlunit.javascript.host.event.EventTarget;

/**
 * A JavaScript object for {@code MediaSource}.
 *
 * @author Ahmed Ashour
 * @author Ronald Brill
 */
@JsxClass
public class MediaSource extends EventTarget {

    /**
     * Creates an instance.
     */
    @JsxConstructor
    public MediaSource() {
    }

    /**
     * @see <a href="https://developer.mozilla.org/en-US/docs/Web/API/MediaSource/isTypeSupported">
     * MDN MediaSource#isTypeSupported </a>
     *
     * @param mimeType the mimeType to check
     * @return indicating if the given MIME type is supported by the
     * current user agent — this is, if it can successfully create SourceBuffer objects for that MIME type
     */
    @JsxStaticFunction
    public static boolean isTypeSupported(final String mimeType) {
        return false;
    }
}
