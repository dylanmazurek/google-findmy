package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbh {
    private static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public dbh(Drawable.Callback callback, String str, Map map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.b = String.valueOf(str).concat("/");
        } else {
            this.b = str;
        }
        this.c = map;
        if (!(callback instanceof View)) {
            this.a = null;
        } else {
            this.a = ((View) callback).getContext().getApplicationContext();
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((cyn) this.c.get(str)).e = bitmap;
        }
    }
}
