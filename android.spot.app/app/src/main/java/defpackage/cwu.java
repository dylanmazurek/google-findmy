package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwu implements Runnable {
    private static final String a = cqc.a("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final csb d;
    private int e = 0;
    private final bet f;

    public cwu(Context context, csb csbVar) {
        this.c = context.getApplicationContext();
        this.d = csbVar;
        this.f = csbVar.j;
    }

    public static void a(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        PendingIntent b2 = b(context, i);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:74|75|76|77|79|80|(3:(11:84|85|86|(3:144|145|(2:147|148))|88|89|(1:91)(1:139)|92|93|94|(6:(2:126|127)|97|99|100|101|(5:105|(1:107)|108|(4:111|(2:113|(2:115|116)(1:120))(1:122)|121|109)|123))(3:132|133|(1:135)))|94|(0)(0))|168|85|86|(0)|88|89|(0)(0)|92|93) */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0377, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0379, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x001e, code lost:            if (r4 == false) goto L547;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f A[Catch: all -> 0x0451, TRY_LEAVE, TryCatch #17 {all -> 0x0451, blocks: (B:3:0x0006, B:5:0x0011, B:8:0x0022, B:10:0x0033, B:12:0x0039, B:14:0x0042, B:16:0x004a, B:17:0x005d, B:19:0x0072, B:21:0x00ae, B:23:0x00b9, B:24:0x00cd, B:25:0x00d5, B:27:0x00db, B:30:0x00f3, B:32:0x00f9, B:33:0x010e, B:35:0x0114, B:36:0x0121, B:39:0x011b, B:43:0x00be, B:44:0x004f, B:45:0x00cb, B:46:0x0125, B:49:0x0129, B:205:0x012f, B:212:0x0170, B:214:0x0178, B:215:0x017e, B:217:0x0185, B:219:0x018b, B:220:0x018f, B:222:0x0195, B:229:0x01a1, B:225:0x01a7, B:232:0x01af, B:233:0x01b3, B:235:0x01b9, B:238:0x01c5, B:240:0x01cd, B:248:0x01eb, B:251:0x01f0, B:252:0x01f4, B:54:0x0212, B:80:0x028a, B:85:0x0295, B:145:0x02a9, B:148:0x02b3, B:89:0x02e8, B:92:0x02f3, B:127:0x0301, B:97:0x030c, B:101:0x0317, B:103:0x031d, B:105:0x0323, B:107:0x0333, B:109:0x0337, B:111:0x033d, B:113:0x034d, B:117:0x0386, B:121:0x0356, B:125:0x0368, B:131:0x037c, B:151:0x040b, B:162:0x0414, B:165:0x0421, B:166:0x042e, B:153:0x042f, B:156:0x0439, B:135:0x035c, B:67:0x03e6, B:68:0x03e9, B:259:0x01f6, B:260:0x01fd, B:267:0x0441, B:268:0x0450, B:269:0x0015), top: B:2:0x0006, inners: #45 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0414 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ff  */
    /* JADX WARN: Type inference failed for: r4v56, types: [java.util.LinkedHashMap] */
    /* JADX WARN: Type inference failed for: r4v57, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v39 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwu.run():void");
    }
}
