package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npv extends npw {
    private final int b;
    private final nnx c;

    public npv(nns nnsVar, nnx nnxVar, nnx nnxVar2) {
        super(nnsVar, nnxVar);
        if (nnxVar2.e()) {
            int c = (int) (nnxVar2.c() / this.a);
            this.b = c;
            if (c >= 2) {
                this.c = nnxVar2;
                return;
            }
            throw new IllegalArgumentException("The effective range must be at least 2");
        }
        throw new IllegalArgumentException("Range duration field must be precise");
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int a(long j) {
        if (j >= 0) {
            return (int) ((j / this.a) % this.b);
        }
        int i = this.b;
        return (i - 1) + ((int) (((j + 1) / this.a) % i));
    }

    @Override // defpackage.npm, defpackage.nnq
    public final int c() {
        return this.b - 1;
    }

    @Override // defpackage.npw, defpackage.npm, defpackage.nnq
    public final long h(long j, int i) {
        moz.ay(this, i, 0, c());
        return j + ((i - a(j)) * this.a);
    }

    @Override // defpackage.nnq
    public final nnx u() {
        return this.c;
    }
}
