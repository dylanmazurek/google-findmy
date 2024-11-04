package defpackage;

import android.content.Context;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cuj {
    public final Context a;
    public final Object b;
    public final LinkedHashSet c;
    public Object d;
    private final eld e;

    public cuj(Context context, eld eldVar) {
        this.e = eldVar;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.a = applicationContext;
        this.b = new Object();
        this.c = new LinkedHashSet();
    }

    public abstract Object b();

    public abstract void d();

    public abstract void e();

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.concurrent.Executor, java.lang.Object] */
    public final void f(Object obj) {
        synchronized (this.b) {
            Object obj2 = this.d;
            if (obj2 != null && amr.i(obj2, obj)) {
                return;
            }
            this.d = obj;
            this.e.c.execute(new cui(mkm.ag(this.c), this, 0));
        }
    }
}
