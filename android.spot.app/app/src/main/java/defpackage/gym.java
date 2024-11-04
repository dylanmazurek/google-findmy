package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gym {
    private final Context h;
    private final gri i;
    private final lqz j;
    private final gvg k;
    private final jer l;
    private final jer m;
    private final String n;
    private final hri o;
    private static final joo g = joo.m("GnpSdk");
    static final gqc a = gqc.a("Cookie");
    static final gqc b = gqc.a("X-Goog-Visitor-Id");
    static final gqc c = gqc.a("X-Goog-PageId");
    static final gqc d = gqc.a("X-Goog-Api-Key");
    static final gqc e = gqc.a("X-Android-Cert");
    static final gqc f = gqc.a("X-Android-Package");

    public gym(Context context, hri hriVar, gri griVar, lqz lqzVar, gvg gvgVar, jer jerVar, jer jerVar2, String str) {
        this.h = context;
        this.o = hriVar;
        this.i = griVar;
        this.j = lqzVar;
        this.k = gvgVar;
        this.l = jerVar;
        this.m = jerVar2;
        this.n = str;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [msw, java.lang.Object] */
    private final gna b(String str, boolean z) {
        if (z) {
            hri hriVar = this.o;
            str.getClass();
            return (gna) mpd.r(hriVar.a, new gyk(hriVar, str, null, 1)).get();
        }
        return this.o.z(str, "oauth2:https://www.googleapis.com/auth/notifications");
    }

    /* JADX WARN: Type inference failed for: r7v36, types: [msw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [lkq, java.lang.Object] */
    private final gyl c(String str, goa goaVar, lkq lkqVar, lkq lkqVar2, boolean z) {
        boolean z2;
        try {
            lkqVar2.getClass();
            byte[] g2 = lkqVar.g();
            gqd a2 = gqe.a();
            a2.c = 2;
            a2.e(new URL(fzo.r(this.i) + str));
            a2.b = g2;
            a2.d();
            if (goaVar != null && !TextUtils.isEmpty(goaVar.b)) {
                gwf b2 = goaVar.b();
                if (b2 instanceof gwh) {
                    a2.c(gqc.a("Authorization"), "Bearer ".concat(String.valueOf((String) b(((gwh) b2).a, z).c())));
                } else if (!(b2 instanceof gwg)) {
                    if (b2 instanceof gws) {
                        if (this.l.g()) {
                            a2.c(a, "NID=".concat(String.valueOf(((PseudonymousIdToken) ((gvw) this.l.c()).a().get()).a)));
                            d(a2);
                        } else {
                            throw new IllegalStateException("PseudonymousIdHelper not found, can't get Zwieback cookie");
                        }
                    } else if (b2 instanceof gwq) {
                        jer jerVar = this.m;
                        if (jerVar.g()) {
                            hri hriVar = (hri) jerVar.c();
                            a2.c(b, (String) mpd.r(hriVar.b, new eau(hriVar, (mmx) null, 20)).get());
                            d(a2);
                        } else {
                            throw new IllegalStateException("YouTubeVisitorDataProvider not found, can't get Visitor cookie");
                        }
                    }
                } else if (!TextUtils.isEmpty(goaVar.d)) {
                    a2.c(gqc.a("Authorization"), "Bearer ".concat(String.valueOf((String) b(goaVar.d, z).c())));
                    a2.c(c, goaVar.c);
                } else {
                    ((jol) ((jol) g.f()).j("com/google/android/libraries/notifications/rpc/impl/HttpRpcExecutor", "addDelegatedGaiaHeader", 249, "HttpRpcExecutor.java")).r("No account name was supplied for delegated Gaia.");
                    throw new IllegalStateException("No account name was supplied for delegated Gaia.");
                }
            } else if (!TextUtils.isEmpty(null)) {
                d(a2);
            } else {
                throw new Exception("One of Account representation or API Key must be set.");
            }
            gqf a3 = ((gqb) this.j.a()).a(a2.a());
            if (a3.b()) {
                gyj b3 = gyl.b();
                b3.a = a3.a;
                b3.c = a3.a();
                b3.c(a3.c());
                Throwable a4 = a3.a();
                if ((a4 instanceof gqg) && ((gqg) a4).a == 401) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                b3.b(z2);
                return b3.a();
            }
            ?? f2 = lkqVar2.q().f(a3.b);
            gyj b4 = gyl.b();
            b4.a = a3.a;
            b4.b = f2;
            return b4.a();
        } catch (Exception e2) {
            gyj b5 = gyl.b();
            b5.c = e2;
            b5.c(false);
            return b5.a();
        }
    }

    private final void d(gqd gqdVar) {
        gqdVar.c(d, null);
        if (!TextUtils.isEmpty(this.n)) {
            gqdVar.c(f, this.h.getPackageName());
            gqdVar.c(e, this.n);
        }
    }

    public final gyl a(String str, goa goaVar, lkq lkqVar, lkq lkqVar2) {
        String str2;
        gyl c2 = c(str, goaVar, lkqVar, lkqVar2, false);
        if (c2.e) {
            jol jolVar = (jol) g.k().j("com/google/android/libraries/notifications/rpc/impl/HttpRpcExecutor", "execute", 119, "HttpRpcExecutor.java");
            if (goaVar == null) {
                str2 = null;
            } else {
                str2 = goaVar.b;
            }
            jolVar.y("Request to %s for %s, failed with auth error, refreshing auth token and retrying", str, str2);
            c2 = c(str, goaVar, lkqVar, lkqVar2, true);
        }
        gvg gvgVar = this.k;
        Context context = this.h;
        Integer num = c2.a;
        String packageName = context.getPackageName();
        Integer num2 = (Integer) jer.h(num).e(-1);
        num2.intValue();
        ((imq) gvgVar.b.a()).b(packageName, str, num2);
        return c2;
    }
}
