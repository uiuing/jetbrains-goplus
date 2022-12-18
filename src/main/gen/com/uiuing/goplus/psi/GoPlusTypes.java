// This is a generated file. Not intended for manual editing.
package com.uiuing.goplus.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.uiuing.goplus.psi.impl.*;

public interface GoPlusTypes {

  IElementType PROPERTY = new GoPlusElementType("PROPERTY");

  IElementType COMMENT = new GoPlusTokenType("COMMENT");
  IElementType CRLF = new GoPlusTokenType("CRLF");
  IElementType KEY = new GoPlusTokenType("KEY");
  IElementType SEPARATOR = new GoPlusTokenType("SEPARATOR");
  IElementType VALUE = new GoPlusTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new GoPlusPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
