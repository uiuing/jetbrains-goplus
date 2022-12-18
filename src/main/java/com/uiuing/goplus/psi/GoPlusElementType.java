package com.uiuing.goplus.psi;

import com.intellij.psi.tree.IElementType;
import com.uiuing.goplus.GoPlusLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class GoPlusElementType extends IElementType {

    public GoPlusElementType(@NotNull @NonNls String debugName) {
        super(debugName, GoPlusLanguage.INSTANCE);
    }

}