/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.1
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package io.github.srjohnathan.gdx.effekseer.core;

public class EffekseerEffectCore {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected EffekseerEffectCore(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EffekseerEffectCore obj) {
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
        GDXJNI.delete_EffekseerEffectCore(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EffekseerEffectCore() {
    this(GDXJNI.new_EffekseerEffectCore(), true);
  }

  public String GetName() {
    return GDXJNI.EffekseerEffectCore_GetName(swigCPtr, this);
  }

  public void SetName(String name) {
    GDXJNI.EffekseerEffectCore_SetName(swigCPtr, this, name);
  }

  public int GetVersion() {
    return GDXJNI.EffekseerEffectCore_GetVersion(swigCPtr, this);
  }

  public boolean load(EffekseerManagerCore manager, byte[] data, int len, float magnification) {
    return GDXJNI.EffekseerEffectCore_load(swigCPtr, this, EffekseerManagerCore.getCPtr(manager), manager, data, len, magnification);
  }

  public int GetTextureCount(EffekseerTextureType type) {
    return GDXJNI.EffekseerEffectCore_GetTextureCount(swigCPtr, this, type.swigValue());
  }

  public String GetTexturePath(int index, EffekseerTextureType type) {
    return GDXJNI.EffekseerEffectCore_GetTexturePath(swigCPtr, this, index, type.swigValue());
  }

  public TextureRefWrapper LoadTexture(byte[] data, int len, int index, EffekseerTextureType type) {
    return new TextureRefWrapper(GDXJNI.EffekseerEffectCore_LoadTexture(swigCPtr, this, data, len, index, type.swigValue()), true);
  }

  public void SetTexture(int index, EffekseerTextureType type, TextureRefWrapper texture) {
    GDXJNI.EffekseerEffectCore_SetTexture(swigCPtr, this, index, type.swigValue(), TextureRefWrapper.getCPtr(texture), texture);
  }

  public boolean HasTextureLoaded(int index, EffekseerTextureType type) {
    return GDXJNI.EffekseerEffectCore_HasTextureLoaded(swigCPtr, this, index, type.swigValue());
  }

  public int GetModelCount() {
    return GDXJNI.EffekseerEffectCore_GetModelCount(swigCPtr, this);
  }

  public String GetModelPath(int index) {
    return GDXJNI.EffekseerEffectCore_GetModelPath(swigCPtr, this, index);
  }

  public ModelRefWrapper LoadModel(byte[] data, int len, int index) {
    return new ModelRefWrapper(GDXJNI.EffekseerEffectCore_LoadModel(swigCPtr, this, data, len, index), true);
  }

  public void SetModel(int index, ModelRefWrapper model) {
    GDXJNI.EffekseerEffectCore_SetModel(swigCPtr, this, index, ModelRefWrapper.getCPtr(model), model);
  }

  public boolean HasModelLoaded(int index) {
    return GDXJNI.EffekseerEffectCore_HasModelLoaded(swigCPtr, this, index);
  }

  public int GetMaterialCount() {
    return GDXJNI.EffekseerEffectCore_GetMaterialCount(swigCPtr, this);
  }

  public String GetMaterialPath(int index) {
    return GDXJNI.EffekseerEffectCore_GetMaterialPath(swigCPtr, this, index);
  }

  public MaterialRefWrapper LoadMaterial(byte[] data, int len, int index) {
    return new MaterialRefWrapper(GDXJNI.EffekseerEffectCore_LoadMaterial(swigCPtr, this, data, len, index), true);
  }

  public void SetMaterial(int index, MaterialRefWrapper material) {
    GDXJNI.EffekseerEffectCore_SetMaterial(swigCPtr, this, index, MaterialRefWrapper.getCPtr(material), material);
  }

  public boolean HasMaterialLoaded(int index) {
    return GDXJNI.EffekseerEffectCore_HasMaterialLoaded(swigCPtr, this, index);
  }

  public int NodeCount() {
    return GDXJNI.EffekseerEffectCore_NodeCount(swigCPtr, this);
  }

  public EffectNodeRoot GetRootNode() {
    long cPtr = GDXJNI.EffekseerEffectCore_GetRootNode(swigCPtr, this);
    return (cPtr == 0) ? null : new EffectNodeRoot(cPtr, false);
  }

}
