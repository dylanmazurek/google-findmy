package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmc {
    private static final joo b = joo.m("GnpSdk");
    public final jer a;
    private final Context c;
    private final gnv d;

    public gmc(Context context, gnv gnvVar, jer jerVar) {
        this.c = context;
        this.d = gnvVar;
        this.a = jerVar;
    }

    private static int e() {
        if (Build.VERSION.SDK_INT < 34) {
            if (a.f()) {
                return 33554432;
            }
            return 0;
        }
        return 67108864;
    }

    public final PendingIntent a(String str, int i, String str2, gmb gmbVar, goa goaVar, List list, lgz lgzVar, gxh gxhVar, ggj ggjVar, lct lctVar, boolean z, Bundle bundle) {
        String str3;
        gmb gmbVar2;
        String str4;
        String str5;
        if (goaVar != null) {
            str3 = goaVar.b;
        } else {
            str3 = "null";
        }
        ((jol) b.k().j("com/google/android/libraries/notifications/internal/systemtray/impl/PendingIntentHelper", "createNotificationPendingIntent", 296, "PendingIntentHelper.java")).A("Creating a notification pending intent for action [%s], handler [%s] and handleInForeground [%s] in account [%s]", str2, gmbVar, Boolean.valueOf(z), str3);
        Intent className = new Intent("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT").setClassName(this.c, this.d.c.h);
        joo jooVar = glx.a;
        if (goaVar != null) {
            className.putExtra("com.google.android.libraries.notifications.ACCOUNT_REPRESENTATION", fzo.l(goaVar.b()));
        }
        className.putExtra("com.google.android.libraries.notifications.EVENT_TYPE", i);
        className.putExtra("com.google.android.libraries.notifications.ACTION_ID", str2);
        if (lgzVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE", lgzVar.g());
        }
        if (gxhVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_LOCAL_THREAD_STATE", gxhVar.g());
        }
        if (ggjVar != null) {
            className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_CHIME_ACTION", ggjVar.b().g());
        }
        className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_REMOVE_REASON", lctVar.m);
        className.putExtra("com.google.android.libraries.notifications.INTENT_EXTRA_APP_PROVIDED_DATA", bundle);
        if (z) {
            gmbVar2 = gmb.ACTIVITY;
            className.putExtra("com.google.android.libraries.notifications.HANDLE_IN_FOREGROUND", true);
        } else {
            gmbVar2 = gmbVar;
        }
        if (list.size() == 1) {
            ggk ggkVar = (ggk) list.get(0);
            if (ggkVar != null && (str5 = ggkVar.a) != null) {
                className.putExtra("com.google.android.libraries.notifications.THREAD_ID", str5);
            }
        } else {
            ggk ggkVar2 = (ggk) list.get(0);
            if (ggkVar2 != null && (str4 = ggkVar2.j) != null) {
                className.putExtra("com.google.android.libraries.notifications.GROUP_ID", str4);
            }
        }
        if (gmbVar2 != gmb.ACTIVITY) {
            int e = kzy.e(lgzVar.b);
            if (e != 0 && e == 5) {
                className.addFlags(268435456);
            }
            return PendingIntent.getBroadcast(this.c, gmj.b(str, str2, i), className, e() | 134217728);
        }
        className.setClassName(this.c, this.d.c.g);
        return PendingIntent.getActivity(this.c, gmj.b(str, str2, i), className, e() | 134217728);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.PendingIntent b(java.lang.String r15, defpackage.goa r16, defpackage.ggk r17, defpackage.ggj r18, defpackage.gxh r19) {
        /*
            r14 = this;
            r13 = r14
            r9 = r18
            int r0 = r9.f
            int r1 = r0 + (-1)
            if (r0 == 0) goto Lcf
            r0 = 0
            r2 = 5
            r3 = 1
            if (r1 == 0) goto L1c
            r4 = 2
            if (r1 == r3) goto L25
            if (r1 == r4) goto L1a
            r4 = 3
            if (r1 == r4) goto L18
            r4 = 0
            goto L25
        L18:
            r4 = 5
            goto L25
        L1a:
            r4 = 4
            goto L25
        L1c:
            java.lang.String r1 = r9.a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto Lc7
            r4 = 1
        L25:
            java.lang.String r1 = r9.a
            java.lang.String r1 = java.lang.String.valueOf(r1)
            if (r4 != r3) goto L45
            jer r4 = r13.a
            boolean r4 = r4.g()
            if (r4 == 0) goto L44
            jer r4 = r13.a
            java.lang.Object r4 = r4.c()
            gxq r4 = (defpackage.gxq) r4
            gxp r4 = r4.a()
            r5 = r4
            r4 = 1
            goto L4a
        L44:
            r4 = 1
        L45:
            gxp r5 = new gxp
            r5.<init>()
        L4a:
            int r5 = r5.a
            java.lang.String r5 = r9.c
            boolean r5 = r5.isEmpty()
            r11 = r5 ^ 1
            lte r5 = defpackage.lte.a
            ltf r5 = r5.a()
            java.lang.String r5 = r5.a()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L89
            java.lang.String r6 = ","
            kru r6 = defpackage.kru.g(r6)
            java.lang.Iterable r5 = r6.b(r5)
            java.util.Iterator r5 = r5.iterator()
        L72:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L89
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r9.a
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L72
            gmb r2 = defpackage.gmb.ACTIVITY
            goto La1
        L89:
            lgz r5 = r9.d
            int r5 = r5.b
            int r5 = defpackage.kzy.e(r5)
            if (r5 != 0) goto L94
            goto L9f
        L94:
            if (r5 != r2) goto L9f
            boolean r2 = defpackage.frx.aJ()
            if (r2 != 0) goto L9f
            gmb r2 = defpackage.gmb.ACTIVITY
            goto La1
        L9f:
            gmb r2 = defpackage.gmb.BROADCAST
        La1:
            r5 = r2
            java.lang.String r2 = "com.google.android.libraries.notifications.ACTION_ID:"
            java.lang.String r6 = r2.concat(r1)
            ggk[] r1 = new defpackage.ggk[r3]
            r1[r0] = r17
            java.util.List r7 = java.util.Arrays.asList(r1)
            lgz r8 = r9.d
            lct r10 = defpackage.lct.ACTION_CLICK_IN_SYSTEM_TRAY
            r12 = 0
            r0 = r14
            r1 = r15
            r2 = r4
            r3 = r6
            r4 = r5
            r5 = r16
            r6 = r7
            r7 = r8
            r8 = r19
            r9 = r18
            android.app.PendingIntent r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        Lc7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ChimeNotificationAction must have an action id or builtInActionType"
            r0.<init>(r1)
            throw r0
        Lcf:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmc.b(java.lang.String, goa, ggk, ggj, gxh):android.app.PendingIntent");
    }

    public final PendingIntent c(String str, goa goaVar, List list, gxh gxhVar) {
        gxp gxpVar;
        gmb gmbVar;
        if (this.a.g()) {
            gxpVar = ((gxq) this.a.c()).b();
        } else {
            gxpVar = new gxp();
        }
        int i = gxpVar.a;
        boolean z = !((ggk) list.get(0)).d.g.isEmpty();
        if (frx.aJ()) {
            gmbVar = gmb.BROADCAST;
        } else {
            gmbVar = gmb.ACTIVITY;
        }
        gmb gmbVar2 = gmbVar;
        ljh k = lgz.f.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lgz lgzVar = (lgz) ljnVar;
        lgzVar.d = 2;
        lgzVar.a |= 4;
        if (!ljnVar.y()) {
            k.t();
        }
        lgz lgzVar2 = (lgz) k.b;
        lgzVar2.b = 4;
        lgzVar2.a |= 1;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                lfy lfyVar = ((ggk) it.next()).d.j;
                if (lfyVar == null) {
                    lfyVar = lfy.g;
                }
                if (lfyVar.e) {
                    break;
                }
            } else {
                if (!k.b.y()) {
                    k.t();
                }
                lgz lgzVar3 = (lgz) k.b;
                lgzVar3.e = 2;
                lgzVar3.a |= 8;
            }
        }
        return a(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_CLICKED", gmbVar2, goaVar, list, (lgz) k.q(), gxhVar, null, lct.CLICKED_IN_SYSTEM_TRAY, z, null);
    }

    public final PendingIntent d(String str, goa goaVar, List list) {
        Bundle bundle;
        if (this.a.g()) {
            bundle = ((gxq) this.a.c()).d();
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        gmb gmbVar = gmb.BROADCAST;
        ljh k = lgz.f.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lgz lgzVar = (lgz) ljnVar;
        lgzVar.e = 2;
        lgzVar.a |= 8;
        if (!ljnVar.y()) {
            k.t();
        }
        lgz lgzVar2 = (lgz) k.b;
        lgzVar2.d = 2;
        lgzVar2.a |= 4;
        return a(str, 1, "com.google.android.libraries.notifications.NOTIFICATION_DISMISSED", gmbVar, goaVar, list, (lgz) k.q(), null, null, lct.DISMISSED_IN_SYSTEM_TRAY, false, bundle2);
    }
}
