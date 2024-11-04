package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkp extends jgf {
    final Object a;
    Object b;
    jkp c;
    jkp d;
    jkp e;
    jkp f;

    public jkp(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.jgf, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }
}
