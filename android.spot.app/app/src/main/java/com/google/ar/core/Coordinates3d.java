package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum Coordinates3d {
    EIS_TEXTURE_NORMALIZED(0),
    EIS_NORMALIZED_DEVICE_COORDINATES(1);

    final int nativeCode;

    Coordinates3d(int i) {
        this.nativeCode = i;
    }

    static Coordinates3d forNumber(int i) {
        for (Coordinates3d coordinates3d : values()) {
            if (coordinates3d.nativeCode == i) {
                return coordinates3d;
            }
        }
        throw new FatalException(a.ae(i, "Unexpected value for native Coordinates3d, value = "));
    }
}
