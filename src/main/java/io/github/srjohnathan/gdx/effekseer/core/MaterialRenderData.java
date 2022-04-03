/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class MaterialRenderData {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MaterialRenderData(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MaterialRenderData obj) {
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
        GDXJNI.delete_MaterialRenderData(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setMaterialIndex(int value) {
    GDXJNI.MaterialRenderData_MaterialIndex_set(swigCPtr, this, value);
  }

  public int getMaterialIndex() {
    return GDXJNI.MaterialRenderData_MaterialIndex_get(swigCPtr, this);
  }

  public void setMaterialTextures(VectorMaterialTextureParameter value) {
    GDXJNI.MaterialRenderData_MaterialTextures_set(swigCPtr, this, VectorMaterialTextureParameter.getCPtr(value), value);
  }

  public VectorMaterialTextureParameter getMaterialTextures() {
    long cPtr = GDXJNI.MaterialRenderData_MaterialTextures_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VectorMaterialTextureParameter(cPtr, false);
  }

  public void setMaterialUniforms(VectorFloatArray4 value) {
    GDXJNI.MaterialRenderData_MaterialUniforms_set(swigCPtr, this, VectorFloatArray4.getCPtr(value), value);
  }

  public VectorFloatArray4 getMaterialUniforms() {
    long cPtr = GDXJNI.MaterialRenderData_MaterialUniforms_get(swigCPtr, this);
    return (cPtr == 0) ? null : new VectorFloatArray4(cPtr, false);
  }

  public MaterialRenderData() {
    this(GDXJNI.new_MaterialRenderData(), true);
  }

}
