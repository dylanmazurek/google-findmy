package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elm {
    private static final jnk a = jnk.l("com/google/android/apps/adm/integrations/spot/SpotRingRequestRouterImpl");
    private final ejt b;
    private final dxf c;
    private final esf d;
    private final ilv e;
    private final apc f;

    public elm(ilv ilvVar, dxf dxfVar, fma fmaVar, apc apcVar, ejt ejtVar, esf esfVar) {
        ilvVar.getClass();
        dxfVar.getClass();
        fmaVar.getClass();
        apcVar.getClass();
        ejtVar.getClass();
        esfVar.getClass();
        this.e = ilvVar;
        this.c = dxfVar;
        this.f = apcVar;
        this.b = ejtVar;
        this.d = esfVar;
    }

    public final void a(final lqd lqdVar, final kyh kyhVar, boolean z, kzl kzlVar) {
        lnb lnbVar;
        lpk lpkVar;
        boolean z2;
        lnb lnbVar2;
        final boolean z3;
        boolean z4;
        lqdVar.getClass();
        ekl d = this.e.d(lqdVar);
        if (z) {
            lnbVar = lnb.RING_REQUESTED;
        } else {
            lnbVar = lnb.STOP_RINGING_REQUESTED;
        }
        this.c.c(lnbVar, jdl.a, lqdVar);
        if (d.c() != 1 || (d.m == ifj.STOPPED && this.f.n(lqdVar).get(kyhVar) != eis.IN_RANGE)) {
            if (kzlVar != null) {
                ((jni) a.g().j("com/google/android/apps/adm/integrations/spot/SpotRingRequestRouterImpl", "makeDeviceRing", 91, "SpotRingRequestRouter.kt")).r("Remote ringing requested with RingingVolume provided.");
            }
            ejt ejtVar = this.b;
            if (z) {
                lpkVar = lpk.SPOT_MAKE_SOUND;
            } else {
                lpkVar = lpk.SPOT_STOP_SOUND;
            }
            ejtVar.a(lqdVar, lpkVar);
            return;
        }
        jer jerVar = d.l;
        if (jerVar.g()) {
            if (!d.j.g()) {
                jer jerVar2 = d.k;
                if (jerVar2.g() && ((kzi) jerVar2.c()).a == 1) {
                    z4 = true;
                    hwx.U(z4);
                    ejt ejtVar2 = this.b;
                    ejtVar2.a.d((String) jerVar.c());
                }
            }
            z4 = false;
            hwx.U(z4);
            ejt ejtVar22 = this.b;
            ejtVar22.a.d((String) jerVar.c());
        }
        this.e.k(lqdVar, new ell(0), false);
        final esf esfVar = this.d;
        final jer h = jer.h(kzlVar);
        if (esfVar.h.d(lqdVar).c() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.U(z2);
        jer e = esfVar.h.e();
        if (e.g()) {
            kyf kyfVar = esfVar.b.a((lqc) e.c()).b;
            if (kyfVar == null) {
                kyfVar = kyf.r;
            }
            kyq kyqVar = kyfVar.f;
            if (kyqVar == null) {
                kyqVar = kyq.g;
            }
            int e2 = kzv.e(kyqVar.b);
            if (e2 != 0) {
                if (e2 == 4) {
                    dxf dxfVar = esfVar.g;
                    if (z) {
                        lnbVar2 = lnb.RING_LOCAL_INSTRUCTION_ISSUED;
                        z3 = true;
                    } else {
                        lnbVar2 = lnb.STOP_RINGING_LOCAL_INSTRUCTION_ISSUED;
                        z3 = false;
                    }
                    dxfVar.c(lnbVar2, jdl.a, lqdVar);
                    if (z3 || !esfVar.c()) {
                        if (z3) {
                            esfVar.h.k(lqdVar, new ell(3), false);
                        }
                        esfVar.a(new buc() { // from class: esb
                            @Override // defpackage.buc
                            public final void a(Object obj) {
                                long x;
                                jer jerVar3 = h;
                                esf esfVar2 = esf.this;
                                ilv ilvVar = esfVar2.h;
                                lqd lqdVar2 = lqdVar;
                                esm esmVar = (esm) obj;
                                if (!ilvVar.o(lqdVar2)) {
                                    ((jni) ((jni) esf.a.f()).j("com/google/android/apps/adm/integrations/spot/ringing/BleRingingHandlerImpl", "makeDeviceRingLocally", 147, "BleRingingHandlerImpl.java")).r("Request to ring device was not cancelled when the device selection changed, ignoring.");
                                    return;
                                }
                                kyf kyfVar2 = esfVar2.b.a((lqc) esfVar2.h.e().c()).b;
                                if (kyfVar2 == null) {
                                    kyfVar2 = kyf.r;
                                }
                                kyf kyfVar3 = kyfVar2;
                                kyh kyhVar2 = kyhVar;
                                boolean z5 = z3;
                                synchronized (esfVar2.d) {
                                    if (z5) {
                                        lqf b = lqf.b(lqdVar2.c);
                                        if (b == null) {
                                            b = lqf.UNRECOGNIZED;
                                        }
                                        if (b == lqf.ANDROID_DEVICE) {
                                            x = lua.a.a().c();
                                        } else {
                                            x = lua.a.a().x();
                                        }
                                        Duration ofMillis = Duration.ofMillis(x);
                                        jdl jdlVar = jdl.a;
                                        jer i = jer.i(kyfVar3.e);
                                        int d2 = ((lim) ((jeu) i).a).d();
                                        boolean z6 = true;
                                        if (d2 != 16 && d2 != 8) {
                                            z6 = false;
                                        }
                                        hwx.U(z6);
                                        ibl iblVar = new ibl(i, jdlVar);
                                        kyl kylVar = kyfVar3.c;
                                        if (kylVar == null) {
                                            kylVar = kyl.j;
                                        }
                                        kzl b2 = kzl.b(kylVar.i);
                                        if (b2 == null) {
                                            b2 = kzl.UNRECOGNIZED;
                                        }
                                        esfVar2.f = jer.i(esmVar.e(kyfVar3, iblVar, (kzl) jerVar3.e(b2), kyhVar2, ofMillis, new ese(esfVar2, lqdVar2)));
                                    } else {
                                        kxv kxvVar = kyfVar3.b;
                                        if (kxvVar == null) {
                                            kxvVar = kxv.b;
                                        }
                                        esmVar.d(kxvVar.a, kyhVar2, jdl.a).d();
                                        esfVar2.f = jdl.a;
                                    }
                                }
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
            throw null;
        }
    }
}
