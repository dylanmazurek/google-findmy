package defpackage;

import java.util.Arrays;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjd {
    final int a;
    final long b;
    final long c;
    final double d;
    final Long e;
    final Set f;

    public mjd(int i, long j, long j2, double d, Long l, Set set) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = d;
        this.e = l;
        this.f = jjr.m(set);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mjd)) {
            return false;
        }
        mjd mjdVar = (mjd) obj;
        if (this.a != mjdVar.a || this.b != mjdVar.b || this.c != mjdVar.c || Double.compare(this.d, mjdVar.d) != 0 || !amr.g(this.e, mjdVar.e) || !amr.g(this.f, mjdVar.f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Long.valueOf(this.c), Double.valueOf(this.d), this.e, this.f});
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.d("maxAttempts", this.a);
        q.e("initialBackoffNanos", this.b);
        q.e("maxBackoffNanos", this.c);
        q.c("backoffMultiplier", this.d);
        q.b("perAttemptRecvTimeoutNanos", this.e);
        q.b("retryableStatusCodes", this.f);
        return q.toString();
    }
}
