package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class not extends npw {
    private final nor b;

    public not(nor norVar, nnx nnxVar) {
        super(nns.g, nnxVar);
        this.b = norVar;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        nor norVar = this.b;
        return norVar.Q(j, norVar.Z(j));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return 366;
    }

    @Override // defpackage.npw, defpackage.nnq
    public final int d() {
        return 1;
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.b.g;
    }

    @Override // defpackage.npm, defpackage.nnq
    public final boolean v(long j) {
        return this.b.ag(j);
    }

    @Override // defpackage.npm
    public final int y(long j) {
        nor norVar = this.b;
        if (norVar.ah(norVar.Z(j))) {
            return 366;
        }
        return 365;
    }

    @Override // defpackage.npw
    protected final int z(long j, int i) {
        if (i <= 365 && i > 0) {
            return 365;
        }
        return y(j);
    }
}
