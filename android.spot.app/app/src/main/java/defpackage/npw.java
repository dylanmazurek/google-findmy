package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class npw extends npm {
    final long a;
    private final nnx b;

    public npw(nns nnsVar, nnx nnxVar) {
        super(nnsVar);
        if (nnxVar.e()) {
            long c = nnxVar.c();
            this.a = c;
            if (c >= 1) {
                this.b = nnxVar;
                return;
            }
            throw new IllegalArgumentException("The unit milliseconds must be at least 1");
        }
        throw new IllegalArgumentException("Unit duration field must be precise");
    }

    @Override // defpackage.nnq
    public int d() {
        return 0;
    }

    @Override // defpackage.npm, defpackage.nnq
    public long f(long j) {
        if (j >= 0) {
            return j % this.a;
        }
        long j2 = this.a;
        return (((j + 1) % j2) + j2) - 1;
    }

    @Override // defpackage.npm, defpackage.nnq
    public long g(long j) {
        long j2;
        if (j >= 0) {
            j2 = j % this.a;
        } else {
            long j3 = j + 1;
            j2 = this.a;
            j = j3 - (j3 % j2);
        }
        return j - j2;
    }

    @Override // defpackage.npm, defpackage.nnq
    public long h(long j, int i) {
        moz.ay(this, i, d(), z(j, i));
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.npm, defpackage.nnq
    public final nnx s() {
        return this.b;
    }

    protected int z(long j, int i) {
        return y(j);
    }

    @Override // defpackage.nnq
    public final void x() {
    }
}
