package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyx extends iyv {
    final /* synthetic */ iyv a;
    final /* synthetic */ izc b;
    final /* synthetic */ bym c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyx(izc izcVar, bym bymVar, bym bymVar2, iyv iyvVar) {
        super(bymVar);
        this.c = bymVar2;
        this.a = iyvVar;
        this.b = izcVar;
    }

    @Override // defpackage.iyv
    public final void a() {
        synchronized (this.b.e) {
            izc izcVar = this.b;
            bym bymVar = this.c;
            izcVar.d.add(bymVar);
            ((fxs) bymVar.a).k(new kry(izcVar, bymVar, 1));
            this.b.j.getAndIncrement();
            izc izcVar2 = this.b;
            iyv iyvVar = this.a;
            if (izcVar2.l == null && !izcVar2.f) {
                izcVar2.c.add(iyvVar);
                izcVar2.k = new jct(izcVar2, 1);
                izcVar2.f = true;
                if (!izcVar2.a.bindService(izcVar2.g, izcVar2.k, 1)) {
                    izcVar2.f = false;
                    Iterator it = izcVar2.c.iterator();
                    while (it.hasNext()) {
                        ((iyv) it.next()).b(new izd());
                    }
                    izcVar2.c.clear();
                }
            } else if (izcVar2.f) {
                izcVar2.c.add(iyvVar);
            } else {
                iyvVar.run();
            }
        }
    }
}
