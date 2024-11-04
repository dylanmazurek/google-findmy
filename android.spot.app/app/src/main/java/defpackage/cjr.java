package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjr {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public cjr(String str, String str2, String str3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cjr) {
            cjr cjrVar = (cjr) obj;
            if (amr.i(this.a, cjrVar.a) && amr.i(this.b, cjrVar.b) && amr.i(this.c, cjrVar.c) && amr.i(this.d, cjrVar.d)) {
                return amr.i(this.e, cjrVar.e);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        String X;
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        byl.p(mkm.ae(this.d));
        sb.append(mlh.a);
        sb.append("\n            |   referenceColumnNames = {");
        byl.o(mkm.ae(this.e));
        sb.append(mlh.a);
        sb.append("\n            |}\n        ");
        X = moz.X(new mrg(moz.p(moz.K(sb.toString())), (moh) new eeo(15, (byte[]) null), 0), "\n");
        return X;
    }
}
