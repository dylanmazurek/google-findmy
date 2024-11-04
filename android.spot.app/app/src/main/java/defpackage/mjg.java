package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mjg extends mfc {
    static final lyo b = new lyo("io.grpc.internal.RetryingNameResolver.RESOLUTION_RESULT_LISTENER_KEY");
    public final mje c;
    public final mcf d;

    public mjg(mbn mbnVar, mje mjeVar, mcf mcfVar) {
        super(mbnVar);
        this.c = mjeVar;
        this.d = mcfVar;
    }

    @Override // defpackage.mfc, defpackage.mbn
    public final void c() {
        this.a.c();
        this.c.a();
    }

    @Override // defpackage.mbn
    public final void d(mbk mbkVar) {
        this.a.d(new mjf(this, mbkVar));
    }
}
