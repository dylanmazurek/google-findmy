package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dml implements ThreadFactory {
    public final boolean a;
    private final String b;
    private final AtomicInteger c = new AtomicInteger();

    public dml(String str, boolean z) {
        this.b = str;
        this.a = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        dmk dmkVar = new dmk(new cui(this, runnable, 4, (char[]) null));
        dmkVar.setName("glide-" + this.b + "-thread-" + this.c.getAndIncrement());
        return dmkVar;
    }
}
