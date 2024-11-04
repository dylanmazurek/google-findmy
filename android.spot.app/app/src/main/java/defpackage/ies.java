package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ies {
    public final jer a;
    public final jer b;
    public final boolean c;

    public ies() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ies) {
            ies iesVar = (ies) obj;
            if (this.a.equals(iesVar.a) && this.b.equals(iesVar.b) && this.c == iesVar.c) {
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
        return "ComponentState{isInCase=" + String.valueOf(this.a) + ", batteryLevel=" + String.valueOf(jerVar) + ", isCharging=" + this.c + "}";
    }

    public ies(jer jerVar, jer jerVar2, boolean z) {
        this.a = jerVar;
        this.b = jerVar2;
        this.c = z;
    }
}
