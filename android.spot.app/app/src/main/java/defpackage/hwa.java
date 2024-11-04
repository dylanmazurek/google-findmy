package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class hwa {
    public static final /* synthetic */ int c = 0;
    private static final Object d = new Object();
    private static volatile hvz e = null;
    private static volatile boolean f = false;
    private static final hwh g;
    private static final AtomicInteger h;
    final hvy a;
    final String b;
    private Object i;
    private volatile int j = -1;
    private volatile Object k;
    private final boolean l;
    private volatile boolean m;

    static {
        new AtomicReference();
        g = new hwh(new hxn(1));
        h = new AtomicInteger();
    }

    public hwa(hvy hvyVar, String str, Object obj, boolean z) {
        if (hvyVar.d == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = hvyVar;
        this.b = str;
        this.i = obj;
        this.l = z;
        this.m = false;
    }

    public static void e() {
        h.incrementAndGet();
    }

    public static void f(Context context) {
        if (e == null && context != null) {
            Object obj = d;
            synchronized (obj) {
                if (e == null) {
                    synchronized (obj) {
                        hvz hvzVar = e;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        if (hvzVar == null || hvzVar.a != context) {
                            if (hvzVar != null) {
                                hvf.b();
                                hwc.b();
                                hvl.c();
                            }
                            e = new hvz(context, hwx.H(new hnn(context, 15)));
                            e();
                        }
                    }
                }
            }
        }
    }

    private final String g(String str) {
        if (str.isEmpty()) {
            return this.b;
        }
        return str.concat(this.b);
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Can't wrap try/catch for region: R(11:97|(8:99|(1:101)(1:110)|102|(1:104)|106|107|108|109)|111|112|113|114|(4:116|107|108|109)|106|107|108|109) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x00d5, code lost:            if ("com.google.android.gms".equals(r9.packageName) != false) goto L198;     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0131 A[Catch: all -> 0x01d1, TryCatch #1 {, blocks: (B:8:0x0019, B:10:0x001d, B:12:0x0024, B:14:0x0032, B:18:0x004e, B:20:0x0059, B:22:0x006b, B:25:0x014c, B:27:0x0156, B:29:0x015e, B:31:0x0164, B:32:0x0168, B:43:0x0185, B:46:0x0195, B:48:0x019b, B:49:0x018d, B:53:0x01a2, B:56:0x01a5, B:58:0x01ab, B:61:0x01b3, B:62:0x01b8, B:63:0x01bc, B:65:0x007d, B:67:0x0085, B:69:0x0102, B:70:0x0110, B:88:0x012d, B:89:0x0092, B:90:0x0094, B:109:0x00f4, B:121:0x0130, B:122:0x0131, B:125:0x013d, B:139:0x01cd, B:140:0x01ce, B:143:0x01cf, B:34:0x0169, B:36:0x016d, B:38:0x0175, B:39:0x0180, B:40:0x017b, B:41:0x0182, B:42:0x0184, B:127:0x013e, B:129:0x0149, B:130:0x01c1, B:135:0x01c7, B:136:0x01ca, B:72:0x0111, B:78:0x011b, B:80:0x0123, B:74:0x0129, B:92:0x0095, B:94:0x009d, B:95:0x00a9, B:97:0x00ab, B:99:0x00b7, B:102:0x00c7, B:104:0x00cd, B:107:0x00e9, B:108:0x00f3, B:111:0x00d7, B:113:0x00db, B:114:0x00e1), top: B:7:0x0019, inners: #0, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059 A[Catch: all -> 0x01d1, TryCatch #1 {, blocks: (B:8:0x0019, B:10:0x001d, B:12:0x0024, B:14:0x0032, B:18:0x004e, B:20:0x0059, B:22:0x006b, B:25:0x014c, B:27:0x0156, B:29:0x015e, B:31:0x0164, B:32:0x0168, B:43:0x0185, B:46:0x0195, B:48:0x019b, B:49:0x018d, B:53:0x01a2, B:56:0x01a5, B:58:0x01ab, B:61:0x01b3, B:62:0x01b8, B:63:0x01bc, B:65:0x007d, B:67:0x0085, B:69:0x0102, B:70:0x0110, B:88:0x012d, B:89:0x0092, B:90:0x0094, B:109:0x00f4, B:121:0x0130, B:122:0x0131, B:125:0x013d, B:139:0x01cd, B:140:0x01ce, B:143:0x01cf, B:34:0x0169, B:36:0x016d, B:38:0x0175, B:39:0x0180, B:40:0x017b, B:41:0x0182, B:42:0x0184, B:127:0x013e, B:129:0x0149, B:130:0x01c1, B:135:0x01c7, B:136:0x01ca, B:72:0x0111, B:78:0x011b, B:80:0x0123, B:74:0x0129, B:92:0x0095, B:94:0x009d, B:95:0x00a9, B:97:0x00ab, B:99:0x00b7, B:102:0x00c7, B:104:0x00cd, B:107:0x00e9, B:108:0x00f3, B:111:0x00d7, B:113:0x00db, B:114:0x00e1), top: B:7:0x0019, inners: #0, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c A[Catch: all -> 0x01d1, TRY_ENTER, TryCatch #1 {, blocks: (B:8:0x0019, B:10:0x001d, B:12:0x0024, B:14:0x0032, B:18:0x004e, B:20:0x0059, B:22:0x006b, B:25:0x014c, B:27:0x0156, B:29:0x015e, B:31:0x0164, B:32:0x0168, B:43:0x0185, B:46:0x0195, B:48:0x019b, B:49:0x018d, B:53:0x01a2, B:56:0x01a5, B:58:0x01ab, B:61:0x01b3, B:62:0x01b8, B:63:0x01bc, B:65:0x007d, B:67:0x0085, B:69:0x0102, B:70:0x0110, B:88:0x012d, B:89:0x0092, B:90:0x0094, B:109:0x00f4, B:121:0x0130, B:122:0x0131, B:125:0x013d, B:139:0x01cd, B:140:0x01ce, B:143:0x01cf, B:34:0x0169, B:36:0x016d, B:38:0x0175, B:39:0x0180, B:40:0x017b, B:41:0x0182, B:42:0x0184, B:127:0x013e, B:129:0x0149, B:130:0x01c1, B:135:0x01c7, B:136:0x01ca, B:72:0x0111, B:78:0x011b, B:80:0x0123, B:74:0x0129, B:92:0x0095, B:94:0x009d, B:95:0x00a9, B:97:0x00ab, B:99:0x00b7, B:102:0x00c7, B:104:0x00cd, B:107:0x00e9, B:108:0x00f3, B:111:0x00d7, B:113:0x00db, B:114:0x00e1), top: B:7:0x0019, inners: #0, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e A[Catch: all -> 0x01d1, TryCatch #1 {, blocks: (B:8:0x0019, B:10:0x001d, B:12:0x0024, B:14:0x0032, B:18:0x004e, B:20:0x0059, B:22:0x006b, B:25:0x014c, B:27:0x0156, B:29:0x015e, B:31:0x0164, B:32:0x0168, B:43:0x0185, B:46:0x0195, B:48:0x019b, B:49:0x018d, B:53:0x01a2, B:56:0x01a5, B:58:0x01ab, B:61:0x01b3, B:62:0x01b8, B:63:0x01bc, B:65:0x007d, B:67:0x0085, B:69:0x0102, B:70:0x0110, B:88:0x012d, B:89:0x0092, B:90:0x0094, B:109:0x00f4, B:121:0x0130, B:122:0x0131, B:125:0x013d, B:139:0x01cd, B:140:0x01ce, B:143:0x01cf, B:34:0x0169, B:36:0x016d, B:38:0x0175, B:39:0x0180, B:40:0x017b, B:41:0x0182, B:42:0x0184, B:127:0x013e, B:129:0x0149, B:130:0x01c1, B:135:0x01c7, B:136:0x01ca, B:72:0x0111, B:78:0x011b, B:80:0x0123, B:74:0x0129, B:92:0x0095, B:94:0x009d, B:95:0x00a9, B:97:0x00ab, B:99:0x00b7, B:102:0x00c7, B:104:0x00cd, B:107:0x00e9, B:108:0x00f3, B:111:0x00d7, B:113:0x00db, B:114:0x00e1), top: B:7:0x0019, inners: #0, #6, #7, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hwa.b():java.lang.Object");
    }

    public final Object c() {
        if (this.m) {
            synchronized (this) {
                if (this.m) {
                    Object a = a(this.i);
                    a.getClass();
                    this.i = a;
                    this.m = false;
                }
            }
        }
        return this.i;
    }

    public final String d() {
        return g(this.a.a);
    }

    public hwa(hvy hvyVar) {
        if (hvyVar.d == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = hvyVar;
        this.b = "getTokenRefactor__blocked_packages";
        this.i = "ChNjb20uYW5kcm9pZC52ZW5kaW5nCiBjb20uZ29vZ2xlLmFuZHJvaWQuYXBwcy5tZWV0aW5ncwohY29tLmdvb2dsZS5hbmRyb2lkLmFwcHMubWVzc2FnaW5n";
        this.l = true;
        this.m = true;
    }
}
