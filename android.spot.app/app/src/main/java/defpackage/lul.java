package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lul implements luk {
    public static final hwa a;
    public static final hwa b;
    public static final hwa c;

    static {
        hvy hvyVar = new hvy(hvo.a("com.google.android.gms.auth_account"));
        if (((String) hvyVar.e).isEmpty()) {
            Object obj = hvyVar.d;
            Uri uri = (Uri) obj;
            hvy hvyVar2 = new hvy(uri, (String) hvyVar.e, hvyVar.a, true, hvyVar.c);
            Object obj2 = hvyVar2.d;
            Uri uri2 = (Uri) obj2;
            hvy hvyVar3 = new hvy(uri2, (String) hvyVar2.e, hvyVar2.a, hvyVar2.b, true);
            hvyVar3.b("getTokenRefactor__account_data_service_sample_percentage");
            hvyVar3.a("getTokenRefactor__account_data_service_tokenAPI_usable", true);
            hvyVar3.c("getTokenRefactor__account_manager_timeout_seconds", 20L);
            hvyVar3.c("getTokenRefactor__android_id_shift", 0L);
            a = new hvx(hvyVar3);
            hvyVar3.a("getTokenRefactor__chimera_get_token_evolved", true);
            hvyVar3.c("getTokenRefactor__clear_token_timeout_seconds", 20L);
            hvyVar3.c("getTokenRefactor__default_task_timeout_seconds", 20L);
            b = hvyVar3.a("getTokenRefactor__gaul_accounts_api_evolved", false);
            c = hvyVar3.a("getTokenRefactor__gaul_token_api_evolved", false);
            hvyVar3.c("getTokenRefactor__get_token_timeout_seconds", 120L);
            hvyVar3.a("getTokenRefactor__gms_account_authenticator_evolved", true);
            hvyVar3.b("getTokenRefactor__gms_account_authenticator_sample_percentage");
            return;
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    @Override // defpackage.luk
    public final lml a() {
        return (lml) a.b();
    }

    @Override // defpackage.luk
    public final boolean b() {
        return ((Boolean) b.b()).booleanValue();
    }

    @Override // defpackage.luk
    public final boolean c() {
        return ((Boolean) c.b()).booleanValue();
    }
}
