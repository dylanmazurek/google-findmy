package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltg implements ltf {
    public static final hxo a;
    public static final hxo b;

    static {
        jmo jmoVar = jmo.a;
        jjr r = jjr.r("CHIME", "PHOTOS_ANDROID_PRIMES", "YT_MAIN_APP_ANDROID_PRIMES", "ANDROID_GSA_ANDROID_PRIMES", "GMM_PRIMES");
        a = hxs.e("SystemTrayFeature__enable_html_tags", true, "com.google.android.libraries.notifications", r, true, false, false);
        b = hxs.d("SystemTrayFeature__force_action_to_open_as_activity", "", "com.google.android.libraries.notifications", r, true, false, false);
    }

    @Override // defpackage.ltf
    public final String a() {
        return (String) b.a();
    }

    @Override // defpackage.ltf
    public final boolean b() {
        return ((Boolean) a.a()).booleanValue();
    }
}
