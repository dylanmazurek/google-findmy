package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatViewInflater;
import android.support.v7.widget.ActionBarContextView;
import android.support.v7.widget.ContentFrameLayout;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dn extends cw implements LayoutInflater.Factory2, gf {
    private static final ta N = new ta();
    private static final int[] O = {R.attr.windowBackground};
    public static final boolean i = !"robolectric".equals(Build.FINGERPRINT);
    boolean A;
    boolean B;
    boolean C;
    public dl D;
    public boolean E;
    boolean F;
    public Configuration G;
    public int H;
    public boolean I;
    public int J;
    public Rect K;
    public Rect L;
    private CharSequence P;
    private dm Q;
    private TextView R;
    private boolean S;
    private boolean T;
    private boolean U;
    private dl[] V;
    private boolean W;
    private boolean X;
    private int Y;
    private int Z;
    private boolean aa;
    private di ab;
    private di ac;
    private boolean ae;
    private AppCompatViewInflater af;
    private OnBackInvokedDispatcher ag;
    private OnBackInvokedCallback ah;
    private dm ai;
    final Object j;
    final Context k;
    public Window l;
    public df m;
    ch n;
    MenuInflater o;
    public jn p;
    fi q;
    public ActionBarContextView r;
    public PopupWindow s;
    public Runnable t;
    public boolean v;
    ViewGroup w;
    public View x;
    boolean y;
    boolean z;
    public bet M = null;
    public boolean u = true;
    private final Runnable ad = new w(this, 5, null);

    public dn(Context context, Window window, Object obj) {
        cs csVar = null;
        this.Y = -100;
        this.k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof cs) {
                        csVar = (cs) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (csVar != null) {
                this.Y = ((dn) csVar.h()).Y;
            }
        }
        if (this.Y == -100) {
            ta taVar = N;
            Integer num = (Integer) taVar.get(this.j.getClass().getName());
            if (num != null) {
                this.Y = num.intValue();
                taVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            V(window);
        }
        ib.f();
    }

    static final bsy O(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return dd.a(configuration);
        }
        return bsy.c(dc.a(configuration.locale));
    }

    static final void R(Configuration configuration, bsy bsyVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            dd.d(configuration, bsyVar);
        } else {
            configuration.setLocale(bsyVar.f(0));
            configuration.setLayoutDirection(bsyVar.f(0));
        }
    }

    private final di T(Context context) {
        if (this.ac == null) {
            this.ac = new dg(this, context);
        }
        return this.ac;
    }

    private final di U(Context context) {
        if (this.ab == null) {
            if (apc.d == null) {
                Context applicationContext = context.getApplicationContext();
                apc.d = new apc(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.ab = new dj(this, apc.d);
        }
        return this.ab;
    }

    private final void V(Window window) {
        if (this.l == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof df)) {
                df dfVar = new df(this, callback);
                this.m = dfVar;
                window.setCallback(dfVar);
                ksr E = ksr.E(this.k, null, O);
                Drawable v = E.v(0);
                if (v != null) {
                    window.setBackgroundDrawable(v);
                }
                E.y();
                this.l = window;
                if (Build.VERSION.SDK_INT >= 33 && this.ag == null) {
                    Object obj = this.j;
                    if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                        this.ag = de.b((Activity) this.j);
                    } else {
                        this.ag = null;
                    }
                    G();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private final void W() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                V(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
        } else {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private final void X(int i2) {
        this.J = (1 << i2) | this.J;
        if (!this.I) {
            View decorView = this.l.getDecorView();
            Runnable runnable = this.ad;
            int[] iArr = bwn.a;
            decorView.postOnAnimation(runnable);
            this.I = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x014c, code lost:            if (r13.f != null) goto L270;     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void Y(defpackage.dl r13, android.view.KeyEvent r14) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.Y(dl, android.view.KeyEvent):void");
    }

    private final void Z() {
        if (!this.v) {
        } else {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private final void aa(boolean z) {
        S(z, true);
    }

    public final void A(dl dlVar, boolean z) {
        ViewGroup viewGroup;
        jn jnVar;
        if (z && dlVar.a == 0 && (jnVar = this.p) != null && jnVar.s()) {
            z(dlVar.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && dlVar.m && (viewGroup = dlVar.e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                y(dlVar.a, dlVar, null);
            }
        }
        dlVar.k = false;
        dlVar.l = false;
        dlVar.m = false;
        dlVar.f = null;
        dlVar.n = true;
        if (this.D == dlVar) {
            this.D = null;
        }
        if (dlVar.a == 0) {
            G();
        }
    }

    public final void B(int i2) {
        dl P = P(i2);
        if (P.h != null) {
            Bundle bundle = new Bundle();
            P.h.o(bundle);
            if (bundle.size() > 0) {
                P.p = bundle;
            }
            P.h.s();
            P.h.clear();
        }
        P.o = true;
        P.n = true;
        if ((i2 == 108 || i2 == 0) && this.p != null) {
            dl P2 = P(0);
            P2.k = false;
            K(P2, null);
        }
    }

    public final void C() {
        bet betVar = this.M;
        if (betVar != null) {
            betVar.f();
        }
    }

    public final void D() {
        ViewGroup viewGroup;
        Context context;
        if (!this.v) {
            TypedArray obtainStyledAttributes = this.k.obtainStyledAttributes(eb.j);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    p(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    p(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    p(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    p(10);
                }
                this.B = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                W();
                this.l.getDecorView();
                LayoutInflater from = LayoutInflater.from(this.k);
                if (!this.C) {
                    if (this.B) {
                        viewGroup = (ViewGroup) from.inflate(com.google.android.apps.adm.R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.z = false;
                        this.y = false;
                    } else if (this.y) {
                        TypedValue typedValue = new TypedValue();
                        this.k.getTheme().resolveAttribute(com.google.android.apps.adm.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new ps(this.k, typedValue.resourceId);
                        } else {
                            context = this.k;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(com.google.android.apps.adm.R.layout.abc_screen_toolbar, (ViewGroup) null);
                        jn jnVar = (jn) viewGroup.findViewById(com.google.android.apps.adm.R.id.decor_content_parent);
                        this.p = jnVar;
                        jnVar.n(v());
                        if (this.z) {
                            this.p.c(109);
                        }
                        if (this.S) {
                            this.p.c(2);
                        }
                        if (this.T) {
                            this.p.c(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    viewGroup = this.A ? (ViewGroup) from.inflate(com.google.android.apps.adm.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.google.android.apps.adm.R.layout.abc_screen_simple, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    bwb.n(viewGroup, new cx(this));
                    if (this.p == null) {
                        this.R = (TextView) viewGroup.findViewById(com.google.android.apps.adm.R.id.title);
                    }
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.google.android.apps.adm.R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(R.id.content);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.l.setContentView(viewGroup);
                    contentFrameLayout.i = new njz(this, null);
                    this.w = viewGroup;
                    CharSequence x = x();
                    if (!TextUtils.isEmpty(x)) {
                        jn jnVar2 = this.p;
                        if (jnVar2 != null) {
                            jnVar2.o(x);
                        } else {
                            ch chVar = this.n;
                            if (chVar != null) {
                                chVar.k(x);
                            } else {
                                TextView textView = this.R;
                                if (textView != null) {
                                    textView.setText(x);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.w.findViewById(R.id.content);
                    View decorView = this.l.getDecorView();
                    contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = this.k.obtainStyledAttributes(eb.j);
                    if (contentFrameLayout2.b == null) {
                        contentFrameLayout2.b = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.b);
                    if (contentFrameLayout2.c == null) {
                        contentFrameLayout2.c = new TypedValue();
                    }
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.c);
                    if (obtainStyledAttributes2.hasValue(122)) {
                        if (contentFrameLayout2.d == null) {
                            contentFrameLayout2.d = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.d);
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        if (contentFrameLayout2.e == null) {
                            contentFrameLayout2.e = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.e);
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        if (contentFrameLayout2.f == null) {
                            contentFrameLayout2.f = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.f);
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        if (contentFrameLayout2.g == null) {
                            contentFrameLayout2.g = new TypedValue();
                        }
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.g);
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.v = true;
                    dl P = P(0);
                    if (!this.F && P.h == null) {
                        X(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.y + ", windowActionBarOverlay: " + this.z + ", android:windowIsFloating: " + this.B + ", windowActionModeOverlay: " + this.A + ", windowNoTitle: " + this.C + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void E() {
        D();
        if (this.y && this.n == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.n = new ea((Activity) obj, this.z);
            } else if (obj instanceof Dialog) {
                this.n = new ea((Dialog) obj);
            }
            ch chVar = this.n;
            if (chVar != null) {
                chVar.f(this.ae);
            }
        }
    }

    @Override // defpackage.gf
    public final void F(gh ghVar) {
        jn jnVar = this.p;
        if (jnVar != null && jnVar.p() && (!ViewConfiguration.get(this.k).hasPermanentMenuKey() || this.p.r())) {
            Window.Callback v = v();
            if (this.p.s()) {
                this.p.q();
                if (!this.F) {
                    v.onPanelClosed(108, P(0).h);
                    return;
                }
                return;
            }
            if (v != null && !this.F) {
                if (this.I && (1 & this.J) != 0) {
                    this.l.getDecorView().removeCallbacks(this.ad);
                    this.ad.run();
                }
                dl P = P(0);
                gh ghVar2 = P.h;
                if (ghVar2 != null && !P.o && v.onPreparePanel(0, P.g, ghVar2)) {
                    v.onMenuOpened(108, P.h);
                    this.p.u();
                    return;
                }
                return;
            }
            return;
        }
        dl P2 = P(0);
        P2.n = true;
        A(P2, false);
        Y(P2, null);
    }

    public final void G() {
        if (Build.VERSION.SDK_INT >= 33) {
            if (this.ag != null && (P(0).m || this.q != null)) {
                if (this.ah == null) {
                    this.ah = de.a(this.ag, this);
                }
            } else {
                OnBackInvokedCallback onBackInvokedCallback = this.ah;
                if (onBackInvokedCallback != null) {
                    de.c(this.ag, onBackInvokedCallback);
                    this.ah = null;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean H(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.H(android.view.KeyEvent):boolean");
    }

    public final boolean I() {
        boolean z = this.W;
        this.W = false;
        dl P = P(0);
        if (P.m) {
            if (!z) {
                A(P, true);
            }
            return true;
        }
        fi fiVar = this.q;
        if (fiVar != null) {
            fiVar.f();
            return true;
        }
        ch b = b();
        if (b == null || !b.m()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.gf
    public final boolean J(gh ghVar, MenuItem menuItem) {
        dl u;
        Window.Callback v = v();
        if (v != null && !this.F && (u = u(ghVar.a())) != null) {
            return v.onMenuItemSelected(u.a, menuItem);
        }
        return false;
    }

    public final boolean K(dl dlVar, KeyEvent keyEvent) {
        boolean z;
        jn jnVar;
        jn jnVar2;
        Resources.Theme theme;
        int i2;
        boolean z2;
        jn jnVar3;
        jn jnVar4;
        if (this.F) {
            return false;
        }
        if (dlVar.k) {
            return true;
        }
        dl dlVar2 = this.D;
        if (dlVar2 != null && dlVar2 != dlVar) {
            A(dlVar2, false);
        }
        Window.Callback v = v();
        if (v != null) {
            dlVar.g = v.onCreatePanelView(dlVar.a);
        }
        int i3 = dlVar.a;
        if (i3 != 0 && i3 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (jnVar4 = this.p) != null) {
            jnVar4.m();
        }
        if (dlVar.g == null && (!z || !(this.n instanceof du))) {
            gh ghVar = dlVar.h;
            if (ghVar == null || dlVar.o) {
                if (ghVar == null) {
                    Context context = this.k;
                    int i4 = dlVar.a;
                    if ((i4 == 0 || i4 == 108) && this.p != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.google.android.apps.adm.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.google.android.apps.adm.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.google.android.apps.adm.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            ps psVar = new ps(context, 0);
                            psVar.getTheme().setTo(theme);
                            context = psVar;
                        }
                    }
                    gh ghVar2 = new gh(context);
                    ghVar2.b = this;
                    dlVar.a(ghVar2);
                    if (dlVar.h == null) {
                        return false;
                    }
                }
                if (z && (jnVar2 = this.p) != null) {
                    if (this.ai == null) {
                        this.ai = new dm(this, 1);
                    }
                    jnVar2.l(dlVar.h, this.ai);
                }
                dlVar.h.s();
                if (!v.onCreatePanelMenu(dlVar.a, dlVar.h)) {
                    dlVar.a(null);
                    if (z && (jnVar = this.p) != null) {
                        jnVar.l(null, this.ai);
                    }
                    return false;
                }
                dlVar.o = false;
            }
            dlVar.h.s();
            Bundle bundle = dlVar.p;
            if (bundle != null) {
                dlVar.h.n(bundle);
                dlVar.p = null;
            }
            if (!v.onPreparePanel(0, dlVar.g, dlVar.h)) {
                if (z && (jnVar3 = this.p) != null) {
                    jnVar3.l(null, this.ai);
                }
                dlVar.h.r();
                return false;
            }
            if (keyEvent != null) {
                i2 = keyEvent.getDeviceId();
            } else {
                i2 = -1;
            }
            if (KeyCharacterMap.load(i2).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            dlVar.h.setQwertyMode(z2);
            dlVar.h.r();
        }
        dlVar.k = true;
        dlVar.l = false;
        this.D = dlVar;
        return true;
    }

    public final boolean L() {
        ViewGroup viewGroup;
        if (this.v && (viewGroup = this.w) != null && viewGroup.isLaidOut()) {
            return true;
        }
        return false;
    }

    public final void M() {
        aa(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x00c1, code lost:            if (r10.equals("Spinner") != false) goto L324;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View N(java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.N(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    public final dl P(int i2) {
        dl[] dlVarArr = this.V;
        if (dlVarArr == null || dlVarArr.length <= i2) {
            dl[] dlVarArr2 = new dl[i2 + 1];
            if (dlVarArr != null) {
                System.arraycopy(dlVarArr, 0, dlVarArr2, 0, dlVarArr.length);
            }
            this.V = dlVarArr2;
            dlVarArr = dlVarArr2;
        }
        dl dlVar = dlVarArr[i2];
        if (dlVar == null) {
            dl dlVar2 = new dl(i2);
            dlVarArr[i2] = dlVar2;
            return dlVar2;
        }
        return dlVar;
    }

    public final boolean Q(dl dlVar, int i2, KeyEvent keyEvent) {
        gh ghVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!dlVar.k && !K(dlVar, keyEvent)) || (ghVar = dlVar.h) == null) {
            return false;
        }
        return ghVar.performShortcut(i2, keyEvent, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x01a1, code lost:            if (r13 == false) goto L384;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0114 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void S(boolean r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.S(boolean, boolean):void");
    }

    @Override // defpackage.cw
    public final Context a() {
        return this.k;
    }

    @Override // defpackage.cw
    public final ch b() {
        E();
        return this.n;
    }

    @Override // defpackage.cw
    public final View c(int i2) {
        D();
        return this.l.findViewById(i2);
    }

    @Override // defpackage.cw
    public final void d(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ((ViewGroup) this.w.findViewById(R.id.content)).addView(view, layoutParams);
        this.m.b(this.l.getCallback());
    }

    @Override // defpackage.cw
    public final void e() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            from.getFactory2();
        }
    }

    @Override // defpackage.cw
    public final void f() {
        if (this.n != null && !b().n()) {
            X(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.cw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.j
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = defpackage.cw.g
            monitor-enter(r0)
            defpackage.cw.i(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.I
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.l
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.ad
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.F = r0
            int r0 = r3.Y
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.j
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            java.lang.Object r0 = r3.j
            ta r1 = defpackage.dn.N
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            int r2 = r3.Y
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.put(r0, r2)
            goto L5c
        L4d:
            java.lang.Object r0 = r3.j
            ta r1 = defpackage.dn.N
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getName()
            r1.remove(r0)
        L5c:
            ch r0 = r3.n
            if (r0 == 0) goto L63
            r0.e()
        L63:
            di r0 = r3.ab
            if (r0 == 0) goto L6a
            r0.c()
        L6a:
            di r0 = r3.ac
            if (r0 == 0) goto L71
            r0.c()
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.g():void");
    }

    @Override // defpackage.cw
    public final void h() {
        ch b = b();
        if (b != null) {
            b.h(false);
        }
    }

    @Override // defpackage.cw
    public final void j(int i2) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i2, viewGroup);
        this.m.b(this.l.getCallback());
    }

    @Override // defpackage.cw
    public final void k(View view) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.b(this.l.getCallback());
    }

    @Override // defpackage.cw
    public final void l(View view, ViewGroup.LayoutParams layoutParams) {
        D();
        ViewGroup viewGroup = (ViewGroup) this.w.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.b(this.l.getCallback());
    }

    @Override // defpackage.cw
    public final void m(CharSequence charSequence) {
        this.P = charSequence;
        jn jnVar = this.p;
        if (jnVar == null) {
            ch chVar = this.n;
            if (chVar != null) {
                chVar.k(charSequence);
                return;
            }
            TextView textView = this.R;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        jnVar.o(charSequence);
    }

    @Override // defpackage.cw
    public final void o() {
        String str;
        this.E = true;
        aa(false);
        W();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                str = box.f((Activity) obj);
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                ch chVar = this.n;
                if (chVar == null) {
                    this.ae = true;
                } else {
                    chVar.f(true);
                }
            }
            synchronized (cw.g) {
                cw.i(this);
                cw.f.add(new WeakReference(this));
            }
        }
        this.G = new Configuration(this.k.getResources().getConfiguration());
        this.X = true;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return N(str, context, attributeSet);
    }

    @Override // defpackage.cw
    public final void p(int i2) {
        if (i2 == 8) {
            i2 = 108;
        } else if (i2 == 9) {
            i2 = 109;
        }
        if (this.C && i2 == 108) {
            return;
        }
        if (this.y && i2 == 1) {
            this.y = false;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 5) {
                    if (i2 != 10) {
                        if (i2 != 108) {
                            if (i2 != 109) {
                                this.l.requestFeature(i2);
                                return;
                            } else {
                                Z();
                                this.z = true;
                                return;
                            }
                        }
                        Z();
                        this.y = true;
                        return;
                    }
                    Z();
                    this.A = true;
                    return;
                }
                Z();
                this.T = true;
                return;
            }
            Z();
            this.S = true;
            return;
        }
        Z();
        this.C = true;
    }

    public final int q() {
        int i2 = this.Y;
        if (i2 != -100) {
            return i2;
        }
        return cw.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012a A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int r(android.content.Context r24, int r25) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn.r(android.content.Context, int):int");
    }

    public final Context s() {
        Context context;
        ch b = b();
        if (b != null) {
            context = b.b();
        } else {
            context = null;
        }
        if (context == null) {
            return this.k;
        }
        return context;
    }

    public final Configuration t(Context context, int i2, bsy bsyVar, Configuration configuration, boolean z) {
        int i3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (z) {
                    i3 = 0;
                } else {
                    i3 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i3 = 32;
            }
        } else {
            i3 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i3 | (configuration2.uiMode & (-49));
        if (bsyVar != null) {
            R(configuration2, bsyVar);
        }
        return configuration2;
    }

    public final dl u(Menu menu) {
        int i2;
        dl[] dlVarArr = this.V;
        if (dlVarArr != null) {
            i2 = dlVarArr.length;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            dl dlVar = dlVarArr[i3];
            if (dlVar != null && dlVar.h == menu) {
                return dlVar;
            }
        }
        return null;
    }

    public final Window.Callback v() {
        return this.l.getCallback();
    }

    public final bsy w(Context context) {
        bsy bsyVar;
        bsy c;
        Locale f;
        if (Build.VERSION.SDK_INT >= 33 || (bsyVar = cw.c) == null) {
            return null;
        }
        bsy O2 = O(context.getApplicationContext().getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            if (bsyVar.g()) {
                c = bsy.a;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < bsyVar.a() + O2.a(); i2++) {
                    if (i2 < bsyVar.a()) {
                        f = bsyVar.f(i2);
                    } else {
                        f = O2.f(i2 - bsyVar.a());
                    }
                    if (f != null) {
                        linkedHashSet.add(f);
                    }
                }
                c = bsy.b((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (bsyVar.g()) {
            c = bsy.a;
        } else {
            c = bsy.c(dc.a(bsyVar.f(0)));
        }
        if (c.g()) {
            return O2;
        }
        return c;
    }

    public final CharSequence x() {
        Object obj = this.j;
        if (obj instanceof Activity) {
            return ((Activity) obj).getTitle();
        }
        return this.P;
    }

    public final void y(int i2, dl dlVar, Menu menu) {
        if (menu == null) {
            menu = dlVar.h;
        }
        if (dlVar.m && !this.F) {
            df dfVar = this.m;
            Window.Callback callback = this.l.getCallback();
            try {
                dfVar.b = true;
                callback.onPanelClosed(i2, menu);
            } finally {
                dfVar.b = false;
            }
        }
    }

    public final void z(gh ghVar) {
        if (this.U) {
            return;
        }
        this.U = true;
        this.p.a();
        Window.Callback v = v();
        if (v != null && !this.F) {
            v.onPanelClosed(108, ghVar);
        }
        this.U = false;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return N(str, context, attributeSet);
    }
}
