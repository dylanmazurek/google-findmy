package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmk implements Executor {
    public static final bmk a;
    private static final /* synthetic */ bmk[] b;

    static {
        bmk bmkVar = new bmk();
        a = bmkVar;
        b = new bmk[]{bmkVar};
    }

    private bmk() {
    }

    public static bmk[] values() {
        return (bmk[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
