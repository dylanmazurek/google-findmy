package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gam extends jwq {
    Object a;
    Runnable b;

    public gam(Object obj, Runnable runnable) {
        this.a = obj;
        this.b = runnable;
    }

    @Override // defpackage.jwq
    public final String a() {
        Object obj = this.a;
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    @Override // defpackage.jwq
    protected final void b() {
        this.a = null;
        if (this.b != null && isCancelled()) {
            this.b.run();
        }
        this.b = null;
    }

    @Override // defpackage.jwq
    public final boolean d(Object obj) {
        return super.d(obj);
    }
}
