package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Looper;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gsn implements gsk {
    private static final joo a = joo.m("GnpSdk");
    private final Context b;
    private final gnv c;
    private final ddg d;

    public gsn(Context context, gnv gnvVar, ddg ddgVar) {
        gnvVar.getClass();
        ddgVar.getClass();
        this.b = context;
        this.c = gnvVar;
        this.d = ddgVar;
    }

    private final SharedPreferences d() {
        SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.android.libraries.notifications.GCM", 0);
        sharedPreferences.getClass();
        return sharedPreferences;
    }

    private final FirebaseInstanceId e() {
        FirebaseInstanceId firebaseInstanceId = FirebaseInstanceId.getInstance(grp.a(this.b, this.d, this.c));
        firebaseInstanceId.getClass();
        return firebaseInstanceId;
    }

    private final synchronized void f(String str) {
        d().edit().putString("reg_id", str).apply();
    }

    @Override // defpackage.gsk
    public final synchronized gna a() {
        ijs.b();
        String str = this.c.b;
        if (str != null) {
            try {
                FirebaseInstanceId e = e();
                FirebaseInstanceId.j(e.c);
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    String i = FirebaseInstanceId.i("");
                    String e2 = e.e();
                    kqr kqrVar = e.e;
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    e.d(kqr.b(kqrVar.a(e2, str, i, bundle)));
                    FirebaseInstanceId.g.e(e.f(), str, i);
                    f(null);
                    try {
                        c();
                    } catch (gsl e3) {
                        ((jol) ((jol) a.g()).i(e3)).r("Exception thrown when trying to get token after deletion.");
                        return new gsm(e3, true);
                    }
                } else {
                    throw new IOException("MAIN_THREAD");
                }
            } catch (Throwable th) {
                ((jol) ((jol) a.g()).i(th)).r("Exception thrown when trying to delete token.");
                return new gsm(th, false);
            }
        } else {
            throw new IllegalArgumentException("Project ID must not be null when trying to reset registration token");
        }
        return new gnc(mlh.a);
    }

    @Override // defpackage.gsk
    public final synchronized String b() {
        return d().getString("reg_id", null);
    }

    @Override // defpackage.gsk
    public final synchronized String c() {
        String h;
        ijs.b();
        String str = this.c.b;
        if (str != null) {
            try {
                h = e().h(str, "");
                if (h != null && h.length() != 0) {
                    if (!amr.i(h, b())) {
                        a.k().r("New registration ID doesn't match the previously stored one.");
                        f(h);
                    }
                } else {
                    throw new gsl();
                }
            } catch (Throwable th) {
                if (!(th instanceof IOException) && !(th instanceof AssertionError) && !(th instanceof NullPointerException)) {
                    throw th;
                }
                ((jol) ((jol) a.g()).i(th)).r("Exception during register with IID.");
                throw new gsl(th);
            }
        } else {
            throw new IllegalArgumentException("Project ID must not be null when trying to get registration token");
        }
        return h;
    }
}
