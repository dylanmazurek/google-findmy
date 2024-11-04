package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jst {
    public static final jst a = new jst("about:invalid#zGuavaz");
    public final String b;

    public jst(String str) {
        str.getClass();
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jst)) {
            return false;
        }
        return this.b.equals(((jst) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ 18288376;
    }

    public final String toString() {
        return "SafeUrl{" + this.b + "}";
    }
}
