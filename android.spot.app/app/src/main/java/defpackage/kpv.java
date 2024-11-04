package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kpv implements kpz {
    private final int a;
    private final kpy b;

    public kpv(int i, kpy kpyVar) {
        this.a = i;
        this.b = kpyVar;
    }

    @Override // defpackage.kpz
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return kpz.class;
    }

    @Override // defpackage.kpz
    public final kpy b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpz)) {
            return false;
        }
        kpz kpzVar = (kpz) obj;
        if (this.a == kpzVar.a() && this.b.equals(kpzVar.b())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
