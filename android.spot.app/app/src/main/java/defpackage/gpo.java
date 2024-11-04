package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpo {
    public final lfs a;
    public final gpq b;

    public gpo() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gpo) {
            gpo gpoVar = (gpo) obj;
            if (this.a.equals(gpoVar.a) && this.b.equals(gpoVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        lfs lfsVar = this.a;
        if (lfsVar.y()) {
            i = lfsVar.i();
        } else {
            int i2 = lfsVar.y;
            if (i2 == 0) {
                i2 = lfsVar.i();
                lfsVar.y = i2;
            }
            i = i2;
        }
        return ((i ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        gpq gpqVar = this.b;
        return "ExtractedPayloadData{androidPayload=" + String.valueOf(this.a) + ", pushPayloadType=" + String.valueOf(gpqVar) + "}";
    }

    public gpo(lfs lfsVar, gpq gpqVar) {
        this.a = lfsVar;
        this.b = gpqVar;
    }
}
