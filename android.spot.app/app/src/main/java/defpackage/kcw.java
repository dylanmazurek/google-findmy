package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kcw {
    public final kcu a;
    public final kcu b;

    public kcw(byte[] bArr) {
        if (iuu.y(1)) {
            this.a = a(bArr, 1);
            this.b = a(bArr, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public abstract kcu a(byte[] bArr, int i);
}
