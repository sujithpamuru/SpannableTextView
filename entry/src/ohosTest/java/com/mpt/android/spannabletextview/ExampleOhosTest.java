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