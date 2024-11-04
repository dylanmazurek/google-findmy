package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class blf implements ble {
    private final float a = 1.0f;
    private final float b = 1.0f;

    @Override // defpackage.ble
    public final float a() {
        return 1.0f;
    }

    @Override // defpackage.blj
    public final float b() {
        return 1.0f;
    }

    @Override // defpackage.blj
    public final /* synthetic */ float cc(long j) {
        return bbp.e(this, j);
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
    public final /* synthetic */ long cl(float f) {
        return bbp.f(this, f);
    }

    @Override // defpackage.ble
    public final /* synthetic */ long cm(float f) {
        return bbc.h(this, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blf)) {
            return false;
        }
        blf blfVar = (blf) obj;
        float f = blfVar.a;
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        float f2 = blfVar.b;
        if (Float.compare(1.0f, 1.0f) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(1.0f) * 31) + Float.floatToIntBits(1.0f);
    }

    public final String toString() {
        return "DensityImpl(density=1.0, fontScale=1.0)";
    }
}
