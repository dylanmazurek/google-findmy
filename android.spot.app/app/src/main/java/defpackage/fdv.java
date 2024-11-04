package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fdv {
    private long a;

    public fdv() {
    }

    public final void a() {
        this.a = 0L;
    }

    public final void b() {
        this.a = SystemClock.elapsedRealtime();
    }

    public final boolean c(long j) {
        if (this.a == 0 || SystemClock.elapsedRealtime() - this.a > j) {
            return true;
        }
        return false;
    }

    public fdv(long j) {
        this.a = j;
    }
}
