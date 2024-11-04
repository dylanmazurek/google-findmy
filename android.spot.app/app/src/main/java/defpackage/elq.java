package defpackage;

import android.content.Context;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elq implements edb {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/SpotRingingViewModelDelegate");
    public cfn b = null;
    public ewk c = null;
    public final esf d;
    public final ilv e;
    private final Context f;
    private final lqd g;
    private final kyh h;
    private final ewg i;
    private final ewc j;
    private final lra k;
    private final elm l;
    private final fma m;

    public elq(Context context, ewg ewgVar, ewc ewcVar, fma fmaVar, elm elmVar, esf esfVar, ilv ilvVar, lra lraVar, cfz cfzVar) {
        this.f = context;
        this.i = ewgVar;
        this.j = ewcVar;
        this.m = fmaVar;
        this.l = elmVar;
        this.d = esfVar;
        this.e = ilvVar;
        this.k = lraVar;
        this.g = eyf.h(cfzVar);
        this.h = (kyh) eku.f(cfzVar).e(kyh.DEVICE_COMPONENT_UNSPECIFIED);
    }

    private final ekl g() {
        eix eixVar = (eix) this.j.a(this.g);
        eixVar.getClass();
        return eixVar.c();
    }

    @Override // defpackage.edb
    public final cfk a() {
        cfn cfnVar = this.b;
        cfnVar.getClass();
        return cfnVar;
    }

    @Override // defpackage.edb
    public final void b() {
        if (this.b != null) {
            return;
        }
        final esf esfVar = this.d;
        final lqd lqdVar = this.g;
        final kyh kyhVar = this.h;
        if (esfVar.h.d(lqdVar).m != ifj.STOPPED) {
            synchronized (esfVar.d) {
                if (!esfVar.e.g()) {
                    esfVar.a(new buc() { // from class: esc
                        @Override // defpackage.buc
                        public final void a(Object obj) {
                            kyh kyhVar2 = kyhVar;
                            esf esfVar2 = esf.this;
                            ilv ilvVar = esfVar2.h;
                            lqd lqdVar2 = lqdVar;
                            esm esmVar = (esm) obj;
                            if (!ilvVar.o(lqdVar2)) {
                                ((jni) ((jni) esf.a.f()).j("com/google/android/apps/adm/integrations/spot/ringing/BleRingingHandlerImpl", "startTrackingRingingState", 222, "BleRingingHandlerImpl.java")).r("Request to ring device was not cancelled when the device selection changed, ignoring.");
                                return;
                            }
                            synchronized (esfVar2.d) {
                                kyf kyfVar = esfVar2.b.a((lqc) esfVar2.h.e().c()).b;
                                if (kyfVar == null) {
                                    kyfVar = kyf.r;
                                }
                                kxv kxvVar = kyfVar.b;
                                if (kxvVar == null) {
                                    kxvVar = kxv.b;
                                }
                                esfVar2.f = jer.i(esmVar.d(kxvVar.a, kyhVar2, jer.i(new ese(esfVar2, lqdVar2))));
                            }
                        }
                    });
                }
            }
        }
        this.b = new cfn(c());
        ela elaVar = new ela(this, 3);
        this.c = elaVar;
        this.e.g(elaVar);
        this.k.a(new elp(this, 0));
    }

    public final eda c() {
        jer i;
        jer i2;
        ekl g = g();
        lqc lqcVar = (lqc) eyf.b(this.i.c(), this.g).d(new eft(3));
        eir eirVar = new eir(null, null);
        eirVar.g(false);
        if (g.d() == 1) {
            i = jdl.a;
        } else {
            String str = lqcVar.g;
            if (g().c() == 2) {
                i = jer.i(this.f.getString(R.string.spot_attempting_to_ring_remotely, str));
            } else {
                i = jer.i(this.f.getString(R.string.spot_how_to_stop_ringing, str));
            }
        }
        eirVar.d = i;
        eirVar.e = g.d();
        eirVar.c = g.h;
        eirVar.a = g.h.b(new dyv(g, 18));
        int ordinal = g.m.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (kzv.b(((kzi) g.j.a(g.k).e(kzi.c)).a) == 1) {
                        i2 = jer.i(Integer.valueOf(R.string.connecting));
                    } else {
                        i2 = jdl.a;
                    }
                }
            } else {
                i2 = jdl.a;
            }
            eirVar.b = i2;
            eirVar.h(eyf.k(lqcVar).containsKey(lpk.SPOT_STOP_SOUND));
            return eirVar.f();
        }
        i2 = jer.i(Integer.valueOf(R.string.connecting));
        eirVar.b = i2;
        eirVar.h(eyf.k(lqcVar).containsKey(lpk.SPOT_STOP_SOUND));
        return eirVar.f();
    }

    @Override // defpackage.edb
    public final void d(kzl kzlVar) {
        this.l.a(this.g, this.h, true, kzlVar);
    }

    @Override // defpackage.edb
    public final void e() {
        this.l.a(this.g, this.h, true, null);
    }

    @Override // defpackage.edb
    public final void f() {
        this.l.a(this.g, this.h, false, null);
    }
}
