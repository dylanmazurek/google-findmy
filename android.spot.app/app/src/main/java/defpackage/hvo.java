package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvo {
    public static final /* synthetic */ int a = 0;
    private static final rx b = new rx();

    public static synchronized Uri a(String str) {
        synchronized (hvo.class) {
            rx rxVar = b;
            Uri uri = (Uri) rxVar.get(str);
            if (uri == null) {
                Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode(str))));
                rxVar.put(str, parse);
                return parse;
            }
            return uri;
        }
    }

    public static String b(Context context, String str) {
        if (!str.contains("#")) {
            return str + "#" + context.getPackageName();
        }
        throw new IllegalArgumentException("The passed in package cannot already have a subpackage: ".concat(String.valueOf(str)));
    }
}
