package defpackage;

import android.os.ext.SdkExtensions;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsr {
    public static final bsr a = new bsr();

    private bsr() {
    }

    public final int a(int i) {
        int extensionVersion;
        extensionVersion = SdkExtensions.getExtensionVersion(i);
        return extensionVersion;
    }
}
