package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public interface jzc extends ExecutorService {
    jyz b(Callable callable);

    jyz cP(Runnable runnable);

    jyz cQ(Runnable runnable, Object obj);
}
