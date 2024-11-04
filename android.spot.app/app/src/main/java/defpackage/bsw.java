package defpackage;

import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bsw {
    private static final Locale[] a = {new Locale("en", "XA"), new Locale("ar", "XB")};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale a(String str) {
        return Locale.forLanguageTag(str);
    }

    static boolean b(Locale locale, Locale locale2) {
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage()) || c(locale) || c(locale2)) {
            return false;
        }
        String a2 = btz.a(locale);
        if (a2.isEmpty()) {
            String country = locale.getCountry();
            if (country.isEmpty() || country.equals(locale2.getCountry())) {
                return true;
            }
            return false;
        }
        return a2.equals(btz.a(locale2));
    }

    private static boolean c(Locale locale) {
        Locale[] localeArr = a;
        int length = localeArr.length;
        for (int i = 0; i < 2; i++) {
            if (localeArr[i].equals(locale)) {
                return true;
            }
        }
        return false;
    }
}
