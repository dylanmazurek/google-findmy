package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kst {
    private static final long e = TimeUnit.HOURS.toSeconds(8);
    public final ksh a;
    public final FirebaseMessaging b;
    public final ksr d;
    private final Context f;
    private final ksj g;
    private final ScheduledExecutorService h;
    public final Map c = new rx();
    private boolean i = false;

    public kst(FirebaseMessaging firebaseMessaging, ksj ksjVar, ksr ksrVar, ksh kshVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.b = firebaseMessaging;
        this.g = ksjVar;
        this.d = ksrVar;
        this.a = kshVar;
        this.f = context;
        this.h = scheduledExecutorService;
    }

    public static void a(fxs fxsVar) {
        try {
            fma.q(fxsVar, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            e = e2;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e3);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e4) {
            e = e4;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Runnable runnable, long j) {
        this.h.schedule(runnable, j, TimeUnit.SECONDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void c(boolean z) {
        this.i = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(long j) {
        b(new ksv(this, this.f, this.g, Math.min(Math.max(30L, j + j), e)), j);
        c(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean e() {
        return this.i;
    }
}
