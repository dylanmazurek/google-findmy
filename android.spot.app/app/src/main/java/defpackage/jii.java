package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jii extends jgf implements Serializable {
    private static final long serialVersionUID = 0;
    final Object a;
    final Object b;

    public jii(Object obj, Object obj2) {
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
        throw new UnsupportedOperationException();
    }
}
