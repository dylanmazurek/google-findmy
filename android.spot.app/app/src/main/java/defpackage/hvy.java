package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvy {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public hvy(Context context, String str, cke ckeVar, boolean z, boolean z2) {
        this.d = context;
        this.a = str;
        this.e = ckeVar;
        this.b = z;
        this.c = z2;
    }

    public final hwa a(String str, boolean z) {
        return new hvu(this, str, Boolean.valueOf(z));
    }

    public final void b(String str) {
        new hvv(this, str, Double.valueOf(0.0d));
    }

    public final void c(String str, long j) {
        new hvt(this, str, Long.valueOf(j));
    }

    public hvy(Uri uri, String str, String str2, boolean z, boolean z2) {
        this.d = uri;
        this.e = str;
        this.a = str2;
        this.b = z;
        this.c = z2;
    }

    public hvy(Uri uri) {
        this(uri, "", "", false, false);
    }
}
