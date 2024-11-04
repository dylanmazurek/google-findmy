package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class muj extends naz implements muc, mtl, mtz {
    public mun d;

    @Override // defpackage.mtz
    public final mus a() {
        return null;
    }

    @Override // defpackage.mtl
    public final void dc() {
        Object B;
        Object f;
        naz nazVar;
        nbe nbeVar;
        mun e = e();
        do {
            B = e.B();
            if (B instanceof muj) {
                if (B != this) {
                    return;
                }
            } else {
                if (!(B instanceof mtz) || ((mtz) B).a() == null) {
                    return;
                }
                do {
                    f = f();
                    if (f instanceof nbe) {
                        naz nazVar2 = ((nbe) f).a;
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    f.getClass();
                    nazVar = (naz) f;
                    nbeVar = (nbe) nazVar.g.a;
                    if (nbeVar == null) {
                        nbeVar = new nbe(nazVar);
                        nazVar.g.b(nbeVar);
                    }
                } while (!this.e.d(f, nbeVar));
                nazVar.j();
                return;
            }
        } while (!e.d.d(B, muo.g));
    }

    @Override // defpackage.mtz
    public final boolean dd() {
        return true;
    }

    public final mun e() {
        mun munVar = this.d;
        if (munVar != null) {
            return munVar;
        }
        mpd.b("job");
        return null;
    }

    @Override // defpackage.naz
    public final String toString() {
        return msz.a(this) + "@" + msz.b(this) + "[job@" + msz.b(e()) + "]";
    }
}
