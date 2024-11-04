package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzw {
    static int a(TextView textView) {
        int breakStrategy;
        breakStrategy = textView.getBreakStrategy();
        return breakStrategy;
    }

    static int b(TextView textView) {
        int hyphenationFrequency;
        hyphenationFrequency = textView.getHyphenationFrequency();
        return hyphenationFrequency;
    }

    static ColorStateList c(TextView textView) {
        ColorStateList compoundDrawableTintList;
        compoundDrawableTintList = textView.getCompoundDrawableTintList();
        return compoundDrawableTintList;
    }

    static PorterDuff.Mode d(TextView textView) {
        PorterDuff.Mode compoundDrawableTintMode;
        compoundDrawableTintMode = textView.getCompoundDrawableTintMode();
        return compoundDrawableTintMode;
    }

    static void e(TextView textView, int i) {
        textView.setBreakStrategy(i);
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        textView.setCompoundDrawableTintList(colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        textView.setCompoundDrawableTintMode(mode);
    }

    static void h(TextView textView, int i) {
        textView.setHyphenationFrequency(i);
    }
}
