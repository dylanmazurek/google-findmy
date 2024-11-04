package com.google.ar.core;

import defpackage.a;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum ModuleAvailability {
    SUPPORTED_INSTALLED(0),
    SUPPORTED_PENDING_IMMEDIATE_INSTALL(10),
    SUPPORTED_NOT_INSTALLED(11),
    SUPPORTED_PENDING_DEFERRED_INSTALL(20),
    UNKNOWN_ERROR(50);

    final int nativeCode;

    ModuleAvailability(int i) {
        this.nativeCode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ModuleAvailability forNumber(int i) {
        for (ModuleAvailability moduleAvailability : values()) {
            if (moduleAvailability.nativeCode == i) {
                return moduleAvailability;
            }
        }
        throw new IllegalArgumentException(a.ae(i, "Unexpected value for native ModuleAvailability, value="));
    }
}
