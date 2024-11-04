package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqg extends mqf implements mqe {
    public static final mqg d = new mqg(1, 0);

    public mqg(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.mqe
    public final /* bridge */ /* synthetic */ Comparable a() {
        throw null;
    }

    @Override // defpackage.mqe
    public final /* bridge */ /* synthetic */ Comparable b() {
        throw null;
    }

    @Override // defpackage.mqf, defpackage.mqe
    public final boolean c() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mqf
    public final boolean equals(Object obj) {
        if (!(obj instanceof mqg)) {
            return false;
        }
        if (c() && ((mqg) obj).c()) {
            return true;
        }
        mqg mqgVar = (mqg) obj;
        if (this.a != mqgVar.a || this.b != mqgVar.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mqf
    public final int hashCode() {
        if (c()) {
            return -1;
        }
        return (this.a * 31) + this.b;
    }

    @Override // defpackage.mqf
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
