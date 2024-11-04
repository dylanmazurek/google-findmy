package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gxy {
    private final int a;
    private final String b;

    public gxy(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxy)) {
            return false;
        }
        gxy gxyVar = (gxy) obj;
        if (this.a == gxyVar.a && amr.i(this.b, gxyVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SlotLimit(limit=" + this.a + ", slotKey=" + this.b + ")";
    }
}
