package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkj extends gkm {
    private final gjk c;

    public gkj(gjk gjkVar) {
        this.c = gjkVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_FETCH_LATEST_THREADS";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        if (goaVar == null) {
            return i();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION");
        return this.c.d(goaVar, Long.valueOf(j), lgd.b(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", lgd.FETCH_REASON_UNSPECIFIED.p)), lgqVar);
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "FetchLatestThreadsCallback";
    }
}
