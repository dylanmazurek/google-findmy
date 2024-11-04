package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jb {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private na e;
    private na f;
    private na g;
    private na h;
    private na i;
    private na j;
    private na k;
    private final jj l;
    public int a = 0;
    private int m = -1;

    public jb(TextView textView) {
        this.d = textView;
        this.l = new jj(textView);
    }

    public static final void s(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        CharSequence subSequence;
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (Build.VERSION.SDK_INT < 30) {
                bqd.n(text);
                if (Build.VERSION.SDK_INT >= 30) {
                    bqv.d(editorInfo, text);
                    return;
                }
                if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                    i = editorInfo.initialSelEnd;
                } else {
                    i = editorInfo.initialSelStart;
                }
                if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
                    i2 = editorInfo.initialSelStart;
                } else {
                    i2 = editorInfo.initialSelEnd;
                }
                int length = text.length();
                if (i >= 0 && i2 <= length) {
                    int i4 = editorInfo.inputType & 4095;
                    if (i4 != 129 && i4 != 225 && i4 != 18) {
                        if (length > 2048) {
                            int i5 = i2 - i;
                            int length2 = text.length() - i2;
                            if (i5 > 1024) {
                                i3 = 0;
                            } else {
                                i3 = i5;
                            }
                            int i6 = 2048 - i3;
                            int min = Math.min(length2, i6 - Math.min(i, (int) (i6 * 0.8d)));
                            int min2 = Math.min(i, i6 - min);
                            int i7 = i - min2;
                            if (bzd.b(text, i7, 0)) {
                                i7++;
                                min2--;
                            }
                            if (bzd.b(text, (i2 + min) - 1, 1)) {
                                min--;
                            }
                            int i8 = min2 + i3;
                            if (i3 != i5) {
                                subSequence = TextUtils.concat(text.subSequence(i7, i7 + min2), text.subSequence(i2, min + i2));
                            } else {
                                subSequence = text.subSequence(i7, min + i8 + i7);
                            }
                            bzd.a(editorInfo, subSequence, min2, i8);
                            return;
                        }
                        bzd.a(editorInfo, text, i, i2);
                        return;
                    }
                    bzd.a(editorInfo, null, 0, 0);
                    return;
                }
                bzd.a(editorInfo, null, 0, 0);
                return;
            }
            bqv.d(editorInfo, text);
        }
    }

    private static na t(Context context, ib ibVar, int i) {
        ColorStateList a = ibVar.a(context, i);
        if (a != null) {
            na naVar = new na();
            naVar.d = true;
            naVar.a = a;
            return naVar;
        }
        return null;
    }

    private final void u(Drawable drawable, na naVar) {
        if (drawable != null && naVar != null) {
            mn.g(drawable, naVar, this.d.getDrawableState());
        }
    }

    private final void v() {
        na naVar = this.k;
        this.e = naVar;
        this.f = naVar;
        this.g = naVar;
        this.h = naVar;
        this.i = naVar;
        this.j = naVar;
    }

    private final void w(Context context, ksr ksrVar) {
        String x;
        boolean z;
        boolean z2;
        int[] iArr = eb.a;
        this.a = ksrVar.p(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int p = ksrVar.p(11, -1);
            this.m = p;
            if (p != -1) {
                this.a &= 2;
            }
        }
        int i = 10;
        boolean z3 = false;
        if (!ksrVar.A(10) && !ksrVar.A(12)) {
            if (ksrVar.A(1)) {
                this.c = false;
                int p2 = ksrVar.p(1, 1);
                if (p2 != 1) {
                    if (p2 != 2) {
                        if (p2 == 3) {
                            this.b = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.b = Typeface.SERIF;
                    return;
                }
                this.b = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        Typeface typeface = null;
        this.b = null;
        if (true == ksrVar.A(12)) {
            i = 12;
        }
        int i2 = this.m;
        int i3 = this.a;
        if (!context.isRestricted()) {
            iw iwVar = new iw(this, i2, i3, new WeakReference(this.d));
            try {
                int i4 = this.a;
                int resourceId = ((TypedArray) ksrVar.b).getResourceId(i, 0);
                if (resourceId != 0) {
                    if (ksrVar.c == null) {
                        ksrVar.c = new TypedValue();
                    }
                    Object obj = ksrVar.a;
                    Object obj2 = ksrVar.c;
                    ThreadLocal threadLocal = brm.a;
                    if (!((Context) obj).isRestricted()) {
                        typeface = brm.a((Context) obj, resourceId, (TypedValue) obj2, i4, iwVar, true, false);
                    }
                }
                if (typeface != null) {
                    if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                        Typeface create = Typeface.create(typeface, 0);
                        int i5 = this.m;
                        if ((this.a & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.b = ja.a(create, i5, z2);
                    } else {
                        this.b = typeface;
                    }
                }
                if (this.b == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.c = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (x = ksrVar.x(i)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.m != -1) {
                Typeface create2 = Typeface.create(x, 0);
                int i6 = this.m;
                if ((2 & this.a) != 0) {
                    z3 = true;
                }
                this.b = ja.a(create2, i6, z3);
                return;
            }
            this.b = Typeface.create(x, this.a);
        }
    }

    public final int a() {
        return this.l.a();
    }

    public final int b() {
        return this.l.b();
    }

    public final int c() {
        return this.l.c();
    }

    public final int d() {
        return this.l.a;
    }

    public final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            u(compoundDrawables[0], this.e);
            u(compoundDrawables[1], this.f);
            u(compoundDrawables[2], this.g);
            u(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        u(compoundDrawablesRelative[0], this.i);
        u(compoundDrawablesRelative[2], this.j);
    }

    public final void f() {
        this.l.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0360, code lost:            if (r7 != null) goto L488;     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x03ae, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03ac, code lost:            r2 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x03aa, code lost:            if (r7 != null) goto L488;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:216:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.util.AttributeSet r22, int r23) {
        /*
            Method dump skipped, instructions count: 1124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jb.g(android.util.AttributeSet, int):void");
    }

    public final void h(Context context, int i) {
        String x;
        ColorStateList t;
        ColorStateList t2;
        ColorStateList t3;
        ksr D = ksr.D(context, i, eb.v);
        if (D.A(14)) {
            i(D.z(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (D.A(3) && (t3 = D.t(3)) != null) {
                this.d.setTextColor(t3);
            }
            if (D.A(5) && (t2 = D.t(5)) != null) {
                this.d.setLinkTextColor(t2);
            }
            if (D.A(4) && (t = D.t(4)) != null) {
                this.d.setHintTextColor(t);
            }
        }
        if (D.A(0) && D.o(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        w(context, D);
        if (Build.VERSION.SDK_INT >= 26 && D.A(13) && (x = D.x(13)) != null) {
            iz.d(this.d, x);
        }
        D.y();
        Typeface typeface = this.b;
        if (typeface != null) {
            this.d.setTypeface(typeface, this.a);
        }
    }

    final void i(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void j(int i, int i2, int i3, int i4) {
        jj jjVar = this.l;
        if (jjVar.k()) {
            DisplayMetrics displayMetrics = jjVar.i.getResources().getDisplayMetrics();
            jjVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (jjVar.i()) {
                jjVar.e();
            }
        }
    }

    public final void k(int[] iArr, int i) {
        jj jjVar = this.l;
        if (jjVar.k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = jjVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                jjVar.f = jj.l(iArr2);
                if (!jjVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            } else {
                jjVar.g = false;
            }
            if (jjVar.i()) {
                jjVar.e();
            }
        }
    }

    public final void l(int i) {
        jj jjVar = this.l;
        if (jjVar.k()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = jjVar.i.getResources().getDisplayMetrics();
                    jjVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (jjVar.i()) {
                        jjVar.e();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(a.ae(i, "Unknown auto-size text type: "));
            }
            jjVar.a = 0;
            jjVar.d = -1.0f;
            jjVar.e = -1.0f;
            jjVar.c = -1.0f;
            jjVar.f = new int[0];
            jjVar.b = false;
        }
    }

    public final void m(ColorStateList colorStateList) {
        boolean z;
        if (this.k == null) {
            this.k = new na();
        }
        na naVar = this.k;
        naVar.a = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        naVar.d = z;
        v();
    }

    public final void n(PorterDuff.Mode mode) {
        boolean z;
        if (this.k == null) {
            this.k = new na();
        }
        na naVar = this.k;
        naVar.b = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        naVar.c = z;
        v();
    }

    public final void o(int i, float f) {
        if (!nr.c && !p()) {
            this.l.f(i, f);
        }
    }

    public final boolean p() {
        return this.l.h();
    }

    public final int[] q() {
        return this.l.f;
    }

    public final void r() {
        if (!nr.c) {
            f();
        }
    }
}
