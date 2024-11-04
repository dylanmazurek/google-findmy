package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kef extends kel {
    public final keb a;
    public final knb b;
    public final knb c;

    private kef(keb kebVar, knb knbVar, knb knbVar2) {
        this.a = kebVar;
        this.b = knbVar;
        this.c = knbVar2;
    }

    public static kef V(keb kebVar, knb knbVar, Integer num) {
        EllipticCurve curve;
        knb b;
        kea keaVar = kebVar.d;
        if (!keaVar.equals(kea.c) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + keaVar.d + " variant.");
        }
        if (keaVar.equals(kea.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
        kdz kdzVar = kebVar.a;
        int a = knbVar.a();
        String str = "Encoded public key byte length for " + kdzVar.toString() + " must be %d, not " + a;
        kdz kdzVar2 = kdz.a;
        if (kdzVar == kdzVar2) {
            if (a != 65) {
                throw new GeneralSecurityException(String.format(str, 65));
            }
        } else if (kdzVar == kdz.b) {
            if (a != 97) {
                throw new GeneralSecurityException(String.format(str, 97));
            }
        } else if (kdzVar == kdz.c) {
            if (a != 133) {
                throw new GeneralSecurityException(String.format(str, 133));
            }
        } else if (kdzVar == kdz.f) {
            if (a != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            throw new GeneralSecurityException("Unable to validate public key length for ".concat(kdzVar.toString()));
        }
        if (kdzVar == kdzVar2 || kdzVar == kdz.b || kdzVar == kdz.c) {
            if (kdzVar == kdzVar2) {
                curve = kfk.a.getCurve();
            } else if (kdzVar == kdz.b) {
                curve = kfk.b.getCurve();
            } else if (kdzVar == kdz.c) {
                curve = kfk.c.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(kdzVar.toString()));
            }
            kfk.f(jql.A(curve, kmj.UNCOMPRESSED, knbVar.c()), curve);
        }
        kea keaVar2 = kebVar.d;
        if (keaVar2 == kea.c) {
            b = kgb.a;
        } else if (num != null) {
            if (keaVar2 == kea.b) {
                b = kgb.a(num.intValue());
            } else if (keaVar2 == kea.a) {
                b = kgb.b(num.intValue());
            } else {
                throw new IllegalStateException("Unknown HpkeParameters.Variant: ".concat(keaVar2.d));
            }
        } else {
            throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant ".concat(keaVar2.d));
        }
        return new kef(kebVar, knbVar, b);
    }

    @Override // defpackage.kel
    public final knb X() {
        return this.c;
    }
}
