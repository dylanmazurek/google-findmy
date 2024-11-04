package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxn implements Executor {
    final /* synthetic */ eld a;

    public cxn(eld eldVar) {
        this.a = eldVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) this.a.b).post(runnable);
    }
}
