package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npo extends npm {
    public final nnq b;

    /* JADX INFO: Access modifiers changed from: protected */
    public npo(nnq nnqVar, nns nnsVar) {
        super(nnsVar);
        if (nnqVar != null) {
            if (nnqVar.w()) {
                this.b = nnqVar;
                return;
            }
            throw new IllegalArgumentException("The field must be supported");
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    @Override // defpackage.npm, defpackage.nnq
    public int a(long j) {
        throw null;
    }

    @Override // defpackage.npm, defpackage.nnq
    public int c() {
        throw null;
    }

    @Override // defpackage.nnq
    public int d() {
        throw null;
    }

    @Override // defpackage.npm, defpackage.nnq
    public long g(long j) {
        throw null;
    }

    @Override // defpackage.npm, defpackage.nnq
    public long h(long j, int i) {
        return this.b.h(j, i);
    }

    @Override // defpackage.npm, defpackage.nnq
    public nnx s() {
        return this.b.s();
    }

    @Override // defpackage.nnq
    public nnx u() {
        return this.b.u();
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
