package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class mbr extends lyv {
    protected abstract lyv b();

    @Override // defpackage.lyv
    public void c(String str, Throwable th) {
        b().c(str, th);
    }

    @Override // defpackage.lyv
    public void d() {
        b().d();
    }

    @Override // defpackage.lyv
    public void e(int i) {
        b().e(i);
    }

    public final String toString() {
        jeq q = ivc.q(this);
        q.b("delegate", b());
        return q.toString();
    }
}
