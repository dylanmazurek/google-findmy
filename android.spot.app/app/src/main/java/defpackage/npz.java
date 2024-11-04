package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npz extends npp {
    private static final long serialVersionUID = -3205227092378684157L;
    private final int b;

    public npz(nnx nnxVar, nnz nnzVar) {
        super(nnxVar, nnzVar);
        this.b = 100;
    }

    @Override // defpackage.npp, defpackage.nnx
    public final long a(long j, int i) {
        return this.a.b(j, i * 100);
    }

    @Override // defpackage.npp, defpackage.nnx
    public final long b(long j, long j2) {
        long j3 = j2 * 100;
        if (j3 / 100 == j2) {
            return this.a.b(j, j3);
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * 100");
    }

    @Override // defpackage.npp, defpackage.nnx
    public final long c() {
        return this.a.c() * 100;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof npz) {
            npz npzVar = (npz) obj;
            if (this.a.equals(npzVar.a) && this.d == npzVar.d) {
                int i = npzVar.b;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + 100 + this.a.hashCode();
    }
}
