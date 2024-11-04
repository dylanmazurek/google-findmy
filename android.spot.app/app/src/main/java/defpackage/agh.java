package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agh extends aod implements adr, ann {
    private agg a;

    public agh(long j) {
        agg aggVar = new agg(j);
        if (amy.b()) {
            agg aggVar2 = new agg(j);
            aggVar2.f = 1;
            aggVar.g = aggVar2;
        }
        this.a = aggVar;
    }

    @Override // defpackage.agt
    public final /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // defpackage.adr, defpackage.adi
    public final long b() {
        return ((agg) anm.j(this.a, this)).a;
    }

    @Override // defpackage.adr
    public final /* synthetic */ Long c() {
        return Long.valueOf(b());
    }

    @Override // defpackage.aoc
    public final aoe d() {
        return this.a;
    }

    @Override // defpackage.aoc
    public final void e(aoe aoeVar) {
        aoeVar.getClass();
        this.a = (agg) aoeVar;
    }

    @Override // defpackage.adr
    public final void f(long j) {
        amz b;
        agg aggVar = (agg) anm.e(this.a);
        if (aggVar.a != j) {
            agg aggVar2 = this.a;
            synchronized (anm.c) {
                b = anm.b();
                ((agg) anm.i(aggVar2, this, b, aggVar)).a = j;
            }
            anm.t(b, this);
        }
    }

    @Override // defpackage.adr
    public final /* synthetic */ void g(long j) {
        f(j);
    }

    @Override // defpackage.adt
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        g(((Number) obj).longValue());
    }

    @Override // defpackage.ann
    public final agk i() {
        return agw.a;
    }

    @Override // defpackage.aod, defpackage.aoc
    public final aoe j(aoe aoeVar, aoe aoeVar2, aoe aoeVar3) {
        if (((agg) aoeVar2).a == ((agg) aoeVar3).a) {
            return aoeVar2;
        }
        return null;
    }

    public final String toString() {
        return "MutableLongState(value=" + ((agg) anm.e(this.a)).a + ")@" + hashCode();
    }
}
