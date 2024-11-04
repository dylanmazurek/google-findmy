package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class npx extends npn {
    private static final long serialVersionUID = -8346152187724495365L;
    private final long a;

    public npx(nnz nnzVar, long j) {
        super(nnzVar);
        this.a = j;
    }

    @Override // defpackage.nnx
    public final long a(long j, int i) {
        return moz.ax(j, i * this.a);
    }

    @Override // defpackage.nnx
    public final long b(long j, long j2) {
        long j3 = this.a;
        if (j2 != 1) {
            long j4 = 0;
            if (j2 != 0) {
                j4 = j2 * j3;
                if (j4 / j3 != j2) {
                    throw new ArithmeticException("Multiplication overflows a long: " + j2 + " * " + j3);
                }
            }
            j3 = j4;
        }
        return moz.ax(j, j3);
    }

    @Override // defpackage.nnx
    public final long c() {
        return this.a;
    }

    @Override // defpackage.nnx
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof npx) {
            npx npxVar = (npx) obj;
            if (this.d == npxVar.d && this.a == npxVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((int) this.a) + this.d.hashCode();
    }
}
