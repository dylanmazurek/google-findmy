package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkm extends CharacterStyle implements UpdateAppearance {
    public final Object a;
    private final /* synthetic */ int b;

    public bkm(kv kvVar, int i) {
        this.b = i;
        this.a = kvVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (this.b != 0) {
            if (textPaint != null && amr.i(this.a, asp.a)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            return;
        }
        throw null;
    }
}
