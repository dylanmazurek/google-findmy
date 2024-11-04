package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gln implements gll {
    private static final joo a = joo.m("GnpSdk");
    private final gka b;

    public gln(gka gkaVar) {
        this.b = gkaVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(lgd lgdVar) {
        int ordinal = lgdVar.ordinal();
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal != 3) {
                if (ordinal == 5) {
                    return 5;
                }
                if (ordinal != 8) {
                    return 1;
                }
                return 6;
            }
            return 4;
        }
        return 7;
    }

    @Override // defpackage.gll
    public final void a(goa goaVar, Long l, lgd lgdVar) {
        long j = goaVar.j;
        if (j == 0) {
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/sync/impl/ChimeSyncHelperImpl", "fetchUpdatedThreads", 46, "ChimeSyncHelperImpl.java")).u("SYNC request fell back to FULL_SYNC for account [%s]. Account never synced before.", frx.aN(goaVar.b));
            c(goaVar, lgdVar);
        } else if (l != null && j >= l.longValue()) {
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/sync/impl/ChimeSyncHelperImpl", "fetchUpdatedThreads", 57, "ChimeSyncHelperImpl.java")).z("SYNC request ignored for account [%s]. Current version [%d]. Requested version [%d].", frx.aN(goaVar.b), Long.valueOf(goaVar.j), l);
        } else {
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/sync/impl/ChimeSyncHelperImpl", "fetchUpdatedThreads", 69, "ChimeSyncHelperImpl.java")).z("Sending SYNC request for account [%s], current sync version [%d], for reason [%s].", frx.aN(goaVar.b), Long.valueOf(goaVar.j), lgdVar.name());
            this.b.b(goaVar, j, lgdVar);
        }
    }

    @Override // defpackage.gll
    public final void b(goa goaVar, lgz lgzVar, String str, int i, ghr ghrVar, List list) {
        this.b.c(goaVar, lgzVar, str, i, ghrVar, list);
    }

    @Override // defpackage.gll
    public final void c(goa goaVar, lgd lgdVar) {
        this.b.d(goaVar, lgdVar);
    }
}
