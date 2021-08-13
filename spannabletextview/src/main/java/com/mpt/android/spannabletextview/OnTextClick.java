package com.mpt.android.spannabletextview;

import ohos.agp.components.Component;

/**
 * Listener for onClick.
 */

public interface OnTextClick {
    /**
     * To perform onClick action.
     */

    void onTextClick(Component component, SpannableStyles slice);
}