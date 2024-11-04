package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvt extends mnl {
    /* synthetic */ Object a;
    final /* synthetic */ mvu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvt(mvu mvuVar, mmx mmxVar) {
        super(mmxVar);
        this.b = mvuVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object g = this.b.g(null, 0, 0L, this);
        if (g == mne.a) {
            return g;
        }
        return new mwc(g);
    }
}
