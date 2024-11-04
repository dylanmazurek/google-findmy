package defpackage;

import java.math.BigInteger;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iia {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public iia(hjy hjyVar, int i, hri hriVar, String str) {
        this.d = hjyVar;
        this.c = hriVar;
        this.a = i;
        this.b = str;
    }

    private final iib h(iib iibVar, iib iibVar2) {
        if (!iibVar.c()) {
            if (iibVar2.c()) {
                return iibVar;
            }
            if (iibVar != iibVar2) {
                BigInteger bigInteger = iibVar.d;
                BigInteger mod = bigInteger.multiply(bigInteger).mod((BigInteger) this.c);
                BigInteger bigInteger2 = iibVar.b;
                BigInteger mod2 = iibVar2.b.multiply(mod).mod((BigInteger) this.c);
                BigInteger bigInteger3 = iibVar.c;
                BigInteger mod3 = iibVar2.c.multiply(mod).multiply(iibVar.d).mod((BigInteger) this.c);
                if (!iibVar2.d.equals(BigInteger.ONE)) {
                    BigInteger bigInteger4 = iibVar2.d;
                    BigInteger mod4 = bigInteger4.multiply(bigInteger4).mod((BigInteger) this.c);
                    bigInteger2 = bigInteger2.multiply(mod4).mod((BigInteger) this.c);
                    bigInteger3 = bigInteger3.multiply(mod4).multiply(iibVar2.d).mod((BigInteger) this.c);
                }
                BigInteger mod5 = mod2.subtract(bigInteger2).mod((BigInteger) this.c);
                BigInteger mod6 = mod3.subtract(bigInteger3).mod((BigInteger) this.c);
                if (mod5.equals(BigInteger.ZERO)) {
                    if (mod6.equals(BigInteger.ZERO)) {
                        return i(iibVar);
                    }
                    return iib.a;
                }
                BigInteger mod7 = mod5.multiply(mod5).mod((BigInteger) this.c);
                BigInteger mod8 = bigInteger2.multiply(mod7).mod((BigInteger) this.c);
                BigInteger mod9 = mod7.multiply(mod5).mod((BigInteger) this.c);
                BigInteger mod10 = mod6.multiply(mod6).subtract(mod9).subtract(mod8.shiftLeft(1)).mod((BigInteger) this.c);
                return new iib(mod10, mod6.multiply(mod8.subtract(mod10)).subtract(bigInteger3.multiply(mod9)).mod((BigInteger) this.c), mod5.multiply(iibVar.d).multiply(iibVar2.d).mod((BigInteger) this.c));
            }
            return i(iibVar);
        }
        return iibVar2;
    }

    private final iib i(iib iibVar) {
        if (!iibVar.c() && !iibVar.c.equals(BigInteger.ZERO)) {
            BigInteger bigInteger = iibVar.c;
            BigInteger mod = bigInteger.multiply(bigInteger).mod((BigInteger) this.c);
            BigInteger bigInteger2 = iibVar.d;
            BigInteger mod2 = bigInteger2.multiply(bigInteger2).mod((BigInteger) this.c);
            BigInteger mod3 = iic.d.multiply(iibVar.b.add(mod2)).multiply(iibVar.b.subtract(mod2)).mod((BigInteger) this.c);
            BigInteger mod4 = iibVar.b.multiply(mod).shiftLeft(2).mod((BigInteger) this.c);
            BigInteger mod5 = mod3.multiply(mod3).subtract(mod4.shiftLeft(1)).mod((BigInteger) this.c);
            return new iib(mod5, mod3.multiply(mod4.subtract(mod5)).subtract(mod.multiply(mod).shiftLeft(3)).mod((BigInteger) this.c), iibVar.c.multiply(iibVar.d).shiftLeft(1).mod((BigInteger) this.c));
        }
        return iib.a;
    }

    private final iib j(iib iibVar) {
        for (int i = 0; i < 4; i++) {
            iibVar = i(iibVar);
        }
        return iibVar;
    }

    public final iib a(iib iibVar, List list, BigInteger bigInteger) {
        BigInteger mod = bigInteger.mod((BigInteger) this.c);
        int bitLength = mod.bitLength() - 2;
        iib iibVar2 = iibVar;
        while (bitLength >= 0) {
            iibVar2 = i(iibVar2);
            boolean testBit = mod.testBit(bitLength);
            if (testBit && bitLength >= 4) {
                iib j = j(iibVar2);
                int i = 0;
                for (int i2 = 1; i2 < 5; i2++) {
                    i += i;
                    if (mod.testBit(bitLength - i2)) {
                        i++;
                    }
                }
                iibVar2 = h(j, (iib) list.get(i));
                bitLength -= 5;
            } else {
                if (testBit) {
                    iibVar2 = h(iibVar2, iibVar);
                }
                bitLength--;
            }
        }
        return iibVar2;
    }

    public final jis b(iib iibVar) {
        jin jinVar = new jin();
        iib j = j(iibVar);
        jinVar.h(j);
        for (int i = 1; i < 16; i++) {
            j = h(j, iibVar);
            jinVar.h(j);
        }
        return jinVar.g();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:            if (r5.a(0) == 0) goto L8;     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lim c(defpackage.lim r5) {
        /*
            r4 = this;
            int r0 = r5.d()
            int r1 = r4.a
            r2 = 1
            if (r0 <= r1) goto L17
            int r0 = r5.d()
            int r1 = r1 + r2
            r3 = 0
            if (r0 != r1) goto L18
            byte r0 = r5.a(r3)
            if (r0 != 0) goto L18
        L17:
            r3 = 1
        L18:
            defpackage.hwx.E(r3)
            int r0 = r5.d()
            int r1 = r4.a
            if (r0 >= r1) goto L31
            int r0 = r5.d()
            int r1 = r1 - r0
            lim r0 = defpackage.iji.g(r1)
            lim r5 = r0.r(r5)
            return r5
        L31:
            int r0 = r5.d()
            int r1 = r1 + r2
            if (r0 != r1) goto L3c
            lim r5 = r5.w(r2)
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iia.c(lim):lim");
    }

    public final lim d(ECPoint eCPoint) {
        return c(lim.t(eCPoint.getAffineX().toByteArray()));
    }

    public final ECPoint e(ECPoint eCPoint, BigInteger bigInteger) {
        iib a = iib.a(eCPoint);
        return a(a, b(a), bigInteger).b((BigInteger) this.c);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [hjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [hjy, java.lang.Object] */
    public final jyz f(boolean z) {
        jyz b;
        long epochMilli = fma.i().toEpochMilli();
        if (z) {
            b = this.d.a();
        } else {
            b = this.d.b();
        }
        iuu.q(b, new hlf(this, z, epochMilli), jxv.a);
        return b;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [hjy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [hjy, java.lang.Object] */
    public final jyz g(boolean z, String str, int i) {
        jyz d;
        long epochMilli = fma.i().toEpochMilli();
        if (z) {
            d = this.d.c(str, i);
        } else {
            d = this.d.d(str, i);
        }
        iuu.q(d, new hle(this, i, z, epochMilli), jxv.a);
        return d;
    }

    public iia(ECParameterSpec eCParameterSpec, int i) {
        this.b = eCParameterSpec;
        this.a = i;
        BigInteger p = ((ECFieldFp) eCParameterSpec.getCurve().getField()).getP();
        this.c = p;
        this.d = p.add(BigInteger.ONE).shiftRight(2);
    }
}
