package com.airbnb.lottie;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.adm.R;
import defpackage.a;
import defpackage.bqx;
import defpackage.cxz;
import defpackage.cya;
import defpackage.cyb;
import defpackage.cyg;
import defpackage.cym;
import defpackage.cyo;
import defpackage.cyq;
import defpackage.cyt;
import defpackage.cyv;
import defpackage.cyw;
import defpackage.dbc;
import defpackage.dbd;
import defpackage.dbm;
import defpackage.dfb;
import defpackage.dfe;
import defpackage.eyh;
import defpackage.lbr;
import defpackage.njz;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;

/* compiled from: PG */
/* loaded from: classes.dex */
public class LottieAnimationView extends AppCompatImageView {
    public static final cyo a = new cyo() { // from class: cxx
        @Override // defpackage.cyo
        public final void a(Object obj) {
            Throwable th = (Throwable) obj;
            cyo cyoVar = LottieAnimationView.a;
            ThreadLocal threadLocal = dfb.a;
            if (!(th instanceof SocketException) && !(th instanceof ClosedChannelException) && !(th instanceof InterruptedIOException) && !(th instanceof ProtocolException) && !(th instanceof SSLException) && !(th instanceof UnknownHostException) && !(th instanceof UnknownServiceException)) {
                throw new IllegalStateException("Unable to parse composition", th);
            }
            deu.b("Unable to load composition.", th);
        }
    };
    public int b;
    public final cym c;
    public boolean d;
    public final Set e;
    public cyb f;
    private final cyo g;
    private final cyo h;
    private String i;
    private int j;
    private boolean k;
    private boolean l;
    private final Set m;
    private cyt n;

    public LottieAnimationView(Context context) {
        super(context);
        this.g = new dbc(this, 1);
        this.h = new dbd(this, 1);
        this.b = 0;
        this.c = new cym();
        this.k = false;
        this.l = false;
        this.d = true;
        this.m = new HashSet();
        this.e = new HashSet();
        i(null, R.attr.lottieAnimationViewStyle);
    }

    private final void h() {
        cyt cytVar = this.n;
        if (cytVar != null) {
            cytVar.g(this.g);
            this.n.f(this.h);
        }
    }

