package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imc implements img {
    public final jyz a;
    public final Executor b;
    public final jer c;
    public final kpb f;
    private final String g;
    private final imj h;
    public final Object d = new Object();
    private final kub i = new kub((byte[]) null);
    public jyz e = null;

    public imc(String str, jyz jyzVar, imj imjVar, Executor executor, kpb kpbVar, jer jerVar) {
        this.g = str;
        this.a = ivc.F(jyzVar);
        this.h = imjVar;
        this.b = new jzl(executor);
        this.f = kpbVar;
        this.c = jerVar;
    }

    private final jyz d() {
        jyz jyzVar;
        synchronized (this.d) {
            jyz jyzVar2 = this.e;
            if (jyzVar2 != null && jyzVar2.isDone()) {
                try {
                    ivc.M(this.e);
                } catch (ExecutionException unused) {
                    this.e = null;
                }
            }
            if (this.e == null) {
                this.e = ivc.F(this.i.b(jbn.b(new eli(this, 19)), this.b));
            }
            jyzVar = this.e;
        }
        return jyzVar;
    }

    @Override // defpackage.img
    public final jxc a() {
        return new eli(this, 18);
    }

    public final Object b(Uri uri) {
        try {
            try {
                jax i = iqh.i("Read " + this.g);
                try {
                    InputStream inputStream = (InputStream) this.f.n(uri, new ikt(2));
                    try {
                        lkq a = this.h.a(inputStream);
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
            } catch (FileNotFoundException e) {
                if (!this.f.q(uri)) {
                    return this.h.a;
                }
                throw e;
            }
        } catch (IOException e2) {
            throw hrb.m(this.f, uri, e2, this.g);
        }
    }

    public final void c(Uri uri, Object obj) {
        Uri d = hrc.d(uri, ".tmp");
        try {
            jax i = iqh.i("Write " + this.g);
            try {
                lyn lynVar = new lyn((byte[]) null);
                try {
                    kpb kpbVar = this.f;
                    iky ikyVar = new iky();
                    ikyVar.a = new lyn[]{lynVar};
                    OutputStream outputStream = (OutputStream) kpbVar.n(d, ikyVar);
                    try {
                        ((lkq) obj).f(outputStream);
                        lynVar.n();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        i.close();
                        this.f.p(d, uri);
                    } catch (Throwable th) {
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    throw hrb.m(this.f, uri, e, this.g);
                }
            } finally {
            }
        } catch (IOException e2) {
            if (this.f.q(d)) {
                try {
                    this.f.o(d);
                } catch (IOException e3) {
                    e2.addSuppressed(e3);
                }
            }
            throw e2;
        }
    }

    @Override // defpackage.img
    public final String f() {
        return this.g;
    }

    @Override // defpackage.img
    public final jyz h(jxd jxdVar, Executor executor) {
        return this.i.b(jbn.b(new igf(this, d(), jxdVar, executor, 3)), jxv.a);
    }

    @Override // defpackage.img
    public final jyz i() {
        return d();
    }
}
