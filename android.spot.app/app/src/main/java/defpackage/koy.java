package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class koy implements Executor {
    public static final koy a;
    private static final Handler b;
    private static final /* synthetic */ koy[] c;

    static {
        koy koyVar = new koy();
        a = koyVar;
        c = new koy[]{koyVar};
        b = new Handler(Looper.getMainLooper());
    }

    private koy() {
    }

    public static koy[] values() {
        return (koy[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b.post(runnable);
    }
}
