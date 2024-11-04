package defpackage;

import android.accounts.Account;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class enm implements jxd {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ enm(dyo dyoVar, lor lorVar, jis jisVar, int i, int i2) {
        this.e = i2;
        this.b = dyoVar;
        this.d = lorVar;
        this.c = jisVar;
        this.a = i;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, hkq] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        int i = this.e;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    hks hksVar = (hks) this.c;
                    hksVar.g((hkm) obj);
                    return this.b.a(hksVar.a, (String) this.d, this.a);
                }
                jer jerVar = (jer) obj;
                boolean g = jerVar.g();
                Object obj2 = this.b;
                if (g) {
                    if (!gfn.j((gfs) this.d, (gfj) obj2)) {
                        fzo.g((InputStream) jerVar.c());
                        return ivc.D(new gfk());
                    }
                    return ivc.E((InputStream) jerVar.c());
                }
                return ((gfn) this.c).b((gfj) obj2, this.a);
            }
            jer jerVar2 = (jer) obj;
            if (jerVar2.g()) {
                return ivc.E(jerVar2);
            }
            int i2 = this.a;
            Object obj3 = this.c;
            return ((dyo) this.b).e((lor) this.d, (jis) obj3, i2 + 1);
        }
        ((jni) ((jni) ((jni) eno.a.f()).i((Exception) obj)).j("com/google/android/apps/adm/integrations/spot/clientactions/FmdSignedCommandHandlerForAccountFactory", "lambda$findAccountInternal$3", 114, "FmdSignedCommandHandlerForAccountFactory.java")).r("Failed getting account ID");
        int i3 = this.a;
        Object obj4 = this.d;
        return ((eno) this.b).a((String) this.c, (Account[]) obj4, i3 + 1);
    }

    public /* synthetic */ enm(eno enoVar, String str, Account[] accountArr, int i, int i2) {
        this.e = i2;
        this.b = enoVar;
        this.c = str;
        this.d = accountArr;
        this.a = i;
    }

    public /* synthetic */ enm(gfn gfnVar, gfs gfsVar, gfj gfjVar, int i, int i2) {
        this.e = i2;
        this.c = gfnVar;
        this.d = gfsVar;
        this.b = gfjVar;
        this.a = i;
    }

    public /* synthetic */ enm(hks hksVar, hkq hkqVar, String str, int i, int i2) {
        this.e = i2;
        this.c = hksVar;
        this.b = hkqVar;
        this.d = str;
        this.a = i;
    }
}
