package defpackage;

import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkd {
    public static final kkd a = new kkd("NIST_P256", kfk.a);
    public static final kkd b = new kkd("NIST_P384", kfk.b);
    public static final kkd c = new kkd("NIST_P521", kfk.c);
    public final String d;
    public final ECParameterSpec e;

    private kkd(String str, ECParameterSpec eCParameterSpec) {
        this.d = str;
        this.e = eCParameterSpec;
    }

    public final String toString() {
        return this.d;
    }
}
