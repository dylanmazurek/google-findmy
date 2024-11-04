package defpackage;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bsy {
    public static final bsy a = b(new Locale[0]);
    public final bta b;

    private bsy(bta btaVar) {
        this.b = btaVar;
    }

    public static bsy b(Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d(bsx.a(localeArr));
        }
        return new bsy(new bsz(localeArr));
    }

    public static bsy c(String str) {
        if (str != null && !str.isEmpty()) {
            String[] split = str.split(",", -1);
            int length = split.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = bsw.a(split[i]);
            }
            return b(localeArr);
        }
        return a;
    }

    public static bsy d(LocaleList localeList) {
        return new bsy(new btb(localeList));
    }

    public final int a() {
        return this.b.a();
    }

    public final String e() {
        return this.b.c();
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof bsy) && this.b.equals(((bsy) obj).b)) {
            return true;
        }
        return false;
    }

    public final Locale f(int i) {
        return this.b.d(i);
    }

    public final boolean g() {
        return this.b.e();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return this.b.toString();
    }
}
