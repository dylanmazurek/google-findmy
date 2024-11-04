package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klp {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kgf d;
    public static final kuv e;
    public static final kuv f;
    private static final knb g;
    private static final knb h;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.EcdsaPrivateKey");
        g = b2;
        knb b3 = kgt.b("type.googleapis.com/google.crypto.tink.EcdsaPublicKey");
        h = b3;
        a = new kgf((Object) kkh.class, kgl.class, (Object) new kgd() { // from class: klo
            @Override // defpackage.kgd
            public final kgo a(kag kagVar) {
                kiv kivVar;
                kiu kiuVar;
                int i;
                kjr kjrVar;
                kkh kkhVar = (kkh) kagVar;
                kgf kgfVar = klp.a;
                ljh k = kji.d.k();
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).a = "type.googleapis.com/google.crypto.tink.EcdsaPrivateKey";
                ljh k2 = kih.c.k();
                ljh k3 = kii.d.k();
                kke kkeVar = kkhVar.c;
                if (kke.a.equals(kkeVar)) {
                    kivVar = kiv.SHA256;
                } else if (kke.b.equals(kkeVar)) {
                    kivVar = kiv.SHA384;
                } else if (kke.c.equals(kkeVar)) {
                    kivVar = kiv.SHA512;
                } else {
                    throw new GeneralSecurityException("Unable to serialize HashType ".concat(kkeVar.d));
                }
                if (!k3.b.y()) {
                    k3.t();
                }
                ((kii) k3.b).a = kivVar.a();
                kkd kkdVar = kkhVar.b;
                if (kkd.a.equals(kkdVar)) {
                    kiuVar = kiu.NIST_P256;
                } else if (kkd.b.equals(kkdVar)) {
                    kiuVar = kiu.NIST_P384;
                } else if (kkd.c.equals(kkdVar)) {
                    kiuVar = kiu.NIST_P521;
                } else {
                    throw new GeneralSecurityException("Unable to serialize CurveType ".concat(kkdVar.d));
                }
                if (!k3.b.y()) {
                    k3.t();
                }
                ((kii) k3.b).b = kiuVar.a();
                kkf kkfVar = kkhVar.a;
                if (kkf.a.equals(kkfVar)) {
                    i = 3;
                } else if (kkf.b.equals(kkfVar)) {
                    i = 4;
                } else {
                    throw new GeneralSecurityException("Unable to serialize SignatureEncoding ".concat(kkfVar.c));
                }
                if (!k3.b.y()) {
                    k3.t();
                }
                ((kii) k3.b).c = a.B(i);
                kii kiiVar = (kii) k3.q();
                if (!k2.b.y()) {
                    k2.t();
                }
                kih kihVar = (kih) k2.b;
                kiiVar.getClass();
                kihVar.b = kiiVar;
                kihVar.a |= 1;
                lim e2 = ((kih) k2.q()).e();
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).b = e2;
                kkg kkgVar = kkhVar.d;
                if (kkg.a.equals(kkgVar)) {
                    kjrVar = kjr.TINK;
                } else if (kkg.b.equals(kkgVar)) {
                    kjrVar = kjr.CRUNCHY;
                } else if (kkg.d.equals(kkgVar)) {
                    kjrVar = kjr.RAW;
                } else if (kkg.c.equals(kkgVar)) {
                    kjrVar = kjr.LEGACY;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(kkgVar.e));
                }
                if (!k.b.y()) {
                    k.t();
                }
                ((kji) k.b).c = kjrVar.a();
                return kgl.a((kji) k.q());
            }
        });
        b = new kgf((Object) b2, kgl.class, (Object) new kby(13));
        e = new kuv(kkj.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b3, kgk.class, (Object) new kbz(13));
        f = new kuv(kki.class, kgk.class, (byte[]) null);
        d = new kgf((Object) b2, kgk.class, (Object) new kbz(14));
    }

    public static kkd a(kiu kiuVar) {
        int ordinal = kiuVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return kkd.c;
                }
                throw new GeneralSecurityException("Unable to parse EllipticCurveType: " + kiuVar.a());
            }
            return kkd.b;
        }
        return kkd.a;
    }

    public static kke b(kiv kivVar) {
        int ordinal = kivVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                if (ordinal == 4) {
                    return kke.c;
                }
                throw new GeneralSecurityException("Unable to parse HashType: " + kivVar.a());
            }
            return kke.a;
        }
        return kke.b;
    }

    public static kkg c(kjr kjrVar) {
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return kkg.b;
                    }
                    throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
                }
                return kkg.d;
            }
            return kkg.c;
        }
        return kkg.a;
    }

    public static kkf d(int i) {
        int i2 = i - 2;
        if (i2 != 1) {
            if (i2 == 2) {
                return kkf.b;
            }
            throw new GeneralSecurityException("Unable to parse EcdsaSignatureEncoding: " + a.B(i));
        }
        return kkf.a;
    }
}
