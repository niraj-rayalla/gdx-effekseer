/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class SpriteColorParameterCore {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SpriteColorParameterCore(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SpriteColorParameterCore obj) {
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
        GDXJNI.delete_SpriteColorParameterCore(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setType(int value) {
    GDXJNI.SpriteColorParameterCore_type_set(swigCPtr, this, value);
  }

  public int getType() {
    return GDXJNI.SpriteColorParameterCore_type_get(swigCPtr, this);
  }

  public Color getFixedLowerLeftColor() {
    return new Color(GDXJNI.SpriteColorParameterCore_getFixedLowerLeftColor(swigCPtr, this), true);
  }

  public void setFixedLowerLeftColor(Color value) {
    GDXJNI.SpriteColorParameterCore_setFixedLowerLeftColor(swigCPtr, this, Color.getCPtr(value), value);
  }

  public Color getFixedLowerRightColor() {
    return new Color(GDXJNI.SpriteColorParameterCore_getFixedLowerRightColor(swigCPtr, this), true);
  }

  public void setFixedLowerRightColor(Color value) {
    GDXJNI.SpriteColorParameterCore_setFixedLowerRightColor(swigCPtr, this, Color.getCPtr(value), value);
  }

  public Color getFixedUpperLeftColor() {
    return new Color(GDXJNI.SpriteColorParameterCore_getFixedUpperLeftColor(swigCPtr, this), true);
  }

  public void setFixedUpperLeftColor(Color value) {
    GDXJNI.SpriteColorParameterCore_setFixedUpperLeftColor(swigCPtr, this, Color.getCPtr(value), value);
  }

  public Color getFixedUpperRightColor() {
    return new Color(GDXJNI.SpriteColorParameterCore_getFixedUpperRightColor(swigCPtr, this), true);
  }

  public void setFixedUpperRightColor(Color value) {
    GDXJNI.SpriteColorParameterCore_setFixedUpperRightColor(swigCPtr, this, Color.getCPtr(value), value);
  }

  public SpriteColorParameterCore() {
    this(GDXJNI.new_SpriteColorParameterCore(), true);
  }

  public final static int Default = GDXJNI.SpriteColorParameterCore_Default_get();
  public final static int Fixed = GDXJNI.SpriteColorParameterCore_Fixed_get();
  public final static int Parameter_DWORD = GDXJNI.SpriteColorParameterCore_Parameter_DWORD_get();

}