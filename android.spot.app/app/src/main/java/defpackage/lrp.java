package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lrp implements lsc {
    private volatile Object a;
    private final Object b = new Object();
    private final njz c;

    public lrp(njz njzVar) {
        this.c = njzVar;
    }

    @Override // defpackage.lsc
    public final Object r() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    njz njzVar = this.c;
                    lsm lsmVar = dvz.a;
                    this.a = new dwj(new ktf(njzVar.a));
                }
            }
        }
        return this.a;
    }
}
