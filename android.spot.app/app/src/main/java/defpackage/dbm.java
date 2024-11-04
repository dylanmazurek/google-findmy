package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dbm {
    public static final dbm a = new dbm("COMPOSITION");
    public dbn b;
    private final List c;

    private dbm(dbm dbmVar) {
        this.c = new ArrayList(dbmVar.c);
        this.b = dbmVar.b;
    }

    private final boolean g() {
        return ((String) this.c.get(this.c.size() - 1)).equals("**");
    }

    private static final boolean h(String str) {
        return "__container".equals(str);
    }

    public final int a(String str, int i) {
        if (h(str)) {
            return 0;
        }
        if (!((String) this.c.get(i)).equals("**")) {
            return 1;
        }
        if (i == this.c.size() - 1 || !((String) this.c.get(i + 1)).equals(str)) {
            return 0;
        }
        return 2;
    }

    public final dbm b(String str) {
        dbm dbmVar = new dbm(this);
        dbmVar.c.add(str);
        return dbmVar;
    }

    public final dbm c(dbn dbnVar) {
        dbm dbmVar = new dbm(this);
        dbmVar.b = dbnVar;
        return dbmVar;
    }

    public final boolean d(String str, int i) {
        boolean z;
        if (i >= this.c.size()) {
            return false;
        }
        int size = this.c.size() - 1;
        String str2 = (String) this.c.get(i);
        if (!str2.equals("**")) {
            if (!str2.equals(str) && !str2.equals("*")) {
                z = false;
            } else {
                z = true;
            }
            if ((i != size && (i != this.c.size() - 2 || !g())) || !z) {
                return false;
            }
            return true;
        }
        if (i == size) {
            return true;
        }
        int i2 = i + 1;
        if (((String) this.c.get(i2)).equals(str)) {
            if (i != this.c.size() - 2 && (i != this.c.size() - 3 || !g())) {
                return false;
            }
            return true;
        }
        if (i2 < this.c.size() - 1) {
            return false;
        }
        return ((String) this.c.get(i2)).equals(str);
    }

    public final boolean e(String str, int i) {
        if (h(str)) {
            return true;
        }
        if (i >= this.c.size()) {
            return false;
        }
        if (((String) this.c.get(i)).equals(str) || ((String) this.c.get(i)).equals("**") || ((String) this.c.get(i)).equals("*")) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dbm dbmVar = (dbm) obj;
        if (!this.c.equals(dbmVar.c)) {
            return false;
        }
        dbn dbnVar = this.b;
        if (dbnVar != null) {
            return dbnVar.equals(dbmVar.b);
        }
        if (dbmVar.b == null) {
            return true;
        }
        return false;
    }

    public final boolean f(String str, int i) {
        if ("__container".equals(str) || i < this.c.size() - 1 || ((String) this.c.get(i)).equals("**")) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.c.hashCode() * 31;
        dbn dbnVar = this.b;
        if (dbnVar != null) {
            i = dbnVar.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final String toString() {
        boolean z;
        String valueOf = String.valueOf(this.c);
        dbn dbnVar = this.b;
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(valueOf);
        sb.append(",resolved=");
        if (dbnVar != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    public dbm(String... strArr) {
        this.c = Arrays.asList(strArr);
    }
}
