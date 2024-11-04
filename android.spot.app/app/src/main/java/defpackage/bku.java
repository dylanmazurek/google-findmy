package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bku {
    public final int a = 3;

    public static String a(int i) {
        if (a.m(i, 1)) {
            return "Left";
        }
        if (a.m(i, 2)) {
            return "Right";
        }
        if (a.m(i, 3)) {
            return "Center";
        }
        if (a.m(i, 4)) {
            return "Justify";
        }
        if (a.m(i, 5)) {
            return "Start";
        }
        if (a.m(i, 6)) {
            return "End";
        }
        if (a.m(i, Integer.MIN_VALUE)) {
            return "Unspecified";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bku)) {
            return false;
        }
        int i = ((bku) obj).a;
        return true;
    }

    public final int hashCode() {
        return 3;
    }

    public final String toString() {
        return a(3);
    }
}
