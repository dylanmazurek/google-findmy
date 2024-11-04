package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atr {
    public final int a;

    public /* synthetic */ atr(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof atr) && this.a == ((atr) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = this.a;
        if (a.m(i, 1)) {
            return "Touch";
        }
        if (a.m(i, 2)) {
            return "Keyboard";
        }
        return "Error";
    }
}
