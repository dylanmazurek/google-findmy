package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evj {
    public final int a;
    public final Boolean b;
    public final evi c;

    public evj() {
        throw null;
    }

    public static exu a() {
        exu exuVar = new exu((char[]) null);
        exuVar.f(0);
        exuVar.b = eve.a;
        exuVar.a = false;
        return exuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof evj) {
            evj evjVar = (evj) obj;
            if (this.a == evjVar.a && this.b.equals(evjVar.b) && this.c.equals(evjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "NotificationMessageOptions{duration=" + this.a + ", aboveDevicePanelOnly=" + this.b + ", action=" + String.valueOf(this.c) + "}";
    }

    public evj(int i, Boolean bool, evi eviVar) {
        this.a = i;
        this.b = bool;
        this.c = eviVar;
    }
}
