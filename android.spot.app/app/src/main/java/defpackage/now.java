package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class now extends npw {
    private final nor b;

    public now(nor norVar, nnx nnxVar) {
        super(nns.l, nnxVar);
        this.b = norVar;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        return this.b.V(j);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return 53;
    }

    @Override // defpackage.npw, defpackage.nnq
    public final int d() {
        return 1;
    }

    @Override // defpackage.npw, defpackage.npm, defpackage.nnq
    public final long f(long j) {
        return super.f(j + 259200000);
    }

    @Override // defpackage.npw, defpackage.npm, defpackage.nnq
    public final long g(long j) {
        return super.g(j + 259200000) - 259200000;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.b.e;
    }

    @Override // defpackage.npm
    public final int y(long j) {
        nor norVar = this.b;
        return norVar.X(norVar.Y(j));
    }

    @Override // defpackage.npw
    protected final int z(long j, int i) {
        if (i <= 52) {
            return 52;
        }
        return y(j);
    }
}
