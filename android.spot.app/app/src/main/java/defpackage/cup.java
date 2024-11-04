package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cup extends cug {
    public cup(Context context, eld eldVar) {
        super(context, eldVar);
    }

    @Override // defpackage.cug
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:            if (r0.equals("android.intent.action.DEVICE_STORAGE_OK") == false) goto L18;     */
    @Override // defpackage.cuj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object b() {
        /*
            r5 = this;
            android.content.IntentFilter r0 = r5.a()
            android.content.Context r1 = r5.a
            r2 = 0
            android.content.Intent r0 = r1.registerReceiver(r2, r0)
            r1 = 1
            if (r0 == 0) goto L3a
            java.lang.String r2 = r0.getAction()
            if (r2 != 0) goto L15
            goto L3a
        L15:
            java.lang.String r0 = r0.getAction()
            r2 = 0
            if (r0 == 0) goto L39
            int r3 = r0.hashCode()
            r4 = -1181163412(0xffffffffb998e06c, float:-2.9158907E-4)
            if (r3 == r4) goto L34
            r4 = -730838620(0xffffffffd47049a4, float:-4.1281105E12)
            if (r3 == r4) goto L2b
            goto L39
        L2b:
            java.lang.String r3 = "android.intent.action.DEVICE_STORAGE_OK"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L3a
            goto L39
        L34:
            java.lang.String r1 = "android.intent.action.DEVICE_STORAGE_LOW"
            r0.equals(r1)
        L39:
            r1 = 0
        L3a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cup.b():java.lang.Object");
    }

    @Override // defpackage.cug
    public final void c(Intent intent) {
        if (intent.getAction() != null) {
            cqc.b();
            int i = cuq.a;
            intent.getAction();
            String action = intent.getAction();
            if (action != null) {
                int hashCode = action.hashCode();
                if (hashCode != -1181163412) {
                    if (hashCode == -730838620 && action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        f(true);
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                    f(false);
                }
            }
        }
    }
}
