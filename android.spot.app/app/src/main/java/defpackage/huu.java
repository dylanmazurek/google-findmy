package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class huu {
    public final Context a;
    public final String b;
    public final hot c;
    public final hot d;
    public final fma e;
    private final hqk f;

    public huu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof huu) {
            huu huuVar = (huu) obj;
            if (this.a.equals(huuVar.a) && this.b.equals(huuVar.b) && this.e.equals(huuVar.e) && this.d.equals(huuVar.d) && this.f.equals(huuVar.f) && this.c.equals(huuVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        hot hotVar = this.c;
        hqk hqkVar = this.f;
        hot hotVar2 = this.d;
        fma fmaVar = this.e;
        return "Deps{context=" + String.valueOf(this.a) + ", instanceId=" + this.b + ", clock=" + String.valueOf(fmaVar) + ", loggerFactory=" + String.valueOf(hotVar2) + ", facsClientFactory=" + String.valueOf(hqkVar) + ", flags=" + String.valueOf(hotVar) + "}";
    }

    public huu(Context context, String str, fma fmaVar, hot hotVar, hqk hqkVar, hot hotVar2) {
        this.a = context;
        this.b = "common";
        this.e = fmaVar;
        this.d = hotVar;
        this.f = hqkVar;
        this.c = hotVar2;
    }
}
