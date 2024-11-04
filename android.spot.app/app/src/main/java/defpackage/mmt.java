package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mmt implements mmz {
    private final mna key;

    public mmt(mna mnaVar) {
        mnaVar.getClass();
        this.key = mnaVar;
    }

    @Override // defpackage.mnb
    public Object fold(Object obj, mol molVar) {
        return mjo.x(this, obj, molVar);
    }

    @Override // defpackage.mmz, defpackage.mnb
    public mmz get(mna mnaVar) {
        return mjo.y(this, mnaVar);
    }

    @Override // defpackage.mmz
    public mna getKey() {
        return this.key;
    }

    @Override // defpackage.mnb
    public mnb minusKey(mna mnaVar) {
        return mjo.z(this, mnaVar);
    }

    @Override // defpackage.mnb
    public mnb plus(mnb mnbVar) {
        return mjo.A(this, mnbVar);
    }
}
