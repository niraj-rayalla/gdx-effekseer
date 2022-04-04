/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class LocalForceFieldElementParameter {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected LocalForceFieldElementParameter(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LocalForceFieldElementParameter obj) {
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
        GDXJNI.delete_LocalForceFieldElementParameter(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setPosition(Vector3D value) {
    GDXJNI.LocalForceFieldElementParameter_Position_set(swigCPtr, this, Vector3D.getCPtr(value), value);
  }

  public Vector3D getPosition() {
    long cPtr = GDXJNI.LocalForceFieldElementParameter_Position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Vector3D(cPtr, false);
  }

  public void setRotation(SIMDMat44f value) {
    GDXJNI.LocalForceFieldElementParameter_Rotation_set(swigCPtr, this, SIMDMat44f.getCPtr(value), value);
  }

  public SIMDMat44f getRotation() {
    long cPtr = GDXJNI.LocalForceFieldElementParameter_Rotation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SIMDMat44f(cPtr, false);
  }

  public void setInvRotation(SIMDMat44f value) {
    GDXJNI.LocalForceFieldElementParameter_InvRotation_set(swigCPtr, this, SIMDMat44f.getCPtr(value), value);
  }

  public SIMDMat44f getInvRotation() {
    long cPtr = GDXJNI.LocalForceFieldElementParameter_InvRotation_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SIMDMat44f(cPtr, false);
  }

  public void setIsRotated(boolean value) {
    GDXJNI.LocalForceFieldElementParameter_IsRotated_set(swigCPtr, this, value);
  }

  public boolean getIsRotated() {
    return GDXJNI.LocalForceFieldElementParameter_IsRotated_get(swigCPtr, this);
  }

  public void setIsGlobal(boolean value) {
    GDXJNI.LocalForceFieldElementParameter_IsGlobal_set(swigCPtr, this, value);
  }

  public boolean getIsGlobal() {
    return GDXJNI.LocalForceFieldElementParameter_IsGlobal_get(swigCPtr, this);
  }

  public void setHasValue(boolean value) {
    GDXJNI.LocalForceFieldElementParameter_HasValue_set(swigCPtr, this, value);
  }

  public boolean getHasValue() {
    return GDXJNI.LocalForceFieldElementParameter_HasValue_get(swigCPtr, this);
  }

  public LocalForceFieldElementParameter() {
    this(GDXJNI.new_LocalForceFieldElementParameter(), true);
  }

}
