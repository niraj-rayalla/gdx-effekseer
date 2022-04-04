/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public final class TextureFilterType {
  public final static TextureFilterType Nearest = new TextureFilterType("Nearest", GDXJNI.TextureFilterType_Nearest_get());
  public final static TextureFilterType Linear = new TextureFilterType("Linear", GDXJNI.TextureFilterType_Linear_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static TextureFilterType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + TextureFilterType.class + " with value " + swigValue);
  }

  private TextureFilterType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private TextureFilterType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private TextureFilterType(String swigName, TextureFilterType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static TextureFilterType[] swigValues = { Nearest, Linear };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

