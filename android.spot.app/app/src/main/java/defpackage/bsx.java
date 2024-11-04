package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsx {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    static LocaleList b() {
        LocaleList adjustedDefault;
        adjustedDefault = LocaleList.getAdjustedDefault();
        return adjustedDefault;
    }

    static LocaleList c() {
        LocaleList localeList;
        localeList = LocaleList.getDefault();
        return localeList;
    }

    public static final cew d(cew cewVar, cew cewVar2) {
        cewVar.getClass();
        if (cewVar2 != null && cewVar2.compareTo(cewVar) < 0) {
            return cewVar2;
        }
        return cewVar;
    }
}
