package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jce extends ArCoreApk.Availability {
    public jce() {
        super("SUPPORTED_INSTALLED", 6, 203);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
