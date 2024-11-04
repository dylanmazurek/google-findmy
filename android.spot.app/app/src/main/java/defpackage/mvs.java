package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mvs extends mnl {
    /* synthetic */ Object a;
    final /* synthetic */ mvu b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvs(mvu mvuVar, mmx mmxVar) {
        super(mmxVar);
        this.b = mvuVar;
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object f = mvu.f(this.b, this);
        if (f == mne.a) {
            return f;
        }
        return new mwc(f);
    }
}
