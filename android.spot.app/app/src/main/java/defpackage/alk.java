package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alk extends ajw implements Map, aek {
    public static final alk d = new alk(akn.a, 0);

    public alk(akn aknVar, int i) {
        super(aknVar, i);
    }

    @Override // defpackage.acd
    public final Object a(aby abyVar) {
        return ace.b(this, abyVar);
    }

    @Override // defpackage.aek
    public final /* synthetic */ aej b() {
        return new alj(this);
    }

    @Override // defpackage.aek
    public final aek c(aby abyVar, agy agyVar) {
        akm d2 = this.b.d(abyVar.hashCode(), abyVar, agyVar, 0);
        if (d2 == null) {
            return this;
        }
        return new alk(d2.a, this.c + d2.b);
    }

    @Override // defpackage.ajw, defpackage.mlo, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof aby)) {
            return false;
        }
        return super.containsKey((aby) obj);
    }

    @Override // defpackage.mlo, java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof agy)) {
            return false;
        }
        return super.containsValue((agy) obj);
    }

    @Override // defpackage.ajw, defpackage.mlo, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof aby)) {
            return null;
        }
        return (agy) super.get((aby) obj);
    }

    @Override // defpackage.mlo, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof aby)) {
            return obj2;
        }
        return (agy) Map.CC.$default$getOrDefault(this, (aby) obj, (agy) obj2);
    }
}
