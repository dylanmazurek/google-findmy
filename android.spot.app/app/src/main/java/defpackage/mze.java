package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mze extends mzd {
    protected final mwv d;

    public mze(mwv mwvVar, mnb mnbVar, int i, int i2) {
        super(mnbVar, i, i2);
        this.d = mwvVar;
    }

    @Override // defpackage.mzd, defpackage.mwv
    public final Object a(mww mwwVar, mmx mmxVar) {
        Object e = mzd.e(this, mwwVar, mmxVar);
        if (e == mne.a) {
            return e;
        }
        return mlh.a;
    }

    @Override // defpackage.mzd
    public final Object b(mwi mwiVar, mmx mmxVar) {
        Object d = d(new mzy(mwiVar), mmxVar);
        if (d == mne.a) {
            return d;
        }
        return mlh.a;
    }

    protected abstract Object d(mww mwwVar, mmx mmxVar);

    @Override // defpackage.mzd
    public final String toString() {
        return this.d + " -> " + super.toString();
    }
}
