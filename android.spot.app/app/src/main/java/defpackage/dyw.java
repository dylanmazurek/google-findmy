package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyw {
    public static final jnk a = jnk.l("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl");
    public final kpb b;
    public final Executor c;
    public jer h;
    private final Executor j;
    private jer k;
    public final Object d = new Object();
    public int i = 1;
    public jer e = jdl.a;
    public jyz f = ivc.C();
    public jyz g = ivc.C();

    public dyw(kpb kpbVar, Executor executor, Executor executor2) {
        jdl jdlVar = jdl.a;
        this.h = jdlVar;
        this.k = jdlVar;
        this.b = kpbVar;
        this.c = executor;
        this.j = executor2;
    }

    private final void f(jer jerVar) {
        if (!this.e.g()) {
            ((jni) ((jni) a.g()).j("com/google/android/apps/adm/deeplink/DeepLinkHandlerImpl", "maybeCallCallbackOnUiThread", 176, "DeepLinkHandlerImpl.java")).r("Cannot call callback without deep link data");
            return;
        }
        lor lorVar = (lor) this.e.c();
        if (!jerVar.g()) {
            return;
        }
        this.g = iuu.t(new etm(jerVar, lorVar, 1, null), this.j).e(new dyv(this, 0), this.j).a(Throwable.class, new dvh(5), jxv.a);
    }

    public final void a() {
        synchronized (this.d) {
            this.k = jdl.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x01a5 A[Catch: RuntimeException -> 0x01cd, LOOP:1: B:47:0x019f->B:49:0x01a5, LOOP_END, TryCatch #1 {RuntimeException -> 0x01cd, blocks: (B:3:0x0002, B:5:0x0016, B:7:0x001e, B:9:0x0021, B:12:0x0024, B:14:0x002d, B:16:0x003a, B:18:0x0042, B:21:0x0051, B:24:0x0059, B:27:0x0064, B:28:0x006b, B:30:0x006c, B:32:0x0076, B:34:0x0080, B:36:0x0092, B:39:0x009c, B:41:0x00a2, B:43:0x00ac, B:45:0x00b2, B:46:0x0170, B:47:0x019f, B:49:0x01a5, B:51:0x01bb, B:57:0x00ba, B:59:0x00c0, B:65:0x00cc, B:67:0x00da, B:69:0x00ed, B:70:0x00f1, B:74:0x00f9, B:75:0x00fe, B:76:0x00ff, B:78:0x010d, B:79:0x0120, B:80:0x0127, B:81:0x0128, B:82:0x012d, B:83:0x012e, B:84:0x013b, B:86:0x0149, B:87:0x0151, B:88:0x0158, B:89:0x0159, B:90:0x0160, B:91:0x0161, B:92:0x0166, B:93:0x0167, B:94:0x016e, B:98:0x01c5, B:99:0x01cc), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.net.Uri r13) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyw.b(android.net.Uri):void");
    }

    public final void c(dyu dyuVar) {
        synchronized (this.d) {
            this.h = jer.i(dyuVar);
            if (this.i == 2 && this.e.g()) {
                f(this.h);
            }
        }
    }

    public final void d(dyu dyuVar) {
        synchronized (this.d) {
            this.k = jer.i(dyuVar);
            if (this.i == 3 && this.e.g()) {
                f(this.k);
            }
        }
    }

    public final void e(int i) {
        this.i = i;
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 1) {
                f(this.k);
                return;
            } else {
                f(this.h);
                return;
            }
        }
        this.e = jdl.a;
    }
}
