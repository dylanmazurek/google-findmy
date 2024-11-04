package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.adm.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gz extends gp implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener, gt {
    final ld a;
    View c;
    ViewTreeObserver d;
    private final Context e;
    private final gh f;
    private final ge h;
    private final boolean i;
    private final int j;
    private final int k;
    private PopupWindow.OnDismissListener m;
    private View n;
    private gs o;
    private boolean p;
    private boolean q;
    private int r;
    private boolean t;
    final ViewTreeObserver.OnGlobalLayoutListener b = new gy(this, 0);
    private final View.OnAttachStateChangeListener l = new fz(this, 2);
    private int s = 0;

    public gz(Context context, gh ghVar, View view, int i, boolean z) {
        this.e = context;
        this.f = ghVar;
        this.i = z;
        this.h = new ge(ghVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.k = i;
        Resources resources = context.getResources();
        this.j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.n = view;
        this.a = new ld(context, i);
        ghVar.h(this, context);
    }

    @Override // defpackage.gt
    public final Parcelable bL() {
        return null;
    }

    @Override // defpackage.gx
    public final ListView bM() {
        return this.a.e;
    }

    @Override // defpackage.gt
    public final void d(gh ghVar, boolean z) {
        if (ghVar == this.f) {
            m();
            gs gsVar = this.o;
            if (gsVar != null) {
                gsVar.a(ghVar, z);
            }
        }
    }

    @Override // defpackage.gt
    public final void e(gs gsVar) {
        this.o = gsVar;
    }

    @Override // defpackage.gt
    public final void f(boolean z) {
        this.q = false;
        ge geVar = this.h;
        if (geVar != null) {
            geVar.notifyDataSetChanged();
        }
    }

    @Override // defpackage.gt
    public final boolean g() {
        return false;
    }

    @Override // defpackage.gt
    public final boolean h(ha haVar) {
        if (haVar.hasVisibleItems()) {
            gr grVar = new gr(this.e, haVar, this.c, this.i, this.k);
            grVar.e(this.o);
            grVar.d(gp.z(haVar));
            grVar.c = this.m;
            this.m = null;
            this.f.i(false);
            ld ldVar = this.a;
            int i = ldVar.g;
            int b = ldVar.b();
            if ((Gravity.getAbsoluteGravity(this.s, this.n.getLayoutDirection()) & 7) == 5) {
                i += this.n.getWidth();
            }
            if (!grVar.g()) {
                if (grVar.a != null) {
                    grVar.f(i, b, true, true);
                }
            }
            gs gsVar = this.o;
            if (gsVar != null) {
                gsVar.b(haVar);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.gx
    public final void m() {
        if (x()) {
            this.a.m();
        }
    }

    @Override // defpackage.gp
    public final void o(View view) {
        this.n = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.p = true;
        this.f.close();
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.d = this.c.getViewTreeObserver();
            }
            this.d.removeGlobalOnLayoutListener(this.b);
            this.d = null;
        }
        this.c.removeOnAttachStateChangeListener(this.l);
        PopupWindow.OnDismissListener onDismissListener = this.m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1 && i == 82) {
            m();
            return true;
        }
        return false;
    }

    @Override // defpackage.gp
    public final void p(boolean z) {
        this.h.b = z;
    }

    @Override // defpackage.gp
    public final void q(int i) {
        this.s = i;
    }

    @Override // defpackage.gp
    public final void r(int i) {
        this.a.g = i;
    }

    @Override // defpackage.gp
    public final void s(PopupWindow.OnDismissListener onDismissListener) {
        this.m = onDismissListener;
    }

    @Override // defpackage.gp
    public final void t(boolean z) {
        this.t = z;
    }

    @Override // defpackage.gp
    public final void u(int i) {
        this.a.j(i);
    }

    @Override // defpackage.gx
    public final void v() {
        View view;
        if (x()) {
            return;
        }
        if (!this.p && (view = this.n) != null) {
            this.c = view;
            this.a.t(this);
            ld ldVar = this.a;
            ldVar.m = this;
            ldVar.y();
            View view2 = this.c;
            ViewTreeObserver viewTreeObserver = this.d;
            ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
            this.d = viewTreeObserver2;
            if (viewTreeObserver == null) {
                viewTreeObserver2.addOnGlobalLayoutListener(this.b);
            }
            view2.addOnAttachStateChangeListener(this.l);
            ld ldVar2 = this.a;
            ldVar2.l = view2;
            ldVar2.j = this.s;
            if (!this.q) {
                this.r = A(this.h, this.e, this.j);
                this.q = true;
            }
            this.a.r(this.r);
            this.a.w();
            this.a.s(this.g);
            this.a.v();
            kb kbVar = this.a.e;
            kbVar.setOnKeyListener(this);
            if (this.t && this.f.e != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.e).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) kbVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(this.f.e);
                }
                frameLayout.setEnabled(false);
                kbVar.addHeaderView(frameLayout, null, false);
            }
            this.a.e(this.h);
            this.a.v();
            return;
        }
        throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // defpackage.gx
    public final boolean x() {
        if (!this.p && this.a.x()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gp
    public final void l(gh ghVar) {
    }

    @Override // defpackage.gt
    public final void n(Parcelable parcelable) {
    }
}
