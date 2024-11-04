package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msb implements msc {
    private final /* synthetic */ int a;
    private final Object b;

    public msb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [moh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.concurrent.Future, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [mtl, java.lang.Object] */
    @Override // defpackage.msc
    public final void b(Throwable th) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                this.b.dc();
                return;
            } else {
                if (th != null) {
                    this.b.cancel(false);
                    return;
                }
                return;
            }
        }
        this.b.a(th);
    }

    public final String toString() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return "DisposeOnCancel[" + this.b + "]";
            }
            return "CancelFutureOnCancel[" + this.b + "]";
        }
        return "CancelHandler.UserSupplied[" + msz.a(this.b) + "@" + msz.b(this) + "]";
    }
}
