package defpackage;

import android.content.Context;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class buw {
    public final Object a;

    public buw(Context context) {
        this.a = context;
    }

    public final void a(boolean z) {
        ((GestureDetector) this.a).setIsLongpressEnabled(z);
    }

    public final boolean b(MotionEvent motionEvent) {
        return ((GestureDetector) this.a).onTouchEvent(motionEvent);
    }

    public final boolean c() {
        FingerprintManager c;
        if (Build.VERSION.SDK_INT < 23 || (c = bsn.c((Context) this.a)) == null || !bsn.f(c)) {
            return false;
        }
        return true;
    }

    public final boolean d() {
        FingerprintManager c;
        if (Build.VERSION.SDK_INT < 23 || (c = bsn.c((Context) this.a)) == null || !bsn.g(c)) {
            return false;
        }
        return true;
    }

    public buw(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.a = new GestureDetector(context, onGestureListener, null);
    }
}
