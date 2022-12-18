// This is a generated file. Not intended for manual editing.
package com.uiuing.goplus.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.uiuing.goplus.psi.GoPlusTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.uiuing.goplus.psi.*;

public class GoPlusPropertyImpl extends ASTWrapperPsiElement implements GoPlusProperty {

  public GoPlusPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull GoPlusVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoPlusVisitor) accept((GoPlusVisitor)visitor);
    else super.accept(visitor);
  }

}
