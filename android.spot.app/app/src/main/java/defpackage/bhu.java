package defpackage;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhu implements LineHeightSpan {
    public final float a;
    public final boolean b;
    public final float c;
    public int d;
    public int e;
    private final int f;
    private final boolean g;
    private int h = Integer.MIN_VALUE;
    private int i = Integer.MIN_VALUE;
    private int j = Integer.MIN_VALUE;
    private int k = Integer.MIN_VALUE;

    public bhu(float f, int i, boolean z, boolean z2, float f2) {
        this.a = f;
        this.f = i;
        this.g = z;
        this.b = z2;
        this.c = f2;
        if ((f2 >= 0.0f && f2 <= 1.0f) || f2 == -1.0f) {
        } else {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        boolean z;
        int i5;
        int i6;
        double ceil;
        int i7;
        if (bhd.b(fontMetricsInt) > 0) {
            boolean z2 = true;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != this.f) {
                z2 = false;
            }
            if (z && z2 && this.g && this.b) {
                return;
            }
            if (this.h == Integer.MIN_VALUE) {
                int ceil2 = (int) Math.ceil(this.a);
                int b = ceil2 - bhd.b(fontMetricsInt);
                float f = this.c;
                if (f == -1.0f) {
                    f = Math.abs(fontMetricsInt.ascent) / bhd.b(fontMetricsInt);
                }
                if (b <= 0) {
                    ceil = Math.ceil(b * f);
                } else {
                    ceil = Math.ceil(b * (1.0f - f));
                }
                int i8 = fontMetricsInt.descent + ((int) ceil);
                this.j = i8;
                int i9 = i8 - ceil2;
                this.i = i9;
                if (this.g) {
                    i9 = fontMetricsInt.ascent;
                }
                this.h = i9;
                if (this.b) {
                    i7 = fontMetricsInt.descent;
                } else {
                    i7 = this.j;
                }
                this.k = i7;
                this.d = fontMetricsInt.ascent - this.h;
                this.e = this.k - fontMetricsInt.descent;
            }
            if (z) {
                i5 = this.h;
            } else {
                i5 = this.i;
            }
            fontMetricsInt.ascent = i5;
            if (z2) {
                i6 = this.k;
            } else {
                i6 = this.j;
            }
            fontMetricsInt.descent = i6;
        }
    }
}
