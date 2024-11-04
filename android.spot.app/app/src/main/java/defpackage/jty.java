package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class jty implements jxd {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ jty(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, jyz] */
    @Override // defpackage.jxd
    public final jyz a(Object obj) {
        if (this.b == 0) {
            Object obj2 = this.a;
            ((jub) obj2).h++;
            try {
                ((idk) ((jub) obj2).g).a.i++;
                return ((jub) obj2).b.a();
            } catch (Exception e) {
                ((jwq) obj2).n(e);
                return ivc.E(null);
            }
        }
        Object obj3 = this.a;
        ((IOException) obj3).addSuppressed((IOException) obj);
        throw ((Throwable) obj3);
    }
}
