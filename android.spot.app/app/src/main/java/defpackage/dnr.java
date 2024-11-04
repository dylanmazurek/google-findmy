package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dnr implements dje, djd {
    private final List a;
    private final buf b;
    private int c;
    private dgs d;
    private djd e;
    private List f;
    private boolean g;

    public dnr(List list, buf bufVar) {
        this.b = bufVar;
        bsc.p(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            f(this.d, this.e);
        } else {
            bsc.q(this.f);
            this.e.e(new dlb("Fetch failed", new ArrayList(this.f)));
        }
    }

    @Override // defpackage.dje
    public final Class a() {
        return ((dje) this.a.get(0)).a();
    }

    @Override // defpackage.djd
    public final void b(Object obj) {
        if (obj != null) {
            this.e.b(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.dje
    public final void cr() {
        this.g = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dje) it.next()).cr();
        }
    }

    @Override // defpackage.dje
    public final void d() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dje) it.next()).d();
        }
    }

    @Override // defpackage.djd
    public final void e(Exception exc) {
        List list = this.f;
        bsc.q(list);
        list.add(exc);
        h();
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        this.d = dgsVar;
        this.e = djdVar;
        this.f = (List) this.b.a();
        ((dje) this.a.get(this.c)).f(dgsVar, this);
        if (this.g) {
            cr();
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return ((dje) this.a.get(0)).g();
    }
}
