package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kdv extends kel {
    public final kdt a;
    public final ECPoint b;
    public final knb c;
    public final knb d;

    private kdv(kdt kdtVar, ECPoint eCPoint, knb knbVar, knb knbVar2) {
        this.a = kdtVar;
        this.b = eCPoint;
        this.c = knbVar;
        this.d = knbVar2;
    }

    public static kdv V(kdt kdtVar, knb knbVar, Integer num) {
        if (kdtVar.b.equals(kdp.d)) {
            Z(kdtVar.e, num);
            if (knbVar.a() == 32) {
                return new kdv(kdtVar, null, knbVar, Y(kdtVar.e, num));
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    public static kdv W(kdt kdtVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        if (!kdtVar.b.equals(kdp.d)) {
            Z(kdtVar.e, num);
            kdp kdpVar = kdtVar.b;
            if (kdpVar == kdp.a) {
                curve = kfk.a.getCurve();
            } else if (kdpVar == kdp.b) {
                curve = kfk.b.getCurve();
            } else if (kdpVar == kdp.c) {
                curve = kfk.c.getCurve();
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve type for ".concat(String.valueOf(String.valueOf(kdpVar))));
            }
            kfk.f(eCPoint, curve);
            return new kdv(kdtVar, eCPoint, null, Y(kdtVar.e, num));
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static knb Y(kds kdsVar, Integer num) {
        if (kdsVar == kds.c) {
            return kgb.a;
        }
        if (num != null) {
            if (kdsVar == kds.b) {
                return kgb.a(num.intValue());
            }
            if (kdsVar == kds.a) {
                return kgb.b(num.intValue());
            }
            throw new IllegalStateException("Unknown EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(kdsVar))));
        }
        throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(String.valueOf(kdsVar))));
    }

    private static void Z(kds kdsVar, Integer num) {
        if (!kdsVar.equals(kds.c) && num == null) {
            throw new GeneralSecurityException(der.b(kdsVar, "'idRequirement' must be non-null for ", " variant."));
        }
        if (kdsVar.equals(kds.c) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    @Override // defpackage.kel
    public final knb X() {
        return this.d;
    }
}
