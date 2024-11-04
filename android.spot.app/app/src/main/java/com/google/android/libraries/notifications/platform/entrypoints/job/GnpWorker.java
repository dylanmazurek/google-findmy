package com.google.android.libraries.notifications.platform.entrypoints.job;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.bym;
import defpackage.cpn;
import defpackage.cpy;
import defpackage.dwj;
import defpackage.goy;
import defpackage.gqp;
import defpackage.jol;
import defpackage.joo;
import defpackage.mko;
import defpackage.mmx;
import defpackage.mpd;

/* compiled from: PG */
/* loaded from: classes.dex */
public class GnpWorker extends CoroutineWorker {
    private static final joo f = joo.m("GnpSdk");
    public goy e;
    private final WorkerParameters g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GnpWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.g = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(mmx mmxVar) {
        mko mkoVar = (mko) gqp.a(this.a).j().get(GnpWorker.class);
        if (mkoVar != null) {
            Object a = mkoVar.a();
            a.getClass();
            goy goyVar = (goy) ((dwj) ((bym) a).a).U.a();
            this.e = goyVar;
            if (goyVar == null) {
                mpd.b("gnpWorkerHandler");
                goyVar = null;
            }
            WorkerParameters workerParameters = this.g;
            cpn cpnVar = workerParameters.b;
            cpnVar.getClass();
            return goyVar.a(cpnVar, workerParameters.c, mmxVar);
        }
        ((jol) f.g()).r("Failed to inject dependencies.");
        return new cpy();
    }
}
