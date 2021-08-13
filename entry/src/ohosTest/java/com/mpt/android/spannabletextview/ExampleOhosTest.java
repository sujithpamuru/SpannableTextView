/*
 * Copyright(C) 2020-21 Application Library Engineering Group
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,software
 * Distributed under the License is distributed on as "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,either express or impiles.
 * See the License for the specific language governing permissions and
 * Limitations under the License.
 */

package com.mpt.android.spannabletextview;

import ohos.aafwk.ability.delegation.AbilityDelegatorRegistry;
import ohos.agp.utils.Color;
import ohos.app.Context;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To execute the UnitTestcases.
 */

public class ExampleOhosTest {
    /**
     * Context.
     */
    private final transient Context context = AbilityDelegatorRegistry.getAbilityDelegator().getAppContext();
    /**
     * Custom View.
     */
    private final transient SpannableTextView spannableTextView = new SpannableTextView(context);
    /**
     * Test bundle name test case.
     */

    @Test
    public void testBundleName() {
        final String actualBundleName = AbilityDelegatorRegistry.getArguments().getTestBundleName();
        assertEquals("actualBundleName is same", "com.mpt.android.spannabletextview", actualBundleName);
    }
    /**
     * Text color test-case.
     */

    @Test
    public void testTextColor() {
        spannableTextView.changeTextColor(Color.BLACK.getValue());
        assertEquals("testTestColor", Color.BLACK, spannableTextView.getTextColor());
    }
}