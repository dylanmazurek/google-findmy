package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jeq {
    public boolean a;
    private final String b;
    private final jep c;
    private jep d;

    public jeq(String str) {
        jep jepVar = new jep();
        this.c = jepVar;
        this.d = jepVar;
        this.a = false;
        str.getClass();
        this.b = str;
    }

    private final jep g() {
        jep jepVar = new jep();
        this.d.c = jepVar;
        this.d = jepVar;
        return jepVar;
    }

    private final void h(String str, Object obj) {
        jeo jeoVar = new jeo();
        this.d.c = jeoVar;
        this.d = jeoVar;
        jeoVar.b = obj;
        jeoVar.a = str;
    }

    public final void a(Object obj) {
        g().b = obj;
    }

    public final void b(String str, Object obj) {
        jep g = g();
        g.b = obj;
        g.a = str;
    }

    public final void c(String str, double d) {
        h(str, String.valueOf(d));
    }

    public final void d(String str, int i) {
        h(str, String.valueOf(i));
    }

    public final void e(String str, long j) {
        h(str, String.valueOf(j));
    }

    public final void f(String str, boolean z) {
        h(str, String.valueOf(z));
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        String str = "";
        for (jep jepVar = this.c.c; jepVar != null; jepVar = jepVar.c) {
            boolean z2 = jepVar instanceof jeo;
            Object obj = jepVar.b;
            if (z2 || obj != null || !z) {
                sb.append(str);
                String str2 = jepVar.a;
                if (str2 != null) {
                    sb.append(str2);
                    sb.append('=');
                }
                if (obj != null && obj.getClass().isArray()) {
                    sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r4.length() - 1);
                } else {
                    sb.append(obj);
                }
                str = ", ";
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
