package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nrd {
    public final long a;
    public final nnw b;
    nrd c;
    private String d;
    private int e = Integer.MIN_VALUE;
    private int f = Integer.MIN_VALUE;

    public nrd(nnw nnwVar, long j) {
        this.a = j;
        this.b = nnwVar;
    }

    public final int a(long j) {
        nrd nrdVar = this.c;
        if (nrdVar != null && j >= nrdVar.a) {
            return nrdVar.a(j);
        }
        int i = this.e;
        if (i == Integer.MIN_VALUE) {
            int a = this.b.a(this.a);
            this.e = a;
            return a;
        }
        return i;
    }

    public final int b(long j) {
        nrd nrdVar = this.c;
        if (nrdVar != null && j >= nrdVar.a) {
            return nrdVar.b(j);
        }
        int i = this.f;
        if (i == Integer.MIN_VALUE) {
            int c = this.b.c(this.a);
            this.f = c;
            return c;
        }
        return i;
    }

    public final String c(long j) {
        nrd nrdVar = this.c;
        if (nrdVar != null && j >= nrdVar.a) {
            return nrdVar.c(j);
        }
        if (this.d == null) {
            this.d = this.b.g(this.a);
        }
        return this.d;
    }
}
