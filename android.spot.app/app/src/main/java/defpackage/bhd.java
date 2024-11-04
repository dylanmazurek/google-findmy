package defpackage;

import android.graphics.Paint;
import android.text.StaticLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhd {
    public static final void a(StaticLayout.Builder builder, boolean z) {
        builder.setUseLineSpacingFromFallbacks(z);
    }

    public static final int b(Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
