package defpackage;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kok implements kqz {
    private final /* synthetic */ int a;

    @Override // defpackage.kqz
    public final Object a() {
        int i = this.a;
        if (i == 0) {
            return null;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return Executors.newSingleThreadScheduledExecutor(new kor("Firebase Scheduler", 0, null));
                    }
                    return ExecutorsRegistrar.a(Executors.newCachedThreadPool(new kor("Firebase Blocking", 11, null)));
                }
                return ExecutorsRegistrar.a(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new kor("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())));
            }
            StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
            if (Build.VERSION.SDK_INT >= 23) {
                detectNetwork.detectResourceMismatches();
                if (Build.VERSION.SDK_INT >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
            }
            return ExecutorsRegistrar.a(Executors.newFixedThreadPool(4, new kor("Firebase Background", 10, detectNetwork.penaltyLog().build())));
        }
        return Collections.emptySet();
    }
}
