package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jin extends jig {
    public jin() {
        super(4);
    }

    @Override // defpackage.jig
    public final /* synthetic */ void d(Object obj) {
        super.c(obj);
    }

    public final jis g() {
        this.c = true;
        return jis.l(this.a, this.b);
    }

    public final void h(Object obj) {
        super.c(obj);
    }

    public final void i(Object... objArr) {
        super.e(objArr);
    }

    public final void j(Iterable iterable) {
        super.f(iterable);
    }

    public final void k(Iterator it) {
        while (it.hasNext()) {
            super.c(it.next());
        }
    }

    public jin(int i) {
        super(i);
    }
}
