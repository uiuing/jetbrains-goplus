package com.uiuing.goplus;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class GoPlusFileType extends LanguageFileType {

    public static final GoPlusFileType INSTANCE = new GoPlusFileType();

    private GoPlusFileType() {
        super(GoPlusLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Go+ File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Go+ language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "gop";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return GoPlusIcons.FILE;
    }

}