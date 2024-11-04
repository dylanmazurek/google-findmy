package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtv extends jtw {
    public final long a;
    private final long b;

    public jtv(long j) {
        jtw.d(500L, "delayMillis");
        this.b = 500L;
        jtw.e(j, "totalMillis");
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jtv) {
            jtv jtvVar = (jtv) obj;
            long j = jtvVar.b;
            if (this.a == jtvVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{500L, Long.valueOf(this.a)});
    }

    public final String toString() {
        jeq jeqVar = new jeq("timed");
        jeqVar.e("delayMs", 500L);
        jeqVar.e("totalMs", this.a);
        return jeqVar.toString();
    }
}
