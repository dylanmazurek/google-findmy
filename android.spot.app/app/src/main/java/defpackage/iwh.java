package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.adm.R;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iwh {
    private int B;
    private List C;
    private final AccessibilityManager D;
    public final int c;
    public final int d;
    public final int e;
    public final TimeInterpolator f;
    public final TimeInterpolator g;
    public final ViewGroup h;
    public final Context i;
    public final iwg j;
    public int k;
    public iwe l;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public final SnackbarContentLayout t;
    private final TimeInterpolator z;
    private static final TimeInterpolator v = inc.b;
    private static final TimeInterpolator w = inc.a;
    private static final TimeInterpolator x = inc.d;
    private static final int[] y = {R.attr.snackbarStyle};
    public static final String b = "iwh";
    static final Handler a = new Handler(Looper.getMainLooper(), new iwa());
    public boolean m = false;
    private final Runnable A = new ide(this, 14, null);
    public final njz u = new njz(this, null);

    public iwh(Context context, ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        int i;
        if (view != null) {
            if (snackbarContentLayout != null) {
                this.h = viewGroup;
                this.t = snackbarContentLayout;
                this.i = context;
                isa.b(context);
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(y);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                obtainStyledAttributes.recycle();
                if (resourceId != -1) {
                    i = R.layout.mtrl_layout_snackbar;
                } else {
                    i = R.layout.design_layout_snackbar;
                }
                iwg iwgVar = (iwg) from.inflate(i, viewGroup, false);
                this.j = iwgVar;
                iwgVar.a = this;
                float f = iwgVar.d;
                if (f != 1.0f) {
                    SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) view;
                    snackbarContentLayout2.b.setTextColor(iqg.f(iqg.c(view, R.attr.colorSurface), snackbarContentLayout2.b.getCurrentTextColor(), f));
                }
                ((SnackbarContentLayout) view).d = iwgVar.e;
                iwgVar.addView(view);
                iwgVar.setAccessibilityLiveRegion(1);
                iwgVar.setImportantForAccessibility(1);
                iwgVar.setFitsSystemWindows(true);
                bwb.n(iwgVar, new iwb(this, 0));
                bwn.q(iwgVar, new iwc(this));
                this.D = (AccessibilityManager) context.getSystemService("accessibility");
                this.e = hzc.n(context, R.attr.motionDurationLong2, 250);
                this.c = hzc.n(context, R.attr.motionDurationLong2, 150);
                this.d = hzc.n(context, R.attr.motionDurationMedium1, 75);
                this.z = hwx.h(context, R.attr.motionEasingEmphasizedInterpolator, w);
                this.g = hwx.h(context, R.attr.motionEasingEmphasizedInterpolator, x);
                this.f = hwx.h(context, R.attr.motionEasingEmphasizedInterpolator, v);
                return;
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null content");
    }

    public int a() {
        throw null;
    }

    public final int b() {
        iwg iwgVar = this.j;
        int height = iwgVar.getHeight();
        ViewGroup.LayoutParams layoutParams = iwgVar.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        }
        return height;
    }

    public final ValueAnimator c(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.z);
        ofFloat.addUpdateListener(new ioj(this, 3));
        return ofFloat;
    }

    public final View d() {
        iwe iweVar = this.l;
        if (iweVar == null) {
            return null;
        }
        return (View) iweVar.a.get();
    }

    public final void e() {
        f(3);
    }

    public final void f(int i) {
        iwn a2 = iwn.a();
        Object obj = a2.a;
        njz njzVar = this.u;
        synchronized (obj) {
            if (a2.g(njzVar)) {
                a2.d((iwm) a2.c, i);
            } else if (a2.h(njzVar)) {
                a2.d((iwm) a2.d, i);
            }
        }
    }

    public final void g() {
        iwn a2 = iwn.a();
        Object obj = a2.a;
        njz njzVar = this.u;
        synchronized (obj) {
            if (a2.g(njzVar)) {
                a2.b((iwm) a2.c);
            }
        }
        List list = this.C;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((iuu) this.C.get(size)).h(this);
                } else {
                    return;
                }
            }
        }
    }

    public final void h() {
        int height;
        if (d() == null) {
            height = 0;
        } else {
            int[] iArr = new int[2];
            d().getLocationOnScreen(iArr);
            int i = iArr[1];
            int[] iArr2 = new int[2];
            this.h.getLocationOnScreen(iArr2);
            height = (iArr2[1] + this.h.getHeight()) - i;
        }
        this.B = height;
        k();
    }

    public final void i() {
        iwn a2 = iwn.a();
        Object obj = a2.a;
        int a3 = a();
        njz njzVar = this.u;
        synchronized (obj) {
            if (a2.g(njzVar)) {
                Object obj2 = a2.c;
                ((iwm) obj2).a = a3;
                ((Handler) a2.b).removeCallbacksAndMessages(obj2);
                a2.b((iwm) a2.c);
                return;
            }
            if (a2.h(njzVar)) {
                ((iwm) a2.d).a = a3;
            } else {
                a2.d = new iwm(a3, njzVar);
            }
            Object obj3 = a2.c;
            if (obj3 != null && a2.d((iwm) obj3, 4)) {
                return;
            }
            a2.c = null;
            a2.c();
        }
    }

    public final void j() {
        if (l()) {
            this.j.post(new ide(this, 16, null));
            return;
        }
        if (this.j.getParent() != null) {
            this.j.setVisibility(0);
        }
        g();
    }

    public final void k() {
        int i;
        ViewGroup.LayoutParams layoutParams = this.j.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(b, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        iwg iwgVar = this.j;
        if (iwgVar.f == null) {
            Log.w(b, "Unable to update margins because original view margins are not set");
            return;
        }
        if (iwgVar.getParent() != null) {
            if (d() != null) {
                i = this.B;
            } else {
                i = this.n;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i2 = this.j.f.bottom + i;
            int i3 = this.j.f.left + this.o;
            int i4 = this.j.f.right + this.p;
            int i5 = this.j.f.top;
            if (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4 && marginLayoutParams.topMargin == i5) {
                if (this.r == this.q) {
                    return;
                }
            } else {
                marginLayoutParams.bottomMargin = i2;
                marginLayoutParams.leftMargin = i3;
                marginLayoutParams.rightMargin = i4;
                marginLayoutParams.topMargin = i5;
                this.j.requestLayout();
            }
            if (Build.VERSION.SDK_INT >= 29 && this.q > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.j.getLayoutParams();
                if ((layoutParams2 instanceof bos) && (((bos) layoutParams2).a instanceof SwipeDismissBehavior)) {
                    this.j.removeCallbacks(this.A);
                    this.j.post(this.A);
                }
            }
        }
    }

    public final boolean l() {
        AccessibilityManager accessibilityManager = this.D;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty()) {
            return true;
        }
        return false;
    }

    public final void m() {
        iwn a2 = iwn.a();
        Object obj = a2.a;
        njz njzVar = this.u;
        synchronized (obj) {
            if (a2.g(njzVar)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.c();
                }
            }
        }
        List list = this.C;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((iuu) this.C.get(size)).a(this);
                }
            }
        }
        ViewParent parent = this.j.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.j);
        }
    }

    public final void n(iuu iuuVar) {
        if (this.C == null) {
            this.C = new ArrayList();
        }
        this.C.add(iuuVar);
    }
}
