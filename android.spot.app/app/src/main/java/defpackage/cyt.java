package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cyt {
    public static final Executor a = Executors.newCachedThreadPool();
    public volatile cyr b;
    private final Set c;
    private final Set d;
    private final Handler e;

    public cyt(Callable callable) {
        this(callable, false);
    }

    public final synchronized void a(Throwable th) {
        ArrayList arrayList = new ArrayList(this.d);
        if (arrayList.isEmpty()) {
            deu.b("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cyo) arrayList.get(i)).a(th);
        }
    }

    public final synchronized void b(Object obj) {
        ArrayList arrayList = new ArrayList(this.c);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cyo) arrayList.get(i)).a(obj);
        }
    }

    public final void c(cyr cyrVar) {
        if (this.b == null) {
            this.b = cyrVar;
            this.e.post(new col(this, 7, null));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public final synchronized void d(cyo cyoVar) {
        Throwable th;
        cyr cyrVar = this.b;
        if (cyrVar != null && (th = cyrVar.b) != null) {
            cyoVar.a(th);
        }
        this.d.add(cyoVar);
    }

    public final synchronized void e(cyo cyoVar) {
        Object obj;
        cyr cyrVar = this.b;
        if (cyrVar != null && (obj = cyrVar.a) != null) {
            cyoVar.a(obj);
        }
        this.c.add(cyoVar);
    }

    public final synchronized void f(cyo cyoVar) {
        this.d.remove(cyoVar);
    }

    public final synchronized void g(cyo cyoVar) {
        this.c.remove(cyoVar);
    }

    public cyt(Callable callable, boolean z) {
        this.c = new LinkedHashSet(1);
        this.d = new LinkedHashSet(1);
        this.e = new Handler(Looper.getMainLooper());
        this.b = null;
        if (z) {
            try {
                c((cyr) callable.call());
                return;
            } catch (Throwable th) {
                c(new cyr(th));
                return;
            }
        }
        a.execute(new cys(this, callable));
    }
}
