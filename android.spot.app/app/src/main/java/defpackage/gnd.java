package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gnd {
    private final Long a;
    private final long b;

    public gnd() {
        throw null;
    }

    public static gnd b(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        gmw gmwVar = new gmw();
        gmwVar.a = Long.valueOf(j);
        gmwVar.b(SystemClock.uptimeMillis());
        return gmwVar.a();
    }

    public static gnd c() {
        gmw gmwVar = new gmw();
        gmwVar.a = null;
        gmwVar.b(SystemClock.uptimeMillis());
        return gmwVar.a();
    }

    public final long a() {
        Long l = this.a;
        l.getClass();
        return Math.max(0L, l.longValue() - (SystemClock.uptimeMillis() - this.b));
    }

    public final gnd d(long j) {
        if (e()) {
            return this;
        }
        gmw gmwVar = new gmw();
        gmwVar.a = Long.valueOf(Math.max(0L, this.a.longValue() - j));
        gmwVar.b(this.b);
        return gmwVar.a();
    }

    public final boolean e() {
        if (this.a == null) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gnd) {
            gnd gndVar = (gnd) obj;
            Long l = this.a;
            if (l != null ? l.equals(gndVar.a) : gndVar.a == null) {
                if (this.b == gndVar.b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Long l = this.a;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        long j = this.b;
        return ((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "Timeout{value=" + this.a + ", startTime=" + this.b + "}";
    }

    public gnd(Long l, long j) {
        this.a = l;
        this.b = j;
    }
}
