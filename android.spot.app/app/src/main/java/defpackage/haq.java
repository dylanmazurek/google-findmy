package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haq {
    public final bui a;
    public final hiw b;
    public final lnh c;
    public final hjp d;
    public final gyy e;
    public final gyy f;
    public final hgw g;
    private final jer h;
    private final jer i;

    public haq() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof haq) {
            haq haqVar = (haq) obj;
            if (this.a.equals(haqVar.a) && this.b.equals(haqVar.b) && this.c.equals(haqVar.c) && this.d.equals(haqVar.d) && this.e.equals(haqVar.e) && this.f.equals(haqVar.f) && this.h.equals(haqVar.h) && this.i.equals(haqVar.i) && this.g.equals(haqVar.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        lnh lnhVar = this.c;
        if (lnhVar.y()) {
            i = lnhVar.i();
        } else {
            int i2 = lnhVar.y;
            if (i2 == 0) {
                i2 = lnhVar.i();
                lnhVar.y = i2;
            }
            i = i2;
        }
        return (((((((((((((hashCode * 1000003) ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        hgw hgwVar = this.g;
        jer jerVar = this.i;
        jer jerVar2 = this.h;
        gyy gyyVar = this.f;
        gyy gyyVar2 = this.e;
        hjp hjpVar = this.d;
        lnh lnhVar = this.c;
        hiw hiwVar = this.b;
        return "PolicyFooterSpec{accountSupplier=" + String.valueOf(this.a) + ", eventLogger=" + String.valueOf(hiwVar) + ", logContext=" + String.valueOf(lnhVar) + ", visualElements=" + String.valueOf(hjpVar) + ", privacyPolicyClickListener=" + String.valueOf(gyyVar2) + ", termsOfServiceClickListener=" + String.valueOf(gyyVar) + ", customItemLabelStringId=" + String.valueOf(jerVar2) + ", customItemClickListener=" + String.valueOf(jerVar) + ", clickRunnables=" + String.valueOf(hgwVar) + "}";
    }

    public haq(bui buiVar, hiw hiwVar, lnh lnhVar, hjp hjpVar, gyy gyyVar, gyy gyyVar2, jer jerVar, jer jerVar2, hgw hgwVar) {
        this.a = buiVar;
        this.b = hiwVar;
        this.c = lnhVar;
        this.d = hjpVar;
        this.e = gyyVar;
        this.f = gyyVar2;
        this.h = jerVar;
        this.i = jerVar2;
        this.g = hgwVar;
    }
}
