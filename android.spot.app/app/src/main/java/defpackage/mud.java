package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class mud extends muh {
    private final muc a;
    private final mrp b = new mrp(0, mrs.a);

    public mud(muc mucVar) {
        this.a = mucVar;
    }

    @Override // defpackage.muc
    public final void b(Throwable th) {
        if (this.b.c(0, 1)) {
            this.a.b(th);
        }
    }
}
