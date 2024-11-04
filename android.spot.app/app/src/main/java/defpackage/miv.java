package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.common.CirclePulseDrawable;
import java.util.ArrayDeque;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class miv {
    public final Object a;
    public boolean b;
    public Object c;

    public miv() {
        this.a = new Object();
    }

    public static AnimatorSet e(CirclePulseDrawable circlePulseDrawable, String str, int i, long j, long j2) {
        ObjectAnimator duration = ObjectAnimator.ofInt(circlePulseDrawable, str, 0, i).setDuration(j);
        duration.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator duration2 = ObjectAnimator.ofInt(circlePulseDrawable, str, i, 0).setDuration(j2);
        duration2.setInterpolator(new AccelerateInterpolator());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        return animatorSet;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.concurrent.Future, java.lang.Object] */
    public final Future a() {
        this.b = true;
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Future future) {
        boolean z;
        synchronized (this.a) {
            z = this.b;
            if (!z) {
                this.c = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Queue] */
    public final void c(fxt fxtVar) {
        synchronized (this.a) {
            if (this.c == null) {
                this.c = new ArrayDeque();
            }
            this.c.add(fxtVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Queue] */
    public final void d(fxs fxsVar) {
        fxt fxtVar;
        synchronized (this.a) {
            if (this.c != null && !this.b) {
                this.b = true;
                while (true) {
                    synchronized (this.a) {
                        fxtVar = (fxt) this.c.poll();
                        if (fxtVar == null) {
                            this.b = false;
                            return;
                        }
                    }
                    fxtVar.b(fxsVar);
                }
            }
        }
    }

    public miv(Object obj) {
        this.a = obj;
    }

    public miv(byte[] bArr) {
        this.b = false;
        this.c = null;
        this.a = null;
    }

    public miv(Context context) {
        int Y = frx.Y(context, R.attr.ogCriticalAlertRingColor);
        this.a = new CirclePulseDrawable(new ColorDrawable(0), Y, Y);
    }
}
