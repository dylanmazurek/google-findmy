package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.adm.R;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cx implements bvj {
    final /* synthetic */ dn a;

    public cx(dn dnVar) {
        this.a = dnVar;
    }

    @Override // defpackage.bvj
    public final bya a(View view, bya byaVar) {
        boolean z;
        bxs bxpVar;
        boolean z2;
        int b;
        int c;
        int c2;
        bya byaVar2 = byaVar;
        dn dnVar = this.a;
        int d = byaVar.d();
        int d2 = byaVar.d();
        ActionBarContextView actionBarContextView = dnVar.r;
        int i = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) dnVar.r.getLayoutParams();
            if (dnVar.r.isShown()) {
                if (dnVar.K == null) {
                    dnVar.K = new Rect();
                    dnVar.L = new Rect();
                }
                Rect rect = dnVar.K;
                Rect rect2 = dnVar.L;
                rect.set(byaVar.b(), byaVar.d(), byaVar.c(), byaVar.a());
                ViewGroup viewGroup = dnVar.w;
                if (Build.VERSION.SDK_INT >= 29) {
                    nq.a(viewGroup, rect, rect2);
                } else {
                    if (!nr.a) {
                        nr.a = true;
                        try {
                            nr.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            if (!nr.b.isAccessible()) {
                                nr.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    Method method = nr.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception unused2) {
                        }
                    }
                }
                int i2 = rect.top;
                int i3 = rect.left;
                int i4 = rect.right;
                bya e = bwn.e(dnVar.w);
                if (e == null) {
                    b = 0;
                } else {
                    b = e.b();
                }
                if (e == null) {
                    c = 0;
                } else {
                    c = e.c();
                }
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 > 0 && dnVar.x == null) {
                    dnVar.x = new View(dnVar.k);
                    dnVar.x.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b;
                    layoutParams.rightMargin = c;
                    dnVar.w.addView(dnVar.x, -1, layoutParams);
                } else {
                    View view2 = dnVar.x;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        if (marginLayoutParams2.height != marginLayoutParams.topMargin || marginLayoutParams2.leftMargin != b || marginLayoutParams2.rightMargin != c) {
                            marginLayoutParams2.height = marginLayoutParams.topMargin;
                            marginLayoutParams2.leftMargin = b;
                            marginLayoutParams2.rightMargin = c;
                            dnVar.x.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view3 = dnVar.x;
                if (view3 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && view3.getVisibility() != 0) {
                    View view4 = dnVar.x;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        c2 = bqx.c(dnVar.k, R.color.abc_decor_view_status_guard_light);
                    } else {
                        c2 = bqx.c(dnVar.k, R.color.abc_decor_view_status_guard);
                    }
                    view4.setBackgroundColor(c2);
                }
                if (!dnVar.A && z) {
                    d2 = 0;
                }
            } else {
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = true;
                } else {
                    z2 = false;
                }
                z = false;
            }
            if (z2) {
                dnVar.r.setLayoutParams(marginLayoutParams);
            }
        } else {
            z = false;
        }
        View view5 = dnVar.x;
        if (view5 != null) {
            if (true == z) {
                i = 0;
            }
            view5.setVisibility(i);
        }
        if (d != d2) {
            int b2 = byaVar.b();
            int c3 = byaVar.c();
            int a = byaVar.a();
            if (Build.VERSION.SDK_INT >= 30) {
                bxpVar = new bxr(byaVar2);
            } else if (Build.VERSION.SDK_INT >= 29) {
                bxpVar = new bxq(byaVar2);
            } else {
                bxpVar = new bxp(byaVar2);
            }
            bxpVar.c(brq.d(b2, d2, c3, a));
            byaVar2 = bxpVar.a();
        }
        return bwn.f(view, byaVar2);
    }
}
