package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irk {
    private float A;
    private float B;
    private float C;
    private float D;
    private Typeface E;
    private Typeface F;
    private Typeface G;
    private Typeface H;
    private Typeface I;
    private Typeface J;
    private Typeface K;
    private iuo L;
    private iuo M;
    private CharSequence N;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    private int T;
    private int[] U;
    private boolean V;
    private final TextPaint W;
    private TimeInterpolator X;
    private TimeInterpolator Y;
    private float Z;
    public float a;
    private float aa;
    private float ab;
    private ColorStateList ac;
    private float ad;
    private float ae;
    private float af;
    private ColorStateList ag;
    private float ah;
    private float ai;
    private StaticLayout aj;
    private float ak;
    private float al;
    private CharSequence am;
    public boolean b;
    public float c;
    public float d;
    public int e;
    public final Rect f;
    public ColorStateList g;
    public ColorStateList h;
    public int i;
    public CharSequence k;
    public boolean l;
    public final TextPaint n;
    public float o;
    public float p;
    private final View r;
    private final Rect s;
    private final RectF t;
    private float y;
    private float z;
    private int u = 16;
    private int v = 16;
    private float w = 15.0f;
    private float x = 15.0f;
    public TextUtils.TruncateAt j = TextUtils.TruncateAt.END;
    public boolean m = true;
    public int q = 1;
    private final int an = iru.a;

    public irk(View view) {
        this.r = view;
        TextPaint textPaint = new TextPaint(129);
        this.W = textPaint;
        this.n = new TextPaint(textPaint);
        this.f = new Rect();
        this.s = new Rect();
        this.t = new RectF();
        this.d = a();
        f(view.getContext().getResources().getConfiguration());
    }

    private static float A(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        TimeInterpolator timeInterpolator2 = inc.a;
        return f + (f3 * (f2 - f));
    }

    private static int B(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i) * f2) + (Color.alpha(i2) * f)), Math.round((Color.red(i) * f2) + (Color.red(i2) * f)), Math.round((Color.green(i) * f2) + (Color.green(i2) * f)), Math.round((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    private final int C(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.U;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    private final void D() {
        float f;
        float a;
        Rect rect;
        float f2 = this.a;
        if (this.b) {
            RectF rectF = this.t;
            if (f2 < this.d) {
                rect = this.s;
            } else {
                rect = this.f;
            }
            rectF.set(rect);
        } else {
            this.t.left = A(this.s.left, this.f.left, f2, this.X);
            this.t.top = A(this.y, this.z, f2, this.X);
            this.t.right = A(this.s.right, this.f.right, f2, this.X);
            this.t.bottom = A(this.s.bottom, this.f.bottom, f2, this.X);
        }
        if (this.b) {
            if (f2 < this.d) {
                this.C = this.A;
                this.D = this.y;
                F(0.0f);
                f = 0.0f;
            } else {
                this.C = this.B;
                this.D = this.z - Math.max(0, this.e);
                F(1.0f);
                f = 1.0f;
            }
        } else {
            this.C = A(this.A, this.B, f2, this.X);
            this.D = A(this.y, this.z, f2, this.X);
            F(f2);
            f = f2;
        }
        this.ak = 1.0f - A(0.0f, 1.0f, 1.0f - f2, inc.b);
        this.r.postInvalidateOnAnimation();
        this.al = A(1.0f, 0.0f, f2, inc.b);
        this.r.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.h;
        ColorStateList colorStateList2 = this.g;
        if (colorStateList != colorStateList2) {
            this.W.setColor(B(C(colorStateList2), c(), f));
        } else {
            this.W.setColor(c());
        }
        float f3 = this.ah;
        float f4 = this.o;
        if (f3 != f4) {
            this.W.setLetterSpacing(A(f4, f3, f2, inc.b));
        } else {
            this.W.setLetterSpacing(f3);
        }
        this.Q = A(this.ad, this.Z, f2, null);
        this.R = A(this.ae, this.aa, f2, null);
        this.S = A(this.af, this.ab, f2, null);
        int B = B(C(this.ag), C(this.ac), f2);
        this.T = B;
        this.W.setShadowLayer(this.Q, this.R, this.S, B);
        if (this.b) {
            int alpha = this.W.getAlpha();
            float f5 = this.d;
            if (f2 <= f5) {
                a = inc.a(1.0f, 0.0f, this.c, f5, f2);
            } else {
                a = inc.a(0.0f, 1.0f, f5, 1.0f, f2);
            }
            this.W.setAlpha((int) (a * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.W;
                textPaint.setShadowLayer(this.Q, this.R, this.S, iqg.b(this.T, textPaint.getAlpha()));
            }
        }
        this.r.postInvalidateOnAnimation();
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00f2, code lost:            if (r26.l != false) goto L64;     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017f A[Catch: Exception -> 0x0178, TryCatch #1 {Exception -> 0x0178, blocks: (B:78:0x0172, B:69:0x017f, B:70:0x0184, B:76:0x0182), top: B:77:0x0172, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0182 A[Catch: Exception -> 0x0178, TryCatch #1 {Exception -> 0x0178, blocks: (B:78:0x0172, B:69:0x017f, B:70:0x0184, B:76:0x0182), top: B:77:0x0172, outer: #0 }] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Class<android.text.StaticLayout>, java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void E(float r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.irk.E(float, boolean):void");
    }

    private final void F(float f) {
        E(f, false);
        this.r.postInvalidateOnAnimation();
    }

    private static boolean G(float f, float f2) {
        if (Math.abs(f - f2) < 1.0E-5f) {
            return true;
        }
        return false;
    }

    private static boolean H(Rect rect, int i, int i2, int i3, int i4) {
        if (rect.left == i && rect.top == i2 && rect.right == i3 && rect.bottom == i4) {
            return true;
        }
        return false;
    }

    private final boolean I() {
        if (this.q <= 1) {
            return false;
        }
        if (this.l && !this.b) {
            return false;
        }
        return true;
    }

    private static final float J(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final float a() {
        float f = this.c;
        return f + ((1.0f - f) * 0.5f);
    }

    public final float b() {
        TextPaint textPaint = this.n;
        textPaint.setTextSize(this.x);
        textPaint.setTypeface(this.E);
        textPaint.setLetterSpacing(this.ah);
        return -this.n.ascent();
    }

    public final int c() {
        return C(this.h);
    }

    public final void d(Canvas canvas) {
        int save = canvas.save();
        if (this.N != null && this.t.width() > 0.0f && this.t.height() > 0.0f) {
            this.W.setTextSize(this.P);
            float f = this.C;
            float f2 = this.D;
            float f3 = this.O;
            if (f3 != 1.0f && !this.b) {
                canvas.scale(f3, f3, f, f2);
            }
            if (I() && (!this.b || this.a > this.d)) {
                float lineStart = this.C - this.aj.getLineStart(0);
                int alpha = this.W.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.b) {
                    this.W.setAlpha((int) (this.al * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        TextPaint textPaint = this.W;
                        textPaint.setShadowLayer(this.Q, this.R, this.S, iqg.b(this.T, textPaint.getAlpha()));
                    }
                    this.aj.draw(canvas);
                }
                if (!this.b) {
                    this.W.setAlpha((int) (this.ak * alpha));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    TextPaint textPaint2 = this.W;
                    textPaint2.setShadowLayer(this.Q, this.R, this.S, iqg.b(this.T, textPaint2.getAlpha()));
                }
                int lineBaseline = this.aj.getLineBaseline(0);
                CharSequence charSequence = this.am;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, this.W);
                if (Build.VERSION.SDK_INT >= 31) {
                    this.W.setShadowLayer(this.Q, this.R, this.S, this.T);
                }
                if (!this.b) {
                    String trim = this.am.toString().trim();
                    if (trim.endsWith("…")) {
                        trim = trim.substring(0, trim.length() - 1);
                    }
                    String str = trim;
                    this.W.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(this.aj.getLineEnd(0), str.length()), 0.0f, f4, (Paint) this.W);
                }
            } else {
                canvas.translate(f, f2);
                this.aj.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    public final void e(TextPaint textPaint) {
        textPaint.setTextSize(this.w);
        textPaint.setTypeface(this.H);
        textPaint.setLetterSpacing(this.o);
    }

    public final void f(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.G;
            if (typeface != null) {
                this.F = hzc.e(configuration, typeface);
            }
            Typeface typeface2 = this.J;
            if (typeface2 != null) {
                this.I = hzc.e(configuration, typeface2);
            }
            Typeface typeface3 = this.F;
            if (typeface3 == null) {
                typeface3 = this.G;
            }
            this.E = typeface3;
            Typeface typeface4 = this.I;
            if (typeface4 == null) {
                typeface4 = this.J;
            }
            this.H = typeface4;
            h(true);
        }
    }

    public final void g() {
        h(false);
    }

    public final void h(boolean z) {
        float f;
        int i;
        StaticLayout staticLayout;
        if (this.r.getHeight() <= 0 || this.r.getWidth() <= 0) {
            if (z) {
                z = true;
            } else {
                return;
            }
        }
        E(1.0f, z);
        CharSequence charSequence = this.N;
        if (charSequence != null && (staticLayout = this.aj) != null) {
            this.am = TextUtils.ellipsize(charSequence, this.W, staticLayout.getWidth(), this.j);
        }
        CharSequence charSequence2 = this.am;
        float f2 = 0.0f;
        if (charSequence2 != null) {
            this.p = J(this.W, charSequence2);
        } else {
            this.p = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.v, this.l ? 1 : 0);
        int i2 = absoluteGravity & 112;
        if (i2 != 48) {
            if (i2 != 80) {
                TextPaint textPaint = this.W;
                this.z = this.f.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
            } else {
                this.z = this.f.bottom + this.W.ascent();
            }
        } else {
            this.z = this.f.top;
        }
        int i3 = absoluteGravity & 8388615;
        if (i3 != 1) {
            if (i3 != 5) {
                this.B = this.f.left;
            } else {
                this.B = this.f.right - this.p;
            }
        } else {
            this.B = this.f.centerX() - (this.p / 2.0f);
        }
        E(0.0f, z);
        StaticLayout staticLayout2 = this.aj;
        if (staticLayout2 != null) {
            f = staticLayout2.getHeight();
        } else {
            f = 0.0f;
        }
        StaticLayout staticLayout3 = this.aj;
        if (staticLayout3 != null && this.q > 1) {
            f2 = staticLayout3.getWidth();
        } else {
            CharSequence charSequence3 = this.N;
            if (charSequence3 != null) {
                f2 = J(this.W, charSequence3);
            }
        }
        StaticLayout staticLayout4 = this.aj;
        if (staticLayout4 != null) {
            i = staticLayout4.getLineCount();
        } else {
            i = 0;
        }
        this.i = i;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.u, this.l ? 1 : 0);
        int i4 = absoluteGravity2 & 112;
        if (i4 != 48) {
            if (i4 != 80) {
                this.y = this.s.centerY() - (f / 2.0f);
            } else {
                this.y = (this.s.bottom - f) + this.W.descent();
            }
        } else {
            this.y = this.s.top;
        }
        int i5 = absoluteGravity2 & 8388615;
        if (i5 != 1) {
            if (i5 != 5) {
                this.A = this.s.left;
            } else {
                this.A = this.s.right - f2;
            }
        } else {
            this.A = this.s.centerX() - (f2 / 2.0f);
        }
        F(this.a);
        D();
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == colorStateList && this.g == colorStateList) {
            return;
        }
        this.h = colorStateList;
        this.g = colorStateList;
        g();
    }

    public final void j(int i, int i2, int i3, int i4) {
        if (!H(this.f, i, i2, i3, i4)) {
            this.f.set(i, i2, i3, i4);
            this.V = true;
        }
    }

    public final void k(int i) {
        ius iusVar = new ius(this.r.getContext(), i);
        ColorStateList colorStateList = iusVar.j;
        if (colorStateList != null) {
            this.h = colorStateList;
        }
        float f = iusVar.k;
        if (f != 0.0f) {
            this.x = f;
        }
        ColorStateList colorStateList2 = iusVar.a;
        if (colorStateList2 != null) {
            this.ac = colorStateList2;
        }
        this.aa = iusVar.e;
        this.ab = iusVar.f;
        this.Z = iusVar.g;
        this.ah = iusVar.i;
        iuo iuoVar = this.M;
        if (iuoVar != null) {
            iuoVar.c();
        }
        this.M = new iuo(new irj(this, 1), iusVar.a());
        iusVar.b(this.r.getContext(), this.M);
        g();
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            g();
        }
    }

    public final void m(int i) {
        if (this.v != i) {
            this.v = i;
            g();
        }
    }

    public final void n(int i, int i2, int i3, int i4) {
        if (!H(this.s, i, i2, i3, i4)) {
            this.s.set(i, i2, i3, i4);
            this.V = true;
        }
    }

    public final void o(int i) {
        ius iusVar = new ius(this.r.getContext(), i);
        ColorStateList colorStateList = iusVar.j;
        if (colorStateList != null) {
            this.g = colorStateList;
        }
        float f = iusVar.k;
        if (f != 0.0f) {
            this.w = f;
        }
        ColorStateList colorStateList2 = iusVar.a;
        if (colorStateList2 != null) {
            this.ag = colorStateList2;
        }
        this.ae = iusVar.e;
        this.af = iusVar.f;
        this.ad = iusVar.g;
        this.o = iusVar.i;
        iuo iuoVar = this.L;
        if (iuoVar != null) {
            iuoVar.c();
        }
        this.L = new iuo(new irj(this, 0), iusVar.a());
        iusVar.b(this.r.getContext(), this.L);
        g();
    }

    public final void p(int i) {
        if (this.u != i) {
            this.u = i;
            g();
        }
    }

    public final void q(float f) {
        if (this.w != f) {
            this.w = f;
            g();
        }
    }

    public final void r(float f) {
        float d = bpv.d(f, 0.0f, 1.0f);
        if (d != this.a) {
            this.a = d;
            D();
        }
    }

    public final void s(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        g();
    }

    public final void t(CharSequence charSequence) {
        if (charSequence != null && TextUtils.equals(this.k, charSequence)) {
            return;
        }
        this.k = charSequence;
        this.N = null;
        g();
    }

    public final void u(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        g();
    }

    public final void v(Typeface typeface) {
        boolean x = x(typeface);
        boolean y = y(typeface);
        if (!x && !y) {
            return;
        }
        g();
    }

    public final boolean w(CharSequence charSequence) {
        lzl lzlVar;
        int layoutDirection = this.r.getLayoutDirection();
        boolean z = this.m;
        boolean z2 = true;
        if (layoutDirection != 1) {
            z2 = false;
        }
        if (z) {
            if (z2) {
                lzlVar = bub.d;
            } else {
                lzlVar = bub.c;
            }
            return lzlVar.d(charSequence, charSequence.length());
        }
        return z2;
    }

    public final boolean x(Typeface typeface) {
        iuo iuoVar = this.M;
        if (iuoVar != null) {
            iuoVar.c();
        }
        if (this.G != typeface) {
            this.G = typeface;
            Typeface e = hzc.e(this.r.getContext().getResources().getConfiguration(), typeface);
            this.F = e;
            if (e == null) {
                e = this.G;
            }
            this.E = e;
            return true;
        }
        return false;
    }

    public final boolean y(Typeface typeface) {
        iuo iuoVar = this.L;
        if (iuoVar != null) {
            iuoVar.c();
        }
        if (this.J != typeface) {
            this.J = typeface;
            Typeface e = hzc.e(this.r.getContext().getResources().getConfiguration(), typeface);
            this.I = e;
            if (e == null) {
                e = this.J;
            }
            this.H = e;
            return true;
        }
        return false;
    }

    public final boolean z(int[] iArr) {
        ColorStateList colorStateList;
        this.U = iArr;
        ColorStateList colorStateList2 = this.h;
        if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.g) != null && colorStateList.isStateful())) {
            g();
            return true;
        }
        return false;
    }
}
