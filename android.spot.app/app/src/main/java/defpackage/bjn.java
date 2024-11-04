package defpackage;

import com.google.android.apps.adm.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjn {
    public final String a = "com.google.android.gms.fonts";
    public final String b = "com.google.android.gms";
    private final List c = null;
    private final int d = R.array.com_google_android_gms_fonts_certs;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjn)) {
            return false;
        }
        bjn bjnVar = (bjn) obj;
        if (!amr.i(this.a, bjnVar.a) || !amr.i(this.b, bjnVar.b)) {
            return false;
        }
        List list = bjnVar.c;
        if (!amr.i(null, null)) {
            return false;
        }
        int i = bjnVar.d;
        return true;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 961) + R.array.com_google_android_gms_fonts_certs;
    }
}
