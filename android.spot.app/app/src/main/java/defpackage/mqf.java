package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mqf implements Iterable, mpq {
    public final int a;
    public final int b;
    public final int c;

    public mqf(int i, int i2, int i3) {
        if (i3 != 0) {
            this.a = i;
            this.b = mjo.s(i, i2, i3);
            this.c = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean c() {
        if (this.c > 0) {
            if (this.a > this.b) {
                return true;
            }
            return false;
        }
        if (this.a < this.b) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final mmb iterator() {
        return new mmb(this.a, this.b, this.c);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mqf)) {
            return false;
        }
        if (c() && ((mqf) obj).c()) {
            return true;
        }
        mqf mqfVar = (mqf) obj;
        if (this.a != mqfVar.a || this.b != mqfVar.b || this.c != mqfVar.c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (c()) {
            return -1;
        }
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        StringBuilder sb;
        String str;
        int i = this.c;
        int i2 = this.a;
        int i3 = this.b;
        if (i > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            str = "..";
        } else {
            i = -i;
            sb = new StringBuilder();
            sb.append(i2);
            str = " downTo ";
        }
        sb.append(str);
        sb.append(i3);
        sb.append(" step ");
        sb.append(i);
        return sb.toString();
    }
}
