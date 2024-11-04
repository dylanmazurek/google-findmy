package defpackage;

import android.os.SystemClock;
import com.google.android.apps.adm.R;
import j$.time.Duration;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Random;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class egh implements eho {
    public static final jnk a = jnk.l("com/google/android/apps/adm/integrations/android/LocateActionHandler");
    public final efy b;
    public final dvt c;
    public final eze d;
    public final ejj e;
    public final dxf f;
    private final dvn g;
    private final Random h;
    private final lqz i;
    private final lqz j;
    private jer k;
    private jer l;
    private final iil m;
    private final ddg n;
    private final dhx o;

    public egh(efy efyVar, dvt dvtVar, dvn dvnVar, iil iilVar, Random random, lqz lqzVar, dxf dxfVar, ddg ddgVar, dhx dhxVar, eze ezeVar, ejj ejjVar, lqz lqzVar2) {
        jdl jdlVar = jdl.a;
        this.k = jdlVar;
        this.l = jdlVar;
        this.b = efyVar;
        this.c = dvtVar;
        this.g = dvnVar;
        this.m = iilVar;
        this.h = random;
        this.i = lqzVar;
        this.f = dxfVar;
        this.j = lqzVar2;
        this.n = ddgVar;
        this.o = dhxVar;
        this.d = ezeVar;
        this.e = ejjVar;
        efyVar.b.add(new ah(this, 7));
    }

    public static final boolean i(lqr lqrVar) {
        lqq lqqVar = lqrVar.f;
        if (lqqVar == null) {
            lqqVar = lqq.e;
        }
        if (!lqqVar.a.isEmpty()) {
            lqq lqqVar2 = lqrVar.f;
            if (lqqVar2 == null) {
                lqqVar2 = lqq.e;
            }
            if (!lqqVar2.b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private final void j() {
        if (this.l.g()) {
            ((evh) this.l.c()).a();
            this.l = jdl.a;
        }
    }

    private final void k(lqd lqdVar, int i) {
        j();
        this.b.i(lqdVar, new ege(i, 0), 2);
        this.f.c(m(i), jdl.a, lqdVar);
    }

    private static final boolean l(lqr lqrVar) {
        int I = a.I(lqrVar.d);
        if (I != 0 && I == 3) {
            return true;
        }
        return false;
    }

    private static final lnb m(int i) {
        int i2 = i - 1;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_FAILURE;
                        }
                        return lnb.LOCATE_REMOTE_INSTRUCTION_SUPERVISED_GOOGLE_LOCATION_ACCURACY_DISABLED;
                    }
                    return lnb.LOCATE_REMOTE_INSTRUCTION_SUPERVISED_LOCATION_SHARING_DISABLED;
                }
                return lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_USER_NOT_PRIVILEGED;
            }
            return lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_LOCATION_DISABLED;
        }
        return lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_FMD_DISABLED;
    }

    @Override // defpackage.eho
    public final void a(lqd lqdVar) {
        jer f;
        Object b;
        jyz E;
        lpp lppVar;
        jer c = this.b.c(lqdVar);
        if (!c.g()) {
            jni jniVar = (jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "executeAction", 131, "LocateActionHandler.java");
            if (lqdVar.a == 1) {
                lppVar = (lpp) lqdVar.b;
            } else {
                lppVar = lpp.d;
            }
            jniVar.t("Locate action requested for a device that either does not exist or is not an Android: %d", lppVar.b);
            return;
        }
        if (!eyf.k((lqc) c.c()).containsKey(lpk.ANDROID_LOCATE)) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "executeAction", 141, "LocateActionHandler.java")).r("Android device does not support locate action");
            return;
        }
        efp a2 = this.b.a(lqdVar);
        dvt dvtVar = this.c;
        efy efyVar = this.b;
        String b2 = dvtVar.b();
        efyVar.i(lqdVar, new egc(b2, 1), 2);
        if (a2 == null) {
            f = jdl.a;
        } else {
            f = a2.f();
        }
        if (f.g()) {
            this.g.d((String) f.c());
        }
        ljh k = loy.c.k();
        if (ltl.a.a().h()) {
            if (!this.k.g()) {
                this.k = jer.i(eyg.b(this.h));
            }
            b = this.k.c();
        } else {
            b = eyg.b(this.h);
        }
        if (!k.b.y()) {
            k.t();
        }
        ((loy) k.b).a = (lim) b;
        if (((Boolean) c.b(new dvh(16)).e(false)).booleanValue() && this.b.h(lqdVar)) {
            efy efyVar2 = this.b;
            lqc a3 = efyVar2.d.a();
            if (a3 != null) {
                lqd lqdVar2 = a3.d;
                if (lqdVar2 == null) {
                    lqdVar2 = lqd.d;
                }
                lqf b3 = lqf.b(lqdVar2.c);
                if (b3 == null) {
                    b3 = lqf.UNRECOGNIZED;
                }
                if (b3 == lqf.ANDROID_DEVICE && eku.j(a3, efyVar2.a)) {
                    E = jbx.d(jbx.d(((ejo) this.n.a).c()).e(new eil(13), jxv.a)).e(new dyv(k, 3), dti.b);
                    ivc.N(E, new ejf(this, lqdVar, b2, 1), (Executor) this.j.a());
                }
            }
        }
        E = ivc.E((loy) k.q());
        ivc.N(E, new ejf(this, lqdVar, b2, 1), (Executor) this.j.a());
    }

    @Override // defpackage.eho
    public final /* synthetic */ void b(lqd lqdVar, lpo lpoVar) {
        bsg.h(this, lqdVar);
    }

    public final void c(lqr lqrVar, lqd lqdVar) {
        kym kymVar;
        kym kymVar2;
        ljh k = lmv.f.k();
        if (i(lqrVar)) {
            if (!k.b.y()) {
                k.t();
            }
            lmv.c((lmv) k.b);
        } else {
            if (lqrVar.b == 1) {
                kymVar = (kym) lqrVar.c;
            } else {
                kymVar = kym.f;
            }
            if (kymVar.b == 10) {
                if (!k.b.y()) {
                    k.t();
                }
                lmv lmvVar = (lmv) k.b;
                lmvVar.a |= 8;
                lmvVar.c = true;
            }
        }
        if (lqrVar.b == 1) {
            kymVar2 = (kym) lqrVar.c;
        } else {
            kymVar2 = kym.f;
        }
        if ((kymVar2.a & 1) != 0) {
            if (!k.b.y()) {
                k.t();
            }
            lmv lmvVar2 = (lmv) k.b;
            lmvVar2.a |= 16;
            lmvVar2.d = true;
        }
        dxf dxfVar = this.f;
        lnb lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_FAILURE;
        ljh k2 = lmu.i.k();
        if (!k2.b.y()) {
            k2.t();
        }
        lmu lmuVar = (lmu) k2.b;
        lmv lmvVar3 = (lmv) k.q();
        lmvVar3.getClass();
        lmuVar.d = lmvVar3;
        lmuVar.a |= 4;
        dxfVar.c(lnbVar, jer.i((lmu) k2.q()), lqdVar);
    }

    @Override // defpackage.eho
    public final boolean d(lqd lqdVar, boolean z) {
        j();
        if (z) {
            efp a2 = this.b.a(lqdVar);
            if (a2 == null) {
                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "handleActionTimeout", 635, "LocateActionHandler.java")).r("Got timeout for a device without state");
            } else {
                this.b.i(lqdVar, new egc(a2, 0), 2);
                jer f = a2.f();
                if (f.g()) {
                    this.g.c((String) f.c());
                }
                if (!a2.o() && this.b.h(lqdVar)) {
                    this.o.m(R.string.location_error_general);
                }
            }
            return false;
        }
        this.b.i(lqdVar, new egj(1), 2);
        return true;
    }

    @Override // defpackage.eho
    public final boolean e(lqy lqyVar) {
        lpt lptVar;
        lpt lptVar2;
        lln llnVar;
        kym kymVar;
        lpt lptVar3;
        kym kymVar2;
        jer jerVar;
        kym kymVar3;
        lnb lnbVar;
        int i;
        boolean z;
        lqc lqcVar = lqyVar.b;
        if (lqcVar == null) {
            lqcVar = lqc.j;
        }
        lqd lqdVar = lqcVar.d;
        if (lqdVar == null) {
            lqdVar = lqd.d;
        }
        jer c = this.b.c(lqdVar);
        boolean z2 = true;
        if (!c.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "handleActionStateUpdate", 237, "LocateActionHandler.java")).r("Got location state update for unknown device");
            return true;
        }
        efp a2 = this.b.a(lqdVar);
        lqt lqtVar = lqyVar.a;
        if (lqtVar == null) {
            lqtVar = lqt.h;
        }
        String str = lqtVar.e;
        if (a2 != null && a2.f().g() && str.equals(a2.f().c())) {
            lqc lqcVar2 = (lqc) c.c();
            if (lqcVar2.b == 3) {
                lptVar = (lpt) lqcVar2.c;
            } else {
                lptVar = lpt.C;
            }
            lqc lqcVar3 = lqyVar.b;
            if (lqcVar3 == null) {
                lqcVar3 = lqc.j;
            }
            if (lqcVar3.b == 3) {
                lptVar2 = (lpt) lqcVar3.c;
            } else {
                lptVar2 = lpt.C;
            }
            lqe b = lqe.b(lptVar2.t);
            if (b == null) {
                b = lqe.UNRECOGNIZED;
            }
            int ordinal = b.ordinal();
            if (ordinal != 0) {
                if (ordinal != 3 && ordinal != 4) {
                    if (ordinal != 5) {
                        switch (ordinal) {
                            case 14:
                                k(lqdVar, 4);
                                return true;
                            case 15:
                                k(lqdVar, 5);
                                return true;
                            case 16:
                                k(lqdVar, 6);
                                return true;
                            default:
                                g(lqdVar, 7);
                                return true;
                        }
                    }
                    g(lqdVar, 2);
                    return true;
                }
                g(lqdVar, 3);
                return true;
            }
            if ((lptVar.a & 1) != 0) {
                lqr lqrVar = lptVar.b;
                if (lqrVar == null) {
                    lqrVar = lqr.g;
                }
                if ((lqrVar.a & 1) != 0) {
                    if (!a2.p() || l(lqrVar)) {
                        if (l(lqrVar)) {
                            dvn dvnVar = this.g;
                            synchronized (dvnVar.a) {
                                dvm dvmVar = (dvm) dvnVar.b.get(str);
                                if (dvmVar != null && dvmVar.b.g()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            if (z) {
                                this.g.c(str);
                            }
                        }
                        lqq lqqVar = lqrVar.f;
                        if (lqqVar == null) {
                            lqqVar = lqq.e;
                        }
                        if (lqqVar.b.isEmpty()) {
                            llnVar = lqrVar.e;
                            if (llnVar == null) {
                                llnVar = lln.c;
                            }
                        } else {
                            lqq lqqVar2 = lqrVar.f;
                            if (lqqVar2 == null) {
                                lqqVar2 = lqq.e;
                            }
                            llnVar = (lln) hzc.W(lqqVar2.b);
                        }
                        jer i2 = a2.i();
                        if (i2.g() && lmi.a((lln) i2.c(), llnVar) > 0) {
                            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "updateStateIfNewer", 311, "LocateActionHandler.java")).r("Newly received location is older than previously received");
                            this.f.c(lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_STALE_LOCATION, jdl.a, lqdVar);
                            return false;
                        }
                        int i3 = lqrVar.b;
                        if (a.w(i3) == 3) {
                            if (!a2.e().g()) {
                                ((jni) ((jni) a.g()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "updateStateIfNewer", 321, "LocateActionHandler.java")).r("Cannot decrypt location due to missing encryption key for the device");
                                return false;
                            }
                            lim limVar = (lim) a2.e().c();
                            ljh k = lmv.f.k();
                            jer a3 = eyg.a(lqrVar, limVar);
                            if (a3.g()) {
                                int I = a.I(lqrVar.d);
                                if (I == 0) {
                                    I = 1;
                                }
                                int i4 = I - 2;
                                if (i4 != 0) {
                                    if (i4 != 1) {
                                        if (i4 != 2) {
                                            if (i4 == 3) {
                                                ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "getAndroidLocationSource", 580, "LocateActionHandler.java")).r("Unexpected LOCATION_SOURCE_SPOT_HISTORY in Android locate flow");
                                            }
                                        } else {
                                            i = 3;
                                        }
                                    } else {
                                        i = 2;
                                    }
                                    h(lqdVar, llnVar, i, (lps) a3.c());
                                    this.f.a(lnb.LOCATION_UPDATE_DISPLAYED, lqdVar, str);
                                } else {
                                    ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "getAndroidLocationSource", 583, "LocateActionHandler.java")).r("Unexpected LOCATION_SOURCE_UNKNOWN in Android locate flow");
                                }
                                i = 1;
                                h(lqdVar, llnVar, i, (lps) a3.c());
                                this.f.a(lnb.LOCATION_UPDATE_DISPLAYED, lqdVar, str);
                            } else {
                                if (!k.b.y()) {
                                    k.t();
                                }
                                lmv lmvVar = (lmv) k.b;
                                lmvVar.a |= 4;
                                lmvVar.b = true;
                            }
                            int I2 = a.I(lqrVar.d);
                            if (I2 == 0) {
                                I2 = 1;
                            }
                            int i5 = I2 - 2;
                            if (i5 != 1) {
                                if (i5 != 2) {
                                    if (i5 != 3) {
                                        lnbVar = null;
                                    } else {
                                        lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_SPOT_LAST_KNOWN_LOCATION;
                                    }
                                } else {
                                    lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_LAST_KNOWN_LOCATION;
                                }
                            } else {
                                lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_LIVE_LOCATION;
                            }
                            if (lnbVar != null) {
                                long seconds = Duration.ofMillis(System.currentTimeMillis()).minusSeconds(lmi.c(llnVar)).toSeconds();
                                if (!k.b.y()) {
                                    k.t();
                                }
                                lmv lmvVar2 = (lmv) k.b;
                                lmvVar2.a |= 32;
                                lmvVar2.e = seconds;
                                dxf dxfVar = this.f;
                                ljh k2 = lmu.i.k();
                                if (!k2.b.y()) {
                                    k2.t();
                                }
                                lmu lmuVar = (lmu) k2.b;
                                lmv lmvVar3 = (lmv) k.q();
                                lmvVar3.getClass();
                                lmuVar.d = lmvVar3;
                                lmuVar.a |= 4;
                                dxfVar.c(lnbVar, jer.i((lmu) k2.q()), lqdVar);
                                return false;
                            }
                            return false;
                        }
                        if (i3 == 1) {
                            kymVar = (kym) lqrVar.c;
                        } else {
                            kymVar = kym.f;
                        }
                        if (kymVar.b != 10 && !i(lqrVar)) {
                            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "updateStateIfNewer", 335, "LocateActionHandler.java")).r("Missing location in update");
                            dxf dxfVar2 = this.f;
                            lnb lnbVar2 = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_NO_LOCATION;
                            ljh k3 = lmu.i.k();
                            ljh k4 = lmv.f.k();
                            if (lqrVar.b == 1) {
                                kymVar3 = (kym) lqrVar.c;
                            } else {
                                kymVar3 = kym.f;
                            }
                            int i6 = kymVar3.a & 1;
                            if (!k4.b.y()) {
                                k4.t();
                            }
                            if (1 != i6) {
                                z2 = false;
                            }
                            lmv lmvVar4 = (lmv) k4.b;
                            lmvVar4.a |= 16;
                            lmvVar4.d = z2;
                            if (!k3.b.y()) {
                                k3.t();
                            }
                            lmu lmuVar2 = (lmu) k3.b;
                            lmv lmvVar5 = (lmv) k4.q();
                            lmvVar5.getClass();
                            lmuVar2.d = lmvVar5;
                            lmuVar2.a |= 4;
                            dxfVar2.c(lnbVar2, jer.i((lmu) k3.q()), lqdVar);
                            return false;
                        }
                        lqc lqcVar4 = (lqc) this.b.c(lqdVar).c();
                        if (lqcVar4.b == 3) {
                            lptVar3 = (lpt) lqcVar4.c;
                        } else {
                            lptVar3 = lpt.C;
                        }
                        lpz lpzVar = lptVar3.u;
                        if (lpzVar == null) {
                            lpzVar = lpz.e;
                        }
                        kyf kyfVar = lpzVar.b;
                        if (kyfVar == null) {
                            kyfVar = kyf.r;
                        }
                        kyf kyfVar2 = kyfVar;
                        if (lqrVar.b == 1) {
                            kymVar2 = (kym) lqrVar.c;
                        } else {
                            kymVar2 = kym.f;
                        }
                        if (kymVar2.b == 10) {
                            lln llnVar2 = lqrVar.e;
                            if (llnVar2 == null) {
                                llnVar2 = lln.c;
                            }
                            jerVar = jer.i(new iif(kymVar2, llnVar2));
                        } else {
                            jerVar = jdl.a;
                        }
                        jer jerVar2 = jerVar;
                        lqq lqqVar3 = lqrVar.f;
                        if (lqqVar3 == null) {
                            lqqVar3 = lqq.e;
                        }
                        Stream mapToObj = IntStream.CC.range(0, lqqVar3.a.size()).mapToObj(new eiz(lqqVar3, 1));
                        int i7 = jis.d;
                        ivc.N(this.m.b(kyfVar2, jerVar2, (jis) mapToObj.collect(jgr.a), lqqVar3.c, new egd(this, lqqVar3, 0)), new egg(this, lqrVar, lqdVar, str), (Executor) this.j.a());
                        return false;
                    }
                    return false;
                }
                ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "updateStateIfNewer", 295, "LocateActionHandler.java")).r("Missing location timestamp.");
                return false;
            }
            ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "handleActionStateUpdate", 255, "LocateActionHandler.java")).r("Missing androidInfo.location in update with RESPONSE_NO_ERROR");
            return false;
        }
        ((jni) ((jni) a.f()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "handleActionStateUpdate", 246, "LocateActionHandler.java")).r("Unexpected missing or mismatching currentLocateRequestId");
        return false;
    }

    public final void f() {
        jer b = this.b.b();
        if (b.g() && !((bym) this.i.a()).z((lqc) b.c()) && eyf.k((lqc) b.c()).containsKey(lpk.ANDROID_LOCATE)) {
            efy efyVar = this.b;
            lqd lqdVar = ((lqc) b.c()).d;
            if (lqdVar == null) {
                lqdVar = lqd.d;
            }
            efp a2 = efyVar.a(lqdVar);
            if (a2 != null && !a2.f().g()) {
                jer g = a2.g();
                if (!g.g() || SystemClock.elapsedRealtime() - ((Long) g.c()).longValue() >= Duration.ofSeconds(ltl.a.a().a()).toMillis() || a2.n()) {
                    lqd lqdVar2 = ((lqc) b.c()).d;
                    if (lqdVar2 == null) {
                        lqdVar2 = lqd.d;
                    }
                    a(lqdVar2);
                }
            }
        }
    }

    public final void g(lqd lqdVar, int i) {
        this.b.i(lqdVar, new ege(i, 1), 2);
        this.f.c(m(i), jdl.a, lqdVar);
    }

    public final void h(lqd lqdVar, final lln llnVar, final int i, final lps lpsVar) {
        if (i == 6) {
            if (this.b.h(lqdVar)) {
                dhx dhxVar = this.o;
                exu a2 = evj.a();
                a2.a = true;
                a2.b = fma.bV(lua.h());
                a2.g(Duration.ofSeconds(10L));
                this.l = jer.i(dhxVar.l(R.string.spot_approximate_location_snackbar, null, a2.e()));
            }
        } else {
            j();
        }
        this.b.i(lqdVar, new efx() { // from class: egf
            @Override // defpackage.efx
            public final void a(efn efnVar) {
                boolean z;
                efnVar.c = jer.i(lps.this);
                efnVar.d = jer.i(llnVar);
                int i2 = i;
                efnVar.j = i2;
                boolean z2 = true;
                efnVar.i = 1;
                if (i2 != 2) {
                    z = true;
                } else {
                    z = false;
                }
                efnVar.e(z);
                if (i2 != 2) {
                    z2 = false;
                }
                efnVar.g(z2);
                efnVar.f(Long.valueOf(SystemClock.elapsedRealtime()));
            }
        }, 2);
    }
}
