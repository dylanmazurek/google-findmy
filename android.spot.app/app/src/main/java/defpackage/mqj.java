package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mqj extends mqh implements mqe {
    public mqj(long j, long j2) {
        super(j, j2);
    }

    @Override // defpackage.mqe
    public final /* bridge */ /* synthetic */ Comparable a() {
        return Long.valueOf(this.b);
    }

    @Override // defpackage.mqe
    public final /* bridge */ /* synthetic */ Comparable b() {
        return Long.valueOf(this.a);
    }

    @Override // defpackage.mqh, defpackage.mqe
    public final boolean c() {
        if (this.a > this.b) {
            return true;
        }
        return false;
    }

    public final boolean d(long j) {
        if (this.a <= j && j <= this.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.mqh
    public final boolean equals(Object obj) {
        if (!(obj instanceof mqj)) {
            return false;
        }
        if (c() && ((mqj) obj).c()) {
            return true;
        }
        mqj mqjVar = (mqj) obj;
        if (this.a != mqjVar.a || this.b != mqjVar.b) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mqh
    public final int hashCode() {
        if (c()) {
            return -1;
        }
        long j = this.a;
        long j2 = this.b;
        return (int) (((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32)));
    }

    @Override // defpackage.mqh
    public final String toString() {
        return this.a + ".." + this.b;
    }
}
