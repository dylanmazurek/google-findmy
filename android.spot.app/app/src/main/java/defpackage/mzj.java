package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mzj extends mze {
    public final mom e;

    public mzj(mom momVar, mwv mwvVar, mnb mnbVar, int i, int i2) {
        super(mwvVar, mnbVar, i, i2);
        this.e = momVar;
    }

    @Override // defpackage.mzd
    protected final mzd c(mnb mnbVar, int i, int i2) {
        return new mzj(this.e, this.d, mnbVar, i, i2);
    }

    @Override // defpackage.mze
    protected final Object d(mww mwwVar, mmx mmxVar) {
        boolean z = msy.a;
        Object l = msz.l(new mzi(this, mwwVar, (mmx) null, 0), mmxVar);
        if (l == mne.a) {
            return l;
        }
        return mlh.a;
    }

    public /* synthetic */ mzj(mom momVar, mwv mwvVar) {
        this(momVar, mwvVar, mnc.a, -2, 1);
    }
}
