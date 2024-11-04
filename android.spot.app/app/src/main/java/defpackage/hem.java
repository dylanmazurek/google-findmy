package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hem extends hek {
    private final jer a;

    public hem() {
        throw null;
    }

    @Override // defpackage.hek
    public final jer a() {
        return jdl.a;
    }

    @Override // defpackage.hek
    public final jis b() {
        int i = jis.d;
        return jmi.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hem) {
            return this.a.equals(((hem) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return 2041338095;
    }

    public final String toString() {
        return "NonCollapsibleFlavorFeatureImpl{minimizableStorageCardRetriever=" + String.valueOf(this.a) + "}";
    }

    public hem(jer jerVar) {
        this.a = jerVar;
    }

    @Override // defpackage.hek
    public final void c() {
    }

    @Override // defpackage.hek
    public final void d() {
    }
}
