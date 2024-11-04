package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhl {
    public final boolean a;
    public final Layout b;
    public final int c;
    public final int d;
    public final Paint.FontMetricsInt e;
    public final Rect f = new Rect();
    private final TextPaint g;
    private final bgz h;
    private final int i;
    private final float j;
    private final float k;
    private final boolean l;
    private final int m;
    private final bhu[] n;
    private lbr o;

    /* JADX WARN: Removed duplicated region for block: B:43:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bhl(java.lang.CharSequence r22, float r23, android.text.TextPaint r24, int r25, android.text.TextUtils.TruncateAt r26, int r27, int r28, int r29, int r30, int r31, int r32, int r33, defpackage.bgz r34) {
        /*
            Method dump skipped, instructions count: 736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhl.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, int, int, int, int, int, int, bgz):void");
    }

    private final float k(int i) {
        if (i == this.c - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    public final float a(int i) {
        int i2;
        if (i == this.c - 1 && this.e != null) {
            return this.b.getLineBottom(i - 1) + this.e.bottom;
        }
        int i3 = this.d;
        float lineBottom = this.b.getLineBottom(i);
        if (i == this.c - 1) {
            i2 = this.i;
        } else {
            i2 = 0;
        }
        return i3 + lineBottom + i2;
    }

    public final float b(int i) {
        int i2;
        float lineTop = this.b.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.d;
        }
        return lineTop + i2;
    }

    public final float c(int i, boolean z) {
        return j().f(i, true, z) + k(g(i));
    }

    public final float d(int i, boolean z) {
        return j().f(i, false, z) + k(g(i));
    }

    public final int e() {
        int height;
        if (this.a) {
            height = this.b.getLineBottom(this.c - 1);
        } else {
            height = this.b.getHeight();
        }
        return height + this.d + this.i + this.m;
    }

    public final int f(int i) {
        if (this.b.getEllipsisStart(i) == 0) {
            return this.b.getLineEnd(i);
        }
        return this.b.getText().length();
    }

    public final int g(int i) {
        return this.b.getLineForOffset(i);
    }

    public final int h(int i) {
        return this.b.getParagraphDirection(i);
    }

    public final CharSequence i() {
        return this.b.getText();
    }

    public final lbr j() {
        lbr lbrVar = this.o;
        if (lbrVar == null) {
            lbr lbrVar2 = new lbr(this.b);
            this.o = lbrVar2;
            return lbrVar2;
        }
        return lbrVar;
    }
}
