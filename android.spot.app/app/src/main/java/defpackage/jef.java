package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jef implements jei {
    private transient jef a;

    @Override // defpackage.jei
    @Deprecated
    public final Object a(Object obj) {
        return e(obj);
    }

    protected /* bridge */ /* synthetic */ Object b(Object obj) {
        lmn lmnVar = (lmn) obj;
        ljh k = lpp.d.k();
        if ((lmnVar.a & 1) != 0) {
            long j = lmnVar.b;
            if (!k.b.y()) {
                k.t();
            }
            ((lpp) k.b).b = j;
        }
        if ((lmnVar.a & 2) != 0) {
            jef f = dxj.a.f();
            lmr lmrVar = lmnVar.c;
            if (lmrVar == null) {
                lmrVar = lmr.c;
            }
            lqu lquVar = (lqu) f.e(lmrVar);
            if (!k.b.y()) {
                k.t();
            }
            lpp lppVar = (lpp) k.b;
            lquVar.getClass();
            lppVar.c = lquVar;
            lppVar.a |= 1;
        }
        return (lpp) k.q();
    }

    protected /* bridge */ /* synthetic */ Object c(Object obj) {
        lpp lppVar = (lpp) obj;
        ljh k = lmn.d.k();
        long j = lppVar.b;
        if (!k.b.y()) {
            k.t();
        }
        lmn lmnVar = (lmn) k.b;
        lmnVar.a |= 1;
        lmnVar.b = j;
        if ((lppVar.a & 1) != 0) {
            jef jefVar = dxj.a;
            lqu lquVar = lppVar.c;
            if (lquVar == null) {
                lquVar = lqu.c;
            }
            lmr lmrVar = (lmr) jefVar.e(lquVar);
            if (!k.b.y()) {
                k.t();
            }
            lmn lmnVar2 = (lmn) k.b;
            lmrVar.getClass();
            lmnVar2.c = lmrVar;
            lmnVar2.a |= 2;
        }
        return (lmn) k.q();
    }

    public Object d(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        b.getClass();
        return b;
    }

    public Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        Object c = c(obj);
        c.getClass();
        return c;
    }

    public final jef f() {
        jef jefVar = this.a;
        if (jefVar == null) {
            jee jeeVar = new jee(this);
            this.a = jeeVar;
            return jeeVar;
        }
        return jefVar;
    }
}
