/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public final class ParameterSoundPanType {
  public final static ParameterSoundPanType ParameterSoundPanType_2D = new ParameterSoundPanType("ParameterSoundPanType_2D", GDXJNI.ParameterSoundPanType_2D_get());
  public final static ParameterSoundPanType ParameterSoundPanType_3D = new ParameterSoundPanType("ParameterSoundPanType_3D", GDXJNI.ParameterSoundPanType_3D_get());
  public final static ParameterSoundPanType ParameterSoundPanType_DWORD = new ParameterSoundPanType("ParameterSoundPanType_DWORD", GDXJNI.ParameterSoundPanType_DWORD_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ParameterSoundPanType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ParameterSoundPanType.class + " with value " + swigValue);
  }

  private ParameterSoundPanType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ParameterSoundPanType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ParameterSoundPanType(String swigName, ParameterSoundPanType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ParameterSoundPanType[] swigValues = { ParameterSoundPanType_2D, ParameterSoundPanType_3D, ParameterSoundPanType_DWORD };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

