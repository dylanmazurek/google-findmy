package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.adm.integrations.spot.clientactions.ClientActionListenableWorker;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class enf extends cqn {
    private final apc a;

    public enf(apc apcVar) {
        this.a = apcVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [mko, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [mko, java.lang.Object] */
    @Override // defpackage.cqn
    public final cqb a(Context context, String str, WorkerParameters workerParameters) {
        if (str.equals(ClientActionListenableWorker.class.getName())) {
            apc apcVar = this.a;
            lja ljaVar = (lja) apcVar.b.a();
            ljaVar.getClass();
            ?? r0 = apcVar.c;
            Object a = apcVar.a.a();
            Executor executor = (Executor) r0.a();
            executor.getClass();
            return new ClientActionListenableWorker(context, workerParameters, ljaVar, (ihu) a, executor);
        }
        return null;
    }
}
