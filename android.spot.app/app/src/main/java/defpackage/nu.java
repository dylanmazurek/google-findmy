package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nu {
    public final float a;
    private final float b;
    private final float c;
    private final int d;

    public nu(BackEvent backEvent) {
        backEvent.getClass();
        float b = nt.a.b(backEvent);
        float c = nt.a.c(backEvent);
        float a = nt.a.a(backEvent);
        int d = nt.a.d(backEvent);
        this.b = b;
        this.c = c;
        this.a = a;
        this.d = d;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.b + ", touchY=" + this.c + ", progress=" + this.a + ", swipeEdge=" + this.d + '}';
    }
}
