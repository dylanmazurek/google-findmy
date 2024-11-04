package defpackage;

import j$.util.Objects;
import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkz extends kll {
    public static final BigInteger a = BigInteger.valueOf(65537);
    public final int b;
    public final BigInteger c;
    public final kky d;
    public final kkx e;

    public kkz(int i, BigInteger bigInteger, kky kkyVar, kkx kkxVar) {
        this.b = i;
        this.c = bigInteger;
        this.d = kkyVar;
        this.e = kkxVar;
    }

    @Override // defpackage.kag
    public final boolean a() {
        if (this.d != kky.d) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kkz)) {
            return false;
        }
        kkz kkzVar = (kkz) obj;
        if (kkzVar.b != this.b || !Objects.equals(kkzVar.c, this.c) || kkzVar.d != this.d || kkzVar.e != this.e) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(kkz.class, Integer.valueOf(this.b), this.c, this.d, this.e);
    }

    public final String toString() {
        BigInteger bigInteger = this.c;
        kkx kkxVar = this.e;
        return "RSA SSA PKCS1 Parameters (variant: " + String.valueOf(this.d) + ", hashType: " + String.valueOf(kkxVar) + ", publicExponent: " + String.valueOf(bigInteger) + ", and " + this.b + "-bit modulus)";
    }
}
