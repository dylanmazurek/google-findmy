package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class npp extends npn {
    private static final long serialVersionUID = 8019982251647420015L;
    public final nnx a;

    public npp(nnx nnxVar, nnz nnzVar) {
        super(nnzVar);
        if (nnxVar.f()) {
            this.a = nnxVar;
            return;
        }
        throw new IllegalArgumentException("The field must be supported");
    }

    @Override // defpackage.nnx
    public long a(long j, int i) {
        return this.a.a(j, i);
    }

    @Override // defpackage.nnx
    public long b(long j, long j2) {
        return this.a.b(j, j2);
    }

    @Override // defpackage.nnx
    public long c() {
        return this.a.c();
    }

    @Override // defpackage.nnx
    public final boolean e() {
        return this.a.e();
    }
}
