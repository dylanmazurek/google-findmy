package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hty {
    static final htz a = new htw(nfd.d, true);
    private final Random b;
    private final htl c;

    public hty(Random random, htl htlVar) {
        this.b = random;
        this.c = htlVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final htz a(nfd nfdVar) {
        int J = a.J(nfdVar.c);
        boolean z = true;
        if (J == 0) {
            J = 1;
        }
        int i = J - 1;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    if (i == 5) {
                        nfdVar = nfd.d;
                    }
                    return new htw(nfdVar, true);
                }
                return new htx(nfdVar, this.b, this.c);
            }
            if (this.b.nextDouble() * 1000.0d >= nfdVar.b) {
                z = false;
            }
            return new htw(nfdVar, z);
        }
        if (nfdVar.b != 1000) {
            z = false;
        }
        return new htw(nfdVar, z);
    }
}
