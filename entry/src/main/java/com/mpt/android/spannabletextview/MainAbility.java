package com.mpt.android.spannabletextview;

import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import com.mpt.android.spannabletextview.slice.MainAbilitySlice;

/**
 * Default MainAbility class to launch the Application.
 */

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
    }

}
