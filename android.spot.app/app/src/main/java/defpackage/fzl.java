package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fzl {
    public final Context a;
    public final jer b;
    private final jer c;
    private final jer d;

    public fzl() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fzl) {
            fzl fzlVar = (fzl) obj;
            if (this.a.equals(fzlVar.a) && this.c.equals(fzlVar.c) && this.d.equals(fzlVar.d) && this.b.equals(fzlVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 1237) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        jer jerVar = this.b;
        jer jerVar2 = this.d;
        jer jerVar3 = this.c;
        return "CollectionBasisContext{context=" + String.valueOf(this.a) + ", accountNames=" + String.valueOf(jerVar3) + ", stacktrace=" + String.valueOf(jerVar2) + ", googlerOverridesCheckbox=false, executor=" + String.valueOf(jerVar) + "}";
    }

    public fzl(Context context, jer jerVar, jer jerVar2, jer jerVar3) {
        this.a = context;
        this.c = jerVar;
        this.d = jerVar2;
        this.b = jerVar3;
    }
}
