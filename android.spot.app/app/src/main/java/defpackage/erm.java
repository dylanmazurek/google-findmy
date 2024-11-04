package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erm {
    public final cyb a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final int f;
    private final boolean g;

    public /* synthetic */ erm(cyb cybVar, String str, String str2, int i, int i2, int i3) {
        i2 = (i3 & 64) != 0 ? 1 : i2;
        if (i2 != 0) {
            int i4 = i3 & 2;
            int i5 = i3 & 4;
            int i6 = i3 & 8;
            int i7 = i3 & 32;
            str = i4 != 0 ? null : str;
            str2 = i5 != 0 ? null : str2;
            i = i6 != 0 ? Integer.MAX_VALUE : i;
            boolean z = i7 != 0;
            this.a = cybVar;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.g = false;
            this.e = z;
            this.f = i2;
            return;
        }
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erm)) {
            return false;
        }
        erm ermVar = (erm) obj;
        if (!amr.i(this.a, ermVar.a) || !amr.i(this.b, ermVar.b) || !amr.i(this.c, ermVar.c) || this.d != ermVar.d) {
            return false;
        }
        boolean z = ermVar.g;
        if (this.e == ermVar.e && this.f == ermVar.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        cyb cybVar = this.a;
        if (cybVar == null) {
            hashCode = 0;
        } else {
            hashCode = cybVar.hashCode();
        }
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i = hashCode * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i2 = (((((((((i + hashCode2) * 31) + hashCode3) * 31) + this.d) * 31) + a.i(false)) * 31) + a.i(this.e)) * 31;
        int i3 = this.f;
        a.V(i3);
        return i2 + i3;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("LottieData(composition=");
        sb.append(this.a);
        sb.append(", minMarker=");
        sb.append(this.b);
        sb.append(", maxMarker=");
        sb.append(this.c);
        sb.append(", iterations=");
        sb.append(this.d);
        sb.append(", reverse=false, isPlaying=");
        sb.append(this.e);
        sb.append(", cancellationBehavior=");
        if (this.f != 1) {
            str = "OnIterationFinish";
        } else {
            str = "Immediately";
        }
        sb.append((Object) str);
        sb.append(")");
        return sb.toString();
    }
}
