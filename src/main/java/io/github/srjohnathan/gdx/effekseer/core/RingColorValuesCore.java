/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class RingColorValuesCore {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected RingColorValuesCore(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RingColorValuesCore obj) {
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
        GDXJNI.delete_RingColorValuesCore(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setCurrent(Color value) {
    GDXJNI.RingColorValuesCore_current_set(swigCPtr, this, Color.getCPtr(value), value);
  }

  public Color getCurrent() {
    long cPtr = GDXJNI.RingColorValuesCore_current_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Color(cPtr, false);
  }

  public void setOriginal(Color value) {
    GDXJNI.RingColorValuesCore_original_set(swigCPtr, this, Color.getCPtr(value), value);
  }

  public Color getOriginal() {
    long cPtr = GDXJNI.RingColorValuesCore_original_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Color(cPtr, false);
  }

  public RingColorValuesCore() {
    this(GDXJNI.new_RingColorValuesCore(), true);
  }

}