package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
class jtu extends jtw {
    final int a;
    final long b;
    final double c;

    public jtu() {
        hwx.Q(true, "%s (%s) must be > 0", "numAttempts", 3);
        this.a = Math.min(3, 131072);
        jtw.e(100L, "firstDelayMillis");
        this.b = 100L;
        hwx.S(true, "%s (%s) must be > 0", "multiplier", Double.valueOf(2.0d));
        this.c = 2.0d;
    }

    @Override // defpackage.jtw
    public final boolean cY(int i) {
        jtw.c(i);
        if (i < this.a) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jtu) {
            jtu jtuVar = (jtu) obj;
            long j = jtuVar.b;
            double d = jtuVar.c;
            if (this.a == jtuVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), 100L, Double.valueOf(2.0d)});
    }
}
