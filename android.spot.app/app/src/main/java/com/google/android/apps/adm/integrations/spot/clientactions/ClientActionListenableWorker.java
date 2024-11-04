package com.google.android.apps.adm.integrations.spot.clientactions;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.adm.R;
import defpackage.bpm;
import defpackage.cpt;
import defpackage.cqb;
import defpackage.eli;
import defpackage.ihu;
import defpackage.iuu;
import defpackage.ivc;
import defpackage.jnk;
import defpackage.jyz;
import defpackage.lja;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClientActionListenableWorker extends cqb {
    public static final jnk e = jnk.l("com/google/android/apps/adm/integrations/spot/clientactions/ClientActionListenableWorker");
    public final lja f;
    public final ihu g;
    private final Executor h;

    public ClientActionListenableWorker(Context context, WorkerParameters workerParameters, lja ljaVar, ihu ihuVar, Executor executor) {
        super(context, workerParameters);
        this.f = ljaVar;
        this.g = ihuVar;
        this.h = executor;
    }

    @Override // defpackage.cqb
    public final jyz a() {
        bpm bpmVar = new bpm(this.a, "spot-findmydevice-sharing");
        bpmVar.i(this.a.getString(R.string.running_in_background));
        bpmVar.m(R.drawable.ic_notification_fmd);
        return ivc.E(new cpt((int) e().getLeastSignificantBits(), bpmVar.b(), 0));
    }

    @Override // defpackage.cqb
    public final jyz b() {
        return iuu.n(new eli(this, 3), this.h);
    }
}
