/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public final class MaterialFileType {
  public final static MaterialFileType Code = new MaterialFileType("Code");
  public final static MaterialFileType Compiled = new MaterialFileType("Compiled");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static MaterialFileType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + MaterialFileType.class + " with value " + swigValue);
  }

  private MaterialFileType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private MaterialFileType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private MaterialFileType(String swigName, MaterialFileType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static MaterialFileType[] swigValues = { Code, Compiled };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}

