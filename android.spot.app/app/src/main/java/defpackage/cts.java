package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cts implements ctv {
    public final cuj a;

    public cts(cuj cujVar) {
        this.a = cujVar;
    }

    @Override // defpackage.ctv
    public final mwv a(cpl cplVar) {
        cplVar.getClass();
        return new mwq(new cbk(this, (mmx) null, 7));
    }

    @Override // defpackage.ctv
    public final boolean c(cvu cvuVar) {
        if (b(cvuVar) && e(this.a.b())) {
            return true;
        }
        return false;
    }

    public abstract int d();

    public boolean e(Object obj) {
        throw null;
    }
}
