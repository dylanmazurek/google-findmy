package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cqn {
    public abstract cqb a(Context context, String str, WorkerParameters workerParameters);

    public final cqb b(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        cqb a = a(context, str, workerParameters);
        if (a == null) {
            try {
                Class<? extends U> asSubclass = Class.forName(str).asSubclass(cqb.class);
                asSubclass.getClass();
                try {
                    Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                    newInstance.getClass();
                    a = (cqb) newInstance;
                } catch (Throwable th) {
                    cqc.b();
                    Log.e(cqo.a, "Could not instantiate ".concat(str), th);
                    throw th;
                }
            } catch (Throwable th2) {
                cqc.b();
                Log.e(cqo.a, "Invalid class: ".concat(str), th2);
                throw th2;
            }
        }
        if (!a.d) {
            return a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
