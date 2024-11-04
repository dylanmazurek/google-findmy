package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bha {
    public static final void a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        paint.getTextBounds(charSequence, i, i2, rect);
    }

    public static final boolean b(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }
}
