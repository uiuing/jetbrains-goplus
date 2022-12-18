package com.uiuing.goplus.psi;

import com.intellij.psi.tree.IElementType;
import com.uiuing.goplus.GoPlusLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GoPlusTokenType extends IElementType {

    public GoPlusTokenType(@NotNull @NonNls String debugName) {
        super(debugName, GoPlusLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "GoPlusTokenType." + super.toString();
    }

}