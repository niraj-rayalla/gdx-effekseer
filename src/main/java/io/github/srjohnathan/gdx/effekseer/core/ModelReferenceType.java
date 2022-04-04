/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public final class ModelReferenceType {
  public final static ModelReferenceType File = new ModelReferenceType("File");
  public final static ModelReferenceType Procedural = new ModelReferenceType("Procedural");

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static ModelReferenceType swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + ModelReferenceType.class + " with value " + swigValue);
  }

  private ModelReferenceType(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private ModelReferenceType(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private ModelReferenceType(String swigName, ModelReferenceType swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static ModelReferenceType[] swigValues = { File, Procedural };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}
