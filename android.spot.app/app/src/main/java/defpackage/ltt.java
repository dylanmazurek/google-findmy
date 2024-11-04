package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltt implements lts {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;
    public static final hxo d;
    public static final hxo e;
    public static final hxo f;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("FIND_MY_DEVICE_CLEARCUT");
        a = hxs.d("45373356", "https://android.googleapis.com", "com.google.android.apps.fmd", jmsVar, true, false, false);
        b = hxs.e("45426830", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
        c = hxs.e("45367210", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
        d = hxs.d("45639250", "LEGACY", "com.google.android.apps.fmd", jmsVar, true, false, false);
        e = hxs.e("45637589", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
        f = hxs.e("45639895", false, "com.google.android.apps.fmd", jmsVar, true, false, false);
    }

    @Override // defpackage.lts
    public final String a() {
        return (String) a.a();
    }

    @Override // defpackage.lts
    public final String b() {
        return (String) d.a();
    }

    @Override // defpackage.lts
    public final boolean c() {
        return ((Boolean) b.a()).booleanValue();
    }

    @Override // defpackage.lts
    public final boolean d() {
        return ((Boolean) c.a()).booleanValue();
    }

    @Override // defpackage.lts
    public final boolean e() {
        return ((Boolean) e.a()).booleanValue();
    }

    @Override // defpackage.lts
    public final boolean f() {
        return ((Boolean) f.a()).booleanValue();
    }
}
