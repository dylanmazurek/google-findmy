package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ksh {
    public final knh a;
    private final ksj b;
    private final fgk c;
    private final kqz d;
    private final kqz e;
    private final krd f;

    public ksh(knh knhVar, ksj ksjVar, fgk fgkVar, kqz kqzVar, kqz kqzVar2, krd krdVar) {
        this.a = knhVar;
        this.b = ksjVar;
        this.c = fgkVar;
        this.d = kqzVar;
        this.e = kqzVar2;
        this.f = krdVar;
    }

    public static final fxs b(fxs fxsVar) {
        return fxsVar.a(new pt(9), new fqx(7));
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.f().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final fxs a(String str, String str2, Bundle bundle) {
        int b;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.d().b);
            bundle.putString("gmsv", Integer.toString(this.b.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.c());
            bundle.putString("app_ver_name", this.b.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String str3 = ((krh) fma.p(this.f.j())).a;
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", str3);
                } else {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) fma.p(this.f.a()));
            bundle.putString("cliv", "fcm-23.3.2_1p");
            kql kqlVar = (kql) this.e.a();
            kti ktiVar = (kti) this.d.a();
            if (kqlVar != null && ktiVar != null && (b = kqlVar.b()) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(kne.v(b)));
                bundle.putString("Firebase-Client", ktiVar.a());
            }
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return fma.n(e2);
        }
    }
}
