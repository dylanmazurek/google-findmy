package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nln {
    public static final nln j = new nlm();
    private boolean a;
    private long b;
    public long k;

    public boolean g() {
        return this.a;
    }

    public long h() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public nln i() {
        this.k = 0L;
        return this;
    }

    public nln j(long j2) {
        this.a = true;
        this.b = j2;
        return this;
    }

    public nln k(long j2, TimeUnit timeUnit) {
        timeUnit.getClass();
        this.k = timeUnit.toNanos(j2);
        return this;
    }

    public void l() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.a && this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public nln m() {
        this.a = false;
        return this;
    }
}
