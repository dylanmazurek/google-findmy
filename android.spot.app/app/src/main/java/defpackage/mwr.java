package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mwr extends mzd {
    private final mol d;

    public mwr(mol molVar, mnb mnbVar, int i, int i2) {
        super(mnbVar, i, i2);
        this.d = molVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object d(mwr mwrVar, mwi mwiVar, mmx mmxVar) {
        Object a = mwrVar.d.a(mwiVar, mmxVar);
        if (a == mne.a) {
            return a;
        }
        return mlh.a;
    }

    @Override // defpackage.mzd
    public Object b(mwi mwiVar, mmx mmxVar) {
        return d(this, mwiVar, mmxVar);
    }

    @Override // defpackage.mzd
    protected mzd c(mnb mnbVar, int i, int i2) {
        return new mwr(this.d, mnbVar, i, i2);
    }

    @Override // defpackage.mzd
    public final String toString() {
        return "block[" + this.d + "] -> " + super.toString();
    }
}
