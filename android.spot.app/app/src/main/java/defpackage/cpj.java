package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cpj implements ThreadFactory {
    final /* synthetic */ boolean a;
    private final AtomicInteger b = new AtomicInteger(0);

    public cpj(boolean z) {
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str;
        runnable.getClass();
        StringBuilder sb = new StringBuilder();
        if (true != this.a) {
            str = "androidx.work-";
        } else {
            str = "WM.task-";
        }
        sb.append(str);
        sb.append(this.b.incrementAndGet());
        return new Thread(runnable, sb.toString());
    }
}
