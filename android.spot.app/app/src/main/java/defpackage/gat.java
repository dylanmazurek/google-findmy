package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gat extends mjo {
    public final Object a;
    public gas b;
    public boolean c;
    public final hsb d;

    public gat(hsb hsbVar) {
        super(null);
        this.a = new Object();
        this.c = false;
        this.d = hsbVar;
        if (!ivc.o("application/grpc")) {
            hsbVar.k = "application/grpc";
        }
    }

    @Override // defpackage.mjo
    public final lyy R() {
        synchronized (this.a) {
            if (this.b != null) {
                return new lyy();
            }
            gas gasVar = new gas(this.d);
            this.b = gasVar;
            return gasVar;
        }
    }
}
