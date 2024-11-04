package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mpz implements Serializable {
    public static final mpz a = new mpz();
    private static final long serialVersionUID = 0;

    private mpz() {
    }

    private final Object readResolve() {
        return mqb.a;
    }
}
