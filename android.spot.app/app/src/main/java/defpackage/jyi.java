package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class jyi extends jye implements jzc {
    protected abstract jzc a();

    @Override // defpackage.jye, java.util.concurrent.ExecutorService
    /* renamed from: b */
    public final jyz submit(Callable callable) {
        return a().submit(callable);
    }

    @Override // defpackage.jye, java.util.concurrent.ExecutorService
    /* renamed from: cP */
    public final jyz submit(Runnable runnable) {
        return a().submit(runnable);
    }

    @Override // defpackage.jye, java.util.concurrent.ExecutorService
    /* renamed from: cQ */
    public final jyz submit(Runnable runnable, Object obj) {
        return a().submit(runnable, obj);
    }

    @Override // defpackage.jye
    protected /* bridge */ /* synthetic */ ExecutorService h() {
        throw null;
    }
}
