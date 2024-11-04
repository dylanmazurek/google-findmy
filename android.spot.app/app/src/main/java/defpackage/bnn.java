package defpackage;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnn extends bns {
    public bnn(bmw bmwVar) {
        super(bmwVar);
    }

    private final void g(bnj bnjVar) {
        this.i.j.add(bnjVar);
        bnjVar.k.add(this.i);
    }

    @Override // defpackage.bns
    public final void b() {
        bmw bmwVar = this.d;
        if (bmwVar instanceof bmt) {
            bnj bnjVar = this.i;
            bnjVar.b = true;
            bmt bmtVar = (bmt) bmwVar;
            int i = bmtVar.a;
            boolean z = bmtVar.b;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            bnjVar.l = 7;
                            while (i2 < bmtVar.aK) {
                                bmw bmwVar2 = bmtVar.aJ[i2];
                                if (z || bmwVar2.ai != 8) {
                                    bnj bnjVar2 = bmwVar2.i.j;
                                    bnjVar2.j.add(this.i);
                                    this.i.k.add(bnjVar2);
                                }
                                i2++;
                            }
                            g(this.d.i.i);
                            g(this.d.i.j);
                            return;
                        }
                        return;
                    }
                    bnjVar.l = 6;
                    while (i2 < bmtVar.aK) {
                        bmw bmwVar3 = bmtVar.aJ[i2];
                        if (z || bmwVar3.ai != 8) {
                            bnj bnjVar3 = bmwVar3.i.i;
                            bnjVar3.j.add(this.i);
                            this.i.k.add(bnjVar3);
                        }
                        i2++;
                    }
                    g(this.d.i.i);
                    g(this.d.i.j);
                    return;
                }
                bnjVar.l = 5;
                while (i2 < bmtVar.aK) {
                    bmw bmwVar4 = bmtVar.aJ[i2];
                    if (z || bmwVar4.ai != 8) {
                        bnj bnjVar4 = bmwVar4.h.j;
                        bnjVar4.j.add(this.i);
                        this.i.k.add(bnjVar4);
                    }
                    i2++;
                }
                g(this.d.h.i);
                g(this.d.h.j);
                return;
            }
            bnjVar.l = 4;
            while (i2 < bmtVar.aK) {
                bmw bmwVar5 = bmtVar.aJ[i2];
                if (z || bmwVar5.ai != 8) {
                    bnj bnjVar5 = bmwVar5.h.i;
                    bnjVar5.j.add(this.i);
                    this.i.k.add(bnjVar5);
                }
                i2++;
            }
            g(this.d.h.i);
            g(this.d.h.j);
        }
    }

    @Override // defpackage.bns
    public final void c() {
        bmw bmwVar = this.d;
        if (bmwVar instanceof bmt) {
            int i = ((bmt) bmwVar).a;
            if (i != 0 && i != 1) {
                bmwVar.ab = this.i.f;
            } else {
                bmwVar.aa = this.i.f;
            }
        }
    }

    @Override // defpackage.bns
    public final void d() {
        this.e = null;
        this.i.b();
    }

    @Override // defpackage.bns
    public final boolean e() {
        return false;
    }

    @Override // defpackage.bns, defpackage.bnh
    public final void f() {
        bmt bmtVar = (bmt) this.d;
        int i = bmtVar.a;
        Iterator it = this.i.k.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((bnj) it.next()).f;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            this.i.c(i2 + bmtVar.c);
        } else {
            this.i.c(i3 + bmtVar.c);
        }
    }
}
