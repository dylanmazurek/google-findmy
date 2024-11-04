package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class npj extends npn {
    private static final long serialVersionUID = -485345310999208286L;
    final nnx a;
    final boolean b;
    final nnw c;

    public npj(nnx nnxVar, nnw nnwVar) {
        super(nnxVar.d());
        if (nnxVar.f()) {
            this.a = nnxVar;
            this.b = npk.P(nnxVar);
            this.c = nnwVar;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final int g(long j) {
        int b = this.c.b(j);
        long j2 = b;
        if (((j - j2) ^ j) < 0 && (j ^ j2) < 0) {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }
        return b;
    }

    private final int h(long j) {
        int a = this.c.a(j);
        long j2 = a;
        if (((j + j2) ^ j) < 0 && (j ^ j2) >= 0) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return a;
    }

    @Override // defpackage.nnx
    public final long a(long j, int i) {
        int h = h(j);
        boolean z = this.b;
        long a = this.a.a(j + h, i);
        if (!z) {
            h = g(a);
        }
        return a - h;
    }

    @Override // defpackage.nnx
    public final long b(long j, long j2) {
        int h = h(j);
        boolean z = this.b;
        long b = this.a.b(j + h, j2);
        if (!z) {
            h = g(b);
        }
        return b - h;
    }

    @Override // defpackage.nnx
    public final long c() {
        return this.a.c();
    }

    @Override // defpackage.nnx
    public final boolean e() {
        if (this.b) {
            return this.a.e();
        }
        if (this.a.e() && this.c.k()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof npj) {
            npj npjVar = (npj) obj;
            if (this.a.equals(npjVar.a) && this.c.equals(npjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        nnw nnwVar = this.c;
        return nnwVar.hashCode() ^ this.a.hashCode();
    }
}
