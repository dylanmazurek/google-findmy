package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wg extends mnp implements mol {
    float a;
    int b;
    final /* synthetic */ wi c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg(wi wiVar, mmx mmxVar) {
        super(2, mmxVar);
        this.c = wiVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wg) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        msw mswVar;
        float g;
        mne mneVar = mne.a;
        if (this.b != 0) {
            g = this.a;
            mswVar = (msw) this.d;
            mjo.o(obj);
        } else {
            mjo.o(obj);
            mswVar = (msw) this.d;
            g = ra.g(mswVar.b());
        }
        while (msz.p(mswVar)) {
            wf wfVar = new wf(this.c, g);
            this.d = mswVar;
            this.a = g;
            this.b = 1;
            if (adl.b(wfVar, this) == mneVar) {
                return mneVar;
            }
        }
        return mlh.a;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        wg wgVar = new wg(this.c, mmxVar);
        wgVar.d = obj;
        return wgVar;
    }
}
