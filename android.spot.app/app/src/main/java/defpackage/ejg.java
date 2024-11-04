package defpackage;

import android.os.SystemClock;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejg implements eho {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/LocateActionHandler");
    static final Duration b = Duration.ofDays(1);
    public final dvt c;
    public final ele d;
    public final Executor e;
    public final jzd f;
    public final eim g;
    public final eze h;
    public final ejj i;
    public jer j = jdl.a;
    public int k = 0;
    public final iil l;
    public final dxf m;
    public final ilv n;
    public final apc o;
    public final dhx p;
    private final Executor q;
    private final ele r;

    public ejg(ilv ilvVar, ewg ewgVar, dvt dvtVar, iil iilVar, ele eleVar, dxf dxfVar, Executor executor, Executor executor2, jzd jzdVar, eim eimVar, apc apcVar, ele eleVar2, dhx dhxVar, eze ezeVar, ejj ejjVar) {
        this.n = ilvVar;
        this.c = dvtVar;
        this.l = iilVar;
        this.d = eleVar;
        this.m = dxfVar;
        this.q = executor;
        this.e = executor2;
        this.f = jzdVar;
        this.g = eimVar;
        this.o = apcVar;
        this.r = eleVar2;
        this.p = dhxVar;
        this.h = ezeVar;
        this.i = ejjVar;
        ilvVar.h(new ah(this, 8));
        ewgVar.g(new dym(this, 13, null));
    }

    public static final lln j(kzb kzbVar) {
        if (kzbVar.e.isEmpty()) {
            lln llnVar = kzbVar.c;
            if (llnVar == null) {
                return lln.c;
            }
            return llnVar;
        }
        return (lln) hzc.W(kzbVar.e);
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        amr.j();
        this.m.c(lnb.ACTION_SPOT_LOCATE_REQUEST_ISSUED, jdl.a, lqdVar);
        if (i(lqdVar)) {
            return;
        }
        ijp.a(jbx.d(this.g.d()).a(Throwable.class, new eil(3), this.q).f(new ejc(this, lqdVar, 0), this.q), "Failed locating device", new Object[0]);
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:            if (r3 != 5) goto L41;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.kzb r7, defpackage.lqd r8, defpackage.jer r9, boolean r10) {
        /*
            Method dump skipped, instructions count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ejg.c(kzb, lqd, jer, boolean):void");
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        this.n.q(lqdVar, new eje(0), 3);
        this.m.c(lnb.ACTION_SPOT_LOCATE_REQUEST_FAILED, jdl.a, lqdVar);
        return true;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        kyx kyxVar;
        final lqc lqcVar = lqyVar.b;
        if (lqcVar == null) {
            lqcVar = lqc.j;
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        hwx.U(i(lqdVar));
        lpy lpyVar = this.r.a(lqcVar).d;
        if (lpyVar == null) {
            lpyVar = lpy.c;
        }
        lqt lqtVar = lqyVar.a;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        final String str = lqtVar.e;
        lqd lqdVar2 = lqcVar.d;
        if (lqdVar2 == null) {
            lqdVar2 = lqd.d;
        }
        if (lpyVar.a == 3) {
            kyxVar = (kyx) lpyVar.b;
        } else {
            kyxVar = kyx.b;
        }
        jiy jiyVar = (jiy) Collection.EL.stream(kyxVar.a).collect(jgr.a(new eff(6), Function$CC.identity()));
        kyf kyfVar = this.r.a(lqcVar).b;
        if (kyfVar == null) {
            kyfVar = kyf.r;
        }
        kyg kygVar = kyfVar.g;
        if (kygVar == null) {
            kygVar = kyg.d;
        }
        int I = a.I(kygVar.c);
        int i = 1;
        if (I == 0) {
            I = 1;
        }
        Stream map = Collection.EL.stream(hqt.k(I)).map(new eka(jiyVar, i)).map(new Function() { // from class: eiy
            public final /* synthetic */ Function andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:            if (defpackage.hzc.au(r0).isAfter(j$.time.Instant.ofEpochMilli(java.lang.System.currentTimeMillis()).minus(defpackage.ejg.b)) == false) goto L27;     */
            /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
            /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0105  */
            /* JADX WARN: Removed duplicated region for block: B:52:0x0110  */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object apply(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 395
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.eiy.apply(java.lang.Object):java.lang.Object");
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = jis.d;
        iuu.q(ivc.B((Iterable) map.collect(jgr.a)), new ejf(this, lqdVar2, lpyVar, 0), this.q);
        return true;
    }

    public final void f() {
        if (this.n.p()) {
            g((lqc) this.n.e().c());
        }
    }

    public final void g(lqc lqcVar) {
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        if (eyf.k((lqc) this.n.e().c()).containsKey(lpk.SPOT_LOCATE)) {
            jer jerVar = this.n.b(lqdVar).d;
            if (jerVar.g() && SystemClock.elapsedRealtime() - ((Long) jerVar.c()).longValue() < TimeUnit.SECONDS.toMillis(lua.a.a().d())) {
                return;
            }
            a(lqdVar);
        }
    }

    public final void h(Runnable runnable) {
        this.q.execute(runnable);
    }

    public final boolean i(lqd lqdVar) {
        if (this.n.b(lqdVar).f.g()) {
            return true;
        }
        return false;
    }
}
