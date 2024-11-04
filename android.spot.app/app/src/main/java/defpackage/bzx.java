package defpackage;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzx {
    static PrecomputedText.Params a(TextView textView) {
        PrecomputedText.Params textMetricsParams;
        textMetricsParams = textView.getTextMetricsParams();
        return textMetricsParams;
    }

    public static void c(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    static String[] d(DecimalFormatSymbols decimalFormatSymbols) {
        String[] digitStrings;
        digitStrings = decimalFormatSymbols.getDigitStrings();
        return digitStrings;
    }

    public static void e(cma cmaVar, cmd cmdVar) {
        cmaVar.b(cmdVar);
    }

    public static void f(cma cmaVar, cmd cmdVar) {
        cmaVar.g();
    }

    static CharSequence b(PrecomputedText precomputedText) {
        return precomputedText;
    }
}
