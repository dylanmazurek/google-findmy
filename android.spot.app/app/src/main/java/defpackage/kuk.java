package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kuk extends cgk {
    public final kuv b;
    public List c;
    private volatile ExecutorService e;
    public final cfn a = new cfn();
    private final Object d = new Object();

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Set, java.lang.Object] */
    public kuk(Context context) {
        kuv b = kuv.b(context);
        this.b = b;
        hwx.X(b.b.add(this), "Registered listener twice: %s", this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cfk a(List list) {
        list.getClass();
        this.c = list;
        d();
        return this.a;
    }

    public final Executor b() {
        if (this.e == null) {
            synchronized (this.d) {
                if (this.e == null) {
                    lzt lztVar = new lzt(null, null, null);
                    lztVar.r(true);
                    lztVar.s("XrpcDebugMenu-%d");
                    this.e = Executors.newSingleThreadExecutor(lzt.z(lztVar));
                }
            }
        }
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.cgk
    public final void c() {
        hwx.X(this.b.b.remove(this), "Tried to unregister listener before registering: %s", this);
        this.e.shutdown();
    }

    public final void d() {
        jza jzaVar = new jza(new kqg(this, 3));
        iuu.q(jzaVar, new dup(this, 19), jxv.a);
        b().execute(jzaVar);
    }
}
