/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class ForceFieldForceParameter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ForceFieldForceParameter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ForceFieldForceParameter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        GDXJNI.delete_ForceFieldForceParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPower(float value) {
    GDXJNI.ForceFieldForceParameter_Power_set(swigCPtr, this, value);
  }

  public float getPower() {
    return GDXJNI.ForceFieldForceParameter_Power_get(swigCPtr, this);
  }

  public void setGravitation(boolean value) {
    GDXJNI.ForceFieldForceParameter_Gravitation_set(swigCPtr, this, value);
  }

  public boolean getGravitation() {
    return GDXJNI.ForceFieldForceParameter_Gravitation_get(swigCPtr, this);
  }

  public ForceFieldForceParameter() {
    this(GDXJNI.new_ForceFieldForceParameter(), true);
  }

}
