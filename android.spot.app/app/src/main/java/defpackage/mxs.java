package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mxs implements mww {
    final /* synthetic */ mpn a;
    private final /* synthetic */ int b;

    public mxs(mpn mpnVar, int i) {
        this.b = i;
        this.a = mpnVar;
    }

    @Override // defpackage.mww
    public final Object dt(Object obj, mmx mmxVar) {
        if (this.b != 0) {
            this.a.a = obj;
            throw new myz(this);
        }
        this.a.a = obj;
        throw new myz(this);
    }
}
