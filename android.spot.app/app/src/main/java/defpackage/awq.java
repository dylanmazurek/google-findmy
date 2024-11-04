package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class awq {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(awr awrVar) {
        if (awrVar instanceof ayb) {
            ((ayb) awrVar).p();
        }
    }

    public static /* synthetic */ void d(awq awqVar, awr awrVar, int i, int i2) {
        long c = bee.c(i, i2);
        if (awqVar.b() != bln.Ltr && awqVar.a() != 0) {
            int a = awqVar.a() - awrVar.a;
            int a2 = blk.a(c);
            int b = blk.b(c);
            c(awrVar);
            awrVar.r(blk.d(bee.c(a - a2, b), awrVar.e), 0.0f, null);
            return;
        }
        c(awrVar);
        awrVar.r(blk.d(c, awrVar.e), 0.0f, null);
    }

    public static /* synthetic */ void e(awq awqVar, awr awrVar) {
        long c = bee.c(0, 0);
        moh mohVar = aws.a;
        if (awqVar.b() != bln.Ltr && awqVar.a() != 0) {
            int a = awqVar.a() - awrVar.a;
            int a2 = blk.a(c);
            int b = blk.b(c);
            c(awrVar);
            awrVar.r(blk.d(bee.c(a - a2, b), awrVar.e), 0.0f, mohVar);
            return;
        }
        c(awrVar);
        awrVar.r(blk.d(c, awrVar.e), 0.0f, mohVar);
    }

    public static final void f(awr awrVar, int i, int i2, float f) {
        c(awrVar);
        awrVar.r(blk.d(bee.c(i, i2), awrVar.e), f, null);
    }

    public static final void g(awr awrVar, long j, float f) {
        c(awrVar);
        awrVar.r(blk.d(j, awrVar.e), f, null);
    }

    public static final void h(awr awrVar, int i, int i2, moh mohVar) {
        c(awrVar);
        awrVar.r(blk.d(bee.c(i, i2), awrVar.e), 0.0f, mohVar);
    }

    public static /* synthetic */ void i(awr awrVar, int i, int i2) {
        f(awrVar, i, i2, 0.0f);
    }

    public static /* synthetic */ void k(awr awrVar, moh mohVar) {
        h(awrVar, 0, 0, mohVar);
    }

    protected abstract int a();

    protected abstract bln b();
}
