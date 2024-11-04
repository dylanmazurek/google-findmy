package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agf extends aod implements adq, ann {
    private age a;

    public agf(int i) {
        age ageVar = new age(i);
        if (amy.b()) {
            age ageVar2 = new age(i);
            ageVar2.f = 1;
            ageVar.g = ageVar2;
        }
        this.a = ageVar;
    }

    @Override // defpackage.agt
    public final /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // defpackage.adq
    public final int b() {
        return ((age) anm.j(this.a, this)).a;
    }

    @Override // defpackage.adq
    public final /* synthetic */ Integer c() {
        return Integer.valueOf(b());
    }

    @Override // defpackage.aoc
    public final aoe d() {
        return this.a;
    }

    @Override // defpackage.aoc
    public final void e(aoe aoeVar) {
        aoeVar.getClass();
        this.a = (age) aoeVar;
    }

    @Override // defpackage.adq
    public final void f(int i) {
        amz b;
        age ageVar = (age) anm.e(this.a);
        if (ageVar.a != i) {
            age ageVar2 = this.a;
            synchronized (anm.c) {
                b = anm.b();
                ((age) anm.i(ageVar2, this, b, ageVar)).a = i;
            }
            anm.t(b, this);
        }
    }

    @Override // defpackage.adq
    public final /* synthetic */ void g(int i) {
        f(i);
    }

    @Override // defpackage.adt
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        g(((Number) obj).intValue());
    }

    @Override // defpackage.ann
    public final agk i() {
        return agw.a;
    }

    @Override // defpackage.aod, defpackage.aoc
    public final aoe j(aoe aoeVar, aoe aoeVar2, aoe aoeVar3) {
        if (((age) aoeVar2).a == ((age) aoeVar3).a) {
            return aoeVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((age) anm.e(this.a)).a + ")@" + hashCode();
    }
}
