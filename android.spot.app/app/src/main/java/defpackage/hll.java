package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hll extends GestureDetector.SimpleOnGestureListener {
    final /* synthetic */ ExpandableDialogView a;

    public hll(ExpandableDialogView expandableDialogView) {
        this.a = expandableDialogView;
    }

    private final boolean a(MotionEvent motionEvent) {
        if (!this.a.a.contains(Math.round(motionEvent.getX()), Math.round(motionEvent.getY()))) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return a(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Runnable runnable;
        boolean a = a(motionEvent);
        if (a && (runnable = this.a.j) != null) {
            runnable.run();
            return true;
        }
        return a;
    }
}
