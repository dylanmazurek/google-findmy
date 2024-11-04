package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioi extends AnimatorListenerAdapter {
    final /* synthetic */ BottomSheetBehavior a;

    public ioi(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.I(5);
        WeakReference weakReference = this.a.C;
        if (weakReference != null && weakReference.get() != null) {
            ((View) this.a.C.get()).requestLayout();
        }
    }
}
