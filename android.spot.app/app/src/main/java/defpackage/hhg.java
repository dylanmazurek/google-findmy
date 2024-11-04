package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhg {
    public final his a;
    public final View.OnClickListener b;
    public final frx c;

    public hhg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        his hisVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof hhg) {
            hhg hhgVar = (hhg) obj;
            if (this.c.equals(hhgVar.c) && ((hisVar = this.a) != null ? hisVar.equals(hhgVar.a) : hhgVar.a == null) && this.b.equals(hhgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.c.hashCode() ^ 1000003;
        his hisVar = this.a;
        if (hisVar == null) {
            hashCode = 0;
        } else {
            hashCode = hisVar.hashCode();
        }
        return (((hashCode2 * 1000003) ^ hashCode) * (-721379959)) ^ this.b.hashCode();
    }

    public final String toString() {
        View.OnClickListener onClickListener = this.b;
        his hisVar = this.a;
        return "AccountLayer{accountConverter=" + String.valueOf(this.c) + ", avatarRetriever=" + String.valueOf(hisVar) + ", avatarImageLoader=null, onAddAccount=" + String.valueOf(onClickListener) + "}";
    }

    public hhg(frx frxVar, his hisVar, View.OnClickListener onClickListener) {
        this.c = frxVar;
        this.a = hisVar;
        this.b = onClickListener;
    }
}
