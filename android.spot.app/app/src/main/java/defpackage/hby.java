package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hby {
    public final hbx a;
    public final hbx b;
    public final hbx c;

    public hby() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hby) {
            hby hbyVar = (hby) obj;
            if (this.a.equals(hbyVar.a) && this.b.equals(hbyVar.b) && this.c.equals(hbyVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        hbx hbxVar = this.c;
        hbx hbxVar2 = this.b;
        return "AccountMenuClickListeners{myAccountClickListener=" + String.valueOf(this.a) + ", useAnotherAccountClickListener=" + String.valueOf(hbxVar2) + ", manageAccountsClickListener=" + String.valueOf(hbxVar) + "}";
    }

    public hby(hbx hbxVar, hbx hbxVar2, hbx hbxVar3) {
        this.a = hbxVar;
        this.b = hbxVar2;
        this.c = hbxVar3;
    }
}
