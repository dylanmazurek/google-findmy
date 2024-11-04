package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bnm extends bns {
    public bnm(bmw bmwVar) {
        super(bmwVar);
        bmwVar.h.d();
        bmwVar.i.d();
        this.g = ((bna) bmwVar).as;
    }

    private final void g(bnj bnjVar) {
        this.i.j.add(bnjVar);
        bnjVar.k.add(this.i);
    }

    @Override // defpackage.bns
    public final void b() {
        bmw bmwVar = this.d;
        bna bnaVar = (bna) bmwVar;
        int i = bnaVar.b;
        int i2 = bnaVar.c;
        float f = bnaVar.a;
        if (bnaVar.as == 1) {
            if (i != -1) {
                this.i.k.add(bmwVar.V.h.i);
                this.d.V.h.i.j.add(this.i);
                this.i.e = i;
            } else if (i2 != -1) {
                this.i.k.add(bmwVar.V.h.j);
                this.d.V.h.j.j.add(this.i);
                this.i.e = -i2;
            } else {
                bnj bnjVar = this.i;
                bnjVar.b = true;
                bnjVar.k.add(bmwVar.V.h.j);
                this.d.V.h.j.j.add(this.i);
            }
            g(this.d.h.i);
            g(this.d.h.j);
            return;
        }
        if (i != -1) {
            this.i.k.add(bmwVar.V.i.i);
            this.d.V.i.i.j.add(this.i);
            this.i.e = i;
        } else if (i2 != -1) {
            this.i.k.add(bmwVar.V.i.j);
            this.d.V.i.j.j.add(this.i);
            this.i.e = -i2;
        } else {
            bnj bnjVar2 = this.i;
            bnjVar2.b = true;
            bnjVar2.k.add(bmwVar.V.i.j);
            this.d.V.i.j.j.add(this.i);
        }
        g(this.d.i.i);
        g(this.d.i.j);
    }

    @Override // defpackage.bns
    public final void c() {
        bmw bmwVar = this.d;
        if (((bna) bmwVar).as == 1) {
            bmwVar.aa = this.i.f;
        } else {
            bmwVar.ab = this.i.f;
        }
    }

    @Override // defpackage.bns
    public final void d() {
        this.i.b();
    }

    @Override // defpackage.bns
    public final boolean e() {
        return false;
    }

    @Override // defpackage.bns, defpackage.bnh
    public final void f() {
        bnj bnjVar = this.i;
        if (bnjVar.c && !bnjVar.i) {
            this.i.c((int) ((((bnj) bnjVar.k.get(0)).f * ((bna) this.d).a) + 0.5f));
        }
    }
}
