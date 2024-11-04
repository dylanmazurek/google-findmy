package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Build;
import android.util.TypedValue;
import android.view.ActionMode;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brh {
    static int a(Resources resources, int i, Resources.Theme theme) {
        int color;
        color = resources.getColor(i, theme);
        return color;
    }

    public static ColorStateList b(Resources resources, int i, Resources.Theme theme) {
        ColorStateList colorStateList;
        colorStateList = resources.getColorStateList(i, theme);
        return colorStateList;
    }

    public static ActionMode.Callback c(ActionMode.Callback callback) {
        if ((callback instanceof bzz) && Build.VERSION.SDK_INT >= 26) {
            return ((bzz) callback).a;
        }
        return callback;
    }

    public static ActionMode.Callback d(TextView textView, ActionMode.Callback callback) {
        if (Build.VERSION.SDK_INT >= 26 && Build.VERSION.SDK_INT <= 27 && !(callback instanceof bzz) && callback != null) {
            return new bzz(callback, textView);
        }
        return callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void e(TextView textView, ColorStateList colorStateList) {
        bqd.n(textView);
        if (Build.VERSION.SDK_INT >= 24) {
            bzw.f(textView, colorStateList);
        } else if (textView instanceof cab) {
            ((cab) textView).bJ(colorStateList);
        }
    }

    public static void f(TextView textView, int i) {
        int i2;
        bqd.m(i);
        if (Build.VERSION.SDK_INT >= 28) {
            bzx.c(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void g(TextView textView, int i) {
        int i2;
        bqd.m(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void h(TextView textView, int i) {
        bqd.m(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static void i(TextView textView, int i, float f) {
        if (Build.VERSION.SDK_INT >= 34) {
            bzy.a(textView, i, f);
        } else {
            h(textView, Math.round(TypedValue.applyDimension(i, f, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void j(TextView textView, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            textView.setTextAppearance(textView.getContext(), i);
        } else {
            textView.setTextAppearance(i);
        }
    }
}