    private final void i(AttributeSet attributeSet, int i) {
        String string;
        cyt h;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, cyv.a, i, 0);
        this.d = obtainStyledAttributes.getBoolean(1, true);
        boolean hasValue = obtainStyledAttributes.hasValue(12);
        boolean hasValue2 = obtainStyledAttributes.hasValue(7);
        boolean hasValue3 = obtainStyledAttributes.hasValue(17);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(12, 0);
            if (resourceId != 0) {
                b(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(7);
            if (string2 != null) {
                c(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(17)) != null) {
            if (this.d) {
                h = cyg.h(getContext(), string, "url_".concat(string));
            } else {
                h = cyg.h(getContext(), string, null);
            }
            j(h);
        }
        this.b = obtainStyledAttributes.getResourceId(6, 0);
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.l = true;
        }
        if (obtainStyledAttributes.getBoolean(10, false)) {
            this.c.p(-1);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            g(obtainStyledAttributes.getInt(15, 1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            f(obtainStyledAttributes.getInt(14, -1));
        }
        if (obtainStyledAttributes.hasValue(16)) {
            this.c.b.c = obtainStyledAttributes.getFloat(16, 1.0f);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.c.m(obtainStyledAttributes.getBoolean(2, true));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            String string3 = obtainStyledAttributes.getString(4);
            cym cymVar = this.c;
            cymVar.g = string3;
            lbr t = cymVar.t();
            if (t != null) {
                t.d = string3;
            }
        }
        e(obtainStyledAttributes.getString(9));
        k(obtainStyledAttributes.getFloat(11, 0.0f), obtainStyledAttributes.hasValue(11));
        this.c.h(obtainStyledAttributes.getBoolean(5, false));
        if (obtainStyledAttributes.hasValue(3)) {
            a(new dbm("**"), cyq.K, new dfe(new cyw(bqx.e(getContext(), obtainStyledAttributes.getResourceId(3, -1)).getDefaultColor())));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            int i2 = obtainStyledAttributes.getInt(13, 0);
            a.y();
            if (i2 >= 3) {
                i2 = 0;
            }
            this.c.s(a.y()[i2]);
        }
        this.c.d = obtainStyledAttributes.getBoolean(8, false);
        if (obtainStyledAttributes.hasValue(18)) {
            this.c.b.l = obtainStyledAttributes.getBoolean(18, false);
        }
        obtainStyledAttributes.recycle();
        cym cymVar2 = this.c;
        Context context = getContext();
        ThreadLocal threadLocal = dfb.a;
        if (Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z = true;
        }
        Boolean.valueOf(z).getClass();
        cymVar2.c = z;
    }

    private final void j(cyt cytVar) {
        this.m.add(cya.SET_ANIMATION);
        this.f = null;
        this.c.g();
        h();
        cytVar.e(this.g);
        cytVar.d(this.h);
        this.n = cytVar;
    }

    private final void k(float f, boolean z) {
        if (z) {
            this.m.add(cya.SET_PROGRESS);
        }
        this.c.o(f);
    }

    public final void a(dbm dbmVar, Object obj, dfe dfeVar) {
        this.c.f(dbmVar, obj, dfeVar);
    }

    public final void b(final int i) {
        cyt g;
        this.j = i;
        this.i = null;
        if (isInEditMode()) {
            g = new cyt(new Callable() { // from class: cxy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    int i2 = i;
                    LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                    if (lottieAnimationView.d) {
                        Context context = lottieAnimationView.getContext();
                        return cyg.c(context, i2, cyg.i(context, i2));
                    }
                    return cyg.c(lottieAnimationView.getContext(), i2, null);
                }
            }, true);
        } else if (this.d) {
            g = cyg.f(getContext(), i);
        } else {
            g = cyg.g(getContext(), i, null);
        }
        j(g);
    }

    public final void c(String str) {
        cyt e;
        this.i = str;
        this.j = 0;
        if (isInEditMode()) {
            e = new cyt(new eyh(this, str, 1), true);
        } else if (this.d) {
            e = cyg.e(getContext(), str, "asset_".concat(String.valueOf(str)));
        } else {
            e = cyg.e(getContext(), str, null);
        }
        j(e);
    }

    public final void d(cyb cybVar) {
        this.c.setCallback(this);
        this.f = cybVar;
        this.k = true;
        boolean r = this.c.r(cybVar);
        this.k = false;
        Drawable drawable = getDrawable();
        cym cymVar = this.c;
        if (drawable == cymVar) {
            if (!r) {
                return;
            }
        } else if (!r) {
            boolean q = cymVar.q();
            setImageDrawable(null);
            setImageDrawable(this.c);
            if (q) {
                this.c.l();
            }
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((njz) it.next()).p();
        }
    }

    public final void e(String str) {
        this.c.f = str;
    }

    public final void f(int i) {
        this.m.add(cya.SET_REPEAT_COUNT);
        this.c.p(i);
    }

    public final void g(int i) {
        this.m.add(cya.SET_REPEAT_MODE);
        this.c.b.setRepeatMode(i);
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof cym) && ((cym) drawable).k) {
            this.c.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        cym cymVar = this.c;
        if (drawable2 == cymVar) {
            super.invalidateDrawable(cymVar);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.l) {
            this.c.j();
        }
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof cxz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        cxz cxzVar = (cxz) parcelable;
        super.onRestoreInstanceState(cxzVar.getSuperState());
        this.i = cxzVar.a;
        if (!this.m.contains(cya.SET_ANIMATION) && !TextUtils.isEmpty(this.i)) {
            c(this.i);
        }
        this.j = cxzVar.b;
        if (!this.m.contains(cya.SET_ANIMATION) && (i = this.j) != 0) {
            b(i);
        }
        if (!this.m.contains(cya.SET_PROGRESS)) {
            k(cxzVar.c, false);
        }
        if (!this.m.contains(cya.PLAY_OPTION) && cxzVar.d) {
            this.m.add(cya.PLAY_OPTION);
            this.c.j();
        }
        if (!this.m.contains(cya.SET_IMAGE_ASSETS)) {
            e(cxzVar.e);
        }
        if (!this.m.contains(cya.SET_REPEAT_MODE)) {
            g(cxzVar.f);
        }
        if (!this.m.contains(cya.SET_REPEAT_COUNT)) {
            f(cxzVar.g);
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        boolean z;
        cxz cxzVar = new cxz(super.onSaveInstanceState());
        cxzVar.a = this.i;
        cxzVar.b = this.j;
        cxzVar.c = this.c.c();
        cym cymVar = this.c;
        if (cymVar.isVisible()) {
            z = cymVar.b.k;
        } else {
            int i = cymVar.m;
            if (i != 2 && i != 3) {
                z = false;
            } else {
                z = true;
            }
        }
        cxzVar.d = z;
        cym cymVar2 = this.c;
        cxzVar.e = cymVar2.f;
        cxzVar.f = cymVar2.b.getRepeatMode();
        cxzVar.g = this.c.e();
        return cxzVar;
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        h();
        super.setImageBitmap(bitmap);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        h();
        super.setImageDrawable(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int i) {
        h();
        super.setImageResource(i);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        cym cymVar;
        if (!this.k && drawable == (cymVar = this.c) && cymVar.q()) {
            this.l = false;
            this.c.i();
        } else if (!this.k && (drawable instanceof cym)) {
            cym cymVar2 = (cym) drawable;
            if (cymVar2.q()) {
                cymVar2.i();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new dbc(this, 1);
        this.h = new dbd(this, 1);
        this.b = 0;
        this.c = new cym();
        this.k = false;
        this.l = false;
        this.d = true;
        this.m = new HashSet();
        this.e = new HashSet();
        i(attributeSet, R.attr.lottieAnimationViewStyle);
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new dbc(this, 1);
        this.h = new dbd(this, 1);
        this.b = 0;
        this.c = new cym();
        this.k = false;
        this.l = false;
        this.d = true;
        this.m = new HashSet();
        this.e = new HashSet();
        i(attributeSet, i);
    }
}
