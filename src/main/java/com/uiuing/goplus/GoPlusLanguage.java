package com.uiuing.goplus;

import com.intellij.lang.Language;

public class GoPlusLanguage extends Language{
    public static final GoPlusLanguage INSTANCE = new GoPlusLanguage();

    private GoPlusLanguage() {
        super("Go+");
    }
}
