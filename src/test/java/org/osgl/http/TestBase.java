package org.osgl.http;

/*-
 * #%L
 * OSGL HTTP
 * %%
 * Copyright (C) 2017 OSGL (Open Source General Library)
 * %%
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
 * #L%
 */

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.runner.JUnitCore;
import org.osgl.util.S;

import java.util.Arrays;

@Ignore
public class TestBase extends Assert {

    protected void same(Object a, Object b) {
        yes(a == b);
    }

    protected void eq(Object[] a1, Object[] a2) {
        yes(Arrays.equals(a1, a2));
    }

    protected void eq(Object o1, Object o2) {
        assertEquals(o1, o2);
    }

    protected void ceq(Object o1, Object o2) {
        assertEquals(S.string(o1), S.string(o2));
    }

    protected void yes(Boolean expr, String msg, Object... args) {
        assertTrue(S.fmt(msg, args), expr);
    }

    protected void yes(Boolean expr) {
        assertTrue(expr);
    }

    protected void no(Boolean expr, String msg, Object... args) {
        assertFalse(S.fmt(msg, args), expr);
    }

    protected void no(Boolean expr) {
        assertFalse(expr);
    }

    protected void fail(String msg, Object... args) {
        assertFalse(S.fmt(msg, args), true);
    }

    protected static void run(Class<? extends TestBase> cls) {
        new JUnitCore().run(cls);
    }

    protected static void println(String tmpl, Object... args) {
        System.out.println(String.format(tmpl, args));
    }


}
