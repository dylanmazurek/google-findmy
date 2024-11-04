package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glo implements gkb {
    public static final /* synthetic */ int a = 0;
    private static final joo b = joo.m("GnpSdk");
    private final git c;
    private final goj d;
    private final gil e;
    private final ghf f;
    private final Set g;
    private final mko h;
    private final ddg i;

    public glo(git gitVar, goj gojVar, ddg ddgVar, gil gilVar, ghf ghfVar, Set set, mko mkoVar) {
        this.c = gitVar;
        this.d = gojVar;
        this.i = ddgVar;
        this.e = gilVar;
        this.f = ghfVar;
        this.g = set;
        this.h = mkoVar;
    }

    @Override // defpackage.gkb
    public final void a(goa goaVar, lkq lkqVar, Throwable th) {
        String str;
        jol jolVar = (jol) ((jol) b.k().i(th)).j("com/google/android/libraries/notifications/internal/sync/impl/FetchLatestThreadsCallback", "onFailure", 188, "FetchLatestThreadsCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Fetched latest threads for account: %s (FAILURE)", str);
    }

    @Override // defpackage.gkb
    public final void b(goa goaVar, lkq lkqVar, lkq lkqVar2) {
        String str;
        long j;
        List a2;
        List list;
        boolean z;
        jol jolVar = (jol) b.k().j("com/google/android/libraries/notifications/internal/sync/impl/FetchLatestThreadsCallback", "onSuccess", 86, "FetchLatestThreadsCallback.java");
        if (goaVar != null) {
            str = frx.aN(goaVar.b);
        } else {
            str = "";
        }
        jolVar.u("Fetched latest threads for account: %s (SUCCESS)", str);
        leh lehVar = (leh) lkqVar;
        lei leiVar = (lei) lkqVar2;
        if (goaVar != null) {
            gnz gnzVar = new gnz(goaVar);
            if (lur.c()) {
                j = leiVar.c;
            } else {
                j = leiVar.d;
            }
            gnzVar.i(j);
            lgd b2 = lgd.b(lehVar.f);
            if (b2 == null) {
                b2 = lgd.FETCH_REASON_UNSPECIFIED;
            }
            if (b2 == lgd.GUNS_MIGRATION && goaVar.m == 0) {
                gnzVar.d(leiVar.d);
            }
            goa a3 = gnzVar.a();
            this.d.e(jis.q(a3));
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                ((gxb) it.next()).d();
            }
            ArrayList arrayList = new ArrayList();
            ddg ddgVar = this.i;
            kuv kuvVar = new kuv((char[]) null, (byte[]) null);
            kuvVar.y("1");
            jis a4 = ((gla) ddgVar.a).a(a3, jis.q(kuvVar.x()));
            int i = ((jmi) a4).c;
            for (int i2 = 0; i2 < i; i2++) {
                ggk ggkVar = (ggk) a4.get(i2);
                if (ggkVar.t != 2) {
                    arrayList.add(ggkVar.a);
                }
            }
            gil gilVar = this.e;
            ljh k = lgz.f.k();
            if (!k.b.y()) {
                k.t();
            }
            lgz lgzVar = (lgz) k.b;
            lgzVar.c = 2;
            lgzVar.a = 2 | lgzVar.a;
            lgz lgzVar2 = (lgz) k.q();
            gji gjiVar = new gji();
            gjiVar.d(lct.DISMISSED_REMOTE);
            gilVar.b(a3, arrayList, lgzVar2, 4, gjiVar.c());
            ddg ddgVar2 = this.i;
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            if (strArr.length != 0) {
                ((gla) ddgVar2.a).e(a3, glc.b(new kuv((char[]) null, (byte[]) null).x(), "thread_id", strArr));
            }
            if (!((jer) ((lsi) this.h).b).g()) {
                ((jol) ((jol) b.g()).j("com/google/android/libraries/notifications/internal/sync/impl/FetchLatestThreadsCallback", "getFrontendNotificationThreadList", 171, "FetchLatestThreadsCallback.java")).r("FetchEncryptionHandler is not present");
                a2 = jis.o(leiVar.a);
            } else {
                grk grkVar = (grk) ((jer) ((lsi) this.h).b).c();
                ljv ljvVar = leiVar.a;
                ljv ljvVar2 = leiVar.b;
                a2 = grl.a(grkVar, ljvVar);
            }
            if (!a2.isEmpty()) {
                long micros = TimeUnit.MILLISECONDS.toMicros(fma.i().toEpochMilli());
                ghg b3 = this.f.b(lde.FETCHED_LATEST_THREADS);
                lgd b4 = lgd.b(lehVar.f);
                if (b4 == null) {
                    b4 = lgd.FETCH_REASON_UNSPECIFIED;
                }
                ((ghn) b3).H = gln.d(b4);
                b3.e(a3);
                b3.g(a2);
                b3.h(micros);
                b3.a();
                if (lwb.c()) {
                    List arrayList2 = new ArrayList(a2);
                    Collections.sort(arrayList2, new bfr(9));
                    list = arrayList2;
                } else {
                    list = a2;
                }
                git gitVar = this.c;
                gnd c = gnd.c();
                ghh ghhVar = new ghh(Long.valueOf(micros), Long.valueOf(SystemClock.elapsedRealtime()), lcn.FETCHED_LATEST_THREADS);
                lgd b5 = lgd.b(lehVar.f);
                if (b5 == null) {
                    b5 = lgd.FETCH_REASON_UNSPECIFIED;
                }
                if (b5 == lgd.INBOX) {
                    z = true;
                } else {
                    z = false;
                }
                gitVar.a(a3, list, c, ghhVar, z, false);
            }
        }
    }
}
