package defpackage;

import j$.util.Collection;
import java.util.EnumSet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iey implements ibh {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess");
    private static final long m = TimeUnit.HOURS.toSeconds(10);
    public final jzd b;
    public final kyf c;
    public final EnumSet d = EnumSet.noneOf(ihx.class);
    public boolean e = false;
    public jyz f = jyv.a;
    public jer g = jdl.a;
    public boolean h = false;
    public final ici i;
    public final kpb j;
    public final kuv k;
    public final kgf l;
    private ifa n;
    private jyz o;
    private final igo p;
    private final kuv q;

    public iey(ici iciVar, igo igoVar, kuv kuvVar, kuv kuvVar2, kpb kpbVar, jzd jzdVar, kyf kyfVar, kgf kgfVar) {
        this.i = iciVar;
        this.p = igoVar;
        this.k = kuvVar;
        this.q = kuvVar2;
        this.j = kpbVar;
        this.b = jzdVar;
        this.c = kyfVar;
        this.l = kgfVar;
    }

    public static boolean b(jiy jiyVar, jei jeiVar, buc bucVar) {
        jiy jiyVar2 = (jiy) Collection.EL.stream(jiyVar.entrySet()).map(new eka(jeiVar, 10)).filter(new eju(18)).collect(jgr.a(new evl(7), new evl(8)));
        if (!jiyVar2.isEmpty()) {
            bucVar.a(jiyVar2);
            return true;
        }
        return false;
    }

    @Override // defpackage.ibh
    public final void a() {
        if (this.o != null) {
            ((jni) ((jni) a.f()).j("com/google/android/libraries/spot/ble/MulticomponentEddystoneBleTrackerProcess", "start", 109, "MulticomponentEddystoneBleTrackerProcess.java")).r("Ignoring attempt to start after the process was already started, or closed.");
            return;
        }
        kuv kuvVar = this.k;
        kyf kyfVar = this.c;
        njz njzVar = new njz(this, null);
        kxv kxvVar = kyfVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        Object obj = kuvVar.a;
        String str = kxvVar.a;
        igh ighVar = (igh) obj;
        synchronized (ighVar.c) {
            igd igdVar = (igd) ((igh) obj).d.get(str);
            if (igdVar != null && igdVar.g()) {
                try {
                    njzVar.m(((ibu) ivc.M(igdVar.b())).a);
                } catch (ExecutionException unused) {
                }
            }
            ((igh) obj).e.o(str, njzVar);
        }
        this.n = new ifw(ighVar, str, njzVar, 0);
        jyz a2 = this.p.a(this.c, m);
        kuv kuvVar2 = this.q;
        kyq kyqVar = this.c.f;
        if (kyqVar == null) {
            kyqVar = kyq.g;
        }
        jyz s = kuvVar2.s(kyqVar);
        this.o = iuu.F(a2, s).h(new iht(this, s, a2, 1), this.b).a(Throwable.class, new iaf(11), this.b);
    }

    public final jyz c(hot hotVar, lim limVar, boolean z) {
        final jyz k;
        final iex iexVar = new iex(this, z);
        jyz d = bei.d(new icy(iexVar, 7));
        iey ieyVar = iexVar.c;
        kxv kxvVar = ieyVar.c.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        final ibh c = ieyVar.i.c(kxvVar.a, hotVar, iexVar);
        c.a();
        if (!iexVar.a) {
            k = jyv.a;
        } else {
            k = iuu.k(new eli(iexVar, 13), 7L, TimeUnit.SECONDS, iexVar.c.b);
        }
        return jbx.d(jbw.c(new jxl() { // from class: iew
            @Override // defpackage.jxl
            public final Object a(jck jckVar) {
                icc iccVar = new icc(k, c, 2);
                jckVar.e(iccVar, iex.this.c.b);
                return iccVar;
            }
        }, iexVar.c.b).e(new idg((jxd) new hxj(d, 18), 3), iexVar.c.b).f()).f(new gfl(this, limVar, hotVar, 4, (char[]) null), this.b);
    }

    @Override // defpackage.ibh, java.lang.AutoCloseable
    public final void close() {
        jyz jyzVar = this.o;
        if (jyzVar != null) {
            jyzVar.cancel(false);
        }
        ifa ifaVar = this.n;
        if (ifaVar != null) {
            ifaVar.close();
        }
        this.o = jyv.a;
    }
}
