package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jcd extends ArCoreApk.Availability {
    public jcd() {
        super("SUPPORTED_APK_TOO_OLD", 5, 202);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isSupported() {
        return true;
    }
}
