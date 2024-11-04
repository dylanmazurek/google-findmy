package defpackage;

import java.lang.reflect.Array;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfi {
    public static final long[] a;
    static final long[] b;
    public static final long[] c;
    static final kff[][] d;
    public static final kff[] e;
    private static final BigInteger f;
    private static final BigInteger g;
    private static final BigInteger h;
    private static final BigInteger i;

    static {
        BigInteger subtract = BigInteger.valueOf(2L).pow(255).subtract(BigInteger.valueOf(19L));
        f = subtract;
        BigInteger mod = BigInteger.valueOf(-121665L).multiply(BigInteger.valueOf(121666L).modInverse(subtract)).mod(subtract);
        g = mod;
        BigInteger mod2 = BigInteger.valueOf(2L).multiply(mod).mod(subtract);
        h = mod2;
        BigInteger modPow = BigInteger.valueOf(2L).modPow(subtract.subtract(BigInteger.ONE).divide(BigInteger.valueOf(4L)), subtract);
        i = modPow;
        lyn lynVar = new lyn((byte[]) null);
        lynVar.b = BigInteger.valueOf(4L).multiply(BigInteger.valueOf(5L).modInverse(subtract)).mod(subtract);
        BigInteger bigInteger = (BigInteger) lynVar.b;
        BigInteger multiply = bigInteger.pow(2).subtract(BigInteger.ONE).multiply(mod.multiply(bigInteger.pow(2)).add(BigInteger.ONE).modInverse(subtract));
        BigInteger modPow2 = multiply.modPow(subtract.add(BigInteger.valueOf(3L)).divide(BigInteger.valueOf(8L)), subtract);
        if (!modPow2.pow(2).subtract(multiply).mod(subtract).equals(BigInteger.ZERO)) {
            modPow2 = modPow2.multiply(modPow).mod(subtract);
        }
        if (modPow2.testBit(0)) {
            modPow2 = subtract.subtract(modPow2);
        }
        lynVar.a = modPow2;
        a = kfl.l(a(mod));
        b = kfl.l(a(mod2));
        c = kfl.l(a(modPow));
        d = (kff[][]) Array.newInstance((Class<?>) kff.class, 32, 8);
        lyn lynVar2 = lynVar;
        for (int i2 = 0; i2 < 32; i2++) {
            lyn lynVar3 = lynVar2;
            for (int i3 = 0; i3 < 8; i3++) {
                d[i2][i3] = b(lynVar3);
                lynVar3 = c(lynVar3, lynVar2);
            }
            for (int i4 = 0; i4 < 8; i4++) {
                lynVar2 = c(lynVar2, lynVar2);
            }
        }
        lyn c2 = c(lynVar, lynVar);
        e = new kff[8];
        for (int i5 = 0; i5 < 8; i5++) {
            e[i5] = b(lynVar);
            lynVar = c(lynVar, c2);
        }
    }

    private static byte[] a(BigInteger bigInteger) {
        byte[] bArr = new byte[32];
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        System.arraycopy(byteArray, 0, bArr, 32 - length, length);
        for (int i2 = 0; i2 < 16; i2++) {
            byte b2 = bArr[i2];
            int i3 = 31 - i2;
            bArr[i2] = bArr[i3];
            bArr[i3] = b2;
        }
        return bArr;
    }

    private static kff b(lyn lynVar) {
        BigInteger add = ((BigInteger) lynVar.b).add((BigInteger) lynVar.a);
        BigInteger bigInteger = f;
        return new kff(kfl.l(a(add.mod(bigInteger))), kfl.l(a(((BigInteger) lynVar.b).subtract((BigInteger) lynVar.a).mod(bigInteger))), kfl.l(a(h.multiply((BigInteger) lynVar.a).multiply((BigInteger) lynVar.b).mod(bigInteger))));
    }

    private static lyn c(lyn lynVar, lyn lynVar2) {
        lyn lynVar3 = new lyn((byte[]) null);
        BigInteger multiply = g.multiply(((BigInteger) lynVar.a).multiply((BigInteger) lynVar2.a).multiply((BigInteger) lynVar.b).multiply((BigInteger) lynVar2.b));
        BigInteger bigInteger = f;
        BigInteger mod = multiply.mod(bigInteger);
        lynVar3.a = ((BigInteger) lynVar.a).multiply((BigInteger) lynVar2.b).add(((BigInteger) lynVar2.a).multiply((BigInteger) lynVar.b)).multiply(BigInteger.ONE.add(mod).modInverse(bigInteger)).mod(bigInteger);
        lynVar3.b = ((BigInteger) lynVar.b).multiply((BigInteger) lynVar2.b).add(((BigInteger) lynVar.a).multiply((BigInteger) lynVar2.a)).multiply(BigInteger.ONE.subtract(mod).modInverse(bigInteger)).mod(bigInteger);
        return lynVar3;
    }
}
