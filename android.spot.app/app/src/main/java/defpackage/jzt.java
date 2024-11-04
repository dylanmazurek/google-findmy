package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzt extends jyd implements RunnableFuture {
    private volatile jyx a;

    public jzt(jxc jxcVar) {
        this.a = new jzr(this, jxcVar);
    }

    public static jzt e(Runnable runnable, Object obj) {
        return new jzt(Executors.callable(runnable, obj));
    }

    @Override // defpackage.jwq
    public final String a() {
        jyx jyxVar = this.a;
        if (jyxVar != null) {
            return der.c(jyxVar, "task=[", "]");
        }
        return super.a();
    }

    @Override // defpackage.jwq
    protected final void b() {
        jyx jyxVar;
        if (p() && (jyxVar = this.a) != null) {
            jyxVar.h();
        }
        this.a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        jyx jyxVar = this.a;
        if (jyxVar != null) {
            jyxVar.run();
        }
        this.a = null;
    }

    public jzt(Callable callable) {
        this.a = new jzs(this, callable);
    }
}
