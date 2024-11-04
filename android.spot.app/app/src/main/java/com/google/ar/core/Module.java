package com.google.ar.core;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum Module {
    AUGMENTED_FACE_IMPROVED_LIP_EYE(0),
    NORMAL_NET(1),
    DEPTH_NET(2),
    FACE_MESH_ULTRALITE(3),
    DEEP_IO(4);

    final int nativeCode;

    Module(int i) {
        this.nativeCode = i;
    }

    static Module forNumber(int i) {
        for (Module module : values()) {
            if (module.nativeCode == i) {
                return module;
            }
        }
        throw new IllegalArgumentException(a.ae(i, "Unexpected value for native Module, value="));
    }
}
