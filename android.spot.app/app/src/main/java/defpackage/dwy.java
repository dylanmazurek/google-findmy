package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dwy extends jef {
    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        lmo lmoVar = (lmo) obj;
        ljh k = kxv.b.k();
        if ((lmoVar.a & 1) != 0) {
            String str = lmoVar.b;
            if (!k.b.y()) {
                k.t();
            }
            kxv kxvVar = (kxv) k.b;
            str.getClass();
            kxvVar.a = str;
        }
        return (kxv) k.q();
    }

    @Override // defpackage.jef
    protected final /* bridge */ /* synthetic */ Object c(Object obj) {
        ljh k = lmo.c.k();
        String str = ((kxv) obj).a;
        if (!k.b.y()) {
            k.t();
        }
        lmo lmoVar = (lmo) k.b;
        str.getClass();
        lmoVar.a |= 1;
        lmoVar.b = str;
        return (lmo) k.q();
    }
}
