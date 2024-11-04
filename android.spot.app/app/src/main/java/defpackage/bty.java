package defpackage;

import android.icu.util.ULocale;
import android.view.View;
import com.google.android.apps.adm.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bty {
    public static ULocale a(Object obj) {
        ULocale addLikelySubtags;
        addLikelySubtags = ULocale.addLikelySubtags(ct$$ExternalSyntheticApiModelOutline0.m(obj));
        return addLikelySubtags;
    }

    public static ULocale b(Locale locale) {
        ULocale forLocale;
        forLocale = ULocale.forLocale(locale);
        return forLocale;
    }

    public static String c(Object obj) {
        String script;
        script = ct$$ExternalSyntheticApiModelOutline0.m(obj).getScript();
        return script;
    }

    public static final cfc d(View view) {
        view.getClass();
        return (cfc) moz.T(moz.W(moz.S(view, bas.q), bas.r));
    }

    public static final void e(View view, cfc cfcVar) {
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, cfcVar);
    }
}
