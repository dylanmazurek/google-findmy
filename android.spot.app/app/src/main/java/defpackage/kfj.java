package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kfj {
    static final kfj a = new kfj(BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO);
    final BigInteger b;
    final BigInteger c;
    final BigInteger d;

    public kfj(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.b = bigInteger;
        this.c = bigInteger2;
        this.d = bigInteger3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.d.equals(BigInteger.ZERO);
    }
}
