package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jjp extends jig {
    public jjp() {
        super(4);
    }

    public jjr g() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                jjr l = jjr.l(i, this.a);
                this.b = l.size();
                this.c = true;
                return l;
            }
            Object obj = this.a[0];
            obj.getClass();
            return new jms(obj);
        }
        return jmo.a;
    }

    public final void h(Object... objArr) {
        super.e(objArr);
    }

    public final void i(Iterable iterable) {
        iterable.getClass();
        super.f(iterable);
    }

    @Override // defpackage.jig
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final void d(Object obj) {
        obj.getClass();
        super.c(obj);
    }

    public final void k(jjp jjpVar) {
        b(jjpVar.a, jjpVar.b);
    }
}
