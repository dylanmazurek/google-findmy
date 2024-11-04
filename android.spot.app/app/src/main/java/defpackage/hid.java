package defpackage;

import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hid {
    public final hih a;
    public final hbc b;
    public final gzf c;
    public final hiw d;
    public final hjp e;
    public final hhg f;
    private final ExecutorService g;
    private final gee h;
    private final jer i;

    public hid() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hid) {
            hid hidVar = (hid) obj;
            if (this.a.equals(hidVar.a) && this.b.equals(hidVar.b) && this.g.equals(hidVar.g) && this.c.equals(hidVar.c) && this.d.equals(hidVar.d) && this.h.equals(hidVar.h) && this.e.equals(hidVar.e) && this.f.equals(hidVar.f) && this.i.equals(hidVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.i;
        hhg hhgVar = this.f;
        hjp hjpVar = this.e;
        gee geeVar = this.h;
        hiw hiwVar = this.d;
        gzf gzfVar = this.c;
        ExecutorService executorService = this.g;
        hbc hbcVar = this.b;
        return "ExpressSignInManager{limitedAvailableAccountsModel=" + String.valueOf(this.a) + ", internalAccountsModel=" + String.valueOf(hbcVar) + ", backgroundExecutor=" + String.valueOf(executorService) + ", avatarImageLoader=" + String.valueOf(gzfVar) + ", oneGoogleEventLogger=" + String.valueOf(hiwVar) + ", vePrimitives=" + String.valueOf(geeVar) + ", visualElements=" + String.valueOf(hjpVar) + ", accountLayer=" + String.valueOf(hhgVar) + ", appIdentifier=" + String.valueOf(jerVar) + "}";
    }

    public hid(hih hihVar, hbc hbcVar, ExecutorService executorService, gzf gzfVar, hiw hiwVar, gee geeVar, hjp hjpVar, hhg hhgVar, jer jerVar) {
        this.a = hihVar;
        this.b = hbcVar;
        this.g = executorService;
        this.c = gzfVar;
        this.d = hiwVar;
        this.h = geeVar;
        this.e = hjpVar;
        this.f = hhgVar;
        this.i = jerVar;
    }
}
