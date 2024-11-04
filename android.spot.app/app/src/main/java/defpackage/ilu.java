package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ilu {
    public final Uri a;
    public final lkq b;
    public final jer c;
    public final jis d;
    public final imd e;
    public final boolean f;

    public ilu() {
        throw null;
    }

    public static ilt a() {
        ilt iltVar = new ilt(null);
        iltVar.b = ima.a;
        iltVar.b();
        iltVar.c = true;
        iltVar.d = (byte) (1 | iltVar.d);
        return iltVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ilu) {
            ilu iluVar = (ilu) obj;
            if (this.a.equals(iluVar.a) && this.b.equals(iluVar.b) && this.c.equals(iluVar.c) && hzc.L(this.d, iluVar.d) && this.e.equals(iluVar.e) && this.f == iluVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        if (true != this.f) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ 1237;
    }

    public final String toString() {
        imd imdVar = this.e;
        jis jisVar = this.d;
        jer jerVar = this.c;
        lkq lkqVar = this.b;
        return "ProtoDataStoreConfig{uri=" + String.valueOf(this.a) + ", schema=" + String.valueOf(lkqVar) + ", handler=" + String.valueOf(jerVar) + ", migrations=" + String.valueOf(jisVar) + ", variantConfig=" + String.valueOf(imdVar) + ", useGeneratedExtensionRegistry=" + this.f + ", enableTracing=false}";
    }

    public ilu(Uri uri, lkq lkqVar, jer jerVar, jis jisVar, imd imdVar, boolean z) {
        this.a = uri;
        this.b = lkqVar;
        this.c = jerVar;
        this.d = jisVar;
        this.e = imdVar;
        this.f = z;
    }
}
