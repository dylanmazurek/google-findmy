package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luf implements lue {
    public static final hxo a;
    public static final hxo b;

    static {
        jmo jmoVar = jmo.a;
        jms jmsVar = new jms("FIND_MY_DEVICE_CLEARCUT");
        a = hxs.e("45477521", true, "com.google.android.apps.fmd", jmsVar, true, false, false);
        b = hxs.d("45614878", "https://familylink.google.com/location/consent?generate_history=false", "com.google.android.apps.fmd", jmsVar, true, false, false);
    }

    @Override // defpackage.lue
    public final String a() {
        return (String) b.a();
    }

    @Override // defpackage.lue
    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
