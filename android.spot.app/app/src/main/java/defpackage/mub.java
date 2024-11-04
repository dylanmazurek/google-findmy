package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mub implements muc {
    private final moh a;

    public mub(moh mohVar) {
        this.a = mohVar;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        this.a.a(th);
    }

    public final String toString() {
        return "InternalCompletionHandler.UserSupplied[" + msz.a(this.a) + "@" + msz.b(this) + "]";
    }
}
