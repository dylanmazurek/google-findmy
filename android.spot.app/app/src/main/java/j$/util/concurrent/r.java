package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends l {
    r e;
    r f;
    r g;
    r h;
    boolean i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(int i, Object obj, Object obj2, l lVar, r rVar) {
        super(i, obj, obj2, lVar);
        this.e = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(int i, Object obj) {
        return b(i, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r b(int i, Object obj, Class cls) {
        int i2;
        if (obj != null) {
            r rVar = this;
            do {
                r rVar2 = rVar.f;
                r rVar3 = rVar.g;
                int i3 = rVar.a;
                if (i3 <= i) {
                    if (i3 >= i) {
                        Object obj2 = rVar.b;
                        if (obj2 != obj && (obj2 == null || !obj.equals(obj2))) {
                            if (rVar2 != null) {
                                if (rVar3 != null) {
                                    if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                        int i4 = ConcurrentHashMap.g;
                                        if (obj2 != null && obj2.getClass() == cls) {
                                            i2 = ((Comparable) obj).compareTo(obj2);
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i2 != 0) {
                                            if (i2 >= 0) {
                                                rVar2 = rVar3;
                                            }
                                        }
                                    }
                                    r b = rVar3.b(i, obj, cls);
                                    if (b != null) {
                                        return b;
                                    }
                                }
                            }
                        } else {
                            return rVar;
                        }
                    }
                    rVar = rVar3;
                }
                rVar = rVar2;
            } while (rVar != null);
            return null;
        }
        return null;
    }
}
