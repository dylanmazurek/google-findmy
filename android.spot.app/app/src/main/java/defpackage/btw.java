package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class btw {
    public static Spanned a(String str, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return btv.a(str, i);
        }
        return Html.fromHtml(str);
    }
}
