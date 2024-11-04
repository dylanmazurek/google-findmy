package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hnq {
    public hnr a;
    public hnj b;
    public final hnp c = new hnp();

    public hnq(hnu hnuVar, hny hnyVar, mko mkoVar) {
        mkoVar.getClass();
        jfe H = hwx.H(new hnn(mkoVar, 0));
        hnr hnrVar = new hnr(new hno(this, H, hnuVar, 1));
        this.a = hnrVar;
        hnuVar.a(hnrVar);
        hnj hnjVar = new hnj(new hno(this, H, hnyVar, 0));
        this.b = hnjVar;
        hnyVar.g.add(hnjVar);
    }

    public final void a(hnl hnlVar) {
        this.c.b.add(hnlVar);
    }

    public final void b(hnl hnlVar) {
        this.c.b.remove(hnlVar);
    }
}
