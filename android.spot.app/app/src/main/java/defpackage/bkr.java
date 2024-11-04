package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkr {
    public static String a(int i) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int d = aqq.d(i);
        String str3 = "Invalid";
        if (a.m(d, 1)) {
            str = "Strategy.Simple";
        } else if (a.m(d, 2)) {
            str = "Strategy.HighQuality";
        } else if (a.m(d, 3)) {
            str = "Strategy.Balanced";
        } else if (!a.m(d, 0)) {
            str = "Invalid";
        } else {
            str = "Strategy.Unspecified";
        }
        sb.append((Object) str);
        sb.append(", strictness=");
        int e = aqq.e(i);
        if (a.m(e, 1)) {
            str2 = "Strictness.None";
        } else if (a.m(e, 2)) {
            str2 = "Strictness.Loose";
        } else if (a.m(e, 3)) {
            str2 = "Strictness.Normal";
        } else if (a.m(e, 4)) {
            str2 = "Strictness.Strict";
        } else if (!a.m(e, 0)) {
            str2 = "Invalid";
        } else {
            str2 = "Strictness.Unspecified";
        }
        sb.append((Object) str2);
        sb.append(", wordBreak=");
        int f = aqq.f(i);
        if (a.m(f, 1)) {
            str3 = "WordBreak.None";
        } else if (a.m(f, 2)) {
            str3 = "WordBreak.Phrase";
        } else if (a.m(f, 0)) {
            str3 = "WordBreak.Unspecified";
        }
        sb.append((Object) str3);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
