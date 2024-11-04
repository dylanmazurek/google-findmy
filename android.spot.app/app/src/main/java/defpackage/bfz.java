package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfz {
    public final bga a;
    public final int b;
    public final int c;

    public bfz(bga bgaVar, int i, int i2) {
        this.a = bgaVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfz)) {
            return false;
        }
        bfz bfzVar = (bfz) obj;
        if (amr.i(this.a, bfzVar.a) && this.b == bfzVar.b && this.c == bfzVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.a + ", startIndex=" + this.b + ", endIndex=" + this.c + ')';
    }
}
