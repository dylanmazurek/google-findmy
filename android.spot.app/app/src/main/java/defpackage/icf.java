package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class icf implements ibh {
    boolean a = false;
    final /* synthetic */ iay b;
    final /* synthetic */ ici c;

    public icf(ici iciVar, iay iayVar) {
        this.b = iayVar;
        this.c = iciVar;
    }

    @Override // defpackage.ibh
    public final void a() {
        if (this.a) {
            ((jni) ((jni) ici.a.g().h(flv.a, 284)).j("com/google/android/libraries/spot/ble/EddystoneScannerImpl$2", "start", 519, "EddystoneScannerImpl.java")).r("Ignoring attempt to start an already closed scan process");
            return;
        }
        ici iciVar = this.c;
        iciVar.b.a(this.b);
    }

    @Override // defpackage.ibh, java.lang.AutoCloseable
    public final void close() {
        this.a = true;
        this.c.b.b(this.b);
    }
}
