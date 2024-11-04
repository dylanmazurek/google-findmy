package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jxr extends jxt {
    final /* synthetic */ jxu a;
    private final jxc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jxr(jxu jxuVar, jxc jxcVar, Executor executor) {
        super(jxuVar, executor);
        this.a = jxuVar;
        this.c = jxcVar;
    }

    @Override // defpackage.jyx
    public final /* bridge */ /* synthetic */ Object a() {
        jyz a = this.c.a();
        a.getClass();
        return a;
    }

    @Override // defpackage.jyx
    public final String b() {
        return this.c.toString();
    }

    @Override // defpackage.jxt
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        this.a.o((jyz) obj);
    }
}
