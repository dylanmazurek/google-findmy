package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fky {
    private static final Uri a;

    static {
        Uri parse = Uri.parse("https://plus.google.com/");
        a = parse;
        parse.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
