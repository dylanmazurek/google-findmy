package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lkj implements lko {
    private final lko[] a;

    public lkj(lko... lkoVarArr) {
        this.a = lkoVarArr;
    }

    @Override // defpackage.lko
    public final lkn a(Class cls) {
        for (int i = 0; i < 2; i++) {
            lko lkoVar = this.a[i];
            if (lkoVar.b(cls)) {
                return lkoVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.lko
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
