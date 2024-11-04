package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luo implements lun {
    public static final hxo a;
    public static final hxo b;
    public static final hxo c;

    static {
        jmo jmoVar = jmo.a;
        a = hxs.e("CollectionBasisVerifierFeatures__enable_cbv_v2", false, "com.google.android.libraries.consentverifier", jmoVar, true, false, false);
        b = hxs.e("CollectionBasisVerifierFeatures__enable_google_signature_check", false, "com.google.android.libraries.consentverifier", jmoVar, true, false, false);
        c = hxs.e("CollectionBasisVerifierFeatures__enable_using_log_verifier_result", false, "com.google.android.libraries.consentverifier", jmoVar, true, false, false);
    }

    @Override // defpackage.lun
    public final boolean a() {
        return ((Boolean) a.a()).booleanValue();
    }

    @Override // defpackage.lun
    public final boolean b() {
        return ((Boolean) b.a()).booleanValue();
    }

    @Override // defpackage.lun
    public final void c() {
        ((Boolean) c.a()).booleanValue();
    }
}
