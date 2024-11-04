package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilz implements img {
    public final String a;
    public final jyz b;
    public final Executor c;
    public final jer d;
    public Object g;
    public boolean h;
    public final ilk i;
    public final imj j;
    public final kpb l;
    public final ilf e = new ily(this, 0);
    public final Object f = new Object();
    public final kub k = new kub((byte[]) null);
    private final kub m = new kub((byte[]) null);

    public ilz(String str, jyz jyzVar, imj imjVar, Executor executor, kpb kpbVar, ilk ilkVar, jer jerVar) {
        new kub((byte[]) null);
        this.g = null;
        this.a = str;
        this.b = ivc.F(jyzVar);
        this.j = imjVar;
        this.c = executor;
        this.l = kpbVar;
        this.i = ilkVar;
        this.d = jerVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            UUID.randomUUID().toString();
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static jyz b(jyz jyzVar, Closeable closeable, Executor executor) {
        return ivc.R(jyzVar).a(new eyh(closeable, jyzVar, 11, null), executor);
    }

    public static boolean d(IOException iOException) {
        if (!(iOException instanceof ikd) && !(iOException.getCause() instanceof ikd)) {
            return false;
        }
        return true;
    }

    private final Closeable j(Uri uri) {
        try {
            kpb kpbVar = this.l;
            iks iksVar = new iks(true, true);
            iksVar.a = true;
            return (Closeable) kpbVar.n(uri, iksVar);
        } catch (ikk unused) {
            return null;
        }
    }

    @Override // defpackage.img
    public final jxc a() {
        return new eli(this, 17);
    }

    public final Object c(Uri uri) {
        InputStream inputStream;
        try {
            try {
                jax i = iqh.i("Read " + this.a);
                try {
                    inputStream = (InputStream) this.l.n(uri, new ikt(2));
                    try {
                        lkq a = this.j.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        i.close();
                        return a;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        i.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                if (this.l.q(uri)) {
                    inputStream = (InputStream) this.l.n(uri, new ikt(2));
                    try {
                        lkq a2 = this.j.a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        return a2;
                    } finally {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th3) {
                                th.addSuppressed(th3);
                            }
                        }
                    }
                }
                return this.j.a;
            }
        } catch (IOException e) {
            throw hrb.m(this.l, uri, e, this.a);
        }
    }

    public final jyz e(jyz jyzVar) {
        jyz b;
        ilk ilkVar = this.i;
        Integer num = (Integer) ((jfh) ilkVar.f).a;
        if (num.intValue() < 0) {
            b = jyv.a;
        } else {
            jyz jyzVar2 = this.b;
            jyz h = jwu.h(jyzVar2, ilkVar.c, jxv.a);
            b = ivc.T(jyzVar2, h).b(new igf(ilkVar, jyzVar2, h, num, 2), jxv.a);
        }
        return jwu.h(b, jbn.c(new ibz(this, jyzVar, 11)), jxv.a);
    }

    @Override // defpackage.img
    public final String f() {
        return this.a;
    }

    public final Object g(Uri uri) {
        Closeable j;
        synchronized (this.f) {
            Object obj = this.g;
            if (obj != null) {
                return obj;
            }
            try {
                j = j(uri);
            } catch (FileNotFoundException unused) {
                Object c = c(uri);
                synchronized (this.f) {
                    if (!this.h) {
                        this.g = c;
                    } else {
                        c = null;
                    }
                    if (c != null) {
                        return c;
                    }
                    j = j(uri);
                }
            }
            try {
                Object c2 = c(uri);
                synchronized (this.f) {
                    if (j != null) {
                        this.g = c2;
                        j.close();
                    }
                }
                return c2;
            } catch (Throwable th) {
                if (j != null) {
                    try {
                        j.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // defpackage.img
    public final jyz h(jxd jxdVar, Executor executor) {
        return this.k.b(jbn.b(new iht(this, jxdVar, executor, 3)), this.c);
    }

    @Override // defpackage.img
    public final jyz i() {
        synchronized (this.f) {
            Object obj = this.g;
            if (obj != null) {
                return ivc.E(obj);
            }
            return ivc.F(this.m.b(jbn.b(new eli(this, 16)), this.c));
        }
    }
}
