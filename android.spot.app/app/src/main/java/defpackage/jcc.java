package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jcc extends ArCoreApk.Availability {
    public jcc() {
        super("SUPPORTED_NOT_INSTALLED", 4, 201);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
