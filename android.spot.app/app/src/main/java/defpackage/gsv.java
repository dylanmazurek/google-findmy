package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsv implements gsp {
    public static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final lqz c;
    private final gsk d;

    public gsv(Context context, lqz lqzVar, gsk gskVar) {
        lqzVar.getClass();
        gskVar.getClass();
        this.b = context;
        this.c = lqzVar;
        this.d = gskVar;
    }

    private final synchronized String c() {
        String string = ((SharedPreferences) this.c.a()).getString("fetch_only_id", null);
        if (TextUtils.isEmpty(string)) {
            String uuid = UUID.randomUUID().toString();
            ((SharedPreferences) this.c.a()).edit().putString("fetch_only_id", uuid).apply();
            return uuid;
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3 A[Catch: gsl -> 0x0125, TryCatch #1 {gsl -> 0x0125, blocks: (B:2:0x0000, B:4:0x0023, B:5:0x0026, B:7:0x004d, B:9:0x0055, B:10:0x0058, B:13:0x0069, B:15:0x0077, B:16:0x007a, B:19:0x0089, B:21:0x008f, B:24:0x0096, B:26:0x009e, B:27:0x00a1, B:30:0x00b2, B:32:0x00b4, B:42:0x00c2, B:37:0x00e3, B:39:0x00eb, B:40:0x00ee, B:45:0x00d4, B:49:0x00fa, B:51:0x010b, B:52:0x010e), top: B:1:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010b A[Catch: gsl -> 0x0125, TryCatch #1 {gsl -> 0x0125, blocks: (B:2:0x0000, B:4:0x0023, B:5:0x0026, B:7:0x004d, B:9:0x0055, B:10:0x0058, B:13:0x0069, B:15:0x0077, B:16:0x007a, B:19:0x0089, B:21:0x008f, B:24:0x0096, B:26:0x009e, B:27:0x00a1, B:30:0x00b2, B:32:0x00b4, B:42:0x00c2, B:37:0x00e3, B:39:0x00eb, B:40:0x00ee, B:45:0x00d4, B:49:0x00fa, B:51:0x010b, B:52:0x010e), top: B:1:0x0000 }] */
    @Override // defpackage.gsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.gna a(defpackage.gso r10) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gsv.a(gso):gna");
    }

    @Override // defpackage.gsp
    public final void b() {
        if (!TextUtils.isEmpty(((SharedPreferences) this.c.a()).getString("fetch_only_id", null))) {
            ((SharedPreferences) this.c.a()).edit().putString("fetch_only_id", UUID.randomUUID().toString()).apply();
        }
    }
}
