package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class chw {
    public final ReentrantLock a = new ReentrantLock();
    public final long[] b;
    public final boolean[] c;
    public boolean d;

    public chw(int i) {
        this.b = new long[i];
        this.c = new boolean[i];
    }
}
