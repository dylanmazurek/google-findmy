package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agg extends aoe {
    public long a;

    public agg(long j) {
        this.a = j;
    }

    @Override // defpackage.aoe
    public final aoe a() {
        return new agg(this.a);
    }

    @Override // defpackage.aoe
    public final void b(aoe aoeVar) {
        aoeVar.getClass();
        this.a = ((agg) aoeVar).a;
    }
}
