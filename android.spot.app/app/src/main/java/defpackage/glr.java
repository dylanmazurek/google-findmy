package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class glr {
    public final String a;
    public final boolean b;

    public glr() {
        throw null;
    }

    public final lbx a() {
        lbw lbwVar;
        ljh k = lbx.d.k();
        if (!k.b.y()) {
            k.t();
        }
        String str = this.a;
        ljn ljnVar = k.b;
        lbx lbxVar = (lbx) ljnVar;
        str.getClass();
        lbxVar.a |= 1;
        lbxVar.b = str;
        if (this.b) {
            lbwVar = lbw.BANNED;
        } else {
            lbwVar = lbw.ALLOWED;
        }
        if (!ljnVar.y()) {
            k.t();
        }
        lbx lbxVar2 = (lbx) k.b;
        lbxVar2.c = lbwVar.d;
        lbxVar2.a |= 2;
        return (lbx) k.q();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof glr) {
            glr glrVar = (glr) obj;
            if (this.a.equals(glrVar.a) && this.b == glrVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() ^ 1000003;
        if (true != this.b) {
            i = 1237;
        } else {
            i = 1231;
        }
        return (hashCode * 1000003) ^ i;
    }

    public final String toString() {
        return "ChimeNotificationChannelGroup{id=" + this.a + ", blocked=" + this.b + "}";
    }

    public glr(String str, boolean z) {
        this.a = str;
        this.b = z;
    }
}
