package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbi extends FutureTask {
    final /* synthetic */ fbj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fbi(fbj fbjVar, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.a = fbjVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a.a.f;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            Log.e("GAv4", "MeasurementExecutor: job failed with ".concat(String.valueOf(String.valueOf(th))));
        }
        super.setException(th);
    }
}
