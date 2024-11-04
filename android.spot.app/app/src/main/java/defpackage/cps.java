package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cps implements Executor {
    public static final cps a;
    private static final /* synthetic */ cps[] b;

    static {
        cps cpsVar = new cps();
        a = cpsVar;
        b = new cps[]{cpsVar};
    }

    private cps() {
    }

    public static cps[] values() {
        return (cps[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
