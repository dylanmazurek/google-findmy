package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kev {
    public static final byte[] a = new byte[0];
    public final keu b;
    public final byte[] c;
    public final byte[] d;
    private final BigInteger e;
    private final byte[] f;
    private BigInteger g = BigInteger.ZERO;

    public kev(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, keu keuVar) {
        this.d = bArr;
        this.c = bArr2;
        this.f = bArr3;
        this.e = bigInteger;
        this.b = keuVar;
    }

    public final synchronized byte[] a() {
        byte[] J;
        J = jql.J(this.f, iuu.w(this.g, 12));
        if (this.g.compareTo(this.e) < 0) {
            this.g = this.g.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return J;
    }
}
