package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class biv {
    public final int a = 0;

    @mkp
    public /* synthetic */ biv() {
    }

    public static String a() {
        if (a.m(0, 0)) {
            return "Normal";
        }
        if (a.m(0, 1)) {
            return "Italic";
        }
        return "Invalid";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof biv)) {
            return false;
        }
        int i = ((biv) obj).a;
        return true;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return a();
    }
}
