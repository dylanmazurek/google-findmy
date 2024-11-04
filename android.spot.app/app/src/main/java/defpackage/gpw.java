package defpackage;

import android.content.BroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpw {
    private static final joo a = joo.m("GnpSdk");
    private final BroadcastReceiver.PendingResult b;
    private final boolean c;
    private final int d;
    private boolean e;

    public gpw(BroadcastReceiver.PendingResult pendingResult, boolean z, int i) {
        this.b = pendingResult;
        this.c = z;
        this.d = i;
    }

    public final synchronized void a() {
        if (this.e) {
            ((jol) a.k().j("com/google/android/libraries/notifications/platform/executor/BroadcastAsyncOperation", "finish", 29, "BroadcastAsyncOperation.java")).s("Already finished BroadcastAsyncOperation [%d]", this.d);
            return;
        }
        if (this.c) {
            this.b.setResultCode(-1);
        }
        this.b.finish();
        this.e = true;
        ((jol) a.k().j("com/google/android/libraries/notifications/platform/executor/BroadcastAsyncOperation", "finish", 41, "BroadcastAsyncOperation.java")).s("Finished BroadcastAsyncOperation [%d]", this.d);
    }

    public final String toString() {
        return "BroadcastAsyncOperation{executionId=" + this.d + "}";
    }
}
