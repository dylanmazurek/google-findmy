package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
final class egg implements jyj {
    final /* synthetic */ lqr a;
    final /* synthetic */ lqd b;
    final /* synthetic */ String c;
    final /* synthetic */ egh d;

    public egg(egh eghVar, lqr lqrVar, lqd lqdVar, String str) {
        this.a = lqrVar;
        this.b = lqdVar;
        this.c = str;
        this.d = eghVar;
    }

    @Override // defpackage.jyj
    public final void a(Throwable th) {
        ((jni) ((jni) ((jni) egh.a.g()).i(th)).j("com/google/android/apps/adm/integrations/android/LocateActionHandler$2", "onFailure", (char) 475, "LocateActionHandler.java")).r("Could not decrypt location");
        this.d.c(this.a, this.b);
    }

    @Override // defpackage.jyj
    public final /* synthetic */ void b(Object obj) {
        kym kymVar;
        int I;
        int i;
        lnb lnbVar;
        kym kymVar2;
        lpt lptVar;
        iid iidVar = (iid) obj;
        jer jerVar = iidVar.a;
        if (!jerVar.g()) {
            ((jni) ((jni) egh.a.g()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler$2", "onSuccess", 424, "LocateActionHandler.java")).r("Could not decrypt location");
            this.d.c(this.a, this.b);
            return;
        }
        egh eghVar = this.d;
        lqd lqdVar = this.b;
        lqr lqrVar = this.a;
        if (iidVar.b) {
            lln llnVar = ((iie) jerVar.c()).b;
            lln llnVar2 = lqrVar.e;
            if (llnVar2 == null) {
                llnVar2 = lln.c;
            }
            if (!llnVar.equals(llnVar2)) {
                ((jni) ((jni) egh.a.e()).j("com/google/android/apps/adm/integrations/android/LocateActionHandler", "uploadLocationIfWasAggregated", 533, "LocateActionHandler.java")).r("Uploading aggregated location");
                ejj ejjVar = eghVar.e;
                lqc lqcVar = (lqc) eghVar.b.c(lqdVar).c();
                if (lqcVar.b == 3) {
                    lptVar = (lpt) lqcVar.c;
                } else {
                    lptVar = lpt.C;
                }
                lpz lpzVar = lptVar.u;
                if (lpzVar == null) {
                    lpzVar = lpz.e;
                }
                kyf kyfVar = lpzVar.b;
                if (kyfVar == null) {
                    kyfVar = kyf.r;
                }
                ejjVar.a(kyfVar, kyh.DEVICE_COMPONENT_UNSPECIFIED, (iie) iidVar.a.c());
            }
        }
        if (iidVar.b) {
            I = 5;
        } else {
            lqr lqrVar2 = this.a;
            if (lqrVar2.b == 1) {
                kymVar = (kym) lqrVar2.c;
            } else {
                kymVar = kym.f;
            }
            I = a.I(kymVar.e);
            if (I == 0) {
                I = 1;
            }
        }
        egh eghVar2 = this.d;
        lqd lqdVar2 = this.b;
        lln llnVar3 = ((iie) iidVar.a.c()).b;
        int i2 = I - 2;
        if (i2 != -1 && i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 6;
                } else {
                    i = 5;
                }
            } else {
                i = 4;
            }
        } else {
            i = 1;
        }
        kyu kyuVar = ((iie) iidVar.a.c()).a;
        double d = kyuVar.a;
        double d2 = kyuVar.b;
        ljh k = lps.d.k();
        ljh k2 = lnr.c.k();
        if (!k2.b.y()) {
            k2.t();
        }
        ljn ljnVar = k2.b;
        ((lnr) ljnVar).a = d / 1.0E7d;
        if (!ljnVar.y()) {
            k2.t();
        }
        ((lnr) k2.b).b = d2 / 1.0E7d;
        if (!k.b.y()) {
            k.t();
        }
        lps lpsVar = (lps) k.b;
        lnr lnrVar = (lnr) k2.q();
        lnrVar.getClass();
        lpsVar.b = lnrVar;
        lpsVar.a |= 1;
        float f = kyuVar.c;
        if (!k.b.y()) {
            k.t();
        }
        ((lps) k.b).c = f;
        eghVar2.h(lqdVar2, llnVar3, i, (lps) k.q());
        this.d.f.a(lnb.LOCATION_UPDATE_DISPLAYED, this.b, this.c);
        if (i2 != -1 && i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_AGGREGATED_CROWDSOURCED_LOCATION;
                } else {
                    lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_CROWDSOURCED_LOCATION;
                }
            } else {
                lnbVar = lnb.LOCATE_REMOTE_INSTRUCTION_RESULT_LAST_KNOWN_LOCATION;
            }
        } else {
            lnbVar = lnb.UNKNOWN_EVENT_TYPE;
        }
        if (lnbVar != null) {
            ljh k3 = lmv.f.k();
            if (egh.i(this.a) && I != 5) {
                if (!k3.b.y()) {
                    k3.t();
                }
                lmv.c((lmv) k3.b);
            }
            if (iidVar.c) {
                if (!k3.b.y()) {
                    k3.t();
                }
                lmv.h((lmv) k3.b);
            }
            lqr lqrVar3 = this.a;
            if (lqrVar3.b == 1) {
                kymVar2 = (kym) lqrVar3.c;
            } else {
                kymVar2 = kym.f;
            }
            if ((kymVar2.a & 1) != 0) {
                if (!k3.b.y()) {
                    k3.t();
                }
                lmv lmvVar = (lmv) k3.b;
                lmvVar.a |= 16;
                lmvVar.d = true;
            }
            long seconds = Duration.ofMillis(System.currentTimeMillis()).minusSeconds(lmi.c(((iie) iidVar.a.c()).b)).toSeconds();
            if (!k3.b.y()) {
                k3.t();
            }
            lmv lmvVar2 = (lmv) k3.b;
            lmvVar2.a |= 32;
            lmvVar2.e = seconds;
            egh eghVar3 = this.d;
            ljh k4 = lmu.i.k();
            if (!k4.b.y()) {
                k4.t();
            }
            dxf dxfVar = eghVar3.f;
            lmu lmuVar = (lmu) k4.b;
            lmv lmvVar3 = (lmv) k3.q();
            lmvVar3.getClass();
            lmuVar.d = lmvVar3;
            lmuVar.a |= 4;
            dxfVar.c(lnbVar, jer.i((lmu) k4.q()), this.b);
        }
    }
}
