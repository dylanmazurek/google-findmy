package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lzj implements Comparable {
    public static final mjo c = new mjo();
    private static final long d;
    private static final long e;
    private static final long f;
    public final long a;
    public volatile boolean b;
    private final mjo g;

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        d = nanos;
        e = -nanos;
        f = TimeUnit.SECONDS.toNanos(1L);
    }

    public lzj(mjo mjoVar, long j, long j2) {
        boolean z;
        this.g = mjoVar;
        long min = Math.min(d, Math.max(e, j2));
        this.a = j + min;
        if (min <= 0) {
            z = true;
        } else {
            z = false;
        }
        this.b = z;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(lzj lzjVar) {
        mjo mjoVar = this.g;
        if (mjoVar == lzjVar.g) {
            long j = this.a - lzjVar.a;
            if (j < 0) {
                return -1;
            }
            if (j > 0) {
                return 1;
            }
            return 0;
        }
        throw new AssertionError("Tickers (" + mjoVar.toString() + " and " + lzjVar.g.toString() + ") don't match. Custom Ticker should only be used in tests!");
    }

    public final long b(TimeUnit timeUnit) {
        long nanoTime = System.nanoTime();
        if (!this.b && this.a - nanoTime <= 0) {
            this.b = true;
        }
        return timeUnit.convert(this.a - nanoTime, TimeUnit.NANOSECONDS);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lzj)) {
            return false;
        }
        lzj lzjVar = (lzj) obj;
        if (this.g == lzjVar.g && this.a == lzjVar.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.g, Long.valueOf(this.a)).hashCode();
    }

    public final String toString() {
        long b = b(TimeUnit.NANOSECONDS);
        long abs = Math.abs(b);
        long j = f;
        long j2 = abs / j;
        long abs2 = Math.abs(b) % j;
        StringBuilder sb = new StringBuilder();
        if (b < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (abs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
        }
        sb.append("s from now");
        mjo mjoVar = this.g;
        if (mjoVar != c) {
            sb.append(der.c(mjoVar, " (ticker=", ")"));
        }
        return sb.toString();
    }
}
