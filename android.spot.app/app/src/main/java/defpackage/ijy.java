package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ijy {
    public String a;
    private String c = "files";
    private String d = "common";
    public Account b = ijz.b;
    private String e = "";
    private final jin f = new jin();

    public ijy(Context context) {
        hrb.l(true, "Context cannot be null", new Object[0]);
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.c + "/" + this.d + "/" + ijw.a(this.b) + "/" + this.e).encodedFragment(ikq.a(this.f.g())).build();
    }

    public final void b() {
        c("directboot-files");
    }

    public final void c(String str) {
        hrb.l(ijz.d.contains(str), "The only supported locations are %s: %s", ijz.d, str);
        this.c = str;
    }

    public final void d(String str) {
        hrb.l(ijz.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        hrb.l(!ijz.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void e(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = ijz.a;
        this.e = str;
    }
}
