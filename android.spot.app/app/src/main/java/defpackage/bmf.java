package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bmf {
    public Object a;
    public bmj b;
    public bml c = new bml();
    public boolean d;

    public final void a(Runnable runnable, Executor executor) {
        bml bmlVar = this.c;
        if (bmlVar != null) {
            bmlVar.c(runnable, executor);
        }
    }

    public final void b() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void c(Object obj) {
        this.d = true;
        bmj bmjVar = this.b;
        if (bmjVar != null && bmjVar.b.f(obj)) {
            b();
        }
    }

    public final void d(Throwable th) {
        this.d = true;
        bmj bmjVar = this.b;
        if (bmjVar != null && bmjVar.a(th)) {
            b();
        }
    }

    protected final void finalize() {
        bml bmlVar;
        bmj bmjVar = this.b;
        if (bmjVar != null && !bmjVar.isDone()) {
            Object obj = this.a;
            Objects.toString(obj);
            bmjVar.a(new bmg("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(obj))));
        }
        if (!this.d && (bmlVar = this.c) != null) {
            bmlVar.f(null);
        }
    }
}
