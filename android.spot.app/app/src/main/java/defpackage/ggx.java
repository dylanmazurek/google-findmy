package defpackage;

import android.content.Intent;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ggx implements gov {
    private static final joo a = joo.m("GnpSdk");
    private final git b;
    private final Set c;
    private final ddg d;
    private final ddg e;

    public ggx(git gitVar, ddg ddgVar, Set set, ddg ddgVar2) {
        this.b = gitVar;
        this.e = ddgVar;
        this.c = set;
        this.d = ddgVar2;
    }

    @Override // defpackage.gov
    public final int a(Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.libraries.notifications.ACTION_ID");
        if (stringExtra != null) {
            if (stringExtra.equals("com.google.android.libraries.notifications.NOTIFICATION_CLICKED") || stringExtra.startsWith("com.google.android.libraries.notifications.ACTION_ID:")) {
                return -2;
            }
            return 10;
        }
        return 10;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00db A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074 A[ADDED_TO_REGION] */
    @Override // defpackage.gov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.content.Intent r11, defpackage.gnd r12, long r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggx.b(android.content.Intent, gnd, long):void");
    }

    @Override // defpackage.gov
    public final boolean c(Intent intent) {
        if ("com.google.android.libraries.notifications.SYSTEM_TRAY_EVENT".equals(intent.getAction())) {
            return true;
        }
        return false;
    }
}
