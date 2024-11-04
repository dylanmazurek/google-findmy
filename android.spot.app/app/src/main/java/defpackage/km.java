package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class km {
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean h;
    public boolean i;
    public boolean a = true;
    public int f = 0;
    public int g = 0;

    public final boolean a(me meVar) {
        int i = this.c;
        if (i >= 0 && i < meVar.a()) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "LayoutState{mAvailable=" + this.b + ", mCurrentPosition=" + this.c + ", mItemDirection=" + this.d + ", mLayoutDirection=" + this.e + ", mStartLine=" + this.f + ", mEndLine=" + this.g + '}';
    }
}
