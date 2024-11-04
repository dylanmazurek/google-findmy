package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkf implements gka {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final gyq c;
    private final lqz d;
    private final lqz e;
    private final gkr f;
    private final gvg g;
    private final lqz h;
    private final lqz i;
    private final lqz j;
    private final lqz k;
    private final lqz l;
    private final lqz m;
    private final lqz n;
    private final lqz o;

    static {
        Charset.forName("UTF-8");
    }

    public gkf(Context context, gyq gyqVar, lqz lqzVar, lqz lqzVar2, gkr gkrVar, gvg gvgVar, lqz lqzVar3, lqz lqzVar4, lqz lqzVar5, lqz lqzVar6, lqz lqzVar7, lqz lqzVar8, lqz lqzVar9, lqz lqzVar10) {
        this.b = context;
        this.c = gyqVar;
        this.d = lqzVar;
        this.e = lqzVar2;
        this.f = gkrVar;
        this.g = gvgVar;
        this.h = lqzVar3;
        this.i = lqzVar4;
        this.j = lqzVar5;
        this.k = lqzVar6;
        this.l = lqzVar7;
        this.m = lqzVar8;
        this.n = lqzVar9;
        this.o = lqzVar10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:            if (((defpackage.gna) defpackage.jyr.b(((defpackage.hri) r14.d.a()).y(r2, r15.b(), r19, r20), java.util.concurrent.ExecutionException.class)).g() == false) goto L10;     */
    /* JADX WARN: Type inference failed for: r0v17, types: [msw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final defpackage.gfx e(defpackage.goa r15, int r16, defpackage.lqz r17, defpackage.lqz r18, android.os.Bundle r19, java.lang.Long r20) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gkf.e(goa, int, lqz, lqz, android.os.Bundle, java.lang.Long):gfx");
    }

    @Override // defpackage.gka
    public final gfx a(goa goaVar, lgp lgpVar) {
        ijs.b();
        hwx.J(true);
        Bundle bundle = new Bundle();
        frx.V(bundle, goaVar);
        bundle.putInt("com.google.android.libraries.notifications.REGISTRATION_REASON", lgpVar.o);
        return e(goaVar, 1, this.n, this.j, bundle, null);
    }

    @Override // defpackage.gka
    public final void b(goa goaVar, long j, lgd lgdVar) {
        boolean z;
        ijs.b();
        if (goaVar != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        Bundle bundle = new Bundle();
        frx.V(bundle, goaVar);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", lgdVar.p);
        if (!frx.aK(this.b)) {
            gyp gypVar = (gyp) this.i.a();
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/scheduled/impl/ChimeScheduledRpcHelperImpl", "fetchUpdatedThreads", 206, "ChimeScheduledRpcHelperImpl.java")).u("App not targeting Android O. Calling [%s] RPC in the current thread.", gypVar.c());
            gypVar.b(bundle);
            return;
        }
        e(goaVar, 2, this.m, this.i, bundle, null);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x009d. Please report as an issue. */
    @Override // defpackage.gka
    public final void c(goa goaVar, lgz lgzVar, String str, int i, ghr ghrVar, List list) {
        boolean z;
        int i2;
        ijs.b();
        if (goaVar != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        hwx.J(!list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            lfm lfmVar = (lfm) it.next();
            ljh k = gxi.g.k();
            if (!k.b.y()) {
                k.t();
            }
            gxi gxiVar = (gxi) k.b;
            lfmVar.getClass();
            gxiVar.b();
            gxiVar.b.add(lfmVar);
            if (!k.b.y()) {
                k.t();
            }
            ljn ljnVar = k.b;
            gxi gxiVar2 = (gxi) ljnVar;
            lgzVar.getClass();
            gxiVar2.c = lgzVar;
            gxiVar2.a |= 1;
            if (!ljnVar.y()) {
                k.t();
            }
            ljn ljnVar2 = k.b;
            gxi gxiVar3 = (gxi) ljnVar2;
            str.getClass();
            int i3 = 4;
            gxiVar3.a |= 4;
            gxiVar3.e = str;
            int i4 = i - 1;
            if (i != 0) {
                if (i4 != 0) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                if (!ljnVar2.y()) {
                    k.t();
                }
                gxi gxiVar4 = (gxi) k.b;
                gxiVar4.d = i2 - 1;
                gxiVar4.a |= 2;
                switch (ghrVar.a) {
                    case REMOVE_REASON_UNKNOWN:
                    default:
                        i3 = 1;
                        break;
                    case CLICKED_IN_SYSTEM_TRAY:
                    case ACTION_CLICK_IN_SYSTEM_TRAY:
                    case DISMISSED_IN_SYSTEM_TRAY:
                    case CLICKED_IN_INBOX:
                    case ACTION_CLICK_IN_INBOX:
                    case DISMISSED_IN_INBOX:
                        i3 = 2;
                        break;
                    case DISMISSED_REMOTE:
                    case ACCOUNT_DATA_CLEANED:
                        i3 = 5;
                        break;
                    case DISMISSED_BY_API:
                        i3 = 6;
                        break;
                    case EXPIRED:
                        break;
                    case LIMIT_REACHED:
                        i3 = 3;
                        break;
                }
                if (!k.b.y()) {
                    k.t();
                }
                gxi gxiVar5 = (gxi) k.b;
                gxiVar5.f = i3 - 1;
                gxiVar5.a |= 8;
                this.f.a(goaVar, 100, ((gxi) k.q()).g());
            } else {
                throw null;
            }
        }
        Bundle bundle = new Bundle();
        frx.V(bundle, goaVar);
        e(goaVar, 100, this.o, this.k, bundle, 5000L);
    }

    @Override // defpackage.gka
    public final void d(goa goaVar, lgd lgdVar) {
        boolean z;
        ijs.b();
        if (goaVar != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        Bundle bundle = new Bundle();
        frx.V(bundle, goaVar);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0L);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", lgdVar.p);
        if (!frx.aK(this.b)) {
            gyp gypVar = (gyp) this.h.a();
            ((jol) a.k().j("com/google/android/libraries/notifications/internal/scheduled/impl/ChimeScheduledRpcHelperImpl", "fetchLatestThreads", 237, "ChimeScheduledRpcHelperImpl.java")).u("App not targeting Android O. Calling [%s] RPC in the current thread.", gypVar.c());
            gypVar.b(bundle);
            return;
        }
        e(goaVar, 2, this.l, this.h, bundle, null);
    }
}
