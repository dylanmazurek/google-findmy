package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltn implements ltm {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;
    public static final hxo e;
    public static final hxo f;
    public static final hxo g;
    public static final hxo h;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("FIND_MY_DEVICE_CLEARCUT");
        a = hxs.e("45370684", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
        b = hxs.c("45363063", 60L, "com.google.android.apps.fmd", jmsVar, true, false, false);
        c = hxs.e("45430289", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
        d = hxs.c("45425695", 30000L, "com.google.android.apps.fmd", jmsVar, true, false, false);
        e = hxs.c("45363064", 30000L, "com.google.android.apps.fmd", jmsVar, true, false, false);
        f = hxs.c("45369215", 0L, "com.google.android.apps.fmd", jmsVar, true, false, false);
        g = hxs.c("45368462", 300000L, "com.google.android.apps.fmd", jmsVar, true, false, false);
        h = hxs.e("45375924", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
    }

    @Override // defpackage.ltm
    public final long a() {
        return ((Long) b.a()).longValue();
    }

    @Override // defpackage.ltm
    public final long b() {
        return ((Long) d.a()).longValue();
    }

    @Override // defpackage.ltm
    public final long c() {
        return ((Long) e.a()).longValue();
    }

    @Override // defpackage.ltm
    public final long d() {
        return ((Long) f.a()).longValue();
    }

    @Override // defpackage.ltm
    public final long e() {
        return ((Long) g.a()).longValue();
    }

    @Override // defpackage.ltm
    public final boolean f() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // defpackage.ltm
    public final boolean g() {
        return ((Boolean) c.a()).booleanValue();
    }

    @Override // defpackage.ltm
    public final boolean h() {
        return ((Boolean) h.a()).booleanValue();
    }
}
