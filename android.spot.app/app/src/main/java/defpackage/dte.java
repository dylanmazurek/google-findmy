package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dte extends rx {
    private int e;

    @Override // defpackage.ta, java.util.Map
    public final void clear() {
        this.e = 0;
        super.clear();
    }

    @Override // defpackage.ta
    public final Object d(int i) {
        this.e = 0;
        return super.d(i);
    }

    @Override // defpackage.ta
    public final Object e(int i, Object obj) {
        this.e = 0;
        return super.e(i, obj);
    }

    @Override // defpackage.ta
    public final void h(ta taVar) {
        this.e = 0;
        super.h(taVar);
    }

    @Override // defpackage.ta, java.util.Map
    public final int hashCode() {
        int i = this.e;
        if (i == 0) {
            int hashCode = super.hashCode();
            this.e = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.ta, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.e = 0;
        return super.put(obj, obj2);
    }
}
