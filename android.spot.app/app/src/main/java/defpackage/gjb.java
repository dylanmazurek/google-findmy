package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjb implements gyp {
    private static final joo a = joo.m("GnpSdk");
    private final gkr b;
    private final goj c;
    private final giw d;

    public gjb(gkr gkrVar, goj gojVar, giw giwVar, fma fmaVar) {
        gkrVar.getClass();
        giwVar.getClass();
        fmaVar.getClass();
        this.b = gkrVar;
        this.c = gojVar;
        this.d = giwVar;
    }

    @Override // defpackage.gyp
    public final /* synthetic */ long a() {
        return 0L;
    }

    @Override // defpackage.gyp
    public final gfx b(Bundle bundle) {
        goa a2;
        boolean z;
        boolean z2;
        lgf lgfVar;
        long j = bundle.getLong("com.google.android.libraries.notifications.DELIVERED_TIMESTAMP");
        int i = bundle.getInt("com.google.android.libraries.notifications.MUTE_NOTIFICATION");
        int i2 = bundle.getInt("com.google.android.libraries.notifications.IS_LOCAL_NOTIFICATION");
        gwf U = frx.U(bundle);
        if (U != null) {
            try {
                a2 = this.c.a(U);
            } catch (gnx e) {
                return gfx.a(e);
            }
        } else {
            a2 = null;
        }
        List b = this.b.b(a2, 5);
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                break;
            }
            try {
                byte[] bArr = ((gkq) it.next()).b;
                lgf lgfVar2 = lgf.s;
                int length = bArr.length;
                lja ljaVar = lja.a;
                lkz lkzVar = lkz.a;
                ljn m = ljn.m(lgfVar2, bArr, 0, length, lja.a);
                ljn.A(m);
                lgfVar = (lgf) m;
            } catch (ljy e2) {
                ((jol) ((jol) a.f()).i(e2)).r("Unable to parse FrontendNotificationThread message");
                lgfVar = null;
            }
            if (lgfVar != null) {
                arrayList.add(lgfVar);
            }
        }
        if (i2 == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i == 1) {
            z = true;
        }
        this.b.d(a2, b);
        this.d.a(a2, arrayList, gnd.c(), new ghh(Long.valueOf(j), Long.valueOf(SystemClock.elapsedRealtime()), lcn.SCHEDULED_RECEIVER), z, z2, false);
        return gfx.a;
    }

    @Override // defpackage.gyp
    public final String c() {
        return "ON_NOTIFICATION_RECEIVED";
    }

    @Override // defpackage.gyp
    public final /* synthetic */ boolean d() {
        return false;
    }

    @Override // defpackage.gyp
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.gyp
    public final /* synthetic */ void f() {
    }
}
