package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkk extends gkm {
    private final gjk c;
    private final ddg d;

    public gkk(gjk gjkVar, ddg ddgVar) {
        this.c = gjkVar;
        this.d = ddgVar;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "RPC_FETCH_UPDATED_THREADS";
    }

    @Override // defpackage.gkm
    public final gjj g(Bundle bundle, lgq lgqVar, goa goaVar) {
        if (goaVar == null) {
            return i();
        }
        long j = bundle.getLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION");
        lgd b = lgd.b(bundle.getInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", lgd.FETCH_REASON_UNSPECIFIED.p));
        ddg ddgVar = this.d;
        kuv kuvVar = new kuv((char[]) null, (byte[]) null);
        kuvVar.y("last_updated__version");
        kuvVar.z(">?", Long.valueOf(j));
        return this.c.e(goaVar, j, ggk.b(((gla) ddgVar.a).a(goaVar, jis.q(kuvVar.x()))), b, lgqVar);
    }

    @Override // defpackage.gkm
    protected final String h() {
        return "FetchUpdatedThreadsCallback";
    }
}
