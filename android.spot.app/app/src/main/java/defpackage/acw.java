package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acw implements Iterator, mpq {
    private final afx a;
    private final int b;
    private int c;
    private final int d;

    public acw(afx afxVar, int i, int i2) {
        this.a = afxVar;
        this.b = i2;
        this.c = i;
        this.d = afxVar.g;
        if (afxVar.f) {
            afz.l();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.c < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (this.a.g != this.d) {
            afz.l();
        }
        int i = this.c;
        this.c = afz.c(this.a.a, i) + i;
        return new afy(this.a, i, this.d);
    }

    @Override // java.util.Iterator
    public final void remove() {
        a.a();
    }
}
