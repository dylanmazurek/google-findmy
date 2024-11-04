package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class erk extends mnp implements mol {
    int a;
    final /* synthetic */ adp b;
    final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public erk(adp adpVar, float f, mmx mmxVar) {
        super(2, mmxVar);
        this.b = adpVar;
        this.c = f;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((erk) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        mne mneVar = mne.a;
        int i = this.a;
        mjo.o(obj);
        if (i == 0) {
            long j = eqz.a;
            this.a = 1;
            if (msz.j(j, this) == mneVar) {
                return mneVar;
            }
        }
        this.b.f(Math.min(this.c, 0.8f));
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        return new erk(this.b, this.c, mmxVar);
    }
}
