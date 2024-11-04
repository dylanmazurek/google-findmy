package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kkw {
    private static final BigInteger d;
    private static final BigInteger e;
    private Integer f = null;
    public BigInteger a = kkz.a;
    public kkx b = null;
    public kky c = kky.d;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        d = valueOf;
        e = valueOf.pow(256);
    }

    public final kkz a() {
        Integer num = this.f;
        if (num != null) {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c != null) {
                        if (num.intValue() >= 2048) {
                            BigInteger bigInteger = this.a;
                            int compareTo = bigInteger.compareTo(kkz.a);
                            if (compareTo != 0) {
                                if (compareTo >= 0) {
                                    if (!bigInteger.mod(d).equals(BigInteger.ZERO)) {
                                        if (bigInteger.compareTo(e) > 0) {
                                            throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
                                        }
                                    } else {
                                        throw new InvalidAlgorithmParameterException("Invalid public exponent");
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
                                }
                            }
                            return new kkz(this.f.intValue(), this.a, this.c, this.b);
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 2048 bits", this.f));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("publicExponent is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }
}
