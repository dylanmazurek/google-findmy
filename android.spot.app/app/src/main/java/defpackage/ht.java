package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ht {
    public int a;
    public int b;
    public Object c = null;
    public int d;

    public ht(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ht)) {
            return false;
        }
        ht htVar = (ht) obj;
        int i = this.a;
        if (i != htVar.a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.b) == 1 && this.d == htVar.b && this.b == htVar.d) {
            return true;
        }
        if (this.d != htVar.d || this.b != htVar.b) {
            return false;
        }
        Object obj2 = htVar.c;
        return true;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:null]");
        return sb.toString();
    }
}
