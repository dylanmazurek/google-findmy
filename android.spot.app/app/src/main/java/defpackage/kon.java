package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kon {
    private final Class a;
    private final Class b;

    public kon(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        kon konVar = (kon) obj;
        if (!this.b.equals(konVar.b)) {
            return false;
        }
        return this.a.equals(konVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        Class cls = this.a;
        if (cls == kom.class) {
            return this.b.getName();
        }
        Class cls2 = this.b;
        return "@" + cls.getName() + " " + cls2.getName();
    }
}
