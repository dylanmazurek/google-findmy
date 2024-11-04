package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dno {
    private static final Queue a = new ArrayDeque(0);
    private int b;
    private int c;
    private Object d;

    private dno() {
    }

    public static dno a(Object obj, int i, int i2) {
        dno dnoVar;
        Queue queue = a;
        synchronized (queue) {
            dnoVar = (dno) queue.poll();
        }
        if (dnoVar == null) {
            dnoVar = new dno();
        }
        dnoVar.d = obj;
        dnoVar.c = i;
        dnoVar.b = i2;
        return dnoVar;
    }

    public final void b() {
        Queue queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dno) {
            dno dnoVar = (dno) obj;
            if (this.c == dnoVar.c && this.b == dnoVar.b && this.d.equals(dnoVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b * 31) + this.c) * 31) + this.d.hashCode();
    }
}
