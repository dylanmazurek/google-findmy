package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdl {
    public final jer a;
    public final jer b;
    public final boolean c;

    public hdl() {
        throw null;
    }

    public static ier a() {
        ier ierVar = new ier(null);
        ierVar.c(false);
        return ierVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hdl) {
            hdl hdlVar = (hdl) obj;
            if (this.a.equals(hdlVar.a) && this.b.equals(hdlVar.b) && this.c == hdlVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        if (true != this.c) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        jer jerVar = this.b;
        return "TextualCardTrailingTitle{textViewData=" + String.valueOf(this.a) + ", icon=" + String.valueOf(jerVar) + ", hasCaptionStyle=" + this.c + "}";
    }

    public hdl(jer jerVar, jer jerVar2, boolean z) {
        this.a = jerVar;
        this.b = jerVar2;
        this.c = z;
    }
}
