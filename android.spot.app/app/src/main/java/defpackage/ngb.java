package defpackage;

import java.util.Arrays;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ngb implements Iterable, mpq {
    private final String[] a;

    public ngb(String[] strArr) {
        this.a = strArr;
    }

    public final int a() {
        return this.a.length >> 1;
    }

    public final String b(String str) {
        String[] strArr = this.a;
        int length = strArr.length - 2;
        int s = mjo.s(length, 0, -2);
        if (s > length) {
            return null;
        }
        while (!moz.v(str, strArr[length])) {
            if (length == s) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        return this.a[i + i];
    }

    public final String d(int i) {
        return this.a[i + i + 1];
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.Collection, java.lang.Object] */
    public final ktf e() {
        ktf ktfVar = new ktf((byte[]) null, (byte[]) null);
        ?? r1 = ktfVar.b;
        String[] strArr = this.a;
        strArr.getClass();
        r1.addAll(mkm.d(strArr));
        return ktfVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof ngb) && Arrays.equals(this.a, ((ngb) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int a = a();
        mkw[] mkwVarArr = new mkw[a];
        for (int i = 0; i < a; i++) {
            mkwVarArr[i] = new mkw(c(i), d(i));
        }
        return new mqt(mkwVarArr, 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int a = a();
        for (int i = 0; i < a; i++) {
            String c = c(i);
            String d = d(i);
            sb.append(c);
            sb.append(": ");
            if (true == ngt.u(c)) {
                d = "██";
            }
            sb.append(d);
            sb.append("\n");
        }
        return sb.toString();
    }
}
