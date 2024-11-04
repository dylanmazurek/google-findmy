package defpackage;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klr implements kah {
    public klr() {
    }

    public klr(RSAPrivateCrtKey rSAPrivateCrtKey, kmq kmqVar) {
        if (iuu.y(2)) {
            kna.d(kmqVar);
            kna.b(rSAPrivateCrtKey.getModulus().bitLength());
            kna.c(rSAPrivateCrtKey.getPublicExponent());
            return;
        }
        throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
    }

    public klr(ktn ktnVar) {
        if (ktnVar.d()) {
            kfx.a.a();
            iuu.x(ktnVar);
        }
    }
}
