package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class awr {
    public int a;
    public int b;
    public long c = bef.m(0, 0);
    public long d = aws.b;
    public long e = 0;

    private final void co() {
        int b = blm.b(this.c);
        long j = this.d;
        this.a = moz.ae(b, bld.d(j), bld.b(j));
        int a = blm.a(this.c);
        long j2 = this.d;
        int ae = moz.ae(a, bld.c(j2), bld.a(j2));
        this.b = ae;
        int i = this.a;
        long j3 = this.c;
        this.e = bee.c((i - blm.b(j3)) / 2, (ae - blm.a(j3)) / 2);
    }

    public /* synthetic */ Object c() {
        throw null;
    }

    public final int ce() {
        return blm.a(this.c);
    }

    public final int q() {
        return blm.b(this.c);
    }

    public abstract void r(long j, float f, moh mohVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void s(long j) {
        if (!a.n(this.c, j)) {
            this.c = j;
            co();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(long j) {
        if (!a.n(this.d, j)) {
            this.d = j;
            co();
        }
    }
}
