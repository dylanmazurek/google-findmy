package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class klg extends kll {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final klf d;
    public final kle e;
    public final kle f;
    public final int g;

    public klg(int i, BigInteger bigInteger, klf klfVar, kle kleVar, kle kleVar2, int i2) {
        this.b = i;
        this.c = bigInteger;
        this.d = klfVar;
        this.e = kleVar;
        this.f = kleVar2;
        this.g = i2;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.d != klf.d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof klg)) {
            return false;
        }
        klg klgVar = (klg) obj;
        if (klgVar.b != this.b || !Objects.equals(klgVar.c, this.c) || !Objects.equals(klgVar.d, this.d) || !Objects.equals(klgVar.e, this.e) || !Objects.equals(klgVar.f, this.f) || klgVar.g != this.g) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(klg.class, Integer.valueOf(this.b), this.c, this.d, this.e, this.f, Integer.valueOf(this.g));
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        kle kleVar = this.f;
        kle kleVar2 = this.e;
        return "RSA SSA PSS Parameters (variant: " + String.valueOf(this.d) + ", signature hashType: " + String.valueOf(kleVar2) + ", mgf1 hashType: " + String.valueOf(kleVar) + ", saltLengthBytes: " + this.g + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
