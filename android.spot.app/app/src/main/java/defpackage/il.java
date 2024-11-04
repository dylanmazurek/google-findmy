package defpackage;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
final class il extends ig {
    public final SeekBar b;
    public Drawable c;
    private ColorStateList d;
    private PorterDuff.Mode e;
    private boolean f;
    private boolean g;

    public il(SeekBar seekBar) {
        super(seekBar);
        this.d = null;
        this.e = null;
        this.f = false;
        this.g = false;
        this.b = seekBar;
    }

    private final void c() {
        Drawable drawable = this.c;
        if (drawable != null) {
            if (this.f || this.g) {
                Drawable i = bpu.i(drawable.mutate());
                this.c = i;
                if (this.f) {
                    bsc.g(i, this.d);
                }
                if (this.g) {
                    bsc.h(this.c, this.e);
                }
                if (this.c.isStateful()) {
                    this.c.setState(this.b.getDrawableState());
                }
            }
        }
    }

    @Override // defpackage.ig
    public final void b(AttributeSet attributeSet, int i) {
        super.b(attributeSet, R.attr.seekBarStyle);
        ksr F = ksr.F(this.b.getContext(), attributeSet, eb.g, R.attr.seekBarStyle, 0);
        Object obj = F.b;
        SeekBar seekBar = this.b;
        bwn.p(seekBar, seekBar.getContext(), eb.g, attributeSet, (TypedArray) obj, R.attr.seekBarStyle, 0);
        Drawable v = F.v(0);
        if (v != null) {
            this.b.setThumb(v);
        }
        Drawable u = F.u(1);
        Drawable drawable = this.c;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.c = u;
        if (u != null) {
            u.setCallback(this.b);
            bpu.k(u, this.b.getLayoutDirection());
            if (u.isStateful()) {
                u.setState(this.b.getDrawableState());
            }
            c();
        }
        this.b.invalidate();
        if (F.A(3)) {
            this.e = a.h(F.p(3, -1), this.e);
            this.g = true;
        }
        if (F.A(2)) {
            this.d = F.t(2);
            this.f = true;
        }
        F.y();
        c();
    }
}
