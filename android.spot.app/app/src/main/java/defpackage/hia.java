package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.adm.R;
import com.google.android.apps.adm.guestmode.GuestModeActivity;
import com.google.android.libraries.onegoogle.accountmanagement.AddAccountActivity;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.common.LockableNestedScrollView;
import com.google.android.libraries.onegoogle.common.OverScrollControlledNestedScrollView;
import com.google.android.material.card.MaterialCardView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hia extends FrameLayout implements hjs {
    public static final String a = "hia";
    private boolean B;
    private int C;
    private final boolean D;
    private final float E;
    private final float F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private final int K;
    private final View L;
    private final ViewGroup M;
    private final ViewGroup N;
    private final LockableNestedScrollView O;
    private final View P;
    private final OverScrollControlledNestedScrollView Q;
    private final View R;
    private final View S;
    private final View T;
    private final View U;
    private final View V;
    private final ivf W;
    private final ivf aa;
    private final ivf ab;
    private final jer ac;
    private final op ad;
    private final FrameLayout ae;
    private final iqi af;
    private final TextView ag;
    private final Rect ah;
    private final boolean ai;
    private jer aj;
    private int ak;
    public boolean b;
    public boolean c;
    public boolean d;
    public hid e;
    public final hhj f;
    public final View g;
    public final RecyclerView h;
    public final RecyclerView i;
    public final SelectedAccountView j;
    public final Button k;
    public final ViewGroup l;
    public final MaterialCardView m;
    public final ViewGroup n;
    public final TextView o;
    public Button p;
    public Button q;
    public hii r;
    public oy s;
    public AnimatorSet t;
    public maf u;
    public maf v;
    public hog w;
    public final frx x;
    private static final Property y = Property.of(View.class, Float.class, "alpha");
    private static final Property z = Property.of(ivf.class, Integer.class, "alpha");
    private static final Interpolator A = bza.c(0.54f, 0.01f, 0.61f, 0.99f);

    public hia(Context context, him himVar) {
        super(new ContextThemeWrapper(context, himVar.c()), null, 0);
        int i;
        int i2;
        int i3;
        int b;
        int i4;
        this.ad = new hhs(this);
        this.ah = new Rect();
        this.aj = jdl.a;
        this.ak = 0;
        this.x = new hhw(this);
        setId(R.id.express_sign_in_layout_internal);
        if (hog.M(getContext())) {
            LayoutInflater.from(getContext()).inflate(R.layout.express_sign_in_layout, this);
            boolean d = hhd.d(getContext());
            this.ai = d;
            jer e = himVar.e(getContext());
            this.ac = e;
            this.af = new iqi(getContext());
            Context context2 = getContext();
            hhj hhjVar = new hhj(frx.Z(context2, R.attr.ogContentContainerPaddingTop), frx.Z(context2, R.attr.ogContainerExternalHorizontalSpacing), frx.Z(context2, R.attr.ogContainerInternalAdditionalHorizontalSpacing), frx.X(context2, R.attr.ogDialogCornerRadius), frx.Y(context2, R.attr.ogImportantBoxBackgroundColor), frx.Z(context2, R.attr.ogImportantBoxCornerRadius), frx.Z(context2, R.attr.ogImportantBoxMarginTop), frx.Z(context2, R.attr.ogDialogMarginBottom), frx.Z(context2, R.attr.ogLegalDisclaimerBottomPadding), frx.Z(context2, R.attr.ogLegalDisclaimerTopPadding), frx.Z(context2, R.attr.ogSelectedAccountViewMarginVertical));
            this.f = hhjVar;
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Resources resources = getResources();
            if (true != d) {
                i = R.color.og_elevation_shadow_color_dark;
            } else {
                i = R.color.og_elevation_shadow_color_light;
            }
            this.J = resources.getColor(i);
            if (true != d) {
                i2 = 5;
            } else {
                i2 = 8;
            }
            this.E = hog.K(displayMetrics, i2);
            if (true != d) {
                i3 = 3;
            } else {
                i3 = 8;
            }
            float K = hog.K(displayMetrics, i3);
            this.F = K;
            this.G = hog.L(displayMetrics, 20);
            this.H = hog.L(displayMetrics, 8);
            this.I = hog.L(displayMetrics, 6);
            boolean g = himVar.g();
            this.D = g;
            this.g = findViewById(R.id.scrim_view);
            View findViewById = findViewById(R.id.fake_scrim_view);
            this.L = findViewById;
            SelectedAccountView selectedAccountView = (SelectedAccountView) findViewById(R.id.selected_account);
            this.j = selectedAccountView;
            this.m = (MaterialCardView) findViewById(R.id.important_box_card_view);
            selectedAccountView.k(150L);
            Interpolator interpolator = A;
            selectedAccountView.l(interpolator);
            this.h = (RecyclerView) findViewById(R.id.accounts_list);
            this.i = (RecyclerView) findViewById(R.id.account_management_actions_list);
            View findViewById2 = findViewById(R.id.og_selected_account_to_account_management_divider);
            this.V = findViewById2;
            if (g) {
                b = 0;
            } else {
                b = hbk.b(getContext()) + hhjVar.c;
            }
            this.K = b;
            C(b);
            this.k = (Button) findViewById(R.id.sign_in_button);
            this.p = (Button) findViewById(R.id.continue_as_button);
            this.q = (Button) findViewById(R.id.secondary_action_button);
            this.M = (ViewGroup) findViewById(R.id.main_container);
            ViewGroup viewGroup = (ViewGroup) findViewById(R.id.content_container);
            this.N = viewGroup;
            LockableNestedScrollView lockableNestedScrollView = (LockableNestedScrollView) findViewById(R.id.scrollable_container);
            this.O = lockableNestedScrollView;
            ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.footer_container);
            this.l = viewGroup2;
            this.P = findViewById(R.id.header_container);
            View findViewById3 = findViewById(R.id.selected_account_container);
            this.R = findViewById3;
            this.S = findViewById(R.id.selected_account_top_inset_spacing);
            this.T = findViewById(R.id.accounts_content_container);
            this.n = (ViewGroup) findViewById(R.id.progress_container);
            TextView textView = (TextView) findViewById(R.id.choose_an_account_a11y);
            this.ag = textView;
            this.o = (TextView) findViewById(R.id.disclaimer_text);
            OverScrollControlledNestedScrollView overScrollControlledNestedScrollView = (OverScrollControlledNestedScrollView) findViewById(R.id.og_account_management_container);
            this.Q = overScrollControlledNestedScrollView;
            View findViewById4 = findViewById(R.id.account_management_list_container);
            this.U = findViewById4;
            ivf w = w();
            w.K(K);
            w.cy(x(hhjVar.a(), true));
            if (!hhjVar.a()) {
                w.V();
            }
            this.aa = w;
            lockableNestedScrollView.setBackgroundDrawable(w);
            viewGroup.setLayoutTransition(t());
            ViewGroup viewGroup3 = (ViewGroup) findViewById4.getParent();
            LayoutTransition layoutTransition = new LayoutTransition();
            layoutTransition.setDuration(150L);
            layoutTransition.setInterpolator(1, interpolator);
            layoutTransition.setInterpolator(0, interpolator);
            layoutTransition.setAnimator(2, null);
            layoutTransition.setAnimator(3, ValueAnimator.ofInt(0));
            H(layoutTransition);
            viewGroup3.setLayoutTransition(layoutTransition);
            ((ViewGroup) findViewById3).setLayoutTransition(t());
            ivf w2 = w();
            this.W = w2;
            w2.cy(x(false, true));
            findViewById3.setBackgroundDrawable(w2);
            if (e.g()) {
                w2.setAlpha(0);
                findViewById2.setBackgroundColor(((Integer) e.c()).intValue());
            }
            ivf w3 = w();
            this.ab = w3;
            w3.V();
            viewGroup2.setBackgroundDrawable(w3);
            w2.N(K);
            w3.N(K);
            overScrollControlledNestedScrollView.d = new bzt() { // from class: hho
                @Override // defpackage.bzt
                public final void a(NestedScrollView nestedScrollView) {
                    hia.this.n();
                }
            };
            overScrollControlledNestedScrollView.getViewTreeObserver().addOnGlobalLayoutListener(new gy(this, 5, null));
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.ae = frameLayout;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, 0));
            findViewById.setVisibility(8);
            View findViewById5 = findViewById(R.id.esi_custom_header_separator);
            if (true != g) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            findViewById5.setVisibility(i4);
            frx.ax(textView);
            bwn.r(textView, getResources().getString(R.string.og_account_picker_dialog_a11y));
            I();
            return;
        }
        throw new IllegalStateException("ExpressSignInLayout has to be used with a Google Material theme");
    }

    private final void A(boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        long j;
        if (this.B == z2) {
            return;
        }
        this.B = z2;
        float f2 = 0.0f;
        int i6 = 0;
        if (this.aa.u() > 0.0f) {
            jin jinVar = new jin();
            ivf ivfVar = this.W;
            Object[] objArr = new Animator[2];
            if (true != z2) {
                i5 = 0;
            } else {
                i5 = 255;
            }
            objArr[0] = ObjectAnimator.ofInt(ivfVar, (Property<ivf, Integer>) z, 255 - i5, i5).setDuration(150L);
            MaterialCardView materialCardView = this.m;
            float f3 = this.f.f;
            if (true != z2) {
                f = f3;
            } else {
                f = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f3 - f, f);
            ofFloat.setDuration(150L);
            ofFloat.addUpdateListener(new bwy(materialCardView, 5, null));
            objArr[1] = ofFloat;
            jinVar.i(objArr);
            if (!this.f.a()) {
                ivf ivfVar2 = this.aa;
                ivf ivfVar3 = this.W;
                if (true != z2) {
                    f2 = 1.0f;
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f2);
                ofFloat2.setDuration(100L);
                if (true != z2) {
                    j = 0;
                } else {
                    j = 50;
                }
                ofFloat2.setStartDelay(j);
                ofFloat2.addUpdateListener(new hhn(ivfVar2, ivfVar3, 0));
                jinVar.h(ofFloat2);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(jinVar.g());
            animatorSet.addListener(new hhy(this, z2));
            animatorSet.start();
        }
        int i7 = 8;
        if (((ViewGroup.MarginLayoutParams) this.M.getLayoutParams()).topMargin == 0) {
            View view = this.S;
            if (true != z2) {
                i4 = 8;
            } else {
                i4 = 0;
            }
            view.setVisibility(i4);
            hog.G(this, z2, this.ai);
        }
        ViewGroup viewGroup = this.N;
        if (true != z2) {
            i = -2;
        } else {
            i = -1;
        }
        viewGroup.getLayoutParams().height = i;
        this.O.g = !z2;
        View view2 = this.P;
        if (true != z2) {
            i7 = 0;
        }
        view2.setVisibility(i7);
        if (this.ac.g()) {
            this.V.setVisibility(i7);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.m.getLayoutParams();
        if (z2) {
            i2 = 0;
        } else {
            i2 = this.f.g;
        }
        marginLayoutParams.topMargin = i2;
        if (z2) {
            i3 = 0;
        } else {
            i3 = this.K;
        }
        C(i3);
        ViewGroup viewGroup2 = this.N;
        if (!z2) {
            i6 = this.f.a;
        }
        k(viewGroup2, i6);
    }

    private static void B(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        marginLayoutParams.setMarginEnd(i);
        view.setLayoutParams(marginLayoutParams);
    }

    private final void C(int i) {
        if (this.D) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.V.getLayoutParams();
        if (marginLayoutParams == null) {
            marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        }
        marginLayoutParams.setMarginStart(i);
        this.V.setLayoutParams(marginLayoutParams);
    }

    private final void D() {
        if (this.m.getVisibility() == 0) {
            y();
        } else {
            z();
        }
    }

    private final void E(boolean z2, boolean z3) {
        boolean z4;
        int i = 0;
        if (hog.I(getContext()) && !z2 && z3) {
            z4 = true;
        } else {
            z4 = false;
        }
        TextView textView = this.ag;
        if (true != z4) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    private final void F(float f, ivf ivfVar, View view) {
        if (this.U.getVisibility() == 8) {
            f = 0.0f;
        }
        float f2 = this.E * f;
        bwb.l(view, f2);
        if (this.ac.g()) {
            ivfVar.L(ColorStateList.valueOf(this.af.a(((Integer) this.ac.c()).intValue(), f)));
        } else {
            ivfVar.K(f2);
        }
    }

    private final void G(boolean z2) {
        this.ab.cy(x(this.f.a(), z2));
    }

    private static void H(LayoutTransition layoutTransition) {
        layoutTransition.setStartDelay(1, 0L);
    }

    private final void I() {
        this.f.a();
    }

    private final void J() {
        this.o.setVisibility(8);
        findViewById(R.id.disclaimer_separator).setVisibility(8);
        findViewById(R.id.footer_bottom_padding).setVisibility(0);
    }

    public static lnh a() {
        ljh k = lnh.g.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lnh lnhVar = (lnh) ljnVar;
        lnhVar.c = 9;
        lnhVar.a |= 2;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lnh lnhVar2 = (lnh) ljnVar2;
        lnhVar2.e = 2;
        lnhVar2.a |= 32;
        if (!ljnVar2.y()) {
            k.t();
        }
        lnh lnhVar3 = (lnh) k.b;
        lnhVar3.d = 3;
        lnhVar3.a |= 8;
        return (lnh) k.q();
    }

    public static void j(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    public static void k(View view, int i) {
        view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
    }

    public static void l(RecyclerView recyclerView, lj ljVar) {
        recyclerView.getContext();
        recyclerView.V(new LinearLayoutManager());
        hog.J(recyclerView, ljVar);
    }

    private final int r() {
        this.l.measure(0, 0);
        j(this.T, this.l.getMeasuredHeight());
        this.N.measure(0, 0);
        return this.N.getMeasuredHeight() + this.f.h;
    }

    private static AnimatorSet s(Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    private static LayoutTransition t() {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(150L);
        Interpolator interpolator = A;
        layoutTransition.setInterpolator(2, interpolator);
        layoutTransition.setInterpolator(3, interpolator);
        layoutTransition.setInterpolator(1, interpolator);
        layoutTransition.setInterpolator(0, interpolator);
        layoutTransition.setInterpolator(4, interpolator);
        layoutTransition.enableTransitionType(4);
        H(layoutTransition);
        return layoutTransition;
    }

    private static ObjectAnimator u(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) y, 0.0f, 1.0f);
    }

    private static ObjectAnimator v(View view) {
        return ObjectAnimator.ofFloat(view, (Property<View, Float>) y, 1.0f, 0.0f);
    }

    private final ivf w() {
        ivf C = ivf.C(getContext());
        C.U();
        C.O(this.J);
        if (this.ac.g()) {
            C.L(ColorStateList.valueOf(((Integer) this.ac.c()).intValue()));
        }
        return C;
    }

    private final ivl x(boolean z2, boolean z3) {
        ivj ivjVar = new ivj();
        if (z3) {
            ivjVar.f(this.f.d);
            ivjVar.g(this.f.d);
        }
        if (z2) {
            hhj hhjVar = this.f;
            ivjVar.h(ivc.d(0));
            ivjVar.a(hhjVar.d);
            hhj hhjVar2 = this.f;
            ivjVar.i(ivc.d(0));
            ivjVar.b(hhjVar2.d);
        }
        return new ivl(ivjVar);
    }

    private final void y() {
        this.m.setVisibility(8);
        this.k.setVisibility(0);
        this.p.setVisibility(8);
        E(false, false);
        h(false);
        J();
        G(true);
    }

    private final void z() {
        this.m.setVisibility(0);
        this.k.setVisibility(8);
        this.p.setVisibility(0);
        E(this.b, true);
        J();
        G(false);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int childCount = getChildCount();
        boolean z2 = true;
        if (childCount == 0) {
            if (view.getId() != R.id.express_sign_in_internal_view) {
                z2 = false;
            }
            hwx.V(z2, "express_sign_in_internal_view must be added first");
            super.addView(view, -1, layoutParams);
            return;
        }
        if (childCount != 1) {
            z2 = false;
        }
        hwx.V(z2, "ExpressSignInLayoutInternal must contain a single content view.");
        this.ae.addView(view, 0, layoutParams);
        FrameLayout frameLayout = this.ae;
        super.addView(frameLayout, 0, frameLayout.getLayoutParams());
    }

    @Override // defpackage.hjs
    public final void b(hjp hjpVar) {
        hjpVar.b(this.j, 90572);
        hjpVar.b(this.g, 90573);
        hjpVar.b(this.h, 90574);
        hjpVar.b(this.p, 90570);
        hjpVar.b(this.k, 90771);
        hjpVar.b(this.q, 90571);
    }

    public final void c(hbk hbkVar, hhh hhhVar) {
        boolean z2;
        ewu ewuVar;
        int a2 = hbkVar.a() + hhhVar.a();
        int i = 1;
        if (a2 > 0 && this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        SelectedAccountView selectedAccountView = this.j;
        if (!z2) {
            i = 3;
        }
        selectedAccountView.m(i);
        SelectedAccountView selectedAccountView2 = this.j;
        if (z2) {
            ewuVar = new ewu(this, 8);
        } else {
            ewuVar = null;
        }
        selectedAccountView2.setOnClickListener(ewuVar);
        this.j.setClickable(z2);
        if (!z2) {
            i(false);
        }
    }

    @Override // defpackage.hjs
    public final void cU(hjp hjpVar) {
        hjpVar.e(this.j);
        hjpVar.e(this.g);
        hjpVar.e(this.h);
        hjpVar.e(this.p);
        hjpVar.e(this.k);
        hjpVar.e(this.q);
    }

    public final void d(hig higVar, Object obj) {
        int i;
        ijs.c();
        if (obj == null) {
            i = 31;
        } else {
            i = 52;
        }
        q(i);
        q(38);
        njz njzVar = higVar.b;
        jer h = jer.h(obj);
        boolean g = h.g();
        Object obj2 = njzVar.a;
        if (!g) {
            ebl eblVar = (ebl) obj2;
            ((bym) eblVar.c.a()).l(dxq.GUEST_LOGIN_SELECTED);
            if (ltr.c()) {
                duo.b(eblVar.y());
            } else {
                GuestModeActivity.q(eblVar.y());
            }
        } else {
            ebl eblVar2 = (ebl) obj2;
            if (eblVar2.af != null) {
                dun dunVar = new dun(((hfl) h.c()).c);
                njz njzVar2 = eblVar2.af;
                njzVar2.getClass();
                njzVar2.q(dunVar);
                njz njzVar3 = eblVar2.af;
                if (njzVar3 != null) {
                    njzVar3.r();
                }
            }
        }
        jyz E = ivc.E(false);
        ijs.c();
        AnimatorSet s = s(new hhv(this));
        s.playTogether(u(this.n), v(this.m), v(this.l));
        this.t = s;
        s.start();
        ivc.N(E, new hhz(this), jxv.a);
    }

    public final void f(boolean z2) {
        ijs.c();
        hhx hhxVar = new hhx(this);
        if (z2) {
            AnimatorSet s = s(hhxVar);
            s.playTogether(v(this.n), u(this.m), u(this.l));
            s.start();
        } else {
            hhxVar.onAnimationStart(null);
            hhxVar.onAnimationEnd(null);
        }
    }

    @Override // android.view.View
    protected final boolean fitSystemWindows(Rect rect) {
        super.fitSystemWindows(rect);
        I();
        return false;
    }

    public final void g(View view) {
        q(11);
        View.OnClickListener onClickListener = this.e.f.b;
        AddAccountActivity.a(view);
    }

    public final void h(boolean z2) {
        int i;
        int i2;
        ObjectAnimator duration;
        boolean z3;
        int i3;
        int i4;
        this.b = z2;
        if (true != z2) {
            i = 8;
        } else {
            i = 0;
        }
        this.U.setVisibility(i);
        this.j.e(z2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.j.getLayoutParams();
        if (z2) {
            i2 = this.f.k;
        } else {
            i2 = 0;
        }
        marginLayoutParams.bottomMargin = i2;
        this.j.requestLayout();
        if (!this.D) {
            ViewGroup viewGroup = this.l;
            if (z2) {
                i4 = this.H;
            } else {
                i4 = 0;
            }
            k(viewGroup, i4);
        }
        View findViewById = findViewById(R.id.disclaimer_separator);
        ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = this.I;
        findViewById.requestLayout();
        View view = this.g;
        if (z2) {
            duration = u(view).setDuration(150L);
            duration.addListener(new hhq(view));
        } else {
            duration = v(view).setDuration(150L);
            duration.addListener(new hhr(view));
        }
        duration.start();
        hid hidVar = this.e;
        if (hidVar != null && !hidVar.b.b().isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        E(z2, z3);
        if (hog.I(getContext())) {
            A(z2);
            FrameLayout frameLayout = this.ae;
            if (true != z2) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            frameLayout.setVisibility(i3);
        }
        if (z2) {
            this.s.c().b(this.s, this.ad);
            return;
        }
        this.ad.f();
        A(false);
        this.h.T(0);
    }

    public final void i(boolean z2) {
        if (this.b != z2) {
            h(z2);
        }
    }

    public final void m(jis jisVar, Object obj) {
        String str;
        jer i;
        if (jisVar.isEmpty()) {
            y();
            return;
        }
        if (obj != null) {
            this.j.j(obj);
            z();
            frx frxVar = this.e.f.c;
            str = ((hfl) obj).d;
            maf mafVar = this.v;
            if (ivc.n(str).trim().isEmpty()) {
                i = jdl.a;
            } else {
                i = jer.i(str);
            }
            Context context = getContext();
            jin jinVar = new jin();
            if (i.g()) {
                jinVar.h(context.getResources().getString(R.string.og_continue_as, i.c()));
            }
            jinVar.h(context.getResources().getString(R.string.og_continue));
            mafVar.c(jinVar.g());
        }
    }

    public final void n() {
        float min;
        F(Math.min(1.0f, this.Q.getScrollY() / this.G), this.W, this.R);
        float scrollY = this.Q.getScrollY();
        float measuredHeight = this.Q.getChildAt(0).getMeasuredHeight() - this.Q.getMeasuredHeight();
        if (scrollY >= measuredHeight) {
            min = 0.0f;
        } else {
            min = Math.min((measuredHeight - scrollY) / this.G, 1.0f);
        }
        F(min, this.ab, this.l);
    }

    public final void o(boolean z2) {
        int i;
        int i2 = 0;
        if (z2) {
            i = 0;
        } else {
            i = this.f.e;
        }
        this.m.j(i);
        View view = this.U;
        if (z2) {
            i2 = this.f.e;
        }
        view.setBackgroundColor(i2);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        new Rect(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        I();
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.ae.getLayoutParams().height = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        super.onMeasure(i, i2);
        maf mafVar = this.u;
        if (mafVar != null) {
            mafVar.d(this.l.getMeasuredWidth());
        }
        maf mafVar2 = this.v;
        if (mafVar2 != null) {
            mafVar2.d(this.l.getMeasuredWidth());
        }
        if (this.l.getVisibility() == 8) {
            measuredHeight = 0;
        } else {
            measuredHeight = this.l.getMeasuredHeight();
        }
        if (this.T.getPaddingBottom() != measuredHeight) {
            j(this.T, measuredHeight);
            super.onMeasure(i, i2);
        }
        if (this.b) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.M.getLayoutParams();
            if (this.N.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin >= getHeight() && getHeight() > 0 && this.P.getVisibility() == 0) {
                A(true);
                super.onMeasure(i, i2);
            }
        }
        FrameLayout frameLayout = this.ae;
        int[] iArr = bwn.a;
        if (!frameLayout.isAttachedToWindow()) {
            return;
        }
        if (this.ak == 0) {
            D();
            int r = r();
            D();
            this.ak = Math.max(r, r());
        }
        int measuredHeight2 = this.N.getMeasuredHeight();
        if (!this.b && measuredHeight2 > this.ak) {
            this.ak = measuredHeight2;
        }
        int measuredHeight3 = getMeasuredHeight();
        int i3 = (measuredHeight3 - this.ak) - this.ah.top;
        if (!this.aj.g() || (!this.b && (((Integer) this.aj.c()).intValue() > i3 || measuredHeight3 != this.C))) {
            this.aj = jer.i(Integer.valueOf(i3));
            FrameLayout frameLayout2 = this.ae;
            frameLayout2.getLayoutParams().height = i3;
            frameLayout2.getClass();
            frameLayout2.post(new hep(frameLayout2, 11));
        }
        this.C = measuredHeight3;
    }

    public final void p(boolean z2) {
        int i;
        int i2;
        int i3 = 0;
        if (z2) {
            i = 0;
        } else {
            i = this.f.b;
        }
        B(this.m, i);
        View view = this.U;
        if (z2) {
            i2 = this.f.b;
        } else {
            i2 = 0;
        }
        B(view, i2);
        SelectedAccountView selectedAccountView = this.j;
        hhj hhjVar = this.f;
        if (z2) {
            i3 = hhjVar.b;
        }
        int i4 = hhjVar.c + i3;
        selectedAccountView.setPadding(i4, selectedAccountView.getPaddingTop(), i4, selectedAccountView.getPaddingBottom());
    }

    public final void q(int i) {
        lnh a2 = a();
        ljh ljhVar = (ljh) a2.z(5);
        ljhVar.w(a2);
        if (!ljhVar.b.y()) {
            ljhVar.t();
        }
        lnh lnhVar = (lnh) ljhVar.b;
        lnh lnhVar2 = lnh.g;
        lnhVar.b = i - 1;
        lnhVar.a |= 1;
        lnh lnhVar3 = (lnh) ljhVar.q();
        hid hidVar = this.e;
        hidVar.d.a(hidVar.b.a(), lnhVar3);
    }
}
