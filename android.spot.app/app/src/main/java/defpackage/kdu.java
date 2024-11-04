package defpackage;

import java.security.spec.ECParameterSpec;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdu extends kek {
    public final ktd a;
    private final kdv b;

    public kdu(kdv kdvVar, ktd ktdVar) {
        this.b = kdvVar;
        this.a = ktdVar;
    }

    public static ECParameterSpec X(kdp kdpVar) {
        if (kdpVar == kdp.a) {
            return kfk.a;
        }
        if (kdpVar == kdp.b) {
            return kfk.b;
        }
        if (kdpVar == kdp.c) {
            return kfk.c;
        }
        throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(kdpVar))));
    }

    public final kdt V() {
        return this.b.a;
    }

    @Override // defpackage.kek
    public final /* synthetic */ kel W() {
        return this.b;
    }
}
