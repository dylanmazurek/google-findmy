package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apr {
    public final int a;

    public /* synthetic */ apr(int i) {
        this.a = i;
    }

    public static String a(int i) {
        if (a.m(i, 1)) {
            return "Next";
        }
        if (a.m(i, 2)) {
            return "Previous";
        }
        if (a.m(i, 3)) {
            return "Left";
        }
        if (a.m(i, 4)) {
            return "Right";
        }
        if (a.m(i, 5)) {
            return "Up";
        }
        if (a.m(i, 6)) {
            return "Down";
        }
        if (a.m(i, 7)) {
            return "Enter";
        }
        if (a.m(i, 8)) {
            return "Exit";
        }
        return "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof apr) && this.a == ((apr) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
