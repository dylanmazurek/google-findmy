package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alj extends ajy implements Map, aej {
    private alk f;

    public alj(alk alkVar) {
        super(alkVar);
        this.f = alkVar;
    }

    @Override // defpackage.ajy, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof aby)) {
            return false;
        }
        return super.containsKey((aby) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof agy)) {
            return false;
        }
        return super.containsValue((agy) obj);
    }

    @Override // defpackage.ajy
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final alk b() {
        akn aknVar = this.b;
        alk alkVar = this.f;
        if (aknVar != alkVar.b) {
            this.a = new akz();
            alkVar = new alk(aknVar, this.e);
        }
        this.f = alkVar;
        return alkVar;
    }

    @Override // defpackage.ajy, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (!(obj instanceof aby)) {
            return null;
        }
        return (agy) super.get((aby) obj);
    }

    @Override // defpackage.ajy, java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof aby)) {
            return obj2;
        }
        return (agy) Map.CC.$default$getOrDefault(this, (aby) obj, (agy) obj2);
    }

    @Override // defpackage.ajy, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (!(obj instanceof aby)) {
            return null;
        }
        return (agy) super.remove((aby) obj);
    }
}
