package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilp implements img {
    public final String a;
    public final jyz b;
    public final Executor c;
    public final imj e;
    public final kpb g;
    private final jer h;
    public final ilf d = new ily(this, 1);
    public final kub f = new kub((byte[]) null);

    public ilp(String str, jyz jyzVar, imj imjVar, Executor executor, kpb kpbVar, jer jerVar) {
        this.a = str;
        this.b = ivc.F(jyzVar);
        this.e = imjVar;
        this.c = executor;
        this.g = kpbVar;
        this.h = jerVar;
    }

    public static jyz b(jyz jyzVar, Closeable closeable) {
        return ivc.R(jyzVar).a(new eyh(closeable, jyzVar, 10, null), jxv.a);
    }

    public static boolean g(IOException iOException) {
        if (!(iOException instanceof ikd) && !(iOException.getCause() instanceof ikd)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.img
    public final jxc a() {
        return new eli(this, 14);
    }

    public final jyz c(Uri uri, ilo iloVar) {
        try {
            return ivc.E(e(uri));
        } catch (IOException e) {
            if (!this.h.g()) {
                return ivc.D(e);
            }
            if (g(e)) {
                return ivc.D(e);
            }
            return jwu.h(iloVar.a(e, (jck) this.h.c()), jbn.c(new ibz(this, uri, 10, null)), this.c);
        }
    }

    public final jyz d(jyz jyzVar) {
        return jwu.h(jyzVar, jbn.c(new ifl(this, 10)), this.c);
    }

    public final lkq e(Uri uri) {
        InputStream inputStream;
        try {
            try {
                jax i = iqh.i("Read " + this.a);
                try {
                    inputStream = (InputStream) this.g.n(uri, new ikt(2));
                    try {
                        lkq a = this.e.a(inputStream);
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
                if (this.g.q(uri)) {
                    inputStream = (InputStream) this.g.n(uri, new ikt(2));
                    try {
                        lkq a2 = this.e.a(inputStream);
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
                return this.e.a;
            }
        } catch (IOException e) {
            throw hrb.m(this.g, uri, e, this.a);
        }
    }

    @Override // defpackage.img
    public final String f() {
        return this.a;
    }

    @Override // defpackage.img
    public final jyz h(jxd jxdVar, Executor executor) {
        return this.f.b(jbn.b(new iht(this, jxdVar, executor, 2)), this.c);
    }

    @Override // defpackage.img
    public final jyz i() {
        return ivc.F(ivc.J(jbn.b(new eli(this, 15)), this.c));
    }
}
