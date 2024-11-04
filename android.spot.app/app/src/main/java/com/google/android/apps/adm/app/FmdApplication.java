package com.google.android.apps.adm.app;

import android.app.Application;
import android.content.BroadcastReceiver;
import defpackage.cpi;
import defpackage.cqn;
import defpackage.dwl;
import defpackage.dwn;
import defpackage.dwt;
import defpackage.ebg;
import defpackage.eus;
import defpackage.hms;
import defpackage.hph;
import defpackage.hpj;
import defpackage.hsn;
import defpackage.hzh;
import defpackage.jdl;
import defpackage.jer;
import defpackage.jni;
import defpackage.ksr;
import defpackage.lrs;

/* compiled from: PG */
/* loaded from: classes.dex */
public class FmdApplication extends dwl implements cpi {
    public Application.ActivityLifecycleCallbacks a;
    public eus b;
    public hms c;
    public hzh d;
    public dwn e;
    public cqn f;
    public dwt g;
    public ebg h;
    public ksr i;

    static {
        hsn hsnVar = hsn.a;
        if (hsnVar.g == null) {
            hsnVar.g = hpj.a();
        }
    }

    @Override // defpackage.cpi
    public final hph a() {
        lrs lrsVar = new lrs();
        cqn cqnVar = this.f;
        cqnVar.getClass();
        lrsVar.a = cqnVar;
        return new hph(lrsVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:            if (r0.startsWith(":privileged_process") == false) goto L18;     */
    @Override // defpackage.dwl, android.app.Application
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate() {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.adm.app.FmdApplication.onCreate():void");
    }

    @Override // android.app.Application
    public final void onTerminate() {
        dwn dwnVar = this.e;
        jer jerVar = (jer) dwnVar.f.getAndSet(jdl.a);
        if (jerVar.g()) {
            ((jni) ((jni) dwn.a.c()).j("com/google/android/apps/adm/app/SpotChangesHandler", "unregisterBroadcastReceiver", 148, "SpotChangesHandler.java")).r("Unregistering spot changes broadcast receiver.");
            dwnVar.e.unregisterReceiver((BroadcastReceiver) jerVar.c());
        }
        super.onTerminate();
    }
}
