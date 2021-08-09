package com.mpt.android.spannabletextview.slice;

import com.mpt.android.spannabletextview.OnTextClick;
import com.mpt.android.spannabletextview.ResourceTable;
import com.mpt.android.spannabletextview.SpannableStyles;
import com.mpt.android.spannabletextview.SpannableTextView;

import java.io.IOException;

import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbPalette;
import ohos.agp.components.Component;
import ohos.agp.components.DirectionalLayout;
import ohos.agp.components.Image;
import ohos.agp.components.LayoutScatter;
import ohos.agp.text.Font;
import ohos.agp.utils.Color;
import ohos.agp.window.dialog.ToastDialog;
import ohos.app.Context;
import ohos.global.resource.NotExistException;
import ohos.global.resource.WrongTypeException;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;

/**
 * To display all Spans.
 */

public class MainAbilitySlice extends AbilitySlice implements OnTextClick {
    /**
     * To know whether the URL was clicked or not.
     */

    private boolean isUrlClicked;
    /**
     * To show the Offer Price.
     */

    private SpannableTextView stvOfferReplace;
    /**
     * To show the Offer details.
     */

    private SpannableTextView stvOfferText;
    /**
     * Provides the context of an object.
     */

    private Context mcontext;
    /**
     * To display the logs.
     */

    private static final HiLogLabel LABEL = new HiLogLabel(HiLog.DEBUG, 0x00201, "TSBV");

    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        mcontext = this;
        final SpannableTextView stvAddress = (SpannableTextView) findComponentById(ResourceTable.Id_stvAddress);
        final SpannableTextView stvMarksTop = (SpannableTextView) findComponentById(ResourceTable.Id_stvMarksTop);
        final SpannableTextView stvMarksTopText = (SpannableTextView) findComponentById(ResourceTable.Id_stvMarksTop_1);
        final SpannableTextView stvMarksDown = (SpannableTextView) findComponentById(ResourceTable.Id_stvMarksDown);
        final SpannableTextView stvMarksDownText = (SpannableTextView) findComponentById(ResourceTable.Id_stvMrksDwn_1);
        final SpannableTextView stvFormula = (SpannableTextView) findComponentById(ResourceTable.Id_stvFormula);
        final SpannableTextView stvAddText = (SpannableTextView) findComponentById(ResourceTable.Id_stvAddress_1);
        final SpannableTextView stvAddSuperScript = (SpannableTextView) findComponentById(ResourceTable.Id_stvAdd_2);
        final SpannableTextView stvOffer = (SpannableTextView) findComponentById(ResourceTable.Id_stvOffer);
        final SpannableTextView stvImageSpan = (SpannableTextView) findComponentById(ResourceTable.Id_stvImageSpan);
        final SpannableTextView stvFormText = (SpannableTextView) findComponentById(ResourceTable.Id_stvFormula_1);
        final SpannableTextView stvFormSubScript = (SpannableTextView) findComponentById(ResourceTable.Id_stvFormula_2);
        final SpannableTextView stvFormSprScript = (SpannableTextView) findComponentById(ResourceTable.Id_stvFormula_4);
        final SpannableTextView stvImage = (SpannableTextView) findComponentById(ResourceTable.Id_Image);
        stvOfferText = (SpannableTextView) findComponentById(ResourceTable.Id_stvOffer_1);
        stvOfferReplace = (SpannableTextView) findComponentById(ResourceTable.Id_stvOffer_2);
        try {
            stvAddText.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvAddText).getString()).build());
            stvAddText.display();
            stvAddSuperScript.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stSupSrpt).getString())
                    .superscript().build());
            stvAddSuperScript.display();
            stvMarksTop.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvMarksTop).getString())
                    .backgroundColor(RgbPalette.parse("#073680"))
                    .textColor(Color.WHITE.getValue())
                    .build());
            stvMarksTop.display();
            stvMarksTopText.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvMrksTxt).getString())
                    .backgroundColor(RgbPalette.parse("#DFF1FE"))
                    .textColor(RgbPalette.parse("#073680"))
                    .style(Font.BOLD)
                    .build());
            stvMarksTopText.display();
            stvMarksDown.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvMarksDown).getString())
                    .backgroundColor(RgbPalette.parse("#800736"))
                    .textColor(Color.WHITE.getValue())
                    .setCornerRadius(13)
                    .build());
            stvMarksDown.display();
            stvMarksDownText.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stMrksDTxt).getString())
                    .textColor(RgbPalette.parse("#073680"))
                    .style(Font.BOLD)
                    .build());
            stvMarksDownText.display();
            stvFormula.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvFormula).getString())
                    .underline()
                    .build());
            stvFormula.display();
            stvFormSprScript.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stFSupSrpt).getString())
                    .superscript()
                    .build());
            stvFormSprScript.display();
            stvFormText.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvFormText).getString())
                    .subscript()
                    .build());
            stvFormText.display();
            stvFormSubScript.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stSubSrt).getString())
                    .build());
            stvFormSubScript.display();
            stvAddress.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvAddress)
                    .getString()).style(Font.BOLD).build());
            stvAddress.display();
            stvOffer.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvOffer)
                    .getString()).build());
            stvOffer.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvOfferPrice)
                    .getString()).strike().build());
            stvOffer.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_Offer)
                    .getString()).style(Font.BOLD)
                    .textColor(RgbPalette.parse(this.getResourceManager()
                    .getElement(ResourceTable.Color_customized_blue)
                    .getString()))
                    .build());
            stvOffer.display();
            stvOfferText.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_url_link).getString())
                    .setOnTextClick(this)
                    .underline()
                    .build());
            stvOfferText.setClickedListener(clickedListener);
            stvOfferText.display();
            stvImageSpan.addSlice(new SpannableStyles.Builder(this.getResourceManager()
                    .getElement(ResourceTable.String_stvImageSpan).getString())
                    .textSize(60)
                    .textColor(RgbPalette.parse("#304ffe"))
                    .build());
            stvImageSpan.display();
            stvImage.addSlice(new SpannableStyles.Builder("star")
                    .setImageResource(ResourceTable.Media_ic_star_border).build());
        } catch (IOException | NotExistException | WrongTypeException exception) {
            HiLog.error(LABEL, exception.getMessage());
        }
    }

    /**
     * To perform click action on URL.
     */

    private final Component.ClickedListener clickedListener = (Component component) -> {
        try {
            if (isUrlClicked) {
                isUrlClicked = false;
                stvOfferText.setText(mcontext.getResourceManager().getElement(ResourceTable.String_url_link)
                        .getString());
            } else {
                isUrlClicked = true;
                stvOfferReplace.setText(mcontext.getResourceManager().getElement(ResourceTable.String_url_link)
                        .getString());
                final DirectionalLayout toastLayout = (DirectionalLayout) LayoutScatter.getInstance(getContext())
                        .parse(ResourceTable.Layout_layout_toast, null, false);
                new ToastDialog(getContext()).setContentCustomComponent(toastLayout)
                        .setSize(MATCH_CONTENT, MATCH_CONTENT).show();
            }
        } catch (IOException | NotExistException | WrongTypeException exception) {
            HiLog.error(LABEL, exception.getMessage());
        }
    };

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }

    @Override
    public void onTextClick(Component component, SpannableStyles slice) {
    }
}