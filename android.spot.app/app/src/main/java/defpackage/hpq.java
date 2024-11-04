package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpq {
    public final File a;
    public int b = 0;
    public boolean c = false;
    private final String d;
    private File e;

    public hpq(File file, String str) {
        this.a = file;
        this.d = str;
    }

    public final int a() {
        if (!c()) {
            return 0;
        }
        return this.b;
    }

    public final File b() {
        if (this.e == null) {
            this.e = new File(this.a, this.d.concat("_crash_counter_storage.pb"));
        }
        return this.e;
    }

    public final boolean c() {
        FileInputStream fileInputStream;
        if (this.c) {
            return true;
        }
        try {
            fileInputStream = new FileInputStream(b());
        } catch (FileNotFoundException unused) {
            this.b = 0;
        } catch (IOException e) {
            ((jni) ((jni) ((jni) hmz.a.g()).i(e)).j("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "maybeLoad", 'f', "CrashCounter.java")).r("failed to read counter from disk.");
            return false;
        }
        try {
            lja a = lja.a();
            hpw hpwVar = hpw.c;
            liq J = liq.J(fileInputStream);
            ljn l = hpwVar.l();
            try {
                try {
                    try {
                        try {
                            llg b = lkz.a.b(l);
                            b.l(l, lir.p(J), a);
                            b.g(l);
                            ljn.A(l);
                            this.b = ((hpw) l).b;
                            fileInputStream.close();
                            this.c = true;
                            return true;
                        } catch (RuntimeException e2) {
                            if (e2.getCause() instanceof ljy) {
                                throw ((ljy) e2.getCause());
                            }
                            throw e2;
                        }
                    } catch (IOException e3) {
                        if (e3.getCause() instanceof ljy) {
                            throw ((ljy) e3.getCause());
                        }
                        throw new ljy(e3);
                    }
                } catch (ljy e4) {
                    if (e4.a) {
                        throw new ljy(e4);
                    }
                    throw e4;
                }
            } catch (llo e5) {
                throw e5.a();
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
