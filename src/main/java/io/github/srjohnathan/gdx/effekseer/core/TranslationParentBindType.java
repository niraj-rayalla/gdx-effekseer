/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public final class TranslationParentBindType {
  public final static TranslationParentBindType NotBind = new TranslationParentBindType("NotBind", GDXJNI.TranslationParentBindType_NotBind_get());
  public final static TranslationParentBindType NotBind_Root = new TranslationParentBindType("NotBind_Root", GDXJNI.TranslationParentBindType_NotBind_Root_get());
  public final static TranslationParentBindType WhenCreating = new TranslationParentBindType("WhenCreating", GDXJNI.TranslationParentBindType_WhenCreating_get());
  public final static TranslationParentBindType Always = new TranslationParentBindType("Always", GDXJNI.TranslationParentBindType_Always_get());
  public final static TranslationParentBindType NotBind_FollowParent = new TranslationParentBindType("NotBind_FollowParent", GDXJNI.TranslationParentBindType_NotBind_FollowParent_get());
  public final static TranslationParentBindType WhenCreating_FollowParent = new TranslationParentBindType("WhenCreating_FollowParent", GDXJNI.TranslationParentBindType_WhenCreating_FollowParent_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TranslationParentBindType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TranslationParentBindType.class + " with value " + swigValue);
  }

  private TranslationParentBindType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TranslationParentBindType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TranslationParentBindType(String swigName, TranslationParentBindType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TranslationParentBindType[] swigValues = { NotBind, NotBind_Root, WhenCreating, Always, NotBind_FollowParent, WhenCreating_FollowParent };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
