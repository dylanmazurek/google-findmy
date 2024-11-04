package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmu {
    private final Context a;

    public gmu(Context context) {
        this.a = context;
    }

    private final Map d(giu giuVar, Collection collection) {
        Object systemService;
        mkw mkwVar;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        Set F = mkm.F(Arrays.copyOf(strArr, strArr.length));
        systemService = this.a.getSystemService((Class<Object>) NotificationManager.class);
        systemService.getClass();
        StatusBarNotification[] K = frx.K((NotificationManager) systemService);
        ArrayList<StatusBarNotification> arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : K) {
            if (mkm.al(F, gmj.g(statusBarNotification)) && gmj.j(statusBarNotification, giuVar)) {
                arrayList.add(statusBarNotification);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (StatusBarNotification statusBarNotification2 : arrayList) {
            String g = gmj.g(statusBarNotification2);
            if (g != null) {
                mkwVar = new mkw(g, gmj.i(statusBarNotification2));
            } else {
                mkwVar = null;
            }
            if (mkwVar != null) {
                arrayList2.add(mkwVar);
            }
        }
        return mkm.K(arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:            r5 = null;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:            if (r4 == false) goto L13;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gmi a(defpackage.giu r9, java.lang.String r10) {
        /*
            r8 = this;
            r10.getClass()
            boolean r0 = defpackage.frx.aG()
            if (r0 == 0) goto L40
            android.content.Context r0 = r8.a
            java.lang.Class<android.app.NotificationManager> r1 = android.app.NotificationManager.class
            java.lang.Object r0 = defpackage.fr$$ExternalSyntheticApiModelOutline0.m(r0, r1)
            r0.getClass()
            android.app.NotificationManager r0 = (android.app.NotificationManager) r0
            android.service.notification.StatusBarNotification[] r0 = defpackage.frx.K(r0)
            int r1 = r0.length
            r2 = 0
            r3 = 0
            r5 = r3
            r4 = 0
        L1f:
            if (r2 >= r1) goto L33
            r6 = r0[r2]
            gmj r7 = defpackage.gmj.a
            boolean r7 = defpackage.gmj.k(r6, r9, r10)
            if (r7 == 0) goto L30
            if (r4 == 0) goto L2e
            goto L35
        L2e:
            r4 = 1
            r5 = r6
        L30:
            int r2 = r2 + 1
            goto L1f
        L33:
            if (r4 != 0) goto L36
        L35:
            r5 = r3
        L36:
            if (r5 != 0) goto L39
            goto L44
        L39:
            gmj r9 = defpackage.gmj.a
            gmi r9 = defpackage.gmj.i(r5)
            return r9
        L40:
            gmi r3 = defpackage.gmt.a(r9, r10)
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmu.a(giu, java.lang.String):gmi");
    }

    public final Map b(giu giuVar, Collection collection) {
        collection.getClass();
        if (frx.aG()) {
            return d(giuVar, collection);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(moz.ac(mkm.H(mkm.ap(collection)), 16));
        for (Object obj : collection) {
            linkedHashMap.put(obj, gmt.a(giuVar, (String) obj));
        }
        return linkedHashMap;
    }

    public final Set c(giu giuVar, Collection collection) {
        if (frx.aG()) {
            return d(giuVar, collection).keySet();
        }
        return mlz.a;
    }
}
