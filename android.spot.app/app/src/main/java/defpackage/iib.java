package defpackage;

import java.math.BigInteger;
import java.security.spec.ECPoint;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iib {
    public static final iib a = new iib(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    public final BigInteger b;
    public final BigInteger c;
    public final BigInteger d;

    public iib(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
    }

    public static iib a(ECPoint eCPoint) {
        if (eCPoint.equals(ECPoint.POINT_INFINITY)) {
            return a;
        }
        return new iib(eCPoint.getAffineX(), eCPoint.getAffineY(), BigInteger.ONE);
    }

    public final ECPoint b(BigInteger bigInteger) {
        if (c()) {
            return ECPoint.POINT_INFINITY;
        }
        BigInteger bigInteger2 = this.d;
        BigInteger modInverse = bigInteger2.multiply(bigInteger2.multiply(bigInteger2)).modInverse(bigInteger);
        return new ECPoint(this.b.multiply(modInverse).multiply(this.d).mod(bigInteger), this.c.multiply(modInverse).mod(bigInteger));
    }

    public final boolean c() {
        return this.d.equals(BigInteger.ZERO);
    }
}
