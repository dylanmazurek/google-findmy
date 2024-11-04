package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cfm extends cfn {
    public final qd h;

    public cfm() {
        this.h = new qd();
    }

    @Override // defpackage.cfk
    public void b() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((cfl) ((pz) ((qb) it).next()).b).b();
        }
    }

    @Override // defpackage.cfk
    public void c() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((cfl) ((pz) ((qb) it).next()).b).c();
        }
    }

    public final void o(cfk cfkVar, cfo cfoVar) {
        if (cfkVar != null) {
            cfl cflVar = new cfl(cfkVar, cfoVar);
            cfl cflVar2 = (cfl) this.h.f(cfkVar, cflVar);
            if (cflVar2 != null && cflVar2.b != cfoVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            }
            if (cflVar2 == null && m()) {
                cflVar.b();
                return;
            }
            return;
        }
        throw new NullPointerException("source cannot be null");
    }

    public cfm(Object obj) {
        super(obj);
        this.h = new qd();
    }
}
