package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hxo implements jfe {
    public static final /* synthetic */ int a = 0;
    private static volatile hwh b = new hwh(new hxn(0));
    private final String c;
    private final String d;
    private Object e;
    private volatile int f;
    private volatile Object g;
    private final boolean h;
    private volatile boolean i;
    private final hww j;
    private volatile hnu k;

    public hxo(String str, String str2, hww hwwVar, String str3) {
        this.f = -1;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.j = hwwVar;
        this.h = true;
        this.i = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0083 A[Catch: all -> 0x00ee, TryCatch #2 {, blocks: (B:10:0x0013, B:12:0x0017, B:13:0x002c, B:15:0x0036, B:17:0x0043, B:18:0x004c, B:20:0x0062, B:23:0x0073, B:24:0x0079, B:26:0x0083, B:27:0x0088, B:50:0x00a5, B:53:0x00af, B:29:0x00ba, B:33:0x00c4, B:35:0x00c8, B:45:0x00e5, B:46:0x00e6, B:47:0x00e8, B:55:0x00ea, B:56:0x00ec, B:37:0x00c9, B:39:0x00cd, B:40:0x00e1), top: B:9:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4 A[Catch: all -> 0x00ee, TryCatch #2 {, blocks: (B:10:0x0013, B:12:0x0017, B:13:0x002c, B:15:0x0036, B:17:0x0043, B:18:0x004c, B:20:0x0062, B:23:0x0073, B:24:0x0079, B:26:0x0083, B:27:0x0088, B:50:0x00a5, B:53:0x00af, B:29:0x00ba, B:33:0x00c4, B:35:0x00c8, B:45:0x00e5, B:46:0x00e6, B:47:0x00e8, B:55:0x00ea, B:56:0x00ec, B:37:0x00c9, B:39:0x00cd, B:40:0x00e1), top: B:9:0x0013, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [hxr, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object c(defpackage.hvq r11) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hxo.c(hvq):java.lang.Object");
    }

    @Override // defpackage.jfe
    public final Object a() {
        Context context = hvq.a;
        hvs.b = true;
        if (hvs.c == null) {
            hvs.c = new hvr();
        }
        Context context2 = hvq.a;
        if (context2 != null) {
            return c(hvq.a(context2));
        }
        hvs.a();
        throw new IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    public final Object b(Context context) {
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        return c(hvq.a(applicationContext));
    }

    public hxo(String str, String str2, Object obj, hww hwwVar, boolean z) {
        this.f = -1;
        this.c = str;
        this.d = str2;
        this.e = obj;
        this.j = hwwVar;
        this.h = z;
        this.i = false;
    }
}
