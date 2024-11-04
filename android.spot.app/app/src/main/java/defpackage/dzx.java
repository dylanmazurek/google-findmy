package defpackage;

import android.content.pm.CrossProfileApps;
import android.os.Build;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzx extends cgk {
    public final ewg a;
    public final ele b;
    public cfn c;
    public dym e;
    public final apc f;
    public final bym g;
    private final jer h;
    private final jzd i;
    private final ezl l;
    private final ilv m;
    public Integer d = 0;
    private final Object j = new Object();
    private jer k = jdl.a;

    public dzx(bym bymVar, ewg ewgVar, jer jerVar, apc apcVar, ilv ilvVar, ezl ezlVar, ele eleVar, jzd jzdVar) {
        this.g = bymVar;
        this.a = ewgVar;
        this.h = jerVar;
        this.f = apcVar;
        this.m = ilvVar;
        this.l = ezlVar;
        this.b = eleVar;
        this.i = jzdVar;
    }

    public final cfk a() {
        dzu a;
        if (this.c == null) {
            ewg ewgVar = this.a;
            jis c = ewgVar.c();
            if (!ewgVar.y() && !this.a.z() && c != null && !c.isEmpty()) {
                g();
                a = d(c);
            } else {
                dzr a2 = dzu.a();
                a2.d(true);
                a = a2.a();
            }
            this.c = new cfn(a);
        }
        if (this.e == null) {
            dym dymVar = new dym(this, 4);
            this.e = dymVar;
            this.a.g(dymVar);
            this.a.e(this.e);
            this.a.h(this.e);
            this.a.f(this.e);
            this.m.i(this.e);
            etb etbVar = (etb) ((jeu) this.h).a;
            dym dymVar2 = this.e;
            dymVar2.getClass();
            etbVar.b(dymVar2);
        }
        return this.c;
    }

    public final dzt b() {
        jer b;
        if (this.l.b()) {
            ifp ifpVar = new ifp((byte[]) null);
            ifpVar.f(true);
            ezl ezlVar = this.l;
            if (Build.VERSION.SDK_INT < 28) {
                b = jdl.a;
            } else {
                CrossProfileApps m = he$$ExternalSyntheticApiModelOutline0.m(ezlVar.b.getSystemService("crossprofileapps"));
                b = ezl.a(m).b(new ewy(m, 3));
            }
            ifpVar.c = b;
            return ifpVar.e();
        }
        ifp ifpVar2 = new ifp((byte[]) null);
        ifpVar2.f(false);
        return ifpVar2.e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cgk
    public final void c() {
        dym dymVar = this.e;
        if (dymVar != null) {
            this.a.n(dymVar);
            this.a.l(this.e);
            this.a.o(this.e);
            this.a.m(this.e);
            this.m.m(this.e);
            etb etbVar = (etb) ((jeu) this.h).a;
            dym dymVar2 = this.e;
            dymVar2.getClass();
            etbVar.d(dymVar2);
            this.e = null;
        }
        e();
    }

    public final dzu d(jis jisVar) {
        jis jisVar2;
        int i = 1;
        Map map = (Map) Collection.EL.stream(jisVar).map(new egd(this, (jiy) this.h.b(new dvh(7)).e(jmn.a), i)).collect(Collectors.partitioningBy(new eju(i)));
        List list = (List) map.get(false);
        list.getClass();
        jis o = jis.o(list);
        if (lud.a.a().b()) {
            List list2 = (List) map.get(true);
            list2.getClass();
            jisVar2 = jis.o(list2);
        } else {
            jisVar2 = jmi.a;
        }
        dzr a = dzu.a();
        a.b(o);
        a.g(jisVar2);
        a.f(b());
        return a.a();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, jyz] */
    public final void e() {
        synchronized (this.j) {
            if (this.k.g()) {
                this.k.c().cancel(false);
                this.k = jdl.a;
            }
        }
    }

    public final void f() {
        dzu dzuVar;
        cfn cfnVar = this.c;
        if (cfnVar != null) {
            dzuVar = (dzu) cfnVar.d();
        } else {
            dzuVar = null;
        }
        if (dzuVar == null || (!dzuVar.a && !dzuVar.b)) {
            this.a.p();
            cfn cfnVar2 = this.c;
            if (cfnVar2 != null && dzuVar != null) {
                cfnVar2.l(dzuVar.b());
            }
        }
    }

    public final void g() {
        e();
        synchronized (this.j) {
            this.k = jer.i(this.i.schedule(new dzw(this, 0), lua.a.a().h(), TimeUnit.MILLISECONDS));
        }
    }
}
