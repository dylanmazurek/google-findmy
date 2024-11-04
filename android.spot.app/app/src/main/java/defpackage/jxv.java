package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxv implements Executor {
    public static final jxv a;
    private static final /* synthetic */ jxv[] b;

    static {
        jxv jxvVar = new jxv();
        a = jxvVar;
        b = new jxv[]{jxvVar};
    }

    private jxv() {
    }

    public static jxv[] values() {
        return (jxv[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
