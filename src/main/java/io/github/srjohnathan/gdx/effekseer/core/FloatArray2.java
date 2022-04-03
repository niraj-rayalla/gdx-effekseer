/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class FloatArray2 {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FloatArray2(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloatArray2 obj) {
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
        GDXJNI.delete_FloatArray2(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FloatArray2() {
    this(GDXJNI.new_FloatArray2__SWIG_0(), true);
  }

  public FloatArray2(FloatArray2 other) {
    this(GDXJNI.new_FloatArray2__SWIG_1(FloatArray2.getCPtr(other), other), true);
  }

  public long size() {
    return GDXJNI.FloatArray2_size(swigCPtr, this);
  }

  public boolean isEmpty() {
    return GDXJNI.FloatArray2_isEmpty(swigCPtr, this);
  }

  public void fill(float u) {
    GDXJNI.FloatArray2_fill(swigCPtr, this, u);
  }

  public float get(int i) {
    return GDXJNI.FloatArray2_get(swigCPtr, this, i);
  }

  public void set(int i, float val) {
    GDXJNI.FloatArray2_set(swigCPtr, this, i, val);
  }

}
