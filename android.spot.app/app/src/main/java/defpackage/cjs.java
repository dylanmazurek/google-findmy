package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjs {
    public final String a;
    public final boolean b;
    public final List c;
    public List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public cjs(String str, boolean z, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cjs) {
            cjs cjsVar = (cjs) obj;
            if (this.b == cjsVar.b && amr.i(this.c, cjsVar.c) && amr.i(this.d, cjsVar.d)) {
                if (moz.I(this.a, "index_")) {
                    return moz.I(cjsVar.a, "index_");
                }
                return amr.i(this.a, cjsVar.a);
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (moz.I(this.a, "index_")) {
            hashCode = -1184239155;
        } else {
            hashCode = this.a.hashCode();
        }
        return (((((hashCode * 31) + (this.b ? 1 : 0)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        String X;
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append("',\n            |   columns = {");
        byl.p(this.c);
        sb.append(mlh.a);
        sb.append("\n            |   orders = {");
        byl.o(this.d);
        sb.append(mlh.a);
        sb.append("\n            |}\n        ");
        X = moz.X(new mrg(moz.p(moz.K(sb.toString())), (moh) new eeo(15, (byte[]) null), 0), "\n");
        return X;
    }
}
