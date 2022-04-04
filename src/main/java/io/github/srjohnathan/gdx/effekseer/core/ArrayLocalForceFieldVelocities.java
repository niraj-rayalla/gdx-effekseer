/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class ArrayLocalForceFieldVelocities {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ArrayLocalForceFieldVelocities(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ArrayLocalForceFieldVelocities obj) {
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
        GDXJNI.delete_ArrayLocalForceFieldVelocities(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ArrayLocalForceFieldVelocities() {
    this(GDXJNI.new_ArrayLocalForceFieldVelocities__SWIG_0(), true);
  }

  public ArrayLocalForceFieldVelocities(ArrayLocalForceFieldVelocities other) {
    this(GDXJNI.new_ArrayLocalForceFieldVelocities__SWIG_1(ArrayLocalForceFieldVelocities.getCPtr(other), other), true);
  }

  public long size() {
    return GDXJNI.ArrayLocalForceFieldVelocities_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return GDXJNI.ArrayLocalForceFieldVelocities_isEmpty(swigCPtr, this);
  }

  public void fill(SIMDVec3f u) {
    GDXJNI.ArrayLocalForceFieldVelocities_fill(swigCPtr, this, SIMDVec3f.getCPtr(u), u);
  }

  public SIMDVec3f get(int i) {
    return new SIMDVec3f(GDXJNI.ArrayLocalForceFieldVelocities_get(swigCPtr, this, i), false);
  }

  public void set(int i, SIMDVec3f val) {
    GDXJNI.ArrayLocalForceFieldVelocities_set(swigCPtr, this, i, SIMDVec3f.getCPtr(val), val);
  }

}