package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aav {
    public int a;

    public aav(int i) {
        this.a = i;
    }

    public final boolean a() {
        if (this.a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return super.toString() + "{ location = " + this.a + " }";
    }
}
