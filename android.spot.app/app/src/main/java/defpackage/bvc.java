package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvc {
    static int a(MenuItem menuItem) {
        int alphabeticModifiers;
        alphabeticModifiers = menuItem.getAlphabeticModifiers();
        return alphabeticModifiers;
    }

    static int b(MenuItem menuItem) {
        int numericModifiers;
        numericModifiers = menuItem.getNumericModifiers();
        return numericModifiers;
    }

    static ColorStateList c(MenuItem menuItem) {
        ColorStateList iconTintList;
        iconTintList = menuItem.getIconTintList();
        return iconTintList;
    }

    static PorterDuff.Mode d(MenuItem menuItem) {
        PorterDuff.Mode iconTintMode;
        iconTintMode = menuItem.getIconTintMode();
        return iconTintMode;
    }

    public static MenuItem e(MenuItem menuItem, char c, int i) {
        MenuItem alphabeticShortcut;
        alphabeticShortcut = menuItem.setAlphabeticShortcut(c, i);
        return alphabeticShortcut;
    }

    public static MenuItem f(MenuItem menuItem, CharSequence charSequence) {
        MenuItem contentDescription;
        contentDescription = menuItem.setContentDescription(charSequence);
        return contentDescription;
    }

    public static MenuItem g(MenuItem menuItem, ColorStateList colorStateList) {
        MenuItem iconTintList;
        iconTintList = menuItem.setIconTintList(colorStateList);
        return iconTintList;
    }

    public static MenuItem h(MenuItem menuItem, PorterDuff.Mode mode) {
        MenuItem iconTintMode;
        iconTintMode = menuItem.setIconTintMode(mode);
        return iconTintMode;
    }

    public static MenuItem i(MenuItem menuItem, char c, int i) {
        MenuItem numericShortcut;
        numericShortcut = menuItem.setNumericShortcut(c, i);
        return numericShortcut;
    }

    static MenuItem j(MenuItem menuItem, char c, char c2, int i, int i2) {
        MenuItem shortcut;
        shortcut = menuItem.setShortcut(c, c2, i, i2);
        return shortcut;
    }

    public static MenuItem k(MenuItem menuItem, CharSequence charSequence) {
        MenuItem tooltipText;
        tooltipText = menuItem.setTooltipText(charSequence);
        return tooltipText;
    }

    static CharSequence l(MenuItem menuItem) {
        CharSequence contentDescription;
        contentDescription = menuItem.getContentDescription();
        return contentDescription;
    }

    static CharSequence m(MenuItem menuItem) {
        CharSequence tooltipText;
        tooltipText = menuItem.getTooltipText();
        return tooltipText;
    }

    public static final cgk n(cgn cgnVar, mql mqlVar, cgu cguVar) {
        try {
            try {
                return cgnVar.c(mqlVar, cguVar);
            } catch (AbstractMethodError unused) {
                return cgnVar.b(moz.a(mqlVar), cguVar);
            }
        } catch (AbstractMethodError unused2) {
            return cgnVar.a(moz.a(mqlVar));
        }
    }
}
