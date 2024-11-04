package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmf implements kah {
    private final byte[] a;

    public kmf(byte[] bArr) {
        if (iuu.y(1)) {
            if (bArr.length == 32) {
                byte[] f = kfh.f(bArr);
                this.a = f;
                kfh.g(f);
                return;
            }
            throw new IllegalArgumentException(String.format("Given private key's length is not %s", 32));
        }
        throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
    }
}
