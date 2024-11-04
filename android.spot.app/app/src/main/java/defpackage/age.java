package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class age extends aoe {
    public int a;

    public age(int i) {
        this.a = i;
    }

    @Override // defpackage.aoe
    public final aoe a() {
        return new age(this.a);
    }

    @Override // defpackage.aoe
    public final void b(aoe aoeVar) {
        aoeVar.getClass();
        this.a = ((age) aoeVar).a;
    }
}
