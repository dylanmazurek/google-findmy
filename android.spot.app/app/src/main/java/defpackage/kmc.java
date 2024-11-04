package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmc implements jzy {
    public final kmt c;
    public final byte[] d;
    public final byte[] e;
    private static final Collection f = Arrays.asList(64);
    public static final byte[] a = new byte[16];
    public static final ThreadLocal b = new kmb();

    private kmc(byte[] bArr, knb knbVar) {
        if (iuu.y(1)) {
            int length = bArr.length;
            if (f.contains(Integer.valueOf(length))) {
                int i = length >> 1;
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, i);
                this.d = Arrays.copyOfRange(bArr, i, length);
                this.c = new kmt(copyOfRange);
                this.e = knbVar.c();
                return;
            }
            throw new InvalidKeyException(a.am(length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    public static jzy a(kde kdeVar) {
        return new kmc(kdeVar.c.X(), kdeVar.b);
    }
}
