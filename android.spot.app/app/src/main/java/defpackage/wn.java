package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wn implements vf {
    private final int a;
    private final int b;
    private final vg c;

    public wn() {
        this(0, (vg) null, 7);
    }

    @Override // defpackage.uu
    public final /* bridge */ /* synthetic */ wq a(atk atkVar) {
        return b();
    }

    public final wz b() {
        return new wz(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wn) {
            wn wnVar = (wn) obj;
            if (wnVar.a == this.a && wnVar.b == this.b && amr.i(wnVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public wn(int i, int i2, vg vgVar) {
        this.a = i;
        this.b = i2;
        this.c = vgVar;
    }

    public /* synthetic */ wn(int i, vg vgVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? vi.a : vgVar);
    }
}
