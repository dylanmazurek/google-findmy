package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmj {
    public final hmd a;
    public final hmd b;
    public final hmd c;
    public final int d;

    public hmj() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hmj) {
            hmj hmjVar = (hmj) obj;
            if (this.a.equals(hmjVar.a) && this.b.equals(hmjVar.b) && this.c.equals(hmjVar.c) && this.d == hmjVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d;
    }

    public final String toString() {
        hmd hmdVar = this.c;
        hmd hmdVar2 = this.b;
        return "ViewProviders{headerViewProvider=" + String.valueOf(this.a) + ", contentViewProvider=" + String.valueOf(hmdVar2) + ", footerViewProvider=" + String.valueOf(hmdVar) + ", title=" + this.d + "}";
    }

    public hmj(hmd hmdVar, hmd hmdVar2, hmd hmdVar3, int i) {
        this.a = hmdVar;
        this.b = hmdVar2;
        this.c = hmdVar3;
        this.d = i;
    }
}
