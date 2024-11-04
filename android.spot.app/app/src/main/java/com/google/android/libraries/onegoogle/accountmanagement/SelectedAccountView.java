package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.adm.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.bwn;
import defpackage.frx;
import defpackage.gzf;
import defpackage.hak;
import defpackage.hal;
import defpackage.ham;
import defpackage.hwx;
import defpackage.jer;
import defpackage.nca;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class SelectedAccountView extends ConstraintLayout implements hal {
    private static final Property k = Property.of(ImageView.class, Float.class, "rotation");
    public final AccountParticleDisc i;
    final ObjectAnimator j;
    private final TextView l;
    private final TextView m;
    private final TextView n;
    private final ImageView o;
    private final ImageView p;
    private final FrameLayout q;
    private final String r;
    private final String s;
    private boolean t;
    private ham u;
    private String v;
    private String w;
    private hak x;
    private nca y;

    public SelectedAccountView(Context context) {
        this(context, null);
    }

    private final void o() {
        jer jerVar = this.u.a;
        if (jerVar.g()) {
            jerVar.c();
        }
        hwx.V(true, "Cannot show right drawable (info/chevron) and counter at the same time");
    }

    private final void p(boolean z) {
        String str;
        String str2;
        int[] iArr = bwn.a;
        this.o.setImportantForAccessibility(1);
        if (z) {
            str = this.v;
        } else {
            str = this.w;
        }
        this.o.setContentDescription(str);
        if (z) {
            str2 = this.s;
        } else {
            str2 = this.r;
        }
        bwn.r(this, str2);
    }

    public final void e(boolean z) {
        if (z == this.t) {
            return;
        }
        this.t = z;
        p(z);
        if (z) {
            this.j.start();
        } else {
            this.j.reverse();
        }
    }

    @Override // defpackage.hal
    public final TextView f() {
        return this.n;
    }

    @Override // defpackage.hal
    public final TextView g() {
        return this.l;
    }

    @Override // defpackage.hal
    public final TextView h() {
        return this.m;
    }

    @Override // defpackage.hal
    public final AccountParticleDisc i() {
        return this.i;
    }

    public final void j(Object obj) {
        boolean z;
        if (this.y != null) {
            z = true;
        } else {
            z = false;
        }
        hwx.V(z, "Initialize must be called before setting an account.");
        this.y.i(obj, this.x);
    }

    public final void k(long j) {
        this.j.setDuration(j);
    }

    public final void l(Interpolator interpolator) {
        this.j.setInterpolator(interpolator);
    }

    public final void m(int i) {
        int i2;
        int i3;
        int i4 = 0;
        if (i == 2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.p.setVisibility(i2);
        ImageView imageView = this.o;
        if (i == 1) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        FrameLayout frameLayout = this.q;
        if (i == 3) {
            i4 = 8;
        }
        frameLayout.setVisibility(i4);
        o();
    }

    public final void n(gzf gzfVar, frx frxVar, ham hamVar, hak hakVar, String str, String str2) {
        this.u = hamVar;
        o();
        this.y = new nca(this, frxVar, hamVar);
        this.i.s(gzfVar, frxVar);
        this.v = str;
        this.w = str2;
        this.x = hakVar;
        this.t = false;
        this.o.setRotation(360.0f);
        p(false);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.u = ham.a().r();
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height);
        if (dimensionPixelSize != this.d) {
            this.d = dimensionPixelSize;
            requestLayout();
        }
        this.l = (TextView) findViewById(R.id.og_primary_account_information);
        this.m = (TextView) findViewById(R.id.og_secondary_account_information);
        this.n = (TextView) findViewById(R.id.counter);
        this.i = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.o = imageView;
        this.j = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) k, 360.0f, 180.0f);
        this.p = (ImageView) findViewById(R.id.og_custom_icon);
        this.q = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
        this.r = getResources().getString(R.string.og_account_list_collapsed_a11y);
        this.s = getResources().getString(R.string.og_account_list_expanded_a11y);
    }
}
