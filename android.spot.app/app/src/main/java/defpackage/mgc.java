package defpackage;

import java.lang.Thread;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mgc implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public mgc(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.b != 0) {
            fdn fdnVar = ((fcn) this.a).d;
            if (fdnVar != null) {
                fdnVar.v("Job execution failed", th);
                return;
            }
            return;
        }
        lzz lzzVar = ((mgu) this.a).h;
        mgu.a.logp(Level.SEVERE, "io.grpc.internal.ManagedChannelImpl$3", "uncaughtException", "[" + String.valueOf(lzzVar) + "] Uncaught exception in the SynchronizationContext. Panic!", th);
        mgu mguVar = (mgu) this.a;
        if (mguVar.u) {
            return;
        }
        mguVar.u = true;
        mguVar.e(true);
        mguVar.i(false);
        mguVar.j(new mgb(th));
        mguVar.H.d(null);
        mguVar.F.a(4, "PANIC! Entering TRANSIENT_FAILURE");
        mguVar.o.a(lze.TRANSIENT_FAILURE);
    }
}
