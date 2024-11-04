package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gr {
    public View a;
    public int b;
    public PopupWindow.OnDismissListener c;
    private final Context d;
    private final gh e;
    private final boolean f;
    private final int g;
    private boolean h;
    private gs i;
    private gp j;
    private final PopupWindow.OnDismissListener k;

    public gr(Context context, gh ghVar, View view, boolean z) {
        this(context, ghVar, view, z, R.attr.actionOverflowMenuStyle);
    }

    public final gp a() {
        gp gzVar;
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.d.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.d.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                gzVar = new gb(this.d, this.a, this.g, this.f);
            } else {
                gzVar = new gz(this.d, this.e, this.a, this.g, this.f);
            }
            gzVar.l(this.e);
            gzVar.s(this.k);
            gzVar.o(this.a);
            gzVar.e(this.i);
            gzVar.p(this.h);
            gzVar.q(this.b);
            this.j = gzVar;
        }
        return this.j;
    }

    public final void b() {
        if (g()) {
            this.j.m();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(boolean z) {
        this.h = z;
        gp gpVar = this.j;
        if (gpVar != null) {
            gpVar.p(z);
        }
    }

    public final void e(gs gsVar) {
        this.i = gsVar;
        gp gpVar = this.j;
        if (gpVar != null) {
            gpVar.e(gsVar);
        }
    }

    public final void f(int i, int i2, boolean z, boolean z2) {
        gp a = a();
        a.t(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.b, this.a.getLayoutDirection()) & 7) == 5) {
                i -= this.a.getWidth();
            }
            a.r(i);
            a.u(i2);
            int i3 = (int) ((this.d.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            int i4 = i + i3;
            a.g = new Rect(i - i3, i2 - i3, i4, i2 + i3);
        }
        a.v();
    }

    public final boolean g() {
        gp gpVar = this.j;
        if (gpVar != null && gpVar.x()) {
            return true;
        }
        return false;
    }

    public final boolean h() {
        if (g()) {
            return true;
        }
        if (this.a == null) {
            return false;
        }
        f(0, 0, false, false);
        return true;
    }

    public gr(Context context, gh ghVar, View view, boolean z, int i) {
        this.b = 8388611;
        this.k = new gq(this);
        this.d = context;
        this.e = ghVar;
        this.a = view;
        this.f = z;
        this.g = i;
    }
}
