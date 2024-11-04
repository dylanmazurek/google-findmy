package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mb {
    public int a = -1;
    private boolean f = false;
    private int g = 0;
    private int b = 0;
    private int c = 0;
    private int d = Integer.MIN_VALUE;
    private Interpolator e = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(RecyclerView recyclerView) {
        int i = this.a;
        if (i >= 0) {
            this.a = -1;
            recyclerView.I(i);
            this.f = false;
            return;
        }
        if (this.f) {
            Interpolator interpolator = this.e;
            if (interpolator != null && this.d <= 0) {
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }
            int i2 = this.d;
            if (i2 > 0) {
                recyclerView.J.c(this.b, this.c, i2, interpolator);
                int i3 = this.g + 1;
                this.g = i3;
                if (i3 > 10) {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                this.f = false;
                return;
            }
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        this.g = 0;
    }

    public final void b(int i, int i2, int i3, Interpolator interpolator) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = interpolator;
        this.f = true;
    }
}
