package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glp implements gkb {
    public static final /* synthetic */ int a = 0;
    private static final joo b = joo.m("GnpSdk");
    private final git c;
    private final goj d;
    private final ghf e;

    public glp(git gitVar, goj gojVar, ghf ghfVar) {
        this.c = gitVar;
        this.d = gojVar;
        this.e = ghfVar;
    }

    @Override // defpackage.gkb
    public final void a(goa goaVar, lkq lkqVar, Throwable th) {
        String str;
        jol jolVar = (jol) ((jol) b.k().i(th)).j("com/google/android/libraries/notifications/internal/sync/impl/FetchUpdatedThreadsCallback", "onFailure", 114, "FetchUpdatedThreadsCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Fetched updated threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.gkb
    public final void b(goa goaVar, lkq lkqVar, lkq lkqVar2) {
        String str;
        List list;
        lej lejVar = (lej) lkqVar;
        lek lekVar = (lek) lkqVar2;
        jol jolVar = (jol) b.k().j("com/google/android/libraries/notifications/internal/sync/impl/FetchUpdatedThreadsCallback", "onSuccess", 60, "FetchUpdatedThreadsCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.x("Fetched updated threads for account: %s [%d threads](SUCCESS)", str, lekVar.b.size());
        if (goaVar != null) {
            long j = lekVar.c;
            if (j > goaVar.j) {
                gnz gnzVar = new gnz(goaVar);
                gnzVar.i(j);
                goaVar = gnzVar.a();
                this.d.e(jis.q(goaVar));
            }
            goa goaVar2 = goaVar;
            if (lekVar.b.size() > 0) {
                long micros = TimeUnit.MILLISECONDS.toMicros(fma.i().toEpochMilli());
                ghg b2 = this.e.b(lde.FETCHED_UPDATED_THREADS);
                lgd b3 = lgd.b(lejVar.g);
                if (b3 == null) {
                    b3 = lgd.FETCH_REASON_UNSPECIFIED;
                }
                ((ghn) b2).H = gln.d(b3);
                b2.e(goaVar2);
                b2.g(lekVar.b);
                b2.h(micros);
                b2.a();
                List list2 = lekVar.b;
                if (lwb.c()) {
                    List arrayList = new ArrayList(list2);
                    Collections.sort(arrayList, new bfr(10));
                    list = arrayList;
                } else {
                    list = list2;
                }
                this.c.a(goaVar2, list, gnd.c(), new ghh(Long.valueOf(micros), Long.valueOf(SystemClock.elapsedRealtime()), lcn.FETCHED_UPDATED_THREADS), false, false);
            }
        }
    }
}
