package com.google.android.libraries.onegoogle.expresssignin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.apps.adm.R;
import defpackage.eft;
import defpackage.frx;
import defpackage.gno;
import defpackage.hgx;
import defpackage.hhm;
import defpackage.hia;
import defpackage.hid;
import defpackage.hig;
import defpackage.hik;
import defpackage.him;
import defpackage.hog;
import defpackage.hri;
import defpackage.hwx;
import defpackage.lwn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ExpressSignInLayout extends FrameLayout implements hgx {
    public hia a;
    private final hri b;

    public ExpressSignInLayout(Context context) {
        this(context, null);
    }

    private final void c(hhm hhmVar) {
        this.b.p(new gno(this, hhmVar, 15, null));
    }

    public final void a(final hid hidVar, final hig higVar) {
        eft eftVar;
        boolean z = true;
        hwx.V(!b(), "initialize() has to be called only once.");
        hog hogVar = higVar.a.h;
        Context context = getContext();
        context.getClass();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.SecondaryButton);
        if (!lwn.a.a().a(contextThemeWrapper) || !frx.ac(contextThemeWrapper)) {
            z = false;
        }
        hik hikVar = higVar.a;
        if (!z) {
            eftVar = new eft(9);
        } else {
            eftVar = new eft(8);
        }
        hia hiaVar = new hia(contextThemeWrapper, (him) hikVar.f.d(eftVar));
        this.a = hiaVar;
        super.addView(hiaVar, -1, new ViewGroup.LayoutParams(-1, -1));
        c(new hhm() { // from class: hhl
            @Override // defpackage.hhm
            public final void a(hia hiaVar2) {
                boolean z2;
                jis q;
                int i;
                hid hidVar2 = hid.this;
                hiaVar2.e = hidVar2;
                oy oyVar = (oy) hog.U(hiaVar2.getContext(), oy.class);
                if (oyVar != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                hwx.K(z2, "Express Sign In's onBackPressedDispatcherOwner has to be set or one of the context baseContexts should be a OnBackPressedDispatcherOwner");
                hiaVar2.s = oyVar;
                hig higVar2 = higVar;
                jer jerVar = higVar2.a.b;
                hiaVar2.p = (Button) hiaVar2.findViewById(R.id.continue_as_button);
                hiaVar2.q = (Button) hiaVar2.findViewById(R.id.secondary_action_button);
                hiaVar2.u = new maf(hiaVar2.q);
                hiaVar2.v = new maf(hiaVar2.p);
                hjp hjpVar = hidVar2.e;
                hjpVar.a(hiaVar2, 90569);
                hiaVar2.b(hjpVar);
                hik hikVar2 = higVar2.a;
                hiaVar2.d = hikVar2.g;
                if (hikVar2.d.g()) {
                    hikVar2.d.c();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams.gravity = 17;
                    FrameLayout frameLayout = (FrameLayout) hiaVar2.findViewById(R.id.express_sign_in_header_logo_container);
                    Context context2 = hiaVar2.getContext();
                    ImageView imageView = new ImageView(context2);
                    if (true != hhd.d(context2)) {
                        i = R.drawable.googlelogo_light_color_74x24_vd;
                    } else {
                        i = R.drawable.googlelogo_standard_color_74x24_vd;
                    }
                    imageView.setImageDrawable(cu.c(context2, i));
                    frameLayout.addView(imageView, layoutParams);
                    frameLayout.setVisibility(0);
                }
                jer jerVar2 = hikVar2.e;
                hnu hnuVar = (hnu) hikVar2.a.f();
                if (hnuVar != null) {
                    hgq hgqVar = new hgq(hiaVar2, higVar2, 6);
                    hiaVar2.getContext();
                    hiaVar2.c = true;
                    hiaVar2.u.c((jis) hnuVar.a);
                    hiaVar2.q.setOnClickListener(hgqVar);
                    hiaVar2.q.setVisibility(0);
                }
                jer jerVar3 = hikVar2.b;
                hiaVar2.r = null;
                hii hiiVar = hiaVar2.r;
                jer jerVar4 = hikVar2.c;
                hiaVar2.w = hikVar2.i;
                if (hikVar2.d.g()) {
                    ((ViewGroup.MarginLayoutParams) hiaVar2.k.getLayoutParams()).topMargin = hiaVar2.getResources().getDimensionPixelSize(R.dimen.og_sign_in_button_with_google_logo_top_margin);
                    hiaVar2.k.requestLayout();
                    View findViewById = hiaVar2.findViewById(R.id.esi_custom_header_container);
                    ((ViewGroup.MarginLayoutParams) findViewById.getLayoutParams()).topMargin = 0;
                    findViewById.requestLayout();
                }
                hii hiiVar2 = hiaVar2.r;
                if (hiaVar2.c) {
                    ((ViewGroup.MarginLayoutParams) hiaVar2.k.getLayoutParams()).bottomMargin = 0;
                    hiaVar2.k.requestLayout();
                    ((ViewGroup.MarginLayoutParams) hiaVar2.p.getLayoutParams()).bottomMargin = 0;
                    hiaVar2.p.requestLayout();
                }
                hiaVar2.g.setOnClickListener(new hgq(hiaVar2, hjpVar, 7));
                int i2 = 2;
                hiaVar2.j.n(hidVar2.c, hidVar2.f.c, ham.a().r(), new hgj(hiaVar2, i2), hiaVar2.getResources().getString(R.string.og_collapse_account_list_a11y), hiaVar2.getResources().getString(R.string.og_expand_account_list_a11y));
                hgg hggVar = new hgg(hiaVar2, hidVar2, 3);
                hiaVar2.getContext();
                kdo kdoVar = new kdo(null, null, null, null);
                kdoVar.n(hidVar2.f.c);
                kdoVar.i(hidVar2.b);
                kdoVar.j(hidVar2.c);
                kdoVar.k(hidVar2.d);
                hbk hbkVar = new hbk(kdoVar.h(), hggVar, new hht(0), hia.a(), hjpVar, hiaVar2.f.c, ham.a().r(), false);
                Context context3 = hiaVar2.getContext();
                hgu ad = frx.ad(hidVar2.b, new hgi(hiaVar2, i2), hiaVar2.getContext());
                if (ad == null) {
                    int i3 = jis.d;
                    q = jmi.a;
                } else {
                    q = jis.q(ad);
                }
                hhh hhhVar = new hhh(context3, q, hjpVar, hiaVar2.f.c);
                hia.l(hiaVar2.h, hbkVar);
                hia.l(hiaVar2.i, hhhVar);
                hiaVar2.c(hbkVar, hhhVar);
                hhu hhuVar = new hhu(hiaVar2, hbkVar, hhhVar);
                hbkVar.q(hhuVar);
                hhhVar.q(hhuVar);
                hiaVar2.p.setOnClickListener(new hhp(hiaVar2, hjpVar, higVar2, hidVar2, 0));
                hiaVar2.k.setOnClickListener(new hhp(hiaVar2, hjpVar, hidVar2, new hjq(hiaVar2, higVar2), 2));
                hck hckVar = new hck(hiaVar2, hidVar2, 4);
                hiaVar2.addOnAttachStateChangeListener(hckVar);
                fz fzVar = new fz(hiaVar2, 5);
                hiaVar2.addOnAttachStateChangeListener(fzVar);
                int[] iArr = bwn.a;
                if (hiaVar2.isAttachedToWindow()) {
                    hckVar.onViewAttachedToWindow(hiaVar2);
                    fzVar.onViewAttachedToWindow(hiaVar2);
                }
                hiaVar2.h(false);
            }
        });
        this.b.o();
    }

    @Override // android.view.ViewGroup
    public final void addView(final View view, final int i, final ViewGroup.LayoutParams layoutParams) {
        c(new hhm() { // from class: hhk
            @Override // defpackage.hhm
            public final void a(hia hiaVar) {
                hiaVar.addView(view, i, layoutParams);
            }
        });
    }

    @Override // defpackage.hgx
    public final boolean b() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new hri(this);
    }
}
