package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bff {
    public static final /* synthetic */ int a = 0;
    private static final AtomicInteger b = new AtomicInteger(0);

    public static final int a() {
        return b.addAndGet(1);
    }
}
