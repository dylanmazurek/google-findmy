package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bqu {
    public static Executor a(Context context) {
        Executor mainExecutor;
        mainExecutor = context.getMainExecutor();
        return mainExecutor;
    }
}
