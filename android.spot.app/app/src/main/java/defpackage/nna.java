package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nna implements Executor {
    private final /* synthetic */ int a;
    private final Object b;

    public nna(Executor executor, int i) {
        this.a = i;
        this.b = executor;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Executor, java.lang.Object] */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a != 0) {
            ((Handler) this.b).post(runnable);
            return;
        }
        nmz nmzVar = new nmz(runnable, Thread.currentThread());
        this.b.execute(nmzVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = nmzVar.b;
        if (inlineExecutionProhibitedException == null) {
            nmzVar.a = null;
            return;
        }
        throw inlineExecutionProhibitedException;
    }

    public nna(int i) {
        this.a = i;
        this.b = new Handler(Looper.getMainLooper());
    }
}
