package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.adm.integrations.spot.TrackingTerminationWorker;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elx extends cqn {
    private final ddg a;

    public elx(ddg ddgVar) {
        this.a = ddgVar;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [mko, java.lang.Object] */
    @Override // defpackage.cqn
    public final cqb a(Context context, String str, WorkerParameters workerParameters) {
        if (str.equals(TrackingTerminationWorker.class.getName())) {
            emg emgVar = (emg) this.a.a.a();
            emgVar.getClass();
            return new TrackingTerminationWorker(context, workerParameters, emgVar);
        }
        return null;
    }
}
