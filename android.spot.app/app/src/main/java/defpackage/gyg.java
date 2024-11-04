package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gyg {
    private static final joo b = joo.m("GnpSdk");
    public final goj a;
    private final gnv c;
    private final gka d;
    private final gvi e;
    private final gjy f;
    private final jer g;
    private final ddg h;

    public gyg(ddg ddgVar, gnv gnvVar, gka gkaVar, goj gojVar, gvi gviVar, gjy gjyVar, jer jerVar, Context context, gwb gwbVar) {
        this.h = ddgVar;
        this.c = gnvVar;
        this.d = gkaVar;
        this.a = gojVar;
        this.e = gviVar;
        this.f = gjyVar;
        this.g = jerVar;
        gwbVar.a(context);
    }

    private final void b(String str) {
        if (this.g.g()) {
            gnz a = goa.a();
            a.b(new gwh(str));
            a.a();
            ((gxx) this.g.c()).a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [goj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10, types: [goj, java.lang.Object] */
    public final gfx a(String str, boolean z, lgp lgpVar) {
        boolean z2;
        long epochMilli;
        hwx.K(!TextUtils.isEmpty(str), "Account name must not be empty.");
        if (this.c.b != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.K(z2, "GcmSenderProjectId must be set on GnpConfig");
        if (!this.e.b(str)) {
            ((jol) ((jol) b.g()).j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 91, "RegistrationHandler.java")).r("Registration failed. Provided account is not available on device.");
            Exception exc = new Exception("Account intended to register is not available on device.");
            b(str);
            return gfx.a(exc);
        }
        try {
            goa w = this.h.w(new gwh(str));
            if (!z) {
                try {
                    int c = gyi.c(this.f.a(w, lgpVar, lgq.c));
                    int i = w.f;
                    if (i == 1 || i == 2) {
                        int i2 = w.l;
                        if (i2 != 0 && i2 == c) {
                            epochMilli = fma.i().toEpochMilli();
                            long j = w.k;
                            this.c.e.longValue();
                            long max = Math.max(0L, 86400000L);
                            if (epochMilli - j > max) {
                                ((jol) b.k().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "isNewRegistrationRequest", 178, "RegistrationHandler.java")).t("Last registration was more than [%d] ms ago, considering this as new.", max);
                            } else {
                                joo jooVar = b;
                                ((jol) jooVar.k().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "isNewRegistrationRequest", 186, "RegistrationHandler.java")).A("Not treating this register request as new. The last registration was at [%d], which is less than [%d] ms ago (current time [%d]), also the request hash [%d] doesn't differ from the old one.", Long.valueOf(j), Long.valueOf(max), Long.valueOf(epochMilli), Integer.valueOf(c));
                                ((jol) jooVar.k().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 118, "RegistrationHandler.java")).u("Skip registration. Target already stored for account: %s.", str);
                                if (this.g.g()) {
                                    ((gxx) this.g.c()).b();
                                }
                                return gfx.a;
                            }
                        }
                        ((jol) b.k().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "isNewRegistrationRequest", 165, "RegistrationHandler.java")).v("New request hash [%d] differs with old request hash [%d].", c, i2);
                    }
                } catch (gsl unused) {
                }
            }
            ddg ddgVar = this.h;
            synchronized (ddgVar.a) {
                try {
                    gnz gnzVar = new gnz(ddgVar.a.a(new gwh(str)));
                    gnzVar.h(2);
                    ddgVar.a.e(jis.q(gnzVar.a()));
                } catch (gnx unused2) {
                }
            }
            ((jol) b.k().j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 129, "RegistrationHandler.java")).u("Registration scheduled for account: %s.", str);
            return this.d.a(w, lgpVar);
        } catch (goi e) {
            ((jol) ((jol) ((jol) b.f()).i(e)).j("com/google/android/libraries/notifications/registration/impl/RegistrationHandler", "register", 'f', "RegistrationHandler.java")).r("Registration failed. Error inserting account.");
            b(str);
            return gfx.a(e);
        }
    }
}
