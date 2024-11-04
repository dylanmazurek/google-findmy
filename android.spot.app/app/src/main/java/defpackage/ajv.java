package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajv extends aju implements Map.Entry, mpq {
    private final akb b;
    private Object c;

    public ajv(akb akbVar, Object obj, Object obj2) {
        super(obj, obj2);
        this.b = akbVar;
        this.c = obj2;
    }

    @Override // defpackage.aju, java.util.Map.Entry
    public final Object getValue() {
        return this.c;
    }

    @Override // defpackage.aju, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i;
        Object obj2 = this.c;
        this.c = obj;
        ajz ajzVar = this.b.a;
        ajy ajyVar = ajzVar.d;
        Object obj3 = this.a;
        if (ajyVar.containsKey(obj3)) {
            if (ajzVar.c) {
                Object a = ajzVar.a();
                ajzVar.d.put(obj3, obj);
                if (a != null) {
                    i = a.hashCode();
                } else {
                    i = 0;
                }
                ajzVar.b(i, ajzVar.d.b, a, 0);
            } else {
                ajzVar.d.put(obj3, obj);
            }
            ajzVar.e = ajzVar.d.d;
        }
        return obj2;
    }
}
