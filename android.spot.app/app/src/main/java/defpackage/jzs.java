package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzs extends jyx {
    final /* synthetic */ jzt a;
    private final Callable b;

    public jzs(jzt jztVar, Callable callable) {
        this.a = jztVar;
        callable.getClass();
        this.b = callable;
    }

    @Override // defpackage.jyx
    public final Object a() {
        return this.b.call();
    }

    @Override // defpackage.jyx
    public final String b() {
        return this.b.toString();
    }

    @Override // defpackage.jyx
    public final void d(Throwable th) {
        this.a.n(th);
    }

    @Override // defpackage.jyx
    public final void e(Object obj) {
        this.a.d(obj);
    }

    @Override // defpackage.jyx
    public final boolean g() {
        return this.a.isDone();
    }
}
