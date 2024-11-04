package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwu implements mwv {
    public final moh a;
    public final mol b;
    private final mwv c;

    public mwu(mwv mwvVar, moh mohVar, mol molVar) {
        this.c = mwvVar;
        this.a = mohVar;
        this.b = molVar;
    }

    @Override // defpackage.mwv
    public final Object a(mww mwwVar, mmx mmxVar) {
        mpn mpnVar = new mpn();
        mpnVar.a = mzu.a;
        Object a = this.c.a(new mwt(this, mpnVar, mwwVar, 0), mmxVar);
        if (a == mne.a) {
            return a;
        }
        return mlh.a;
    }
}
