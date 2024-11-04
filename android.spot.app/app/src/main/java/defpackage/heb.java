package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class heb {
    public final jer a;
    public final jer b;
    public final jer c;
    public final jer d;
    public final jer e;
    public final hek f;
    public final jer g;
    public final jer h;
    public final jis i;
    public final hej j;
    public final jer k;
    public final jer l;
    public final jer m;
    public final hfe n;
    public final boolean o;
    public final Runnable p;
    public final int q;
    public final frx r;

    public heb() {
        throw null;
    }

    public static hea a() {
        hea heaVar = new hea((byte[]) null);
        heaVar.j = new frx();
        int i = jis.d;
        heaVar.b(jmi.a);
        heaVar.h = (byte) (heaVar.h | 1);
        heaVar.c(false);
        heaVar.i = 1;
        heaVar.e = hej.a;
        heaVar.b = new hem(jdl.a);
        heaVar.g = new gpm(3);
        heaVar.f = new hfe();
        return heaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof heb) {
            heb hebVar = (heb) obj;
            if (this.a.equals(hebVar.a) && this.b.equals(hebVar.b) && this.c.equals(hebVar.c) && this.d.equals(hebVar.d) && this.r.equals(hebVar.r) && this.e.equals(hebVar.e) && this.f.equals(hebVar.f) && this.g.equals(hebVar.g) && this.h.equals(hebVar.h) && hzc.L(this.i, hebVar.i) && this.j.equals(hebVar.j) && this.k.equals(hebVar.k) && this.l.equals(hebVar.l) && this.m.equals(hebVar.m)) {
                int i = this.q;
                int i2 = hebVar.q;
                if (i != 0) {
                    if (i2 == 1 && this.n.equals(hebVar.n) && this.o == hebVar.o && this.p.equals(hebVar.p)) {
                        return true;
                    }
                } else {
                    throw null;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((((((((this.d.hashCode() ^ (-2127709203)) * 1000003) ^ this.r.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode();
        a.N(this.q);
        int i = 1237;
        int hashCode2 = (((((((((((hashCode * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ 1237) * 1000003) ^ 1) * 1000003) ^ this.n.hashCode();
        if (true == this.o) {
            i = 1231;
        }
        return (((hashCode2 * 1000003) ^ i) * 1000003) ^ this.p.hashCode();
    }

    public final String toString() {
        Runnable runnable = this.p;
        hfe hfeVar = this.n;
        jer jerVar = this.m;
        jer jerVar2 = this.l;
        jer jerVar3 = this.k;
        hej hejVar = this.j;
        jis jisVar = this.i;
        jer jerVar4 = this.h;
        jer jerVar5 = this.g;
        hek hekVar = this.f;
        jer jerVar6 = this.e;
        frx frxVar = this.r;
        jer jerVar7 = this.d;
        jer jerVar8 = this.c;
        jer jerVar9 = this.b;
        return "AccountMenuFeatures{deactivatedAccountsFeature=" + String.valueOf(this.a) + ", incognitoFeature=" + String.valueOf(jerVar9) + ", customIncognitoActionFeature=" + String.valueOf(jerVar8) + ", obakeFeature=" + String.valueOf(jerVar7) + ", policyFooterCustomizer=" + String.valueOf(frxVar) + ", useWithoutAnAccountActionFeature=" + String.valueOf(jerVar6) + ", flavorsFeature=" + String.valueOf(hekVar) + ", criticalAlertFeature=" + String.valueOf(jerVar5) + ", accountMessagesFeature=" + String.valueOf(jerVar4) + ", commonActions=" + String.valueOf(jisVar) + ", educationManager=" + String.valueOf(hejVar) + ", countDecorationGenerator=" + String.valueOf(jerVar3) + ", disableAccountSwitchingFeature=" + String.valueOf(jerVar2) + ", launcherAppSpec=" + String.valueOf(jerVar) + ", isExperimental=false, largeScreenDialogAlignment=" + hog.y(this.q) + ", materialVersion=" + String.valueOf(hfeVar) + ", enableQuickProfileSwitching=" + this.o + ", onSlowAccountSwitchingRunnable=" + String.valueOf(runnable) + "}";
    }

    public heb(jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, frx frxVar, jer jerVar5, hek hekVar, jer jerVar6, jer jerVar7, jis jisVar, hej hejVar, jer jerVar8, jer jerVar9, jer jerVar10, hfe hfeVar, boolean z, Runnable runnable) {
        this.a = jerVar;
        this.b = jerVar2;
        this.c = jerVar3;
        this.d = jerVar4;
        this.r = frxVar;
        this.e = jerVar5;
        this.f = hekVar;
        this.g = jerVar6;
        this.h = jerVar7;
        this.i = jisVar;
        this.j = hejVar;
        this.k = jerVar8;
        this.l = jerVar9;
        this.m = jerVar10;
        this.q = 1;
        this.n = hfeVar;
        this.o = z;
        this.p = runnable;
    }
}
