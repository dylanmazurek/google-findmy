package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kca {
    public static final kgf a;
    public static final kgf b;
    public static final kgf c;
    public static final kuv d;
    private static final knb e;

    static {
        knb b2 = kgt.b("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        e = b2;
        a = new kgf((Object) kbw.class, kgl.class, (Object) new kbx(0));
        b = new kgf((Object) b2, kgl.class, (Object) new kby(0));
        d = new kuv(kbt.class, kgk.class, (byte[]) null);
        c = new kgf((Object) b2, kgk.class, (Object) new kbz(0));
    }

    public static kbw a(kjq kjqVar, kjr kjrVar) {
        kbu kbuVar;
        kbv kbvVar;
        ljh k = kji.d.k();
        kji kjiVar = kjqVar.c;
        if (kjiVar == null) {
            kjiVar = kji.d;
        }
        String str = kjiVar.a;
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        str.getClass();
        ((kji) ljnVar).a = str;
        kji kjiVar2 = kjqVar.c;
        if (kjiVar2 == null) {
            kjiVar2 = kji.d;
        }
        lim limVar = kjiVar2.b;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        limVar.getClass();
        ((kji) ljnVar2).b = limVar;
        kjr kjrVar2 = kjr.RAW;
        if (!ljnVar2.y()) {
            k.t();
        }
        ((kji) k.b).c = kjrVar2.a();
        kag v = ivc.v(((kji) k.q()).g());
        if (v instanceof kbd) {
            kbuVar = kbu.a;
        } else if (v instanceof kbl) {
            kbuVar = kbu.c;
        } else if (v instanceof kcg) {
            kbuVar = kbu.b;
        } else if (v instanceof kat) {
            kbuVar = kbu.d;
        } else if (v instanceof kay) {
            kbuVar = kbu.e;
        } else if (v instanceof kbh) {
            kbuVar = kbu.f;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing ".concat(v.toString()));
        }
        int ordinal = kjrVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 3) {
                kbvVar = kbv.b;
            } else {
                throw new GeneralSecurityException(der.g(kjrVar, "Unable to parse OutputPrefixType: "));
            }
        } else {
            kbvVar = kbv.a;
        }
        String str2 = kjqVar.b;
        kll kllVar = (kll) v;
        if (str2 != null) {
            if (!kllVar.a()) {
                if ((kbuVar.equals(kbu.a) && (kllVar instanceof kbd)) || ((kbuVar.equals(kbu.c) && (kllVar instanceof kbl)) || ((kbuVar.equals(kbu.b) && (kllVar instanceof kcg)) || ((kbuVar.equals(kbu.d) && (kllVar instanceof kat)) || ((kbuVar.equals(kbu.e) && (kllVar instanceof kay)) || (kbuVar.equals(kbu.f) && (kllVar instanceof kbh))))))) {
                    return new kbw(kbvVar, str2, kbuVar, kllVar);
                }
                throw new GeneralSecurityException("Cannot use parsing strategy " + kbuVar.g + " when new keys are picked according to " + kllVar.toString() + ".");
            }
            throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
        }
        throw new GeneralSecurityException("kekUri must be set");
    }
}
