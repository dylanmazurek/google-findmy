package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class md {
    private final mb a;
    public int b;
    public RecyclerView c;
    public lr d;
    public boolean e;
    public boolean f;
    public View g;
    public boolean h;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    protected int l;
    protected int m;
    private final DisplayMetrics n;
    private boolean o;
    private float p;

    public md() {
        this.b = -1;
        this.a = new mb();
    }

    public static int h(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                return i4 - i2;
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public static final int i(View view) {
        mh h = RecyclerView.h(view);
        if (h != null) {
            return h.b();
        }
        return -1;
    }

    private static int j(int i, int i2) {
        int i3 = i - i2;
        if (i * i3 <= 0) {
            return 0;
        }
        return i3;
    }

    protected float a(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int b(int i) {
        float abs = Math.abs(i);
        if (!this.o) {
            this.p = a(this.n);
            this.o = true;
        }
        return (int) Math.ceil(abs * this.p);
    }

    protected void c(View view, mb mbVar) {
        int i;
        int i2;
        PointF pointF = this.k;
        int i3 = 1;
        int i4 = 0;
        if (pointF != null && pointF.x != 0.0f) {
            if (this.k.x > 0.0f) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        lr lrVar = this.d;
        if (lrVar != null && lrVar.X()) {
            ls lsVar = (ls) view.getLayoutParams();
            i2 = h(lr.bp(view) - lsVar.leftMargin, lr.bq(view) + lsVar.rightMargin, lrVar.getPaddingLeft(), lrVar.C - lrVar.getPaddingRight(), i);
        } else {
            i2 = 0;
        }
        PointF pointF2 = this.k;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (this.k.y <= 0.0f) {
                i3 = -1;
            }
        } else {
            i3 = 0;
        }
        lr lrVar2 = this.d;
        if (lrVar2 != null && lrVar2.Y()) {
            ls lsVar2 = (ls) view.getLayoutParams();
            i4 = h(lr.br(view) - lsVar2.topMargin, lr.bo(view) + lsVar2.bottomMargin, lrVar2.getPaddingTop(), lrVar2.D - lrVar2.getPaddingBottom(), i3);
        }
        int g = g((int) Math.sqrt((i2 * i2) + (i4 * i4)));
        if (g > 0) {
            mbVar.b(-i2, -i4, g, this.j);
        }
    }

    public final PointF d(int i) {
        Object obj = this.d;
        if (obj instanceof mc) {
            return ((mc) obj).L(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement ".concat(String.valueOf(mc.class.getCanonicalName())));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        PointF d;
        RecyclerView recyclerView = this.c;
        if (this.b == -1 || recyclerView == null) {
            f();
        }
        if (this.e && this.g == null && this.d != null && (d = d(this.b)) != null && (d.x != 0.0f || d.y != 0.0f)) {
            recyclerView.S((int) Math.signum(d.x), (int) Math.signum(d.y), null);
        }
        this.e = false;
        View view = this.g;
        if (view != null) {
            if (i(view) == this.b) {
                View view2 = this.g;
                me meVar = recyclerView.M;
                c(view2, this.a);
                this.a.a(recyclerView);
                f();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.g = null;
            }
        }
        if (this.f) {
            me meVar2 = recyclerView.M;
            mb mbVar = this.a;
            if (this.c.m.an() == 0) {
                f();
            } else {
                int j = j(this.l, i);
                this.l = j;
                int j2 = j(this.m, i2);
                this.m = j2;
                if (j == 0 && j2 == 0) {
                    PointF d2 = d(this.b);
                    if (d2 != null && (d2.x != 0.0f || d2.y != 0.0f)) {
                        float sqrt = (float) Math.sqrt((d2.x * d2.x) + (d2.y * d2.y));
                        d2.x /= sqrt;
                        d2.y /= sqrt;
                        this.k = d2;
                        this.l = (int) (d2.x * 10000.0f);
                        this.m = (int) (d2.y * 10000.0f);
                        mbVar.b((int) (this.l * 1.2f), (int) (this.m * 1.2f), (int) (b(10000) * 1.2f), this.i);
                    } else {
                        mbVar.a = this.b;
                        f();
                    }
                }
            }
            mb mbVar2 = this.a;
            int i3 = mbVar2.a;
            mbVar2.a(recyclerView);
            if (i3 >= 0 && this.f) {
                this.e = true;
                recyclerView.J.b();
            }
        }
    }

    public final void f() {
        if (!this.f) {
            return;
        }
        this.f = false;
        this.m = 0;
        this.l = 0;
        this.k = null;
        this.c.M.a = -1;
        this.g = null;
        this.b = -1;
        this.e = false;
        lr lrVar = this.d;
        if (lrVar.t == this) {
            lrVar.t = null;
        }
        this.d = null;
        this.c = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int g(int i) {
        return (int) Math.ceil(b(i) / 0.3356d);
    }

    public md(Context context) {
        this.b = -1;
        this.a = new mb();
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.o = false;
        this.l = 0;
        this.m = 0;
        this.n = context.getResources().getDisplayMetrics();
    }
}
