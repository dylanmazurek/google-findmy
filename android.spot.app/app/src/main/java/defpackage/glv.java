package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glv implements glt {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final jer c;
    private final ghf d;

    public glv(Context context, jer jerVar, ghf ghfVar) {
        this.b = context;
        this.c = jerVar;
        this.d = ghfVar;
    }

    private static String b(goa goaVar) {
        if (goaVar == null) {
            return null;
        }
        return String.valueOf(goaVar.a);
    }

    private static String c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ggk) it.next()).a);
        }
        return TextUtils.join(", ", arrayList);
    }

    private final void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            try {
                this.b.startActivity(intent);
            } catch (ActivityNotFoundException e) {
                ((jol) ((jol) ((jol) a.f()).i(e)).j("com/google/android/libraries/notifications/internal/systemtray/impl/EventCallbackHelper", "openDestinationUrl", 220, "EventCallbackHelper.java")).u("Failed to start activity for destination URL: %s", str);
            }
        }
    }

    @Override // defpackage.glt
    public final void a(ghp ghpVar) {
        lfq lfqVar;
        String str;
        Object gxyVar;
        Intent intent = ghpVar.f;
        if (intent != null) {
            joo jooVar = glx.a;
            if (intent.hasExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA")) {
                intent.getBundleExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA");
            }
        }
        boolean z = ghpVar.h;
        List list = ghpVar.d;
        goa goaVar = ghpVar.c;
        String str2 = ghpVar.b;
        boolean z2 = true;
        if ("com.google.android.libraries.notifications.NOTIFICATION_CLICKED".equals(str2)) {
            ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/EventCallbackHelper", "onNotificationClicked", 101, "EventCallbackHelper.java")).y("Notification clicked for account ID [%s], on threads [%s]", b(goaVar), c(list));
            ghg b = this.d.b(lde.CLICKED);
            ((ghn) b).G = 2;
            b.e(goaVar);
            b.d(list);
            b.a();
            if (this.c.g()) {
                if (z) {
                    ((gxs) this.c.c()).e();
                    return;
                } else {
                    ((gxs) this.c.c()).d();
                    return;
                }
            }
            if (list.size() == 1) {
                d(((ggk) list.get(0)).d.g);
                return;
            }
            return;
        }
        if ("com.google.android.libraries.notifications.NOTIFICATION_DISMISSED".equals(str2)) {
            jls jlsVar = ghpVar.i.c;
            if (jlsVar != null) {
                HashMap hashMap = new HashMap();
                for (ghq ghqVar : jlsVar.r()) {
                    for (String str3 : jlsVar.b(ghqVar)) {
                        if (ghqVar instanceof ght) {
                            gxyVar = new gyb(ghqVar.a());
                        } else if (ghqVar instanceof ghs) {
                            ghs ghsVar = (ghs) ghqVar;
                            gxyVar = new gxy(ghsVar.a, ghsVar.b);
                        } else {
                            throw new IllegalStateException("Reached limit type is not supported.");
                        }
                        hashMap.put(str3, gxyVar);
                    }
                }
            }
            ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/EventCallbackHelper", "onNotificationRemoved", 136, "EventCallbackHelper.java")).y("Notification removed for account ID [%s], on threads [%s]", b(goaVar), c(list));
            ghg b2 = this.d.b(lde.DISMISSED);
            ((ghn) b2).G = 2;
            b2.e(goaVar);
            b2.d(list);
            b2.a();
            if (this.c.g()) {
                ((gxs) this.c.c()).h();
                return;
            }
            return;
        }
        if ("com.google.android.libraries.notifications.NOTIFICATION_EXPIRED".equals(str2)) {
            ((jol) ((jol) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/EventCallbackHelper", "onNotificationExpired", 155, "EventCallbackHelper.java")).y("Notification expired for account ID [%s], on threads [%s]", b(goaVar), c(list));
            ghg b3 = this.d.b(lde.EXPIRED);
            b3.e(goaVar);
            b3.d(list);
            b3.a();
            if (this.c.g()) {
                ((gxs) this.c.c()).g();
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            if (list.size() != 1) {
                z2 = false;
            }
            hwx.J(z2);
            Iterator it = ((ggk) list.get(0)).o.iterator();
            while (true) {
                if (it.hasNext()) {
                    ggj ggjVar = (ggj) it.next();
                    if (str2.equals(ggjVar.a)) {
                        lfqVar = ggjVar.b();
                        break;
                    }
                } else {
                    lfqVar = null;
                    break;
                }
            }
            ggk ggkVar = (ggk) list.get(0);
            jol jolVar = (jol) ((jol) a.e()).j("com/google/android/libraries/notifications/internal/systemtray/impl/EventCallbackHelper", "onActionClicked", 175, "EventCallbackHelper.java");
            String str4 = "";
            if (lfqVar.b != 4) {
                str = "";
            } else {
                str = (String) lfqVar.c;
            }
            jolVar.z("Notification action [%s] clicked for account ID [%s], on thread [%s]", str, b(goaVar), ggkVar.a);
            ghg b4 = this.d.b(lde.ACTION_CLICK);
            ghn ghnVar = (ghn) b4;
            ghnVar.G = 2;
            if (lfqVar.b == 4) {
                str4 = (String) lfqVar.c;
            }
            ghnVar.k = str4;
            b4.e(goaVar);
            b4.c(ggkVar);
            b4.a();
            if (this.c.g()) {
                if (z) {
                    ((gxs) this.c.c()).c();
                    return;
                } else {
                    ((gxs) this.c.c()).b();
                    return;
                }
            }
            d(lfqVar.g);
        }
    }
}
