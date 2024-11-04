package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nj {
    public final Toolbar a;
    public int b;
    CharSequence c;
    public Window.Callback d;
    boolean e;
    public ho f;
    private View g;
    private Drawable h;
    private Drawable i;
    private Drawable j;
    private boolean k;
    private CharSequence l;
    private CharSequence m;
    private int n;
    private Drawable o;

    public nj(Toolbar toolbar, boolean z) {
        boolean z2;
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.c = toolbar.s;
        this.l = toolbar.t;
        if (this.c != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.k = z2;
        this.j = toolbar.e();
        ksr F = ksr.F(toolbar.getContext(), null, eb.a, R.attr.actionBarStyle, 0);
        int i = 15;
        this.o = F.u(15);
        if (z) {
            CharSequence w = F.w(27);
            if (!TextUtils.isEmpty(w)) {
                g(w);
            }
            CharSequence w2 = F.w(25);
            if (!TextUtils.isEmpty(w2)) {
                this.l = w2;
                if ((this.b & 8) != 0) {
                    toolbar.s(w2);
                }
            }
            Drawable u = F.u(20);
            if (u != null) {
                e(u);
            }
            Drawable u2 = F.u(17);
            if (u2 != null) {
                this.h = u2;
                r();
            }
            if (this.j == null && (drawable = this.o) != null) {
                this.j = drawable;
                q();
            }
            d(F.p(10, 0));
            int s = F.s(9, 0);
            if (s != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(s, (ViewGroup) toolbar, false);
                View view = this.g;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.g = inflate;
                if (inflate != null && (this.b & 16) != 0) {
                    toolbar.addView(inflate);
                }
                d(this.b | 16);
            }
            int r = F.r(13, 0);
            if (r > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = r;
                toolbar.setLayoutParams(layoutParams);
            }
            int n = F.n(7, -1);
            int n2 = F.n(3, -1);
            if (n >= 0 || n2 >= 0) {
                int max = Math.max(n, 0);
                int max2 = Math.max(n2, 0);
                toolbar.k();
                toolbar.r.a(max, max2);
            }
            int s2 = F.s(28, 0);
            if (s2 != 0) {
                Context context = toolbar.getContext();
                toolbar.k = s2;
                TextView textView = toolbar.b;
                if (textView != null) {
                    textView.setTextAppearance(context, s2);
                }
            }
            int s3 = F.s(26, 0);
            if (s3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.l = s3;
                TextView textView2 = toolbar.c;
                if (textView2 != null) {
                    textView2.setTextAppearance(context2, s3);
                }
            }
            int s4 = F.s(22, 0);
            if (s4 != 0) {
                toolbar.r(s4);
            }
        } else {
            if (toolbar.e() != null) {
                this.o = toolbar.e();
            } else {
                i = 11;
            }
            this.b = i;
        }
        F.y();
        if (this.n != R.string.abc_action_bar_up_description) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.h())) {
                int i2 = this.n;
                this.m = i2 != 0 ? a().getString(i2) : null;
                p();
            }
        }
        this.m = toolbar.h();
        toolbar.q(new nh(this));
    }

    private final void o(CharSequence charSequence) {
        this.c = charSequence;
        if ((this.b & 8) != 0) {
            this.a.t(charSequence);
            if (this.k) {
                bwn.r(this.a.getRootView(), charSequence);
            }
        }
    }

    private final void p() {
        CharSequence charSequence;
        if ((this.b & 4) != 0) {
            if (TextUtils.isEmpty(this.m)) {
                Toolbar toolbar = this.a;
                int i = this.n;
                if (i != 0) {
                    charSequence = toolbar.getContext().getText(i);
                } else {
                    charSequence = null;
                }
                toolbar.o(charSequence);
                return;
            }
            this.a.o(this.m);
        }
    }

    private final void q() {
        if ((this.b & 4) != 0) {
            Toolbar toolbar = this.a;
            Drawable drawable = this.j;
            if (drawable == null) {
                drawable = this.o;
            }
            toolbar.p(drawable);
            return;
        }
        this.a.p(null);
    }

    private final void r() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) != 0) {
            if ((i & 1) == 0 || (drawable = this.i) == null) {
                drawable = this.h;
            }
        } else {
            drawable = null;
        }
        this.a.n(drawable);
    }

    public final Context a() {
        return this.a.getContext();
    }

    public final void b() {
        this.a.j();
    }

    public final void c() {
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null) {
            actionMenuView.h();
        }
    }

    public final void d(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                q();
            }
            if ((i2 & 3) != 0) {
                r();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.a.t(this.c);
                    this.a.s(this.l);
                } else {
                    this.a.t(null);
                    this.a.s(null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.g) != null) {
                if ((i & 16) != 0) {
                    this.a.addView(view);
                } else {
                    this.a.removeView(view);
                }
            }
        }
    }

    public final void e(Drawable drawable) {
        this.i = drawable;
        r();
    }

    public final void f() {
        this.e = true;
    }

    public final void g(CharSequence charSequence) {
        this.k = true;
        o(charSequence);
    }

    public final void h(int i) {
        this.a.setVisibility(i);
    }

    public final void i(CharSequence charSequence) {
        if (!this.k) {
            o(charSequence);
        }
    }

    public final boolean j() {
        return this.a.v();
    }

    public final boolean k() {
        ho hoVar;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView != null && (hoVar = actionMenuView.c) != null && hoVar.l()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return this.a.w();
    }

    public final boolean m() {
        return this.a.x();
    }

    public final bet n(int i, long j) {
        float f;
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        bet w = bwn.w(this.a);
        w.g(f);
        w.h(j);
        w.i(new ni(this, i));
        return w;
    }
}
