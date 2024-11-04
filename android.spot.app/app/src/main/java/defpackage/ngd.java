package defpackage;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngd {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    private final String g;
    private final String h;
    private final List i;
    private final String j;

    public ngd(String str, String str2, String str3, String str4, int i, List list, String str5, String str6) {
        this.b = str;
        this.g = str2;
        this.h = str3;
        this.c = str4;
        this.d = i;
        this.i = list;
        this.j = str5;
        this.e = str6;
        this.f = amr.i(str, "https");
    }

    public final String a() {
        if (this.h.length() == 0) {
            return "";
        }
        int x = moz.x(this.e, ':', this.b.length() + 3, 4) + 1;
        String str = this.e;
        String substring = str.substring(x, moz.x(str, '@', 0, 6));
        substring.getClass();
        return substring;
    }

    public final String b() {
        int length = this.b.length();
        String str = this.e;
        int x = moz.x(str, '/', length + 3, 4);
        String substring = this.e.substring(x, ngt.b(str, "?#", x, str.length()));
        substring.getClass();
        return substring;
    }

    public final String c() {
        if (this.i == null) {
            return null;
        }
        int x = moz.x(this.e, '?', 0, 6) + 1;
        String str = this.e;
        String substring = str.substring(x, ngt.a(str, '#', x, str.length()));
        substring.getClass();
        return substring;
    }

    public final String d() {
        if (this.g.length() == 0) {
            return "";
        }
        String str = this.b;
        String str2 = this.e;
        int length = str.length() + 3;
        String substring = str2.substring(length, ngt.b(str2, ":@", length, str2.length()));
        substring.getClass();
        return substring;
    }

    public final URI e() {
        String substring;
        String str;
        String str2;
        ngc ngcVar = new ngc();
        ngcVar.a = this.b;
        ngcVar.b = d();
        ngcVar.c = a();
        ngcVar.d = this.c;
        int i = this.d;
        if (i == msz.x(this.b)) {
            i = -1;
        }
        ngcVar.e = i;
        ngcVar.f.clear();
        ngcVar.f.addAll(f());
        ngcVar.b(c());
        String str3 = null;
        if (this.j == null) {
            substring = null;
        } else {
            substring = this.e.substring(moz.x(this.e, '#', 0, 6) + 1);
            substring.getClass();
        }
        ngcVar.h = substring;
        String str4 = ngcVar.d;
        if (str4 != null) {
            str = new mrk("[\"<>^`{|}]").b(str4);
        } else {
            str = null;
        }
        ngcVar.d = str;
        int size = ngcVar.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = ngcVar.f;
            list.set(i2, msz.A((String) list.get(i2), 0, 0, "[]", true, true, false, false, 227));
        }
        List list2 = ngcVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str5 = (String) list2.get(i3);
                if (str5 != null) {
                    str2 = msz.A(str5, 0, 0, "\\^`{|}", true, true, true, false, 195);
                } else {
                    str2 = null;
                }
                list2.set(i3, str2);
            }
        }
        String str6 = ngcVar.h;
        if (str6 != null) {
            str3 = msz.A(str6, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163);
        }
        ngcVar.h = str3;
        String ngcVar2 = ngcVar.toString();
        try {
            return new URI(ngcVar2);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new mrk("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(ngcVar2));
                create.getClass();
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ngd) && amr.i(((ngd) obj).e, this.e)) {
            return true;
        }
        return false;
    }

    public final List f() {
        int length = this.b.length();
        String str = this.e;
        int x = moz.x(str, '/', length + 3, 4);
        int b = ngt.b(str, "?#", x, str.length());
        ArrayList arrayList = new ArrayList();
        while (x < b) {
            int i = x + 1;
            int a2 = ngt.a(this.e, '/', i, b);
            String substring = this.e.substring(i, a2);
            substring.getClass();
            arrayList.add(substring);
            x = a2;
        }
        return arrayList;
    }

    public final ngc g(String str) {
        try {
            ngc ngcVar = new ngc();
            ngcVar.c(this, str);
            return ngcVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return this.e;
    }
}
