/*
 * Copyright (c) 2002-2021 Gargoyle Software Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.gargoylesoftware.htmlunit;

import static org.junit.Assert.assertTrue;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.junit.Test;

/**
 * Tests for {@link ObjectInstantiationException}.
 *
 * @author Ahmed Ashour
 */
public class ObjectInstantiationExceptionTest {

    /**
     * @throws Exception if an error occurs
     */
    @Test
    public void test() throws Exception {
        final Throwable originalExcpetion = new Exception("original exception");
        final ObjectInstantiationException oie = new ObjectInstantiationException("OIE", originalExcpetion);
        final RuntimeException runtimeException = new RuntimeException("runtime exception", oie);
        final Writer writer = new StringWriter();
        runtimeException.printStackTrace(new PrintWriter(writer));
        assertTrue(writer.toString().contains("original exception"));
    }
}
