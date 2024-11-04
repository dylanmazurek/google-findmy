package defpackage;

import android.os.Build;
import android.text.BoringLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgz {
    public final CharSequence a;
    public final TextPaint b;
    private final int d;
    private BoringLayout.Metrics f;
    private boolean g;
    private float e = Float.NaN;
    public float c = Float.NaN;

    public bgz(CharSequence charSequence, TextPaint textPaint, int i) {
        this.a = charSequence;
        this.b = textPaint;
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004b, code lost:            if (defpackage.bha.b(r2, defpackage.bhs.class) == false) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:            if (r3.getLetterSpacing() != 0.0f) goto L23;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a() {
        /*
            r5 = this;
            float r0 = r5.e
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto Lb
            float r0 = r5.e
            goto L5a
        Lb:
            android.text.BoringLayout$Metrics r0 = r5.b()
            if (r0 == 0) goto L14
            int r0 = r0.width
            goto L15
        L14:
            r0 = -1
        L15:
            float r0 = (float) r0
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L2e
            java.lang.CharSequence r0 = r5.a
            android.text.TextPaint r2 = r5.b
            int r3 = r0.length()
            r4 = 0
            float r0 = android.text.Layout.getDesiredWidth(r0, r4, r3, r2)
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            float r0 = (float) r2
        L2e:
            java.lang.CharSequence r2 = r5.a
            android.text.TextPaint r3 = r5.b
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 != 0) goto L37
            goto L58
        L37:
            boolean r4 = r2 instanceof android.text.Spanned
            if (r4 == 0) goto L4d
            android.text.Spanned r2 = (android.text.Spanned) r2
            java.lang.Class<bht> r4 = defpackage.bht.class
            boolean r4 = defpackage.bha.b(r2, r4)
            if (r4 != 0) goto L55
            java.lang.Class<bhs> r4 = defpackage.bhs.class
            boolean r2 = defpackage.bha.b(r2, r4)
            if (r2 != 0) goto L55
        L4d:
            float r2 = r3.getLetterSpacing()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L58
        L55:
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r1
        L58:
            r5.e = r0
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bgz.a():float");
    }

    public final BoringLayout.Metrics b() {
        BoringLayout.Metrics a;
        if (!this.g) {
            int i = this.d;
            CharSequence charSequence = this.a;
            TextPaint textPaint = this.b;
            TextDirectionHeuristic b = bhm.b(i);
            if (Build.VERSION.SDK_INT >= 33) {
                a = bgp.a(charSequence, textPaint, b);
            } else {
                a = bgq.a(charSequence, textPaint, b);
            }
            this.f = a;
            this.g = true;
        }
        return this.f;
    }
}
