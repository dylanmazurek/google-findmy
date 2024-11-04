package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkq extends kln {
    public final kkn a;
    public final knb b;
    public final knb c;

    private kkq(kkn kknVar, knb knbVar, knb knbVar2) {
        this.a = kknVar;
        this.b = knbVar;
        this.c = knbVar2;
    }

    public static kkq W(kkm kkmVar, knb knbVar, Integer num) {
        knb a;
        kkn kknVar = new kkn(kkmVar);
        if (!kkmVar.equals(kkm.d) && num == null) {
            throw new GeneralSecurityException("For given Variant " + kkmVar.e + " the value of idRequirement must be non-null");
        }
        if (kkmVar.equals(kkm.d) && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (knbVar.a() == 32) {
            kkm kkmVar2 = kknVar.a;
            if (kkmVar2 == kkm.d) {
                a = kgb.a;
            } else if (kkmVar2 != kkm.b && kkmVar2 != kkm.c) {
                if (kkmVar2 == kkm.a) {
                    a = kgb.b(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(kkmVar2.e));
                }
            } else {
                a = kgb.a(num.intValue());
            }
            return new kkq(kknVar, knbVar, a);
        }
        throw new GeneralSecurityException("Ed25519 key must be constructed with key of length 32 bytes, not " + knbVar.a());
    }

    @Override // defpackage.kln
    public final knb V() {
        return this.c;
    }
}
