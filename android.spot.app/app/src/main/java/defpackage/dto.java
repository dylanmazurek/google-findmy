package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dto {
    private Class a;
    private Class b;
    private Class c;

    public dto() {
    }

    public final void a(Class cls, Class cls2, Class cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        dto dtoVar = (dto) obj;
        if (this.a.equals(dtoVar.a) && this.b.equals(dtoVar.b) && amr.i(this.c, dtoVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        Class cls = this.c;
        if (cls != null) {
            i = cls.hashCode();
        } else {
            i = 0;
        }
        return (hashCode * 31) + i;
    }

    public final String toString() {
        return "MultiClassKey{first=" + String.valueOf(this.a) + ", second=" + String.valueOf(this.b) + "}";
    }

    public dto(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
