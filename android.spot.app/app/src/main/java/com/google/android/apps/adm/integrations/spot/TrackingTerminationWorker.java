package com.google.android.apps.adm.integrations.spot;

import android.content.Context;
import androidx.work.WorkerParameters;
import defpackage.cpy;
import defpackage.cqa;
import defpackage.cqb;
import defpackage.emg;
import defpackage.ivc;
import defpackage.jni;
import defpackage.jnk;
import defpackage.jyz;
import defpackage.kxv;
import defpackage.lja;
import defpackage.ljn;
import defpackage.ljy;
import defpackage.lqd;
import defpackage.lqu;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class TrackingTerminationWorker extends cqb {
    public static final jnk e = jnk.l("com/google/android/apps/adm/integrations/spot/TrackingTerminationWorker");
    private final WorkerParameters f;
    private final emg g;

    public TrackingTerminationWorker(Context context, WorkerParameters workerParameters, emg emgVar) {
        super(context, workerParameters);
        this.f = workerParameters;
        this.g = emgVar;
    }

    public static String c(lqd lqdVar) {
        lqu lquVar;
        if (lqdVar.a == 3) {
            lquVar = (lqu) lqdVar.b;
        } else {
            lquVar = lqu.c;
        }
        kxv kxvVar = lquVar.b;
        if (kxvVar == null) {
            kxvVar = kxv.b;
        }
        return "tracking_termination_worker".concat(String.valueOf(kxvVar.a));
    }

    @Override // defpackage.cqb
    public final jyz b() {
        lqu lquVar;
        if (h()) {
            return ivc.E(new cqa());
        }
        byte[] e2 = this.f.b.e("device_identifier");
        if (e2 == null) {
            ((jni) ((jni) e.f()).j("com/google/android/apps/adm/integrations/spot/TrackingTerminationWorker", "startWork", 103, "TrackingTerminationWorker.java")).r("deviceIdentifier is null");
            return ivc.E(new cpy());
        }
        try {
            ljn m = ljn.m(lqd.d, e2, 0, e2.length, lja.a());
            ljn.A(m);
            lqd lqdVar = (lqd) m;
            this.g.c(lqdVar);
            jni jniVar = (jni) ((jni) e.e()).j("com/google/android/apps/adm/integrations/spot/TrackingTerminationWorker", "startWork", 116, "TrackingTerminationWorker.java");
            if (lqdVar.a == 3) {
                lquVar = (lqu) lqdVar.b;
            } else {
                lquVar = lqu.c;
            }
            kxv kxvVar = lquVar.b;
            if (kxvVar == null) {
                kxvVar = kxv.b;
            }
            jniVar.u("Stopped tracking %s", kxvVar.a);
            return ivc.E(new cqa());
        } catch (ljy e3) {
            ((jni) ((jni) ((jni) e.f()).i(e3)).j("com/google/android/apps/adm/integrations/spot/TrackingTerminationWorker", "startWork", 'p', "TrackingTerminationWorker.java")).r("Error parsing DeviceIdentifier.");
            return ivc.E(new cpy());
        }
    }
}
