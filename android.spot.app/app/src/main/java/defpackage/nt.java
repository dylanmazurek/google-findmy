package defpackage;

import android.window.BackEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nt {
    public static final nt a = new nt();

    private nt() {
    }

    public final float a(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getProgress();
    }

    public final float b(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchX();
    }

    public final float c(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getTouchY();
    }

    public final int d(BackEvent backEvent) {
        backEvent.getClass();
        return backEvent.getSwipeEdge();
    }

    public final BackEvent e(float f, float f2, float f3, int i) {
        return new BackEvent(f, f2, f3, i);
    }
}
