package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iqd extends cp {
    private Drawable b;
    private final Rect c;

    public iqd(Context context) {
        this(context, 0);
    }

    private static int u(Context context) {
        TypedValue o = hzc.o(context, R.attr.materialAlertDialogTheme);
        if (o == null) {
            return 0;
        }
        return o.data;
    }

    @Override // defpackage.cp
    public final cq b() {
        cq b = super.b();
        Window window = b.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.b;
        if (drawable instanceof ivf) {
            ((ivf) drawable).K(bwb.a(decorView));
        }
        Drawable drawable2 = this.b;
        Rect rect = this.c;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new iqc(b, this.c));
        return b;
    }

    public final void m(int i) {
        this.a.c = i;
    }

    public final void n(int i) {
        super.d(i);
    }

    public final void o(CharSequence charSequence) {
        super.e(charSequence);
    }

    public final void p(int i, DialogInterface.OnClickListener onClickListener) {
        super.f(i, onClickListener);
    }

    public final void q(DialogInterface.OnClickListener onClickListener) {
        cl clVar = this.a;
        clVar.l = clVar.a.getText(R.string.content_desc_back_button);
        clVar.m = onClickListener;
    }

    public final void r(int i, DialogInterface.OnClickListener onClickListener) {
        super.i(i, onClickListener);
    }

    public final void s(int i) {
        super.j(i);
    }

    public final void t(View view) {
        super.l(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public iqd(android.content.Context r12, int r13) {
        /*
            r11 = this;
            int r0 = u(r12)
            r1 = 0
            r2 = 2130968623(0x7f04002f, float:1.7545905E38)
            r3 = 2132017595(0x7f1401bb, float:1.9673473E38)
            android.content.Context r4 = defpackage.iyj.a(r12, r1, r2, r3)
            if (r0 != 0) goto L12
            goto L18
        L12:
            ps r5 = new ps
            r5.<init>(r4, r0)
            r4 = r5
        L18:
            if (r13 != 0) goto L1e
            int r13 = u(r12)
        L1e:
            r11.<init>(r4, r13)
            android.content.Context r12 = r11.a()
            android.content.res.Resources$Theme r13 = r12.getTheme()
            int[] r7 = defpackage.iqe.a
            r9 = 2132017595(0x7f1401bb, float:1.9673473E38)
            r0 = 0
            int[] r10 = new int[r0]
            r6 = 0
            r8 = 2130968623(0x7f04002f, float:1.7545905E38)
            r5 = r12
            android.content.res.TypedArray r4 = defpackage.isa.a(r5, r6, r7, r8, r9, r10)
            android.content.res.Resources r5 = r12.getResources()
            r6 = 2131166064(0x7f070370, float:1.7946363E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r6 = 2
            int r5 = r4.getDimensionPixelSize(r6, r5)
            android.content.res.Resources r6 = r12.getResources()
            r7 = 2131166065(0x7f070371, float:1.7946365E38)
            int r6 = r6.getDimensionPixelSize(r7)
            r7 = 3
            int r6 = r4.getDimensionPixelSize(r7, r6)
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131166063(0x7f07036f, float:1.794636E38)
            int r7 = r7.getDimensionPixelSize(r8)
            r8 = 1
            int r7 = r4.getDimensionPixelSize(r8, r7)
            android.content.res.Resources r9 = r12.getResources()
            r10 = 2131166062(0x7f07036e, float:1.7946359E38)
            int r9 = r9.getDimensionPixelSize(r10)
            int r0 = r4.getDimensionPixelSize(r0, r9)
            r4.recycle()
            android.content.res.Resources r4 = r12.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            int r4 = r4.getLayoutDirection()
            if (r4 != r8) goto L8c
            r9 = r7
            goto L8d
        L8c:
            r9 = r5
        L8d:
            if (r4 == r8) goto L90
            r5 = r7
        L90:
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>(r9, r6, r5, r0)
            r11.c = r4
            java.lang.Class r0 = r11.getClass()
            java.lang.String r0 = r0.getCanonicalName()
            r4 = 2130968986(0x7f04019a, float:1.7546641E38)
            int r0 = defpackage.iqg.e(r12, r4, r0)
            int[] r4 = defpackage.iqe.a
            android.content.res.TypedArray r4 = r12.obtainStyledAttributes(r1, r4, r2, r3)
            r5 = 4
            int r0 = r4.getColor(r5, r0)
            r4.recycle()
            ivf r4 = new ivf
            r4.<init>(r12, r1, r2, r3)
            r4.I(r12)
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r0)
            r4.L(r12)
            int r12 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r12 < r0) goto Lf1
            android.util.TypedValue r12 = new android.util.TypedValue
            r12.<init>()
            r0 = 16844145(0x1010571, float:2.3697462E-38)
            r13.resolveAttribute(r0, r12, r8)
            android.content.Context r13 = r11.a()
            android.content.res.Resources r13 = r13.getResources()
            android.util.DisplayMetrics r13 = r13.getDisplayMetrics()
            float r13 = r12.getDimension(r13)
            int r12 = r12.type
            r0 = 5
            if (r12 != r0) goto Lf1
            r12 = 0
            int r12 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r12 < 0) goto Lf1
            r4.J(r13)
        Lf1:
            r11.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqd.<init>(android.content.Context, int):void");
    }
}
