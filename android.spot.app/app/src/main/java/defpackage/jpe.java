package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jpe extends jph {
    private final Map a;
    private final Map b;
    private final jpg c;
    private final jpf d;

    public jpe(jpd jpdVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        hashMap.putAll(jpdVar.c);
        hashMap2.putAll(jpdVar.d);
        this.c = jpdVar.e;
        this.d = jpdVar.f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jph
    public final void a(joa joaVar, Object obj, Object obj2) {
        jpg jpgVar = (jpg) this.a.get(joaVar);
        if (jpgVar != null) {
            jpgVar.a(joaVar, obj, obj2);
        } else {
            this.c.a(joaVar, obj, obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jph
    public final void b(joa joaVar, Iterator it, Object obj) {
        jpf jpfVar = (jpf) this.b.get(joaVar);
        if (jpfVar != null) {
            jpfVar.a(joaVar, it, obj);
        } else if (this.d != null && !this.a.containsKey(joaVar)) {
            this.d.a(joaVar, it, obj);
        } else {
            while (it.hasNext()) {
                a(joaVar, it.next(), obj);
            }
        }
    }
}
