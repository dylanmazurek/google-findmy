package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ato extends atq {
    private final long b;
    private final long d;
    private float e;
    private ji f;
    private final bet g;
    private final long a = 0;
    private final int c = 1;

    public ato(bet betVar, long j) {
        this.g = betVar;
        this.b = j;
        if (blk.a(0L) >= 0 && blk.b(0L) >= 0 && blm.b(j) >= 0 && blm.a(j) >= 0 && blm.b(j) <= betVar.x() && blm.a(j) <= betVar.w()) {
            this.d = j;
            this.e = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // defpackage.atq
    public final long a() {
        return bef.n(this.d);
    }

    @Override // defpackage.atq
    protected final void b(asn asnVar) {
        long m = bef.m(Math.round(aqn.b(asnVar.l())), Math.round(aqn.a(asnVar.l())));
        float f = this.e;
        ji jiVar = this.f;
        asp aspVar = asp.a;
        asl aslVar = ((ayt) asnVar).a;
        aqv aqvVar = aslVar.a.c;
        aqs o = aslVar.o(aspVar);
        long b = o.b();
        long j = aqx.a;
        if (!a.n(b, j)) {
            o.e(j);
        }
        if (o.a.getAlpha() / 255.0f != f) {
            o.c(f);
        }
        if (!amr.i(o.c, jiVar)) {
            o.i(jiVar);
        }
        if (!a.m(o.b, 3)) {
            o.d(3);
        }
        if (!a.m(o.a(), 1)) {
            o.h();
        }
        aqvVar.m(this.g, this.b, m, o);
    }

    @Override // defpackage.atq
    protected final void d(ji jiVar) {
        this.f = jiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ato)) {
            return false;
        }
        ato atoVar = (ato) obj;
        if (!amr.i(this.g, atoVar.g)) {
            return false;
        }
        long j = atoVar.a;
        if (!a.n(0L, 0L) || !a.n(this.b, atoVar.b)) {
            return false;
        }
        int i = atoVar.c;
        if (a.m(1, 1)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.g.hashCode() * 31) + a.l(0L)) * 31) + a.l(this.b)) * 31) + 1;
    }

    @Override // defpackage.atq
    protected final void j(float f) {
        this.e = f;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.g);
        sb.append(", srcOffset=");
        sb.append((Object) blk.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) blm.c(this.b));
        sb.append(", filterQuality=");
        if (a.m(1, 0)) {
            str = "None";
        } else if (a.m(1, 1)) {
            str = "Low";
        } else if (a.m(1, 2)) {
            str = "Medium";
        } else if (a.m(1, 3)) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
