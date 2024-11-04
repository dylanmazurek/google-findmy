package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nos extends npw {
    private final nor b;

    public nos(nor norVar, nnx nnxVar) {
        super(nns.i, nnxVar);
        this.b = norVar;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        nor norVar = this.b;
        int Z = norVar.Z(j);
        return norVar.O(j, Z, norVar.U(j, Z));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return 31;
    }

    @Override // defpackage.npw, defpackage.nnq
    public final int d() {
        return 1;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.b.f;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        return this.b.ag(j);
    }

    @Override // defpackage.npm
    public final int y(long j) {
        return this.b.R(j);
    }

    @Override // defpackage.npw
    protected final int z(long j, int i) {
        if (i <= 28 && i > 0) {
            return 28;
        }
        return this.b.R(j);
    }
}
