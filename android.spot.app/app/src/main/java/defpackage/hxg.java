package defpackage;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxg {
    public static final ConcurrentMap a = new ConcurrentHashMap();
    private static final jck d = new jck(hwv.b, (byte[]) null);
    private static final Object b = new Object();
    private static volatile ilv c = null;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0023, code lost:            if (r4 != false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.File r6) {
        /*
            boolean r0 = r6.isDirectory()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L25
            java.io.File[] r0 = r6.listFiles()
            if (r0 == 0) goto L25
            r3 = 0
            r4 = 1
        L10:
            int r5 = r0.length
            if (r3 >= r5) goto L23
            r5 = r0[r3]
            if (r4 == 0) goto L1f
            boolean r4 = a(r5)
            if (r4 == 0) goto L1f
            r4 = 1
            goto L20
        L1f:
            r4 = 0
        L20:
            int r3 = r3 + 1
            goto L10
        L23:
            if (r4 == 0) goto L2c
        L25:
            boolean r6 = r6.delete()
            if (r6 == 0) goto L2c
            return r1
        L2c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxg.a(java.io.File):boolean");
    }

    public static imf b(hvq hvqVar) {
        Context context = hvqVar.c;
        ilt a2 = ilu.a();
        ijy ijyVar = new ijy(context);
        ijyVar.d("phenotype");
        ijyVar.e("all_accounts.pb");
        a2.d(ijyVar.a());
        a2.c(hwv.b);
        a2.a = jer.i(d);
        a2.b();
        ilu a3 = a2.a();
        ilv ilvVar = c;
        if (ilvVar == null) {
            synchronized (b) {
                ilvVar = c;
                if (ilvVar == null) {
                    imi imiVar = imi.a;
                    HashMap hashMap = new HashMap();
                    jzd b2 = hvqVar.b();
                    kpb g = hvqVar.g();
                    hrb.k(imb.a, hashMap);
                    ilv ilvVar2 = new ilv(b2, g, imiVar, hashMap);
                    c = ilvVar2;
                    ilvVar = ilvVar2;
                }
            }
        }
        return ilvVar.a(a3);
    }
}
