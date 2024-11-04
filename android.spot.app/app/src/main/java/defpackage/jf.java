package defpackage;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class jf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, ji jiVar) {
        StaticLayout.Builder obtain;
        StaticLayout.Builder alignment2;
        StaticLayout.Builder lineSpacing;
        StaticLayout.Builder includePad;
        int breakStrategy;
        StaticLayout.Builder breakStrategy2;
        int hyphenationFrequency;
        StaticLayout.Builder hyphenationFrequency2;
        StaticLayout build;
        obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        alignment2 = obtain.setAlignment(alignment);
        lineSpacing = alignment2.setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier());
        includePad = lineSpacing.setIncludePad(textView.getIncludeFontPadding());
        breakStrategy = textView.getBreakStrategy();
        breakStrategy2 = includePad.setBreakStrategy(breakStrategy);
        hyphenationFrequency = textView.getHyphenationFrequency();
        hyphenationFrequency2 = breakStrategy2.setHyphenationFrequency(hyphenationFrequency);
        if (i2 == -1) {
            i2 = Integer.MAX_VALUE;
        }
        hyphenationFrequency2.setMaxLines(i2);
        try {
            jiVar.a(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        build = obtain.build();
        return build;
    }

    public static void c(aqv aqvVar, aql aqlVar, aqs aqsVar) {
        aqvVar.h(aqlVar.b, aqlVar.c, aqlVar.d, aqlVar.e, aqsVar);
    }

    public static void g(aqv aqvVar, aql aqlVar) {
        aqvVar.j(aqlVar.b, aqlVar.c, aqlVar.d, aqlVar.e);
    }

    public void b() {
    }
}
