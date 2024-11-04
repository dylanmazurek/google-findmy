package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class vu implements vj {
    public final float a;
    public final float b;
    public final Object c;

    public vu(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [moh, java.lang.Object] */
    @Override // defpackage.uu
    public final /* synthetic */ wq a(atk atkVar) {
        va vaVar;
        Object obj = this.c;
        if (obj == null) {
            vaVar = null;
        } else {
            vaVar = (va) atkVar.b.a(obj);
        }
        return new wy(this.a, this.b, vaVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vu) {
            vu vuVar = (vu) obj;
            if (vuVar.a == this.a && vuVar.b == this.b && amr.i(vuVar.c, this.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        Object obj = this.c;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (((i * 31) + Float.floatToIntBits(this.a)) * 31) + Float.floatToIntBits(this.b);
    }

    public vu() {
        this(1.0f, 1500.0f, null);
    }
}
