package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioq {
    public int a;
    public boolean b;
    public final /* synthetic */ BottomSheetBehavior c;
    private final Runnable d = new ide(this, 11, null);

    public ioq(BottomSheetBehavior bottomSheetBehavior) {
        this.c = bottomSheetBehavior;
    }

    public final void a(int i) {
        WeakReference weakReference = this.c.C;
        if (weakReference != null && weakReference.get() != null) {
            this.a = i;
            if (!this.b) {
                ((View) this.c.C.get()).postOnAnimation(this.d);
                this.b = true;
            }
        }
    }
}
