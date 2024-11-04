package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionBarContainer;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ea extends ch implements hg {
    private static final Interpolator r = new AccelerateInterpolator();
    private static final Interpolator s = new DecelerateInterpolator();
    Context a;
    ActionBarOverlayLayout b;
    public ActionBarContainer c;
    ActionBarContextView d;
    View e;
    dz f;
    fi g;
    fh h;
    public int i;
    public boolean j;
    public boolean k;
    public fq l;
    boolean m;
    final bxa n;
    final bxa o;
    nj p;
    final njz q;
    private Context t;
    private boolean u;
    private boolean v;
    private final ArrayList w;
    private boolean x;
    private boolean y;
    private boolean z;

    public ea(Activity activity, boolean z) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new dx(this);
        this.o = new dy(this);
        this.q = new njz(this, null);
        View decorView = activity.getWindow().getDecorView();
        z(decorView);
        if (z) {
            return;
        }
        this.e = decorView.findViewById(R.id.content);
    }

    private final void A() {
        this.p.a.requestLayout();
        this.b.e = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y(boolean z, boolean z2) {
        if (z2 || !z) {
            return true;
        }
        return false;
    }

    private final void z(View view) {
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.google.android.apps.adm.R.id.decor_content_parent);
        this.b = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.h = this;
            if (actionBarOverlayLayout.getWindowToken() != null) {
                ((ea) actionBarOverlayLayout.h).i = actionBarOverlayLayout.b;
                int i = actionBarOverlayLayout.g;
                if (i != 0) {
                    actionBarOverlayLayout.onWindowSystemUiVisibilityChanged(i);
                    bvz.c(actionBarOverlayLayout);
                }
            }
        }
        View findViewById = view.findViewById(com.google.android.apps.adm.R.id.action_bar);
        if (findViewById instanceof Toolbar) {
            this.p = ((Toolbar) findViewById).y();
            this.d = (ActionBarContextView) view.findViewById(com.google.android.apps.adm.R.id.action_context_bar);
            ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.google.android.apps.adm.R.id.action_bar_container);
            this.c = actionBarContainer;
            nj njVar = this.p;
            if (njVar != null && this.d != null && actionBarContainer != null) {
                this.a = njVar.a();
                if ((this.p.b & 4) != 0) {
                    this.u = true;
                }
                Context context = this.a;
                int i2 = context.getApplicationInfo().targetSdkVersion;
                dd.f(context);
                A();
                TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, eb.a, com.google.android.apps.adm.R.attr.actionBarStyle, 0);
                if (obtainStyledAttributes.getBoolean(14, false)) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.b;
                    if (actionBarOverlayLayout2.d) {
                        this.m = true;
                        actionBarOverlayLayout2.k(true);
                    } else {
                        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                    }
                }
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
                if (dimensionPixelSize != 0) {
                    bwb.l(this.c, dimensionPixelSize);
                }
                obtainStyledAttributes.recycle();
                return;
            }
            throw new IllegalStateException(String.valueOf(getClass().getSimpleName()).concat(" can only be used with a compatible window decor layout"));
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        if (findViewById != null) {
            str = findViewById.getClass().getSimpleName();
        } else {
            str = "null";
        }
        sb.append(str);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.ch
    public final int a() {
        return this.p.b;
    }

    @Override // defpackage.ch
    public final Context b() {
        if (this.t == null) {
            TypedValue typedValue = new TypedValue();
            this.a.getTheme().resolveAttribute(com.google.android.apps.adm.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.t = new ContextThemeWrapper(this.a, i);
            } else {
                this.t = this.a;
            }
        }
        return this.t;
    }

    @Override // defpackage.ch
    public final fi c(fh fhVar) {
        dz dzVar = this.f;
        if (dzVar != null) {
            dzVar.f();
        }
        this.b.k(false);
        this.d.i();
        dz dzVar2 = new dz(this, this.d.getContext(), fhVar);
        dzVar2.a.s();
        try {
            if (dzVar2.b.c(dzVar2, dzVar2.a)) {
                this.f = dzVar2;
                dzVar2.g();
                this.d.h(dzVar2);
                v(true);
                return dzVar2;
            }
            return null;
        } finally {
            dzVar2.a.r();
        }
    }

    @Override // defpackage.ch
    public final void d(boolean z) {
        if (z != this.v) {
            this.v = z;
            int size = this.w.size();
            for (int i = 0; i < size; i++) {
                ((cg) this.w.get(i)).a();
            }
        }
    }

    @Override // defpackage.ch
    public final void f(boolean z) {
        if (!this.u) {
            g(z);
        }
    }

    @Override // defpackage.ch
    public final void g(boolean z) {
        int i;
        if (true != z) {
            i = 0;
        } else {
            i = 4;
        }
        w(i, 4);
    }

    @Override // defpackage.ch
    public final void h(boolean z) {
        fq fqVar;
        this.z = z;
        if (!z && (fqVar = this.l) != null) {
            fqVar.a();
        }
    }

    @Override // defpackage.ch
    public final void i(int i) {
        j(this.a.getString(i));
    }

    @Override // defpackage.ch
    public final void j(CharSequence charSequence) {
        this.p.g(charSequence);
    }

    @Override // defpackage.ch
    public final void k(CharSequence charSequence) {
        this.p.i(charSequence);
    }

    @Override // defpackage.ch
    public final boolean m() {
        nj njVar = this.p;
        if (njVar != null && njVar.j()) {
            njVar.b();
            return true;
        }
        return false;
    }

    @Override // defpackage.ch
    public final boolean o(int i, KeyEvent keyEvent) {
        int i2;
        dz dzVar = this.f;
        if (dzVar == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        gh ghVar = dzVar.a;
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        ghVar.setQwertyMode(z);
        return ghVar.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.ch
    public final void r() {
        dd.f(this.a);
        A();
    }

    @Override // defpackage.ch
    public final void s() {
        w(2, 2);
    }

    @Override // defpackage.ch
    public final void t() {
        w(0, 8);
    }

    @Override // defpackage.ch
    public final void u() {
        this.p.e(null);
    }

    public final void v(boolean z) {
        bet n;
        bet g;
        long j;
        if (z) {
            if (!this.x) {
                this.x = true;
                x(false);
            }
        } else if (this.x) {
            this.x = false;
            x(false);
        }
        if (this.c.isLaidOut()) {
            if (z) {
                g = this.p.n(4, 100L);
                n = this.d.g(0, 200L);
            } else {
                n = this.p.n(0, 200L);
                g = this.d.g(8, 100L);
            }
            fq fqVar = new fq();
            fqVar.a.add(g);
            View view = (View) ((WeakReference) g.a).get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) ((WeakReference) n.a).get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            fqVar.a.add(n);
            fqVar.b();
            return;
        }
        if (z) {
            this.p.h(4);
            this.d.setVisibility(0);
        } else {
            this.p.h(0);
            this.d.setVisibility(8);
        }
    }

    public final void w(int i, int i2) {
        nj njVar = this.p;
        int i3 = njVar.b;
        if ((i2 & 4) != 0) {
            this.u = true;
        }
        njVar.d((i & i2) | ((~i2) & i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(boolean r6) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ea.x(boolean):void");
    }

    public ea(Dialog dialog) {
        new ArrayList();
        this.w = new ArrayList();
        this.i = 0;
        this.j = true;
        this.y = true;
        this.n = new dx(this);
        this.o = new dy(this);
        this.q = new njz(this, null);
        z(dialog.getWindow().getDecorView());
    }
}
