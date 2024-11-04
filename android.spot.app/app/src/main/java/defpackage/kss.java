package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class kss implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ kss(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseMessaging firebaseMessaging, ksj ksjVar, ksh kshVar, int i) {
        this.f = i;
        this.a = context;
        this.b = scheduledExecutorService;
        this.c = firebaseMessaging;
        this.d = ksjVar;
        this.e = kshVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.lang.Object] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        if (this.f != 0) {
            Object obj = this.a;
            Object obj2 = this.e;
            Object obj3 = this.c;
            ((gpp) this.d).e((lfs) this.b, (goa) obj3, (gpf) obj2, (gnd) obj);
            return null;
        }
        ?? r7 = this.b;
        Context context = (Context) this.a;
        ksr b = ksr.b(context, r7);
        Object obj4 = this.e;
        return new kst((FirebaseMessaging) this.c, (ksj) this.d, b, (ksh) obj4, context, r7);
    }

    public /* synthetic */ kss(gpp gppVar, lfs lfsVar, goa goaVar, gpf gpfVar, gnd gndVar, int i) {
        this.f = i;
        this.d = gppVar;
        this.b = lfsVar;
        this.c = goaVar;
        this.e = gpfVar;
        this.a = gndVar;
    }
}
