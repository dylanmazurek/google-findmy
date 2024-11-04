package defpackage;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhw extends CharacterStyle {
    private final int a;
    private final float b;
    private final float c;
    private final float d = Float.MIN_VALUE;

    public bhw(int i, float f, float f2, float f3) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.d, this.b, this.c, this.a);
    }
}
