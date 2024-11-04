package j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class g extends i {
    private final boolean g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(j$.time.temporal.o oVar, int i, int i2, boolean z, int i3) {
        super(oVar, i, i2, u.NOT_NEGATIVE, i3);
        this.g = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Enum, j$.time.temporal.o] */
    @Override // j$.time.format.i
    public final i b() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, j$.time.temporal.o] */
    @Override // j$.time.format.i
    public final i c(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.temporal.o] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean k(p pVar, StringBuilder sb) {
        BigDecimal stripTrailingZeros;
        ?? r0 = this.a;
        Long e = pVar.e(r0);
        if (e == null) {
            return false;
        }
        s b = pVar.b();
        long longValue = e.longValue();
        j$.time.temporal.s k = r0.k();
        k.b(longValue, r0);
        BigDecimal valueOf = BigDecimal.valueOf(k.e());
        BigDecimal add = BigDecimal.valueOf(k.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            if (divide.signum() == 0) {
                stripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
            } else {
                stripTrailingZeros = divide.stripTrailingZeros();
            }
            bigDecimal = stripTrailingZeros;
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale == 0) {
            if (i > 0) {
                if (z) {
                    b.getClass();
                    sb.append('.');
                }
                for (int i2 = 0; i2 < i; i2++) {
                    b.getClass();
                    sb.append('0');
                }
                return true;
            }
            return true;
        }
        String substring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
        b.getClass();
        if (z) {
            sb.append('.');
        }
        sb.append(substring);
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        String str;
        if (this.g) {
            str = ",DecimalPoint";
        } else {
            str = "";
        }
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }
}
