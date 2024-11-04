package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ue {
    public static final atk d = new atk(ts.e, ts.f);
    public static final vu a = qh.b(400.0f, null, 5);
    public static final vu b = qh.b(400.0f, new blk(bee.c(1, 1)), 1);
    public static final vu c = qh.b(400.0f, new blm(xa.a()), 1);

    public static final uf a(adt adtVar) {
        return (uf) adtVar.a();
    }

    public static final ug b(adt adtVar) {
        return (ug) adtVar.a();
    }

    public static final void c(adt adtVar, uf ufVar) {
        adtVar.h(ufVar);
    }

    public static final void d(adt adtVar, ug ugVar) {
        adtVar.h(ugVar);
    }

    public static /* synthetic */ uf e(vj vjVar, int i) {
        if ((i & 1) != 0) {
            vjVar = qh.b(400.0f, null, 5);
        }
        return new uf(new um(new uh(vjVar), null, false, null, 62));
    }

    public static /* synthetic */ ug f(vj vjVar, int i) {
        if ((i & 1) != 0) {
            vjVar = qh.b(400.0f, null, 5);
        }
        return new ug(new um(new uh(vjVar), null, false, null, 62));
    }

    public static /* synthetic */ uf g(vj vjVar, float f) {
        return new uf(new um(null, new uk(f, aro.a, vjVar), false, null, 55));
    }
}
