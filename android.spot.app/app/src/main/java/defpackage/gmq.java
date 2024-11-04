package defpackage;

import android.content.Context;
import android.service.notification.StatusBarNotification;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmq implements gmk {
    private static final joo c = joo.m("GnpSdk");
    public final Context a;
    public final goj b;
    private final ddg d;

    public gmq(Context context, ddg ddgVar, goj gojVar, fma fmaVar) {
        ddgVar.getClass();
        fmaVar.getClass();
        this.a = context;
        this.d = ddgVar;
        this.b = gojVar;
    }

    public static final long b(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            return statusBarNotification.getPostTime();
        }
        return fma.i().toEpochMilli();
    }

    public static final Long c(int i, ggk ggkVar, ggk ggkVar2) {
        if (i - 1 != 2) {
            if (ggkVar2 == null) {
                return null;
            }
            return ggkVar2.b;
        }
        if (amr.i(ggkVar, ggkVar2)) {
            return Long.valueOf(fma.i().toEpochMilli());
        }
        if (ggkVar2 == null) {
            return null;
        }
        return ggkVar2.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a1, code lost:            if (r3 == false) goto L33;     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List a(java.util.List r11, defpackage.mkt r12) {
        /*
            Method dump skipped, instructions count: 522
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gmq.a(java.util.List, mkt):java.util.List");
    }
}
