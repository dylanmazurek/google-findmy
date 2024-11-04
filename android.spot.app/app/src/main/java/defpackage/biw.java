package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biw {
    public final int a = 1;

    public static String a() {
        if (a.m(1, 0)) {
            return "None";
        }
        if (a.m(1, 1)) {
            return "All";
        }
        if (a.m(1, 2)) {
            return "Weight";
        }
        if (a.m(1, 3)) {
            return "Style";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof biw)) {
            return false;
        }
        int i = ((biw) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return a();
    }
}
