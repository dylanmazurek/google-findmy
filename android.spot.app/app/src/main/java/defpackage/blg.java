package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blg implements ble {
    private final float a;
    private final float b;
    private final blr c;

    public blg(float f, float f2, blr blrVar) {
        this.a = f;
        this.b = f2;
        this.c = blrVar;
    }

    @Override // defpackage.ble
    public final float a() {
        return this.a;
    }

    @Override // defpackage.blj
    public final float b() {
        return this.b;
    }

    @Override // defpackage.blj
    public final float cc(long j) {
        if (a.n(blp.c(j), 4294967296L)) {
            return this.c.b(blp.a(j));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cf(float f) {
        return bbc.b(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float cg(int i) {
        return bbc.c(this, i);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ch(long j) {
        return bbc.d(this, j);
    }

    @Override // defpackage.ble
    public final /* synthetic */ float ci(float f) {
        return bbc.e(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ int cj(float f) {
        throw null;
    }

    @Override // defpackage.ble
    public final /* synthetic */ long ck(long j) {
        return bbc.g(this, j);
    }

    @Override // defpackage.blj
    public final long cl(float f) {
        return bef.i(this.c.a(f));
    }

    @Override // defpackage.ble
    public final /* synthetic */ long cm(float f) {
        return bbc.h(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blg)) {
            return false;
        }
        blg blgVar = (blg) obj;
        if (Float.compare(this.a, blgVar.a) == 0 && Float.compare(this.b, blgVar.b) == 0 && amr.i(this.c, blgVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.a + ", fontScale=" + this.b + ", converter=" + this.c + ')';
    }
}
