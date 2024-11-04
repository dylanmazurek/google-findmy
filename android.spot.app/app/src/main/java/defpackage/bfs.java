package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bfs implements CharSequence {
    public final String a;
    public final List b;
    public final List c;
    public final List d;

    public /* synthetic */ bfs(String str) {
        this(str, null, null, null);
    }

    public final int a() {
        return this.a.length();
    }

    public final List b() {
        List list = this.c;
        if (list == null) {
            return mlx.a;
        }
        return list;
    }

    public final List c() {
        List list = this.b;
        if (list == null) {
            return mlx.a;
        }
        return list;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.a.charAt(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfs)) {
            return false;
        }
        bfs bfsVar = (bfs) obj;
        if (amr.i(this.a, bfsVar.a) && amr.i(this.b, bfsVar.b) && amr.i(this.c, bfsVar.c) && amr.i(this.d, bfsVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        int i3 = 0;
        if (list != null) {
            i = list.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List list2 = this.c;
        if (list2 != null) {
            i2 = list2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        List list3 = this.d;
        if (list3 != null) {
            i3 = list3.hashCode();
        }
        return i5 + i3;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return a();
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ /* synthetic */ CharSequence subSequence(int i, int i2) {
        if (i <= i2) {
            if (i == 0) {
                if (i2 != this.a.length()) {
                    i = 0;
                } else {
                    return this;
                }
            }
            String substring = this.a.substring(i, i2);
            substring.getClass();
            return new bfs(substring, bft.a(this.b, i, i2), bft.a(this.c, i, i2), bft.a(this.d, i, i2));
        }
        throw new IllegalArgumentException(a.ak((byte) 41, i2, i, "start (", ") should be less or equal to end ("));
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.a;
    }

    public bfs(String str, List list, List list2, List list3) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        if (list2 != null) {
            List af = mkm.af(list2, new bfr(0));
            int size = af.size();
            int i = -1;
            for (int i2 = 0; i2 < size; i2++) {
                bfq bfqVar = (bfq) af.get(i2);
                if (bfqVar.b >= i) {
                    if (bfqVar.c > this.a.length()) {
                        throw new IllegalArgumentException("ParagraphStyle range [" + bfqVar.b + ", " + bfqVar.c + ") is out of boundary");
                    }
                    i = bfqVar.c;
                } else {
                    throw new IllegalArgumentException("ParagraphStyle should not overlap");
                }
            }
        }
    }
}
