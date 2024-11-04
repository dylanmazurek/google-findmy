package defpackage;

import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public class agd extends aod implements adp, ann {
    private agc a;

    public agd(float f) {
        agc agcVar = new agc(f);
        if (amy.b()) {
            agc agcVar2 = new agc(f);
            agcVar2.f = 1;
            agcVar.g = agcVar2;
        }
        this.a = agcVar;
    }

    @Override // defpackage.agt
    public final /* bridge */ /* synthetic */ Object a() {
        return c();
    }

    @Override // defpackage.adp, defpackage.acu
    public final float b() {
        return ((agc) anm.j(this.a, this)).a;
    }

    @Override // defpackage.adp
    public final /* synthetic */ Float c() {
        return Float.valueOf(b());
    }

    @Override // defpackage.aoc
    public final aoe d() {
        return this.a;
    }

    @Override // defpackage.aoc
    public final void e(aoe aoeVar) {
        aoeVar.getClass();
        this.a = (agc) aoeVar;
    }

    @Override // defpackage.adp
    public final void f(float f) {
        amz b;
        agc agcVar = (agc) anm.e(this.a);
        float f2 = agcVar.a;
        if (Build.VERSION.SDK_INT >= 23) {
            if (f2 == f) {
                return;
            }
        } else if (!alh.a(f2) && !alh.a(f) && f2 == f) {
            return;
        }
        agc agcVar2 = this.a;
        synchronized (anm.c) {
            b = anm.b();
            ((agc) anm.i(agcVar2, this, b, agcVar)).a = f;
        }
        anm.t(b, this);
    }

    @Override // defpackage.adp
    public final /* synthetic */ void g(float f) {
        f(f);
    }

    @Override // defpackage.adt
    public final /* bridge */ /* synthetic */ void h(Object obj) {
        g(((Number) obj).floatValue());
    }

    @Override // defpackage.ann
    public final agk i() {
        return agw.a;
    }

    @Override // defpackage.aod, defpackage.aoc
    public final aoe j(aoe aoeVar, aoe aoeVar2, aoe aoeVar3) {
        float f = ((agc) aoeVar2).a;
        float f2 = ((agc) aoeVar3).a;
        if (Build.VERSION.SDK_INT >= 23) {
            if (f != f2) {
                return null;
            }
        } else if (alh.a(f) || alh.a(f2) || f != f2) {
            return null;
        }
        return aoeVar2;
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((agc) anm.e(this.a)).a + ")@" + hashCode();
    }
}
