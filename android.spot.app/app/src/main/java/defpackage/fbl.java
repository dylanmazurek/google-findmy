package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fbl extends Thread {
    public fbl(Runnable runnable, String str) {
        super(runnable, str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
