package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkv {
    public static final bkv a = new bkv(0);
    public static final bkv b = new bkv(1);
    public static final bkv c = new bkv(2);
    public final int d;

    public bkv(int i) {
        this.d = i;
    }

    public final boolean a(bkv bkvVar) {
        int i = this.d;
        if ((bkvVar.d | i) == i) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof bkv) && this.d == ((bkv) obj).d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        if (this.d == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.d & b.d) != 0) {
            arrayList.add("Underline");
        }
        if ((this.d & c.d) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration.".concat(String.valueOf((String) arrayList.get(0)));
        }
        return "TextDecoration[" + beh.d(arrayList, ", ") + ']';
    }
}
