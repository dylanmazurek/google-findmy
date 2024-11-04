package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nqu implements Comparable {
    nnq a;
    int b;
    String c;
    Locale d;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public final int compareTo(nqu nquVar) {
        nnq nnqVar = nquVar.a;
        int a = nqw.a(this.a.u(), nnqVar.u());
        if (a != 0) {
            return a;
        }
        return nqw.a(this.a.s(), nnqVar.s());
    }

    public final long b(long j, boolean z) {
        long i;
        String str = this.c;
        if (str == null) {
            i = this.a.j(j, this.b);
        } else {
            i = this.a.i(j, str, this.d);
        }
        if (z) {
            return this.a.g(i);
        }
        return i;
    }

    public final void c(nnq nnqVar, int i) {
        this.a = nnqVar;
        this.b = i;
        this.c = null;
        this.d = null;
    }
}
