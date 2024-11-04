package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqy extends mnp implements mol {
    int a;
    final /* synthetic */ agt b;
    final /* synthetic */ mnw c;
    final /* synthetic */ wm d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eqy(wm wmVar, agt agtVar, mnw mnwVar, mmx mmxVar) {
        super(2, mmxVar);
        this.d = wmVar;
        this.b = agtVar;
        this.c = mnwVar;
    }

    @Override // defpackage.mol
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eqy) c((msw) obj, (mmx) obj2)).b(mlh.a);
    }

    @Override // defpackage.mnj
    public final Object b(Object obj) {
        msw mswVar;
        mrl b;
        mne mneVar = mne.a;
        if (this.a != 0) {
            mswVar = (msw) this.e;
            mjo.o(obj);
        } else {
            mjo.o(obj);
            mswVar = (msw) this.e;
        }
        do {
            if (msz.p(mswVar)) {
                this.d.e(this.b.a());
                wm wmVar = this.d;
                wmVar.getClass();
                b = eqz.b(bsn.m((equ) wmVar.b(), (equ) wmVar.c()));
                if (b == null) {
                    this.c.a();
                } else {
                    this.e = mswVar;
                    this.a = 1;
                }
            }
            return mlh.a;
        } while (msz.j(b.c, this) != mneVar);
        return mneVar;
    }

    @Override // defpackage.mnj
    public final mmx c(Object obj, mmx mmxVar) {
        eqy eqyVar = new eqy(this.d, this.b, this.c, mmxVar);
        eqyVar.e = obj;
        return eqyVar;
    }
}
