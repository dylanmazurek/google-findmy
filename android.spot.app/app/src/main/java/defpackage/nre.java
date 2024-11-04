package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nre extends nnw {
    private static final int e;
    private static final long serialVersionUID = 5472298452022250685L;
    private final nnw f;
    private final transient nrd[] g;

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int intValue = num.intValue() - 1;
            int i2 = 0;
            while (intValue > 0) {
                intValue >>= 1;
                i2++;
            }
            i = 1 << i2;
        }
        e = i - 1;
    }

    public nre(nnw nnwVar) {
        super(nnwVar.c);
        this.g = new nrd[e + 1];
        this.f = nnwVar;
    }

    private final nrd n(long j) {
        int i = (int) (j >> 32);
        int i2 = e & i;
        nrd[] nrdVarArr = this.g;
        nrd nrdVar = nrdVarArr[i2];
        if (nrdVar != null && ((int) (nrdVar.a >> 32)) == i) {
            return nrdVar;
        }
        long j2 = j & (-4294967296L);
        nrd nrdVar2 = new nrd(this.f, j2);
        long j3 = j2;
        nrd nrdVar3 = nrdVar2;
        while (true) {
            long e2 = this.f.e(j3);
            if (e2 == j3 || e2 > (4294967295L | j2)) {
                break;
            }
            nrd nrdVar4 = new nrd(this.f, e2);
            nrdVar3.c = nrdVar4;
            nrdVar3 = nrdVar4;
            j3 = e2;
        }
        nrdVarArr[i2] = nrdVar2;
        return nrdVar2;
    }

    @Override // defpackage.nnw
    public final int a(long j) {
        return n(j).a(j);
    }

    @Override // defpackage.nnw
    public final int c(long j) {
        return n(j).b(j);
    }

    @Override // defpackage.nnw
    public final long e(long j) {
        return this.f.e(j);
    }

    @Override // defpackage.nnw
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nre) {
            return this.f.equals(((nre) obj).f);
        }
        return false;
    }

    @Override // defpackage.nnw
    public final long f(long j) {
        return this.f.f(j);
    }

    @Override // defpackage.nnw
    public final String g(long j) {
        return n(j).c(j);
    }

    @Override // defpackage.nnw
    public final int hashCode() {
        return this.f.hashCode();
    }

    @Override // defpackage.nnw
    public final boolean k() {
        return false;
    }
}
