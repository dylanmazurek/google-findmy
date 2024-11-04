package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jzr extends jyx {
    final /* synthetic */ jzt a;
    private final jxc b;

    public jzr(jzt jztVar, jxc jxcVar) {
        this.a = jztVar;
        this.b = jxcVar;
    }

    @Override // defpackage.jyx
    public final /* bridge */ /* synthetic */ Object a() {
        jyz a = this.b.a();
        a.getClass();
        return a;
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
    public final /* bridge */ /* synthetic */ void e(Object obj) {
        this.a.o((jyz) obj);
    }

    @Override // defpackage.jyx
    public final boolean g() {
        return this.a.isDone();
    }
}
