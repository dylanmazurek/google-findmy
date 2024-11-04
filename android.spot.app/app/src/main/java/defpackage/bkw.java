package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkw {
    public static String a(int i) {
        if (a.m(i, 1)) {
            return "Ltr";
        }
        if (a.m(i, 2)) {
            return "Rtl";
        }
        if (a.m(i, 3)) {
            return "Content";
        }
        if (a.m(i, 4)) {
            return "ContentOrLtr";
        }
        if (a.m(i, 5)) {
            return "ContentOrRtl";
        }
        if (a.m(i, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
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
