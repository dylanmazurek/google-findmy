package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agj extends aod implements ann {
    public final agk a;
    private agi b;

    public agj(Object obj, agk agkVar) {
        this.a = agkVar;
        agi agiVar = new agi(obj);
        if (amy.b()) {
            agi agiVar2 = new agi(obj);
            agiVar2.f = 1;
            agiVar.g = agiVar2;
        }
        this.b = agiVar;
    }

    @Override // defpackage.adt, defpackage.agt
    public final Object a() {
        return ((agi) anm.j(this.b, this)).a;
    }

    @Override // defpackage.aoc
    public final aoe d() {
        return this.b;
    }

    @Override // defpackage.aoc
    public final void e(aoe aoeVar) {
        aoeVar.getClass();
        this.b = (agi) aoeVar;
    }

    @Override // defpackage.adt
    public final void h(Object obj) {
        amz b;
        agi agiVar = (agi) anm.e(this.b);
        if (!this.a.a(agiVar.a, obj)) {
            agi agiVar2 = this.b;
            synchronized (anm.c) {
                b = anm.b();
                ((agi) anm.i(agiVar2, this, b, agiVar)).a = obj;
            }
            anm.t(b, this);
        }
    }

    @Override // defpackage.ann
    public final agk i() {
        return this.a;
    }

    @Override // defpackage.aod, defpackage.aoc
    public final aoe j(aoe aoeVar, aoe aoeVar2, aoe aoeVar3) {
        if (this.a.a(((agi) aoeVar2).a, ((agi) aoeVar3).a)) {
            return aoeVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableState(value=" + ((agi) anm.e(this.b)).a + ")@" + hashCode();
    }
}
