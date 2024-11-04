package defpackage;

import com.google.ar.core.ArCoreApk;

/* compiled from: PG */
/* loaded from: classes.dex */
public enum jcb extends ArCoreApk.Availability {
    public jcb() {
        super("UNSUPPORTED_DEVICE_NOT_CAPABLE", 3, 100);
    }

    @Override // com.google.ar.core.ArCoreApk.Availability
    public final boolean isUnsupported() {
        return true;
    }
}
