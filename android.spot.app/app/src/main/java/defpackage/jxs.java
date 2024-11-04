package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxs extends jxt {
    final /* synthetic */ jxu a;
    private final Callable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxs(jxu jxuVar, Callable callable, Executor executor) {
        super(jxuVar, executor);
        this.a = jxuVar;
        this.c = callable;
    }

    @Override // defpackage.jyx
    public final Object a() {
        return this.c.call();
    }

    @Override // defpackage.jyx
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.jxt
    public final void c(Object obj) {
        this.a.d(obj);
    }
}
