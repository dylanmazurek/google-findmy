package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hbh {
    public final gzf a;
    public final haw b;
    public final hiw c;
    public final jer d;
    public final frx e;
    private final jer f;

    public hbh() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hbh) {
            hbh hbhVar = (hbh) obj;
            if (this.a.equals(hbhVar.a) && this.e.equals(hbhVar.e) && this.b.equals(hbhVar.b) && this.c.equals(hbhVar.c) && this.d.equals(hbhVar.d) && this.f.equals(hbhVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.f;
        jer jerVar2 = this.d;
        hiw hiwVar = this.c;
        haw hawVar = this.b;
        frx frxVar = this.e;
        return "AccountManagementSpec{avatarImageLoader=" + String.valueOf(this.a) + ", accountConverter=" + String.valueOf(frxVar) + ", accountsModel=" + String.valueOf(hawVar) + ", accountClass=null, oneGoogleEventLogger=" + String.valueOf(hiwVar) + ", deactivatedAccountsFeature=" + String.valueOf(jerVar2) + ", launcherAppDialogTracker=" + String.valueOf(jerVar) + "}";
    }

    public hbh(gzf gzfVar, frx frxVar, haw hawVar, hiw hiwVar, jer jerVar, jer jerVar2) {
        this.a = gzfVar;
        this.e = frxVar;
        this.b = hawVar;
        this.c = hiwVar;
        this.d = jerVar;
        this.f = jerVar2;
    }
}
