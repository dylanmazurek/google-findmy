package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hik {
    public final jer a;
    public final jer b;
    public final jer c;
    public final jer d;
    public final jer e;
    public final jer f;
    public final boolean g;
    public final hog h;
    public final hog i;

    public hik() {
        throw null;
    }

    public static hij a() {
        hij hijVar = new hij(null);
        hijVar.b = jer.i(new hil(new hog((char[]) null)));
        hijVar.d = true;
        hijVar.e = (byte) 1;
        hijVar.g = new hog((char[]) null);
        hijVar.f = new hog((char[]) null);
        return hijVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hik) {
            hik hikVar = (hik) obj;
            if (this.a.equals(hikVar.a) && this.b.equals(hikVar.b) && this.c.equals(hikVar.c) && this.d.equals(hikVar.d) && this.e.equals(hikVar.e) && this.f.equals(hikVar.f) && this.h.equals(hikVar.h) && this.g == hikVar.g && this.i.equals(hikVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.h.hashCode();
        if (true != this.g) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (((hashCode * 1000003) ^ i) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        hog hogVar = this.i;
        hog hogVar2 = this.h;
        jer jerVar = this.f;
        jer jerVar2 = this.e;
        jer jerVar3 = this.d;
        jer jerVar4 = this.c;
        jer jerVar5 = this.b;
        return "ExpressSignInFeatures{signInWithoutAccountFeature=" + String.valueOf(this.a) + ", disclaimerFeature=" + String.valueOf(jerVar5) + ", customHeaderContentFeature=" + String.valueOf(jerVar4) + ", logoViewFeature=" + String.valueOf(jerVar3) + ", cancelableFeature=" + String.valueOf(jerVar2) + ", materialVersion=" + String.valueOf(jerVar) + ", secondaryButtonStyleFeature=" + String.valueOf(hogVar2) + ", supportAccountSwitching=" + this.g + ", customContinueButtonTextsFactory=" + String.valueOf(hogVar) + "}";
    }

    public hik(jer jerVar, jer jerVar2, jer jerVar3, jer jerVar4, jer jerVar5, jer jerVar6, hog hogVar, boolean z, hog hogVar2) {
        this.a = jerVar;
        this.b = jerVar2;
        this.c = jerVar3;
        this.d = jerVar4;
        this.e = jerVar5;
        this.f = jerVar6;
        this.h = hogVar;
        this.g = z;
        this.i = hogVar2;
    }
}
