package defpackage;

import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ghe implements gne {
    private static final joo a = joo.m("GnpSdk");
    private final gkr b;
    private final glu c;
    private final ghf d;
    private final Set e;
    private final jzc f;
    private final gok g;
    private final ddg h;

    public ghe(gkr gkrVar, ddg ddgVar, glu gluVar, ghf ghfVar, Set set, gok gokVar, jzc jzcVar) {
        this.b = gkrVar;
        this.h = ddgVar;
        this.c = gluVar;
        this.d = ghfVar;
        this.e = set;
        this.g = gokVar;
        this.f = jzcVar;
    }

    /* JADX WARN: Type inference failed for: r8v4, types: [msw, java.lang.Object] */
    private final synchronized void d(goa goaVar) {
        if (goaVar != null) {
            try {
                gok gokVar = this.g;
                mpd.r(gokVar.b, new dzk(gokVar, goaVar, (mmx) null, 10)).get();
            } catch (InterruptedException | ExecutionException e) {
                ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/internal/accountutil/impl/AccountCleanupUtil", "clearCachedCountsBlocking", '|', "AccountCleanupUtil.java")).r("Failed to clear notifications count cache");
            }
        }
    }

    @Override // defpackage.gne
    public final /* synthetic */ Object a(goa goaVar, mmx mmxVar) {
        Object p = mpd.p(this.f.submit(new eyh(this, goaVar, 6)), mmxVar);
        if (p == mne.a) {
            return p;
        }
        return mlh.a;
    }

    public final synchronized void b(goa goaVar, boolean z) {
        if (!z) {
            ghg b = this.d.b(lde.NOTIFICATION_DATA_CLEANED);
            b.e(goaVar);
            b.a();
        } else {
            if (goaVar == null) {
                this.d.b(lde.ACCOUNT_DATA_CLEANED).a();
                return;
            }
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/accountutil/impl/AccountCleanupUtil", "logToClearcut", 141, "AccountCleanupUtil.java")).u("Account deleted: %s", goaVar.b);
            if (!TextUtils.isEmpty(goaVar.c)) {
                ghg b2 = this.d.b(lde.ACCOUNT_DATA_CLEANED);
                ((ghn) b2).q = goaVar.c;
                b2.a();
            }
        }
    }

    public final synchronized void c(goa goaVar, boolean z) {
        String str;
        if (goaVar == null) {
            str = null;
        } else {
            str = goaVar.b;
        }
        ((jol) a.k().j("com/google/android/libraries/notifications/internal/accountutil/impl/AccountCleanupUtil", "deleteAccountData", 93, "AccountCleanupUtil.java")).u("Notification data deleted: %s", str);
        if (z) {
            b(goaVar, false);
        }
        glu gluVar = this.c;
        gji gjiVar = new gji();
        gjiVar.d(lct.ACCOUNT_DATA_CLEANED);
        gluVar.d(goaVar, gjiVar.c());
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((gxb) it.next()).c();
        }
        this.b.c(goaVar);
        ((gla) this.h.a).d(goaVar);
        d(goaVar);
    }
}
