package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kld {
    private static final BigInteger e;
    private static final BigInteger f;
    private Integer g = null;
    public BigInteger a = klg.a;
    public kle b = null;
    public kle c = null;
    private Integer h = null;
    public klf d = klf.d;

    static {
        BigInteger valueOf = BigInteger.valueOf(2L);
        e = valueOf;
        f = valueOf.pow(256);
    }

    public final klg a() {
        Integer num = this.g;
        if (num != null) {
            if (this.a != null) {
                if (this.b != null) {
                    if (this.c != null) {
                        if (this.d != null) {
                            if (this.h != null) {
                                if (num.intValue() >= 2048) {
                                    if (this.b == this.c) {
                                        BigInteger bigInteger = this.a;
                                        int compareTo = bigInteger.compareTo(klg.a);
                                        if (compareTo != 0) {
                                            if (compareTo >= 0) {
                                                if (!bigInteger.mod(e).equals(BigInteger.ZERO)) {
                                                    if (bigInteger.compareTo(f) > 0) {
                                                        throw new InvalidAlgorithmParameterException("Public exponent cannot be larger than 2^256.");
                                                    }
                                                } else {
                                                    throw new InvalidAlgorithmParameterException("Invalid public exponent");
                                                }
                                            } else {
                                                throw new InvalidAlgorithmParameterException("Public exponent must be at least 65537.");
                                            }
                                        }
                                        return new klg(this.g.intValue(), this.a, this.d, this.b, this.c, this.h.intValue());
                                    }
                                    throw new GeneralSecurityException("MGF1 hash is different from signature hash");
                                }
                                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least %d bits", this.g, 2048));
                            }
                            throw new GeneralSecurityException("salt length is not set");
                        }
                        throw new GeneralSecurityException("variant is not set");
                    }
                    throw new GeneralSecurityException("mgf1 hash type is not set");
                }
                throw new GeneralSecurityException("signature hash type is not set");
            }
            throw new GeneralSecurityException("publicExponent is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    public final void b(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void c(int i) {
        if (i >= 0) {
            this.h = Integer.valueOf(i);
            return;
        }
        throw new GeneralSecurityException(String.format("Invalid salt length in bytes %d; salt length must be positive", Integer.valueOf(i)));
    }
}
