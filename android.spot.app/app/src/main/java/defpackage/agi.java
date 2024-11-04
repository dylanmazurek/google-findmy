package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class agi extends aoe {
    public Object a;

    public agi(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aoe
    public final aoe a() {
        return new agi(this.a);
    }

    @Override // defpackage.aoe
    public final void b(aoe aoeVar) {
        aoeVar.getClass();
        this.a = ((agi) aoeVar).a;
    }
}
