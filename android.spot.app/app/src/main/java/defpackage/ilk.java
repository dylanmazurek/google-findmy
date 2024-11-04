package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilk {
    public static final TimeUnit a = TimeUnit.MILLISECONDS;
    public final Context b;
    public final jxd c;
    public final String d;
    public final Handler e;
    public final jfe f;
    public final TimeUnit g;
    public final jfe h;
    public final jkt i;
    public final Object j;

    public ilk(ilh ilhVar) {
        jmb jmbVar = jmb.a;
        hwx.D(2, "expectedValuesPerKey");
        this.i = new jlw(new TreeMap(jmbVar), new jlt());
        this.j = new Object();
        this.b = ilhVar.a;
        this.c = ilhVar.b;
        this.d = ilhVar.c;
        this.e = ilhVar.d;
        this.f = ilhVar.e;
        this.g = ilhVar.f;
        this.h = ilhVar.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.net.Uri a(android.net.Uri r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ilk.a(android.net.Uri):android.net.Uri");
    }

    public final void b(Uri uri) {
        jin jinVar = new jin();
        synchronized (this.j) {
            jinVar.j(this.i.b(uri));
        }
        jis g = jinVar.g();
        int i = ((jmi) g).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((Runnable) g.get(i2)).run();
        }
    }
}
