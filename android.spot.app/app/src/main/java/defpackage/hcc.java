package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hcc {
    public final Context a;
    public final hcd b;
    public final hby c;
    public final heb d;
    public final his e;
    public final hiw f;
    public final hdz g;
    public final jer h;
    public final gzf i;
    public final ExecutorService j;
    public final gee k;
    public final hjp l;
    public final jer m;
    public final hri n;
    public final frx o;

    public hcc() {
        throw null;
    }

    public final boolean equals(Object obj) {
        his hisVar;
        hri hriVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hcc) {
            hcc hccVar = (hcc) obj;
            if (this.a.equals(hccVar.a) && this.b.equals(hccVar.b) && this.o.equals(hccVar.o) && this.c.equals(hccVar.c) && this.d.equals(hccVar.d) && ((hisVar = this.e) != null ? hisVar.equals(hccVar.e) : hccVar.e == null) && this.f.equals(hccVar.f) && this.g.equals(hccVar.g) && this.h.equals(hccVar.h) && this.i.equals(hccVar.i) && this.j.equals(hccVar.j) && this.k.equals(hccVar.k) && this.l.equals(hccVar.l) && ((hriVar = this.n) != null ? hriVar.equals(hccVar.n) : hccVar.n == null) && this.m.equals(hccVar.m)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        his hisVar = this.e;
        int i = 0;
        if (hisVar == null) {
            hashCode = 0;
        } else {
            hashCode = hisVar.hashCode();
        }
        int hashCode3 = ((((((((((((((((hashCode2 * 1000003) ^ hashCode) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ 2040732332) * (-721379959)) ^ this.i.hashCode()) * (-721379959)) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
        hri hriVar = this.n;
        if (hriVar != null) {
            i = hriVar.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.m;
        hri hriVar = this.n;
        hjp hjpVar = this.l;
        gee geeVar = this.k;
        ExecutorService executorService = this.j;
        gzf gzfVar = this.i;
        jer jerVar2 = this.h;
        hdz hdzVar = this.g;
        hiw hiwVar = this.f;
        his hisVar = this.e;
        heb hebVar = this.d;
        hby hbyVar = this.c;
        frx frxVar = this.o;
        hcd hcdVar = this.b;
        return "AccountMenuManager{applicationContext=" + String.valueOf(this.a) + ", accountsModel=" + String.valueOf(hcdVar) + ", accountConverter=" + String.valueOf(frxVar) + ", clickListeners=" + String.valueOf(hbyVar) + ", features=" + String.valueOf(hebVar) + ", avatarRetriever=" + String.valueOf(hisVar) + ", oneGoogleEventLogger=" + String.valueOf(hiwVar) + ", configuration=" + String.valueOf(hdzVar) + ", incognitoModel=" + String.valueOf(jerVar2) + ", customAvatarImageLoader=null, avatarImageLoader=" + String.valueOf(gzfVar) + ", accountClass=null, backgroundExecutor=" + String.valueOf(executorService) + ", vePrimitives=" + String.valueOf(geeVar) + ", visualElements=" + String.valueOf(hjpVar) + ", oneGoogleStreamz=" + String.valueOf(hriVar) + ", appIdentifier=" + String.valueOf(jerVar) + "}";
    }

    public hcc(Context context, hcd hcdVar, frx frxVar, hby hbyVar, heb hebVar, his hisVar, hiw hiwVar, hdz hdzVar, jer jerVar, gzf gzfVar, ExecutorService executorService, gee geeVar, hjp hjpVar, hri hriVar, jer jerVar2) {
        this.a = context;
        this.b = hcdVar;
        this.o = frxVar;
        this.c = hbyVar;
        this.d = hebVar;
        this.e = hisVar;
        this.f = hiwVar;
        this.g = hdzVar;
        this.h = jerVar;
        this.i = gzfVar;
        this.j = executorService;
        this.k = geeVar;
        this.l = hjpVar;
        this.n = hriVar;
        this.m = jerVar2;
    }
}
