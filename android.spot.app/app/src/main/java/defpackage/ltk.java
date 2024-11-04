package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltk implements ltj {
    public static final hxo a;
    public static final hxo b;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("FIND_MY_DEVICE_CLEARCUT");
        a = hxs.c("45387865", 60L, "com.google.android.apps.fmd", jmsVar, true, false, false);
        b = hxs.c("45388581", 10000L, "com.google.android.apps.fmd", jmsVar, true, false, false);
    }

    @Override // defpackage.ltj
    public final long a() {
        return ((Long) a.a()).longValue();
    }

    @Override // defpackage.ltj
    public final long b() {
        return ((Long) b.a()).longValue();
    }
}
