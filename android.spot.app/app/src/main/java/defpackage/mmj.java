package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mmj {
    public final mml a;
    public int b;
    public int c = -1;
    private int d;

    public mmj(mml mmlVar) {
        this.a = mmlVar;
        this.d = mmlVar.f;
        b();
    }

    public final void a() {
        if (this.a.f == this.d) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            mml mmlVar = this.a;
            if (i < mmlVar.e && mmlVar.d[i] < 0) {
                this.b = i + 1;
            } else {
                return;
            }
        }
    }

    public final boolean hasNext() {
        if (this.b < this.a.e) {
            return true;
        }
        return false;
    }

    public final void remove() {
        a();
        if (this.c != -1) {
            this.a.g();
            this.a.h(this.c);
            this.c = -1;
            this.d = this.a.f;
            return;
        }
        throw new IllegalStateException("Call next() before removing element from the iterator.");
    }
}
