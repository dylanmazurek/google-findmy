package defpackage;

import android.text.TextUtils;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class krc implements krd {
    public static final Object a = new Object();
    private static final ThreadFactory g = new krb(0);
    public final knh b;
    public final krp c;
    public final krk d;
    public final krm e;
    public final kub f;
    private final Object h;
    private final ExecutorService i;
    private final ExecutorService j;
    private String k;
    private final Set l;
    private final List m;

    public krc(knh knhVar, kqz kqzVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadFactory threadFactory = g;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, timeUnit, linkedBlockingQueue, threadFactory);
        krp krpVar = new krp(knhVar.a(), kqzVar);
        kub kubVar = new kub(knhVar);
        krk b = krk.b();
        krm krmVar = new krm(knhVar);
        int i = kri.a;
        this.h = new Object();
        this.l = new HashSet();
        this.m = new ArrayList();
        this.b = knhVar;
        this.c = krpVar;
        this.f = kubVar;
        this.d = b;
        this.e = krmVar;
        this.i = threadPoolExecutor;
        this.j = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
    }

    private final synchronized String k() {
        return this.k;
    }

    private final void l(krj krjVar) {
        synchronized (this.h) {
            this.m.add(krjVar);
        }
    }

    private final void m() {
        fma.aQ(c(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fma.aQ(d(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fma.aQ(b(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String c = c();
        long j = krk.a;
        fma.aG(c.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        fma.aG(krk.b.matcher(b()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    @Override // defpackage.krd
    public final fxs a() {
        m();
        String k = k();
        if (k != null) {
            return fma.o(k);
        }
        bym bymVar = new bym((int[]) null);
        l(new krg(bymVar));
        Object obj = bymVar.a;
        this.i.execute(new jxe(this, 5));
        return (fxs) obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        return this.b.d().a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String c() {
        return this.b.d().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String d() {
        return this.b.d().d;
    }

    public final void e(Exception exc) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((krj) it.next()).a(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final void f(kro kroVar) {
        synchronized (this.h) {
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                if (((krj) it.next()).b(kroVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void g(String str) {
        this.k = str;
    }

    public final synchronized void h(kro kroVar, kro kroVar2) {
        if (this.l.size() != 0 && !kroVar.a.equals(kroVar2.a)) {
            Iterator it = this.l.iterator();
            while (it.hasNext()) {
                ((krl) it.next()).a();
            }
        }
    }

    public final void i() {
        kro c;
        String str;
        String string;
        synchronized (a) {
            kuv n = kuv.n(this.b.a());
            try {
                c = this.f.c();
                if (c.c()) {
                    if ((this.b.f().equals("CHIME_ANDROID_SDK") || this.b.j()) && c.g == 1) {
                        krm krmVar = this.e;
                        synchronized (krmVar.b) {
                            synchronized (krmVar.b) {
                                str = null;
                                string = krmVar.b.getString("|S|id", null);
                            }
                            if (string == null) {
                                synchronized (krmVar.b) {
                                    String string2 = krmVar.b.getString("|S||P|", null);
                                    if (string2 != null) {
                                        PublicKey b = krm.b(string2);
                                        if (b != null) {
                                            str = krm.a(b);
                                        }
                                    }
                                }
                                string = str;
                            }
                        }
                        if (TextUtils.isEmpty(string)) {
                            string = kri.a();
                        }
                    } else {
                        string = kri.a();
                    }
                    kub kubVar = this.f;
                    krn krnVar = new krn(c);
                    krnVar.a = string;
                    krnVar.c(3);
                    c = krnVar.a();
                    kubVar.d(c);
                }
            } finally {
                if (n != null) {
                    n.l();
                }
            }
        }
        f(c);
        this.j.execute(new Runnable() { // from class: kra
            /* JADX WARN: Removed duplicated region for block: B:81:0x010b  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0198 A[Catch: kre -> 0x0199, TRY_ENTER, TRY_LEAVE, TryCatch #6 {kre -> 0x0199, blocks: (B:11:0x001b, B:13:0x0023, B:15:0x0029, B:17:0x0031, B:23:0x0050, B:55:0x0061, B:56:0x0068, B:57:0x0069, B:58:0x006f, B:59:0x008c, B:61:0x008e, B:63:0x0093, B:65:0x009b, B:66:0x009f, B:79:0x00f1, B:83:0x010f, B:84:0x0114, B:85:0x011b, B:86:0x011c, B:87:0x0198, B:100:0x00ef, B:68:0x00a0, B:70:0x00a5, B:72:0x00ca, B:75:0x00d0, B:89:0x00d8, B:77:0x00e5, B:93:0x00e8, B:96:0x00eb), top: B:10:0x001b, inners: #3 }] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 424
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.kra.run():void");
            }
        });
    }

    @Override // defpackage.krd
    public final fxs j() {
        m();
        bym bymVar = new bym((int[]) null);
        l(new krf(this.d, bymVar));
        Object obj = bymVar.a;
        this.i.execute(new jxe(this, 6));
        return (fxs) obj;
    }
}
