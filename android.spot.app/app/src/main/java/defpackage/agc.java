package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agc extends aoe {
    public float a;

    public agc(float f) {
        this.a = f;
    }

    @Override // defpackage.aoe
    public final aoe a() {
        return new agc(this.a);
    }

    @Override // defpackage.aoe
    public final void b(aoe aoeVar) {
        aoeVar.getClass();
        this.a = ((agc) aoeVar).a;
    }
}
