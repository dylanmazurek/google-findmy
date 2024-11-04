package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iho implements ihn {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/clientactions/ClientActionResultReporterImpl");
    public final lim b;
    public final jer c;
    public final AtomicInteger d;
    public final ddg e;
    private final Executor f;
    private final Object g;
    private volatile jyz h;

    public iho(ddg ddgVar, Executor executor, lim limVar, lim limVar2) {
        jer i;
        this.e = ddgVar;
        this.f = executor;
        this.b = limVar;
        if (limVar2.z()) {
            i = jdl.a;
        } else {
            i = jer.i(limVar2);
        }
        this.c = i;
        this.d = new AtomicInteger(0);
        this.g = new Object();
        this.h = jyv.a;
    }

    @Override // defpackage.ihn
    public final jyz a(kxy kxyVar) {
        jbx b;
        kxyVar.getClass();
        synchronized (this.g) {
            b = jbx.d(this.h).f(new ibz(this, kxyVar, 9), this.f).b(Throwable.class, new igw(4), jxv.a);
            this.h = b;
        }
        return b;
    }
}
