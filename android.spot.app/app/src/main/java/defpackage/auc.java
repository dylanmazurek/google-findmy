package defpackage;

import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auc {
    public static final auc a = new auc();

    private auc() {
    }

    public final long a(MotionEvent motionEvent, int i) {
        float rawX;
        float rawY;
        rawX = motionEvent.getRawX(i);
        rawY = motionEvent.getRawY(i);
        return a.k(rawX, rawY);
    }
}
