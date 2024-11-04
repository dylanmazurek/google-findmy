package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvc implements guq {
    private static final joo a = joo.m("GnpSdk");
    private final jer b;
    private final jer c;
    private final ddg d;

    public gvc(jer jerVar, jer jerVar2, ddg ddgVar) {
        this.b = jerVar;
        this.c = jerVar2;
        this.d = ddgVar;
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [msw, java.lang.Object] */
    @Override // defpackage.guq
    public final List a(gwf gwfVar) {
        List c;
        if (this.d.n() == 2) {
            try {
                hri hriVar = (hri) ((jeu) this.c).a;
                List list = (List) mpd.r(hriVar.a, new dzk(hriVar, gwfVar, (mmx) null, 19, (char[]) null)).get();
                if (list != null) {
                    return list;
                }
            } catch (Exception e) {
                ((jol) ((jol) ((jol) a.g()).i(e)).j("com/google/android/libraries/notifications/platform/internal/rpc/impl/SelectionTokensHelperImpl", "getSelectionTokens", ';', "SelectionTokensHelperImpl.java")).r("Failed getting selection tokens from GnpRegistrationDataProvider");
            }
        }
        if (this.b.g() && (c = ((gxl) this.b.c()).c()) != null) {
            return c;
        }
        return null;
    }
}
