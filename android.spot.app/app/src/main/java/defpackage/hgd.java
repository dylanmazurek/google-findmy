package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import com.google.android.libraries.onegoogle.accountmenu.viewproviders.MyAccountChip;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hgd {
    public final hcc a;
    public final frx b;
    private final hmh c;
    private final hmd d;
    private final hmd e;
    private final hmd f;
    private final hmd g;
    private final hmd h;
    private final hmd i;
    private final hmd j;
    private final hmd k;
    private final hmd l;
    private int m;

    public hgd(final hcc hccVar, final hmh hmhVar, final lnh lnhVar) {
        hmg hmgVar;
        hmf hmfVar;
        hme hmeVar;
        hjp hjpVar;
        hhf hhfVar;
        final boolean z = true ? 1 : 0;
        this.l = new hmd() { // from class: hfz
            @Override // defpackage.hmd
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                int i = z;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            Context context = layoutInflater.getContext();
                            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, hfs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                            try {
                                obtainStyledAttributes.getColor(4, frx.ai(context, R.color.og_background_light));
                                obtainStyledAttributes.getColor(10, frx.ai(context, R.color.og_default_icon_color_light));
                                obtainStyledAttributes.getColor(11, frx.ai(context, R.color.og_incognito_top_tight_icon_color_light));
                                obtainStyledAttributes.getColor(8, frx.ai(context, R.color.og_menu_title_color_light));
                                obtainStyledAttributes.getColor(9, frx.ai(context, R.color.google_white));
                                Drawable c = cu.c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                                obtainStyledAttributes.recycle();
                                ImageView imageView = new ImageView(layoutInflater.getContext());
                                imageView.setImageDrawable(c);
                                return imageView;
                            } catch (Throwable th) {
                                obtainStyledAttributes.recycle();
                                throw th;
                            }
                        }
                        Context context2 = layoutInflater.getContext();
                        TextView textView = new TextView(context2);
                        textView.setText(R.string.og_choose_an_account_title);
                        brh.j(textView, frx.aa(context2, R.attr.ogTextAppearanceSubhead1));
                        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                        try {
                            int color = obtainStyledAttributes2.getColor(0, 0);
                            obtainStyledAttributes2.recycle();
                            textView.setTextColor(color);
                            textView.setGravity(1);
                            textView.setMaxLines(2);
                            textView.setEllipsize(TextUtils.TruncateAt.END);
                            frx.ax(textView);
                            return textView;
                        } catch (Throwable th2) {
                            obtainStyledAttributes2.recycle();
                            throw th2;
                        }
                    }
                    return hgd.c(layoutInflater);
                }
                FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                return frameLayout;
            }
        };
        this.a = hccVar;
        this.c = hmhVar;
        new hgc(hmhVar);
        hmb hmbVar = new hmb();
        hmbVar.a = new hmg() { // from class: hly
            @Override // defpackage.hmg
            public final void a(View view) {
            }
        };
        hmbVar.b = new hmf() { // from class: hlz
            @Override // defpackage.hmf
            public final void a() {
            }
        };
        hmbVar.c = new hme() { // from class: hma
            @Override // defpackage.hme
            public final void a() {
            }
        };
        hmbVar.a();
        hmbVar.b(1);
        final int i = 2;
        hmbVar.c(new hib(2));
        final int i2 = 0;
        hmbVar.a = new hfu(this, i2);
        hmbVar.b = new hmf() { // from class: hfv
            @Override // defpackage.hmf
            public final void a() {
                hgd.this.d(38);
            }
        };
        hmbVar.c = new hme() { // from class: hfw
            @Override // defpackage.hme
            public final void a() {
                jer jerVar = hgd.this.a.d.m;
            }
        };
        hmbVar.c(hccVar.l);
        hmbVar.a();
        hmbVar.b(hccVar.d.q);
        hfe hfeVar = hccVar.d.n;
        if (hfeVar != null) {
            hmbVar.e = hfeVar;
            if (hmbVar.f == 1 && (hmgVar = hmbVar.a) != null && (hmfVar = hmbVar.b) != null && (hmeVar = hmbVar.c) != null && (hjpVar = hmbVar.d) != null && hmbVar.g != 0 && (hhfVar = hmbVar.e) != null) {
                hmc hmcVar = new hmc(hmgVar, hmfVar, hmeVar, hjpVar, hhfVar);
                if (hmhVar.am == null) {
                    hwx.V(hmhVar.ak == null, "initialize() must be called before setViewProviders()");
                    hmhVar.am = hmcVar;
                    hmhVar.ao.o();
                }
                final hga hgaVar = new hga(hmhVar);
                this.d = new hmd() { // from class: hgh
                    @Override // defpackage.hmd
                    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        hau hauVar = new hau(layoutInflater.getContext());
                        hcc hccVar2 = hcc.this;
                        heb hebVar = hccVar2.d;
                        frx frxVar = hebVar.r;
                        jer jerVar = hebVar.m;
                        hnu hnuVar = new hnu(hccVar2.o, jdl.a);
                        bwo bwoVar = new bwo(hccVar2, 2);
                        hiw hiwVar = hccVar2.f;
                        if (hiwVar != null) {
                            lnh lnhVar2 = lnhVar;
                            if (lnhVar2 != null) {
                                hjp hjpVar2 = hccVar2.l;
                                if (hjpVar2 != null) {
                                    hgw hgwVar = hgaVar;
                                    hgi hgiVar = new hgi(hnuVar, 1);
                                    hgi hgiVar2 = new hgi(hnuVar, 0);
                                    jdl jdlVar = jdl.a;
                                    hwx.J(true);
                                    haq haqVar = new haq(bwoVar, hiwVar, lnhVar2, hjpVar2, hgiVar, hgiVar2, jdlVar, jdlVar, hgwVar);
                                    hauVar.o = haqVar.b;
                                    hauVar.p = haqVar.c;
                                    hauVar.t = haqVar.d;
                                    hauVar.q = haqVar.a;
                                    hauVar.s = haqVar.g;
                                    hauVar.n.clear();
                                    hauVar.i.setOnClickListener(hauVar.g(haqVar.e, 18));
                                    hauVar.j.setOnClickListener(hauVar.g(haqVar.f, 19));
                                    hauVar.n.add(new hat(hauVar));
                                    hauVar.r = new has(hauVar);
                                    hauVar.b(hauVar.t);
                                    int Z = frx.Z(hauVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + frx.Z(hauVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                                    hauVar.setPadding(hauVar.getPaddingLeft() + Z, hauVar.getPaddingTop(), hauVar.getPaddingRight() + Z, hauVar.getPaddingBottom());
                                    return hauVar;
                                }
                                throw new NullPointerException("Null visualElements");
                            }
                            throw new NullPointerException("Null logContext");
                        }
                        throw new NullPointerException("Null eventLogger");
                    }
                };
                final int i3 = 3;
                this.e = new hmd() { // from class: hfz
                    @Override // defpackage.hmd
                    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        int i4 = i3;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    Context context = layoutInflater.getContext();
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, hfs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                                    try {
                                        obtainStyledAttributes.getColor(4, frx.ai(context, R.color.og_background_light));
                                        obtainStyledAttributes.getColor(10, frx.ai(context, R.color.og_default_icon_color_light));
                                        obtainStyledAttributes.getColor(11, frx.ai(context, R.color.og_incognito_top_tight_icon_color_light));
                                        obtainStyledAttributes.getColor(8, frx.ai(context, R.color.og_menu_title_color_light));
                                        obtainStyledAttributes.getColor(9, frx.ai(context, R.color.google_white));
                                        Drawable c = cu.c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                                        obtainStyledAttributes.recycle();
                                        ImageView imageView = new ImageView(layoutInflater.getContext());
                                        imageView.setImageDrawable(c);
                                        return imageView;
                                    } catch (Throwable th) {
                                        obtainStyledAttributes.recycle();
                                        throw th;
                                    }
                                }
                                Context context2 = layoutInflater.getContext();
                                TextView textView = new TextView(context2);
                                textView.setText(R.string.og_choose_an_account_title);
                                brh.j(textView, frx.aa(context2, R.attr.ogTextAppearanceSubhead1));
                                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                                try {
                                    int color = obtainStyledAttributes2.getColor(0, 0);
                                    obtainStyledAttributes2.recycle();
                                    textView.setTextColor(color);
                                    textView.setGravity(1);
                                    textView.setMaxLines(2);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    frx.ax(textView);
                                    return textView;
                                } catch (Throwable th2) {
                                    obtainStyledAttributes2.recycle();
                                    throw th2;
                                }
                            }
                            return hgd.c(layoutInflater);
                        }
                        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                        frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                        return frameLayout;
                    }
                };
                this.f = new hmd() { // from class: hfz
                    @Override // defpackage.hmd
                    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        int i4 = i;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    Context context = layoutInflater.getContext();
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, hfs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                                    try {
                                        obtainStyledAttributes.getColor(4, frx.ai(context, R.color.og_background_light));
                                        obtainStyledAttributes.getColor(10, frx.ai(context, R.color.og_default_icon_color_light));
                                        obtainStyledAttributes.getColor(11, frx.ai(context, R.color.og_incognito_top_tight_icon_color_light));
                                        obtainStyledAttributes.getColor(8, frx.ai(context, R.color.og_menu_title_color_light));
                                        obtainStyledAttributes.getColor(9, frx.ai(context, R.color.google_white));
                                        Drawable c = cu.c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                                        obtainStyledAttributes.recycle();
                                        ImageView imageView = new ImageView(layoutInflater.getContext());
                                        imageView.setImageDrawable(c);
                                        return imageView;
                                    } catch (Throwable th) {
                                        obtainStyledAttributes.recycle();
                                        throw th;
                                    }
                                }
                                Context context2 = layoutInflater.getContext();
                                TextView textView = new TextView(context2);
                                textView.setText(R.string.og_choose_an_account_title);
                                brh.j(textView, frx.aa(context2, R.attr.ogTextAppearanceSubhead1));
                                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                                try {
                                    int color = obtainStyledAttributes2.getColor(0, 0);
                                    obtainStyledAttributes2.recycle();
                                    textView.setTextColor(color);
                                    textView.setGravity(1);
                                    textView.setMaxLines(2);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    frx.ax(textView);
                                    return textView;
                                } catch (Throwable th2) {
                                    obtainStyledAttributes2.recycle();
                                    throw th2;
                                }
                            }
                            return hgd.c(layoutInflater);
                        }
                        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                        frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                        return frameLayout;
                    }
                };
                this.g = new hfx(hmhVar, hccVar, hgaVar, lnhVar, 1);
                this.h = new hfx(hmhVar, hccVar, hgaVar, lnhVar, 0);
                this.i = new hmd() { // from class: hfy
                    @Override // defpackage.hmd
                    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        String str;
                        String str2;
                        hmh hmhVar2 = hmh.this;
                        if (hmhVar2.P == null) {
                            return hgd.c(layoutInflater);
                        }
                        lnh lnhVar2 = lnhVar;
                        hgw hgwVar = hgaVar;
                        hcc hccVar2 = hccVar;
                        cfc O = hmhVar2.O();
                        hgp hgpVar = new hgp(layoutInflater.getContext());
                        ham b = hgd.b(hccVar2, O);
                        ijs.c();
                        hgpVar.p = b;
                        hgpVar.m = hccVar2;
                        hgpVar.n = lnhVar2;
                        hgpVar.k = hgwVar;
                        heb hebVar = hccVar2.d;
                        hej hejVar = hebVar.j;
                        hgpVar.j = hebVar.l;
                        hgpVar.q = new apc(hccVar2.f, lnhVar2, hccVar2.b, (int[]) null);
                        hgpVar.i = hccVar2.l;
                        hgpVar.b(hgpVar.i);
                        int Z = frx.Z(hgpVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing);
                        hgpVar.getContext();
                        hbk hbkVar = new hbk(frx.af(hccVar2), new hgg(hgwVar, hccVar2, 2), hgwVar, lnhVar2, hccVar2.l, Z, b, true);
                        frx.ah(hgpVar.c, hbkVar);
                        MyAccountChip myAccountChip = hgpVar.a;
                        myAccountChip.b = hccVar2;
                        myAccountChip.b(hccVar2.l);
                        hha hhaVar = new hha(new hgq(hccVar2, lnhVar2, 2));
                        hhaVar.c = hgwVar.b();
                        hhaVar.d = hgwVar.a();
                        myAccountChip.setOnClickListener(new hgz(hhaVar));
                        hgpVar.l = hccVar2.d.f;
                        if (hgpVar.l.a().g()) {
                            Context context = hgpVar.getContext();
                            hgpVar.l.a().c();
                            str = context.getString(R.string.og_collapse_account_list_a11y);
                        } else {
                            str = null;
                        }
                        if (hgpVar.l.a().g()) {
                            Context context2 = hgpVar.getContext();
                            hgpVar.l.a().c();
                            str2 = context2.getString(R.string.og_expand_account_list_a11y);
                        } else {
                            str2 = null;
                        }
                        hgpVar.b.i.g();
                        SelectedAccountView selectedAccountView = hgpVar.b;
                        gzf gzfVar = hccVar2.i;
                        frx frxVar = hccVar2.o;
                        if (!hccVar2.d.f.e()) {
                            jer jerVar = hccVar2.d.l;
                        } else {
                            jer jerVar2 = b.a;
                            if (jerVar2.g()) {
                                lyn lynVar = new lyn(b);
                                hao haoVar = (hao) jerVar2.c();
                                lynVar.s(frx.av(haoVar.a, jdl.a, haoVar.c));
                                b = lynVar.r();
                            }
                        }
                        selectedAccountView.n(gzfVar, frxVar, b, new hgj(hgpVar, 0), str, str2);
                        hgpVar.b.i.f(hccVar2.l);
                        jin jinVar = new jin();
                        hgpVar.o = hccVar2.d.g;
                        if (hgpVar.o.g()) {
                            jinVar.h(new hey(hgpVar.getContext(), O, (han) hgpVar.o.c()));
                        }
                        jer jerVar3 = hccVar2.d.d;
                        if (jerVar3.g()) {
                            jerVar3.c();
                            if (fgp.a.g(hgpVar.getContext(), 223900000) == 0) {
                                jerVar3.c();
                                hcd hcdVar = hccVar2.b;
                                hjp hjpVar2 = hccVar2.l;
                                AccountParticleDisc accountParticleDisc = hgpVar.b.i;
                                int dimensionPixelSize = hgpVar.getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_disc_size);
                                jer jerVar4 = hccVar2.d.m;
                                hfg hfgVar = new hfg(hcdVar, hjpVar2, accountParticleDisc, dimensionPixelSize, hgwVar);
                                hck hckVar = new hck(hfgVar, new hff(hfgVar, 0), 2);
                                AccountParticleDisc accountParticleDisc2 = hfgVar.a;
                                int[] iArr = bwn.a;
                                if (accountParticleDisc2.isAttachedToWindow()) {
                                    hckVar.onViewAttachedToWindow(hfgVar.a);
                                }
                                hfgVar.a.addOnAttachStateChangeListener(hckVar);
                                Context context3 = hgpVar.getContext();
                                jerVar3.c();
                                jinVar.h(new hfh(context3));
                            }
                        }
                        jis g = jinVar.g();
                        if (!g.isEmpty()) {
                            hgpVar.b.i.l(new hac(g, O));
                        }
                        boolean e = hgpVar.l.e();
                        hgpVar.a(e);
                        heb hebVar2 = hccVar2.d;
                        hcy hcyVar = new hcy(hgpVar.getContext(), hgpVar.m.b, hgpVar.f, hgpVar.k, hgpVar.i, Z);
                        frx.ah(hgpVar.d, hcyVar);
                        hgpVar.c(hccVar2, hbkVar, hcyVar);
                        hgf hgfVar = new hgf(hccVar2, hgpVar.getContext(), O);
                        hgfVar.b();
                        hgfVar.c();
                        hgfVar.e = new hcg(hccVar2).a();
                        hgfVar.d = e;
                        hge a = hgfVar.a();
                        cfk cfkVar = a.a;
                        hfe hfeVar2 = hebVar2.n;
                        frx.ah((RecyclerView) hgpVar.findViewById(R.id.cards_and_actions), hgpVar.f(cfkVar, Z));
                        frx.ah((RecyclerView) hgpVar.findViewById(R.id.common_actions), hgpVar.f(a.b, frx.Z(hgpVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing) + Z));
                        hgf hgfVar2 = new hgf(hccVar2, hgpVar.getContext(), O);
                        hgfVar2.d = !e;
                        hgfVar2.g = true;
                        hge a2 = hgfVar2.a();
                        RecyclerView recyclerView = (RecyclerView) hgpVar.findViewById(R.id.og_top_cards);
                        hcy f = hgpVar.f(a2.a, Z);
                        frx.ah(recyclerView, f);
                        RecyclerView recyclerView2 = hgpVar.c;
                        recyclerView2.ap(hgp.d(recyclerView2));
                        RecyclerView recyclerView3 = hgpVar.d;
                        hcd hcdVar2 = hccVar2.b;
                        hgk hgkVar = new hgk(hbkVar, recyclerView3, hgp.d(recyclerView3));
                        hgl hglVar = new hgl(hgpVar, hbkVar, hcyVar);
                        hgm hgmVar = new hgm(hgpVar, f, recyclerView);
                        recyclerView.setFocusable(false);
                        hgn hgnVar = new hgn(hgpVar, hcdVar2, hbkVar, hgkVar, hglVar, hcyVar, f, hgmVar);
                        hgpVar.addOnAttachStateChangeListener(hgnVar);
                        int[] iArr2 = bwn.a;
                        if (hgpVar.isAttachedToWindow()) {
                            hgnVar.onViewAttachedToWindow(hgpVar);
                        }
                        hgpVar.setId(R.id.og_has_selected_content);
                        return hgpVar;
                    }
                };
                this.j = new hfx(hccVar, hgaVar, lnhVar, hmhVar, 2);
                this.k = new hmd() { // from class: hfz
                    @Override // defpackage.hmd
                    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                        int i4 = i2;
                        if (i4 != 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    Context context = layoutInflater.getContext();
                                    TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, hfs.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                                    try {
                                        obtainStyledAttributes.getColor(4, frx.ai(context, R.color.og_background_light));
                                        obtainStyledAttributes.getColor(10, frx.ai(context, R.color.og_default_icon_color_light));
                                        obtainStyledAttributes.getColor(11, frx.ai(context, R.color.og_incognito_top_tight_icon_color_light));
                                        obtainStyledAttributes.getColor(8, frx.ai(context, R.color.og_menu_title_color_light));
                                        obtainStyledAttributes.getColor(9, frx.ai(context, R.color.google_white));
                                        Drawable c = cu.c(context, obtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                                        obtainStyledAttributes.recycle();
                                        ImageView imageView = new ImageView(layoutInflater.getContext());
                                        imageView.setImageDrawable(c);
                                        return imageView;
                                    } catch (Throwable th) {
                                        obtainStyledAttributes.recycle();
                                        throw th;
                                    }
                                }
                                Context context2 = layoutInflater.getContext();
                                TextView textView = new TextView(context2);
                                textView.setText(R.string.og_choose_an_account_title);
                                brh.j(textView, frx.aa(context2, R.attr.ogTextAppearanceSubhead1));
                                TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(new int[]{R.attr.colorOnSurface});
                                try {
                                    int color = obtainStyledAttributes2.getColor(0, 0);
                                    obtainStyledAttributes2.recycle();
                                    textView.setTextColor(color);
                                    textView.setGravity(1);
                                    textView.setMaxLines(2);
                                    textView.setEllipsize(TextUtils.TruncateAt.END);
                                    frx.ax(textView);
                                    return textView;
                                } catch (Throwable th2) {
                                    obtainStyledAttributes2.recycle();
                                    throw th2;
                                }
                            }
                            return hgd.c(layoutInflater);
                        }
                        FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                        frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                        return frameLayout;
                    }
                };
                this.b = new hgb(this);
                hjq hjqVar = new hjq(this, hccVar);
                hjq hjqVar2 = hmhVar.an;
                if (hjqVar2 != null && hmhVar.ai) {
                    hjqVar2.c();
                }
                hmhVar.an = hjqVar;
                if (hmhVar.ai) {
                    hjqVar.b();
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder();
            if (hmbVar.a == null) {
                sb.append(" onViewCreatedCallback");
            }
            if (hmbVar.b == null) {
                sb.append(" onDismissCallback");
            }
            if (hmbVar.c == null) {
                sb.append(" onDestroyCallback");
            }
            if (hmbVar.d == null) {
                sb.append(" visualElements");
            }
            if (hmbVar.f == 0) {
                sb.append(" isExperimental");
            }
            if (hmbVar.g == 0) {
                sb.append(" largeScreenDialogAlignment");
            }
            if (hmbVar.e == null) {
                sb.append(" materialVersion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        throw new NullPointerException("Null materialVersion");
    }

    public static final ham b(hcc hccVar, cfc cfcVar) {
        heb hebVar = hccVar.d;
        jer jerVar = hebVar.k;
        jdl jdlVar = jdl.a;
        jer jerVar2 = hebVar.g;
        if (jerVar2 != null) {
            lyn a = ham.a();
            a.s(frx.av(cfcVar, jdlVar, jerVar2));
            return a.r();
        }
        throw new NullPointerException("Null criticalAlertFeature");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ View c(LayoutInflater layoutInflater) {
        View view = new View(layoutInflater.getContext());
        view.setVisibility(8);
        return view;
    }

    public final void a() {
        int i;
        ExpandableDialogView expandableDialogView;
        hmd hmdVar;
        hmd hmdVar2;
        hmd hmdVar3;
        int a;
        if (!this.a.b.c()) {
            i = 1;
        } else if (this.a.b.b().isEmpty()) {
            i = 3;
        } else if (this.a.b.a() != null) {
            i = 5;
        } else {
            i = 4;
        }
        int i2 = this.m;
        if (i != i2) {
            this.m = i;
            hwx.U(true);
            int i3 = i - 1;
            if (i3 != 0) {
                if (i3 != 3) {
                    hmdVar = this.e;
                } else {
                    hmdVar = this.f;
                }
            } else {
                hmdVar = this.l;
            }
            if (hmdVar != null) {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                hmdVar2 = this.i;
                            } else {
                                hmdVar2 = this.h;
                            }
                        } else {
                            hmdVar2 = this.g;
                        }
                    } else {
                        hmdVar2 = this.j;
                    }
                } else {
                    hmdVar2 = this.k;
                }
                if (hmdVar2 != null) {
                    if (i == 1) {
                        hmdVar3 = this.l;
                    } else {
                        hmdVar3 = this.d;
                    }
                    if (hmdVar3 != null) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    a = R.string.og_account_and_settings;
                                } else {
                                    a = R.string.og_choose_an_account_title;
                                }
                            } else {
                                a = R.string.og_sign_in_;
                            }
                        } else {
                            a = ((hel) this.a.d.b.c()).a();
                        }
                        hmh hmhVar = this.c;
                        hmj hmjVar = new hmj(hmdVar, hmdVar2, hmdVar3, a);
                        ijs.c();
                        hmhVar.ak = hmjVar;
                        ExpandableDialogView expandableDialogView2 = hmhVar.al;
                        if (expandableDialogView2 != null) {
                            hmhVar.aF(hmjVar, expandableDialogView2);
                        }
                        Dialog dialog = hmhVar.d;
                        if (dialog != null) {
                            dialog.setTitle(hmjVar.d);
                        }
                    } else {
                        throw new NullPointerException("Null footerViewProvider");
                    }
                } else {
                    throw new NullPointerException("Null contentViewProvider");
                }
            } else {
                throw new NullPointerException("Null headerViewProvider");
            }
        }
        if (i2 == 0) {
            hmh hmhVar2 = this.c;
            ijs.c();
            SparseArray sparseArray = hmhVar2.aj;
            if (sparseArray != null && (expandableDialogView = hmhVar2.al) != null) {
                expandableDialogView.restoreHierarchyState(sparseArray);
            }
        }
    }

    public final void d(int i) {
        hcc hccVar = this.a;
        Object a = hccVar.b.a();
        ljh k = lnh.g.k();
        if (!k.b.y()) {
            k.t();
        }
        ljn ljnVar = k.b;
        lnh lnhVar = (lnh) ljnVar;
        lnhVar.c = 1;
        lnhVar.a |= 2;
        if (!ljnVar.y()) {
            k.t();
        }
        ljn ljnVar2 = k.b;
        lnh lnhVar2 = (lnh) ljnVar2;
        lnhVar2.e = 8;
        lnhVar2.a |= 32;
        if (!ljnVar2.y()) {
            k.t();
        }
        ljn ljnVar3 = k.b;
        lnh lnhVar3 = (lnh) ljnVar3;
        lnhVar3.d = 3;
        lnhVar3.a = 8 | lnhVar3.a;
        if (!ljnVar3.y()) {
            k.t();
        }
        hiw hiwVar = hccVar.f;
        lnh lnhVar4 = (lnh) k.b;
        lnhVar4.b = i - 1;
        lnhVar4.a |= 1;
        hiwVar.a(a, (lnh) k.q());
    }
}
