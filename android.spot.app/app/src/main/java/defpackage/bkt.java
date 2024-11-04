package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkt {
    public static final bkt a = new bkt(bks.b, 17);
    public final float b;
    public final int c;

    public bkt(float f, int i) {
        this.b = f;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkt)) {
            return false;
        }
        bkt bktVar = (bkt) obj;
        if (Float.compare(this.b, bktVar.b) == 0 && a.m(this.c, bktVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.b) * 31) + this.c;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineHeightStyle(alignment=");
        float f = bks.a;
        float f2 = this.b;
        if (f2 == 0.0f) {
            str = "LineHeightStyle.Alignment.Top";
        } else if (f2 == bks.a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (f2 == bks.b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (f2 == bks.c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }
        sb.append((Object) str);
        sb.append(", trim=");
        int i = this.c;
        if (i == 1) {
            str2 = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str2 = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str2 = "LineHeightStyle.Trim.Both";
        } else if (i == 0) {
            str2 = "LineHeightStyle.Trim.None";
        } else {
            str2 = "Invalid";
        }
        sb.append((Object) str2);
        sb.append(')');
        return sb.toString();
    }
}
