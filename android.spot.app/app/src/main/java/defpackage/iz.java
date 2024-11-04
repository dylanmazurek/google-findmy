package defpackage;

import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class iz {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(TextView textView) {
        int autoSizeStepGranularity;
        autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
        return autoSizeStepGranularity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean d(TextView textView, String str) {
        boolean fontVariationSettings;
        fontVariationSettings = textView.setFontVariationSettings(str);
        return fontVariationSettings;
    }

    public static aqm e(float f, float f2, float f3, float f4, long j) {
        long d = iv.d(aqi.a(j), aqi.b(j));
        return new aqm(f, f2, f3, f4, d, d, d, d);
    }

    public static aql f(long j, long j2) {
        return new aql(aqk.b(j), aqk.c(j), aqk.b(j) + aqn.b(j2), aqk.c(j) + aqn.a(j2));
    }
}
