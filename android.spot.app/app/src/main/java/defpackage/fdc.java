package defpackage;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fdc {
    public final fcn a;
    public volatile Boolean b;
    private String c;
    private Set d;

    /* JADX INFO: Access modifiers changed from: protected */
    public fdc(fcn fcnVar) {
        this.a = fcnVar;
    }

    public static final long b() {
        return ((Long) fdh.f.x()).longValue();
    }

    public static final long c() {
        return ((Long) fdh.e.x()).longValue();
    }

    public static final int d() {
        return ((Integer) fdh.i.x()).intValue();
    }

    public static final int e() {
        return ((Integer) fdh.h.x()).intValue();
    }

    public static final String f() {
        return (String) fdh.k.x();
    }

    public static final String g() {
        return (String) fdh.l.x();
    }

    public static final String h() {
        return (String) fdh.j.x();
    }

    public static final boolean i() {
        return ((Boolean) fdh.a.x()).booleanValue();
    }

    public final Set a() {
        String str;
        String str2 = (String) fdh.t.x();
        if (this.d == null || (str = this.c) == null || !str.equals(str2)) {
            String[] split = TextUtils.split(str2, ",");
            HashSet hashSet = new HashSet();
            for (String str3 : split) {
                try {
                    hashSet.add(Integer.valueOf(Integer.parseInt(str3)));
                } catch (NumberFormatException unused) {
                }
            }
            this.c = str2;
            this.d = hashSet;
        }
        return this.d;
    }
}
